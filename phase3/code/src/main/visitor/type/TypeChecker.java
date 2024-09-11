package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    public Stack<Set<Type>> types = new Stack<>();
    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null;
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            for (int i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                argItem.setType(currentArgTypes.get(i));
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
        }catch (ItemNotFound ignored){}

        //TODO:Figure out whether return types of functions are not the same.
        Set<Type> funcTypes = new HashSet<>();
        Type type = new NoType();
        types.push(funcTypes);
        for (Statement statement : functionDeclaration.getBody()) {
            statement.accept(this);
        }
        Set<Type> res = types.pop();
        if (res.size() > 1) {
            typeErrors.add(new FunctionIncompatibleReturnTypes(functionDeclaration.getLine(), functionDeclaration.getFunctionName().getName()));
            SymbolTable.pop();
            return new NoType();
        }
        if (!res.isEmpty())
            type = res.iterator().next();
        SymbolTable.pop();
        return type;
        //TODO:Return the infered type of the function
    }
    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        SymbolTable.push(new SymbolTable());
        Type type = null;
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}
            for(Expression expression : patternDeclaration.getConditions()){
                if(!(expression.accept(this) instanceof BoolType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();
                    return new NoType();
                }
            }
        //TODO:1-figure out whether return expression of different cases in pattern are of the same type/2-return the infered type
            int status = 0;
            for (Expression expression : patternDeclaration.getReturnExp()) {
                if (status == 0) {
                    type = expression.accept(this);
                    status = 1;
                }
                else if (!type.sameType(expression.accept(this))) {
                    typeErrors.add(new PatternIncompatibleReturnTypes(patternDeclaration.getLine(), patternDeclaration.getPatternName().getName()));
                    SymbolTable.pop();
                    return new NoType();
                }
            }
        }catch (ItemNotFound ignored){}

        if (patternDeclaration.getReturnExp().isEmpty()) {
            SymbolTable.pop();
            return new NoType();
        }

        SymbolTable.pop();
        return type;
    }
    @Override
    public Type visit(MainDeclaration mainDeclaration){
        //TODO:visit main
        for (Statement statement : mainDeclaration.getBody()) {
            statement.accept(this);
        }
        return new NoType();
    }
    @Override
    public Type visit(AccessExpression accessExpression){
        Type type = null;
        if(accessExpression.isFunctionCall()){
            //TODO:function is called here.set the arguments type and visit its declaration
            FunctionItem item = null;
            ArrayList<Type> argsTypes = new ArrayList<>();
            try {
                Identifier identifier = (Identifier) accessExpression.getAccessedExpression();
                item = (FunctionItem) SymbolTable.root.getItem("Function:" + identifier.getName()); // ?
            } catch (ItemNotFound ignore) {

            }
            for (Expression expression : accessExpression.getArguments()) {
                argsTypes.add(expression.accept(this));
            }
            if (item != null) {
                if (item.getFunctionDeclaration().getArgs().size() - accessExpression.getArguments().size() > 0){
                    for (int i = accessExpression.getArguments().size(); i < item.getFunctionDeclaration().getArgs().size(); i++) {
                        VarDeclaration var = (VarDeclaration) item.getFunctionDeclaration().getArgs().get(i);
                        argsTypes.add(var.getDefaultVal().accept(this));
                    }
                }
                item.setArgumentTypes(argsTypes); // visit
                return item.getFunctionDeclaration().accept(this);
            }
        }
        else{
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            if(!(accessedType instanceof StringType) && !(accessedType instanceof ListType)){
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            }
            //TODO:index of access list must be int
            if (!(accessExpression.getDimentionalAccess().getFirst().accept(this) instanceof IntType))
                typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));

            if (accessedType instanceof ListType listType) {
                return listType.getType();
            }
            return accessedType;
        }
        return null;
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        // TODO:Visit return statement.Note that return type of functions are specified here
        Type type = returnStatement.getReturnExp().accept(this);
        if (type instanceof NoType)
            return new NoType();
        Set<Type> funcType = types.pop(); // if
        funcType.add(type);
        types.push(funcType);
        return type;
    }
    @Override
    public Type visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());
        Type type = forStatement.getRangeExpression().accept(this);
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        varItem.setType(type);
        try{
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        for(Statement statement : forStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }
    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Expression expression : ifStatement.getConditions())
            if(!(expression.accept(this) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        for(Statement statement : ifStatement.getThenBody())
            statement.accept(this);
        for(Statement statement : ifStatement.getElseBody())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(AssignStatement assignStatement){
        if(assignStatement.isAccessList()){
            // TODO:assignment to list
            if (!(assignStatement.getAccessListExpression().accept(this) instanceof IntType))
                typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
        }
        else{
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
            // TODO:maybe new type for a variable
            newVarItem.setType(assignStatement.getAssignExpression().accept(this));
            try {
                SymbolTable.top.put(newVarItem);
            }catch (ItemAlreadyExists ignored){
                try {
                    VarItem item = (VarItem)SymbolTable.top.getItem("VAR:" + assignStatement.getAssignedId().getName());
                    item.setType(newVarItem.getType());
                } catch (ItemNotFound ignore) {
                    System.out.println(assignStatement.getLine());
                }
            }
        }
        return new NoType();
    }
    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    @Override
    public Type visit(PushStatement pushStatement){ // ?
        //TODO:visit push statement
        Type type1 = pushStatement.getInitial().accept(this);
        Type type2 = pushStatement.getToBeAdded().accept(this);
        if (type1 instanceof NoType || type2 instanceof NoType)
            return new NoType();
        if ((type1 instanceof StringType) && (type2 instanceof StringType))
            return new NoType();
        if ((type1 instanceof StringType)) {
            typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
            }
        else if (!(type1 instanceof ListType)) {// check
            typeErrors.add(new IsNotPushedable(pushStatement.getLine()));
            }
        else {
            ListType listType = (ListType) type1;
            if (listType.getType() instanceof NoType)
                listType.setType(type2);
            if (!type2.sameType(listType.getType()))
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
        }
        return new NoType();
    }
    @Override
    public Type visit(PutStatement putStatement){
        //TODO:visit putStatement
        putStatement.getExpression().accept(this);
        return new NoType();

    }
    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }
    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }
    @Override
    public Type visit(FloatValue floatValue){return new FloatType();}
    @Override
    public Type visit(StringValue stringValue){
        return new StringType();
    }
    @Override
    public Type visit(ListValue listValue){
        // TODO:visit listValue
        int status = 0;
        int error = 0;
        Type type = null;
        for (Expression expression : listValue.getElements()) {
            if (status == 0) {
                type = expression.accept(this);
                status = 1;
            }
            else if (!type.sameType(expression.accept(this)) && error == 0) {
                typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
                error = 1;
            }
        }
        if (listValue.getElements().isEmpty())
            return new ListType(new NoType());
        if (error == 1)
            type = new NoType();
        return new ListType(type); // no type
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        return appendeeType;
    }
    @Override
    public Type visit(BinaryExpression binaryExpression){
        //TODO:visit binary expression
        Type type1 = binaryExpression.getFirstOperand().accept(this); // no type
        Type type2 = binaryExpression.getSecondOperand().accept(this);
        if (type1 instanceof NoType || type2 instanceof NoType)
            return new NoType();
        if (!type1.sameType(type2)) {
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binaryExpression.getOperator()));
            return new NoType();
        }
        else if (type1 instanceof StringType || type1 instanceof ListType || type1 instanceof BoolType) {
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().name()));
            return new NoType();
        }
        if (binaryExpression.getOperator() == BinaryOperator.PLUS || binaryExpression.getOperator() == BinaryOperator.MINUS ||
                binaryExpression.getOperator() == BinaryOperator.MULT || binaryExpression.getOperator() == BinaryOperator.DIVIDE) {
            return type1;
        }
        return new BoolType();
    }
    @Override
    public Type visit(UnaryExpression unaryExpression){
        //TODO:visit unaryExpression
        Type type = unaryExpression.getExpression().accept(this);
        if (type instanceof NoType)
            return type;
        if (type instanceof StringType || type instanceof ListType || type instanceof FptrType)
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().name()));
        else if (type instanceof BoolType && unaryExpression.getOperator() != UnaryOperator.NOT)
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().name()));
        else if ((type instanceof IntType || type instanceof FloatType) && unaryExpression.getOperator() == UnaryOperator.NOT)
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().name()));
        else
            return type;
        return new NoType();
    }
    @Override
    public Type visit(ChompStatement chompStatement){
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(ChopStatement chopStatement){
        return new StringType();
    }
    @Override
    public Type visit(Identifier identifier){
        // TODO: do
        Type type = new NoType();
        try {
            VarItem item = (VarItem) SymbolTable.top.getItem("VAR:" + identifier.getName());
            type = item.getType();
        } catch (ItemNotFound ignore) {

        }
        return type;
    }
    @Override
    public Type visit(LenStatement lenStatement){
        //TODO:visit LenStatement.Be carefull about the return type of LenStatement.
        Type type = lenStatement.getExpression().accept(this);
        if (!(type instanceof StringType) && !(type instanceof ListType))
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
        return new IntType();
    }
    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){
        RangeType rangeType = rangeExpression.getRangeType();
        if(rangeType.equals(RangeType.LIST)){
            // TODO --> mind that the lists are declared explicitly in the grammar in this node, so handle the errors
            int status = 0;
            int error = 0;
            Type type = null;
            for (Expression expression : rangeExpression.getRangeExpressions()) {
                if (status == 0) {
                    type = expression.accept(this);
                    status = 1;
                }
                else if (!type.sameType(expression.accept(this)) && error == 0) {
                    typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
                    error = 1;
                }
            }
            if (error == 0)
                return type;
        }
        else if (rangeType.equals(RangeType.DOUBLE_DOT) || rangeType.equals(RangeType.IDENTIFIER)) {
            Type type = rangeExpression.getRangeExpressions().getFirst().accept(this);
            return type;
        }

        return new NoType();
    }
}
