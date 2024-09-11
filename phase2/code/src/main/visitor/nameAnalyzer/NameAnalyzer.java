package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.FloatValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.Objects;

public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();
    public boolean isFunction = false;
    public boolean isPattern = false;

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        //TODO: addFunctions,
        //Code handles duplicate function declarations by renaming and adding them to the symbol table.
        int duplicateFunctionId = 0;
        ArrayList<FunctionItem> functionItems = new ArrayList<>();
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
                functionItems.add(functionItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfFunction(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
                duplicateFunctionId += 1;
                String freshName = functionItem.getName() + "#" + String.valueOf(duplicateFunctionId);
                Identifier newId = functionDeclaration.getFunctionName();
                newId.setName(freshName);
                functionDeclaration.setFunctionName(newId);
                FunctionItem newItem = new FunctionItem(functionDeclaration);
                functionItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //addPatterns
        int duplicatePatternId = 0;
        ArrayList<PatternItem> patternItems = new ArrayList<>();
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
                patternItems.add(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                duplicatePatternId += 1;
                String freshName = patternItem.getName() + "#" + String.valueOf(duplicatePatternId);
                Identifier newId = patternDeclaration.getPatternName();
                newId.setName(freshName);
                patternDeclaration.setPatternName(newId);
                PatternItem newItem = new PatternItem(patternDeclaration);
                patternItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }
        //TODO:visitFunctions
        //Iterates over function declarations, assigns symbol tables, visits declarations, and manages symbol table stack.
        int visitingFunctionIndex = 0;
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = functionItems.get(visitingFunctionIndex);
            SymbolTable functionSymbolTable = new SymbolTable();
            functionItem.setFunctionSymbolTable(functionSymbolTable);
            SymbolTable.push(functionSymbolTable);
            functionDeclaration.accept(this);
            SymbolTable.pop();
            visitingFunctionIndex += 1;
        }

        //visitPatterns
        int visitingPatternIndex = 0;
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = patternItems.get(visitingPatternIndex);
            SymbolTable patternSymbolTable = new SymbolTable();
            patternItem.setPatternSymbolTable(patternSymbolTable);
            SymbolTable.push(patternSymbolTable);
            patternDeclaration.accept(this);
            SymbolTable.pop();
            visitingPatternIndex += 1;
        }
        //visitMain
        program.getMain().accept(this);
        return null;
    }

    //TODO:visit all other AST nodes and find name errors


    @Override
    public Void visit(Identifier identifier) {
        if (isFunction) {
            try {
                SymbolTable s = SymbolTable.root;
                s.getItem(FunctionItem.START_KEY + identifier.getName());
            } catch (ItemNotFound e) {
                nameErrors.add(new FunctionNotDeclared(identifier.getLine(), identifier.getName()));
            }
        }
        else if (isPattern) {
            try {
                SymbolTable s = SymbolTable.root;
                s.getItem(PatternItem.START_KEY + identifier.getName());
            } catch (ItemNotFound e) {
                nameErrors.add(new PatternNotDeclared(identifier.getLine(), identifier.getName()));
            }
        }
        else{
            try {
                SymbolTable s = SymbolTable.top;
                s.getItem(VarItem.START_KEY + identifier.getName());
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(identifier.getLine(), identifier.getName()));
            }
        }

        isFunction = false;
        isPattern = false;

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        SymbolTable s = SymbolTable.top;

        try {
            s.put(new VarItem(varDeclaration.getName()));
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new DuplicateArg(varDeclaration.getLine(), varDeclaration.getName().getName()));
        }

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        SymbolTable s = SymbolTable.top;

        for (VarDeclaration var :functionDeclaration.getArgs()){
            if (Objects.equals(var.getName().toString(), functionDeclaration.getFunctionName().toString()))
                nameErrors.add(new IdenticalArgFunctionName(functionDeclaration.getLine(), functionDeclaration.getFunctionName().getName()));
        }
        try {
            for (VarDeclaration var : functionDeclaration.getArgs()) {
                s.put(new VarItem(var.getName()));
                if (var.getDefaultVal() != null) {
                    s.addDefaultArg();
                }
                else {
                    s.addArg();
                }
            }
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new IdenticalArgFunctionName(functionDeclaration.getLine(), functionDeclaration.getFunctionName().getName()));
        }

        for (Statement statement : functionDeclaration.getBody()) {
            statement.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(PatternDeclaration patternDeclaration) {
        SymbolTable s = SymbolTable.top;

        try {
            s.put(new PatternItem(patternDeclaration));
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(), patternDeclaration.getPatternName().getName()));
        }

        try {
            s.put(new VarItem(patternDeclaration.getTargetVariable()));
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new DuplicateArg(patternDeclaration.getLine(), patternDeclaration.getTargetVariable().getName()));
        }

        for (Expression exp : patternDeclaration.getConditions()) {
            exp.accept(this);
        }

        for (Expression exp : patternDeclaration.getReturnExp()) {
            exp.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        for (Statement statement : mainDeclaration.getBody()) {
            statement.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {
        if (returnStatement.hasRetExpression())
            returnStatement.getReturnExp().accept(this);
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {
        SymbolTable s = SymbolTable.top.copy();
        SymbolTable.push(s);

        for (Expression expression : ifStatement.getConditions()) {
            expression.accept(this);
        }

        for (Statement statement : ifStatement.getThenBody()) {
            statement.accept(this);
        }

        for (Statement statement : ifStatement.getElseBody()) {
            statement.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(PutStatement putStatement) {
        putStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(LenStatement lenStatement) {
        lenStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(PushStatement pushStatement) {
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }

    @Override
    public Void visit(LoopDoStatement loopDoStatement) {
        SymbolTable s = SymbolTable.top.copy();
        SymbolTable.push(s);

        for (Expression expression : loopDoStatement.getLoopConditions()) {
            expression.accept(this);
        }

        for (Statement statement : loopDoStatement.getLoopBodyStmts()) {
            statement.accept(this);
        }
        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        SymbolTable s = SymbolTable.top.copy();
        SymbolTable.push(s);

        try {
            s.put(new VarItem(forStatement.getIteratorId()));
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new DuplicateArg(forStatement.getLine(), forStatement.getIteratorId().getName()));
        }

        for (Expression expression : forStatement.getRangeExpressions()) {
            expression.accept(this);
        }

        for (Expression expression : forStatement.getLoopBodyExpressions()) {
            expression.accept(this);
        }

        for (Statement statement : forStatement.getLoopBody()) {
            statement.accept(this);
        }

        forStatement.getReturnStatement().accept(this);

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement) {
        isPattern = true;
        matchPatternStatement.getPatternId().accept(this);
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }

    @Override
    public Void visit(ChopStatement chopStatement) {
        chopStatement.getChopExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ChompStatement chompStatement) {
        chompStatement.getChompExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignStatement assignStatement) {
        SymbolTable s = SymbolTable.top;

        try {
            s.put(new VarItem(assignStatement.getAssignedId()));
        } catch (ItemAlreadyExists ignore) {

        }

        assignStatement.getAssignExpression().accept(this);

        if (assignStatement.isAccessList())
            assignStatement.getAccessListExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AppendExpression appendExpression) {
        appendExpression.getAppendee().accept(this);

        for (Expression expression : appendExpression.getAppendeds()) {
            expression.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        unaryExpression.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {
        if (accessExpression.isFunctionCall()) {
            isFunction = true;
            try {
                Identifier id = (Identifier)accessExpression.getAccessedExpression();
                SymbolTableItem var = SymbolTable.root.getItem("Function:" + id.getName());
                FunctionItem functionItem = (FunctionItem) var;
                if (functionItem.getFunctionSymbolTable() != null) {
                    if (accessExpression.getArguments().size() > functionItem.getFunctionSymbolTable().getFuncArgsCount() ||
                            accessExpression.getArguments().size() < functionItem.getFunctionSymbolTable().getFuncArgsCount() - functionItem.getFunctionSymbolTable().getFuncDefaultArgsCount()) {
                        nameErrors.add(new ArgMisMatch(accessExpression.getAccessedExpression().getLine(), id.getName()));
                    }
                }
            } catch (ItemNotFound ignore) {

            }
            accessExpression.getAccessedExpression().accept(this);
            for (Expression expression : accessExpression.getArguments()) {
                expression.accept(this);
            }
            for (Expression expression : accessExpression.getDimentionalAccess()) {
                expression.accept(this);
            }
        } else {
            for (Expression expression : accessExpression.getDimentionalAccess()) {
                expression.accept(this);
            }

            accessExpression.getAccessedExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(LambdaExpression lambdaExpression) {
        for (VarDeclaration var : lambdaExpression.getDeclarationArgs()) {
            var.accept(this);
        }
        for (Statement statement : lambdaExpression.getBody()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        for (Expression expression : listValue.getElements()) {
            expression.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionPointer functionPointer) {
        functionPointer.getId().accept(this);
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        return null;
    }

    @Override
    public Void visit(FloatValue floatValue) {
        return null;
    }
}