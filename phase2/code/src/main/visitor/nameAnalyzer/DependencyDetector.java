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
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.symbolTable.utils.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DependencyDetector extends Visitor<Void> {
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();
    private Identifier funcName;

    @Override
    public Void visit(Program program){
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            funcName = functionDeclaration.getFunctionName();
            functionDeclaration.accept(this);
        }

        return null;
    }
    //TODO:visit function declarations and construct dependency graph

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        SymbolTable s = SymbolTable.top;

        try {
            s.put(new VarItem(varDeclaration.getName()));
        } catch (ItemAlreadyExists ignore) {

        }

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        SymbolTable s = SymbolTable.top;

        try {
            for (VarDeclaration var : functionDeclaration.getArgs()) {
                s.put(new VarItem(var.getName()));
            }
        } catch (ItemAlreadyExists ignore) {

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
        } catch (ItemAlreadyExists ignore) {

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
        for (Expression expression : ifStatement.getConditions()) {
            expression.accept(this);
        }

        for (Statement statement : ifStatement.getThenBody()) {
            statement.accept(this);
        }

        for (Statement statement : ifStatement.getElseBody()) {
            statement.accept(this);
        }
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
        for (Expression expression : loopDoStatement.getLoopConditions()) {
            expression.accept(this);
        }

        for (Statement statement : loopDoStatement.getLoopBodyStmts()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        SymbolTable s = SymbolTable.top;

        try {
            s.put(new VarItem(forStatement.getIteratorId()));
        } catch (ItemAlreadyExists ignore) {

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

        return null;
    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement) {
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
            Identifier id = (Identifier) accessExpression.getAccessedExpression();
            dependencyGraph.addEdge(funcName.getName(), id.getName());
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

    public Void findDependency(){
        //TODO:find dependencies by analyzing dependency graph
        for (List<String> cycle : dependencyGraph.findCycles()) {
            dependencyError.add(new CircularDependency(cycle));
        }
        return null;
    }

}
