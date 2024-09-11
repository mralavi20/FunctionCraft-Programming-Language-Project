package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.FloatType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private int curLabel = 0;

    private String endLoopLabel;
    private String startLoopLabel;

    public CodeGenerator(TypeChecker typeChecker){
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }
    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }
    public String getFreshLabel(){
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }
    public String getType(Type element){
        String type = "";
        switch (element){
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "Ljava/lang/Integer;";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "LList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> {
            }
        }
        return type;
    }
    private void prepareOutputFolder(){
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e){
            // ignore
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e){
            // ignore
        }
    }
    private void copyFile(String toBeCopied, String toBePasted){
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e){
            // ignore
        }
    }
    private void addCommand(String command){
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException e){
            // ignore
        }
    }
    private void handleMainClass(){
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Program program){
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for(String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        funcName);
                this.curFunction.getFunctionDeclaration().accept(this);
            } catch(ItemNotFound ignored) {}
        }

        program.getMain().accept(this);
        return null;
    }
//    @Override
//    public String visit(FunctionDeclaration functionDeclaration){
//        slots.clear();
//
//        SymbolTableItem item = null;
//
//        try {
//            item = SymbolTable.root.getItem(functionDeclaration.getFunctionName().getName());
//        } catch (ItemNotFound ignore) {
//
//        }
//        FunctionItem functionItem = (FunctionItem)item;
//
//        String commands = "";
//        String args = ""; // TODO and add to the slots
//        String returnType = ""; // TODO
//
//        for (VarDeclaration var : functionDeclaration.getArgs()) {
//            slotOf(var.getName().getName());
//        }
//
//        for (Type type : functionItem.getArgumentTypes()) {
//            args += makeTypeSignature(type);
//        }
//        returnType += functionItem.getReturnType();
//
//        commands += ".method public " + functionDeclaration.getFunctionName().getName();
//        commands += args + returnType + "\n";
//        // TODO headers, body and return with corresponding type
//        commands += ".limit stack 128\n";
//        commands += ".limit locals 128\n";
//        for(Statement statement : functionDeclaration.getBody()) {
//            commands += statement.accept(this);
//        }
//        commands += ".end method\n";
//
//        addCommand(commands);
//        return null;
//    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration){
        slots.clear();

        FunctionItem functionItem = new FunctionItem(functionDeclaration);
        SymbolTable symbolTable = new SymbolTable();
        functionItem.setFunctionSymbolTable(symbolTable);

        try {
            SymbolTable.top.put(functionItem);
        } catch (ItemAlreadyExists ignore) {

        }

        SymbolTable.push(symbolTable);

        String commands = "";
        String args = ""; // TODO and add to the slots
        String returnType = ""; // TODO

        for (VarDeclaration var : functionDeclaration.getArgs()) {
            slotOf(var.getName().getName());
            args += makeTypeSignature(var.accept(typeChecker));
        }

        returnType += makeTypeSignature(functionItem.getReturnType());

        commands += ".method public " + functionDeclaration.getFunctionName().getName();
        commands += "(";
        commands += args + ")" + returnType + "\n";
        // TODO headers, body and return with corresponding type
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        for(Statement statement : functionDeclaration.getBody()) {
            commands += statement.accept(this);
        }
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }


    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();

        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        for (var statement : mainDeclaration.getBody())
            commands += statement.accept(this);
        commands += "return\n";
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    public String visit(AccessExpression accessExpression){
        if (accessExpression.isFunctionCall()) {
            Identifier functionName = (Identifier)accessExpression.getAccessedExpression();
            String s = "aload_0\n";

            String args = ""; // TODO
            String returnType = ""; // TODO

            s += ("invokevirtual " + functionName.getName() + "(");

            for (Expression expression : accessExpression.getArguments()) {
                s += makePrimTypes(expression.accept(typeChecker));
            }

            Type type = accessExpression.getAccessedExpression().accept(typeChecker);

            if (type instanceof NoType) {
                s += ")\n";
            } else {
                s += (")" + makeTypeSignature(type) + "\n");
            }
            return s;
            // return "invokestatic Main/" + functionName.getName() + args + returnType + "\n";
        }
        else {
            // TODO
        }
        //TODO
        return null;
    }
    @Override
    public String visit(AssignStatement assignStatement){
        //TODO
        String s = "";
        if (assignStatement.isAccessList()) {
            int index = slotOf(assignStatement.getAssignedId().getName());
            s += "aload " + index + "\n";
            s += assignStatement.getAccessListExpression().accept(this);
            s += assignStatement.getAssignExpression().accept(this);
            s += "iastore\n";
        } else {
            Type type = assignStatement.getAssignExpression().accept(typeChecker);
            int index = slotOf(assignStatement.getAssignedId().getName());
            s += assignStatement.getAssignExpression().accept(this);
            s += nonPrimToPrim(type);
            s += create_commands(type, "store", index) + "\n";
        }
        return s;
    }
    @Override
    public String visit(IfStatement ifStatement){
        //TODO
        String elseLabel = getFreshLabel();
        String endLabel = getFreshLabel();
        String s = "";

        for (Expression expression : ifStatement.getConditions()) {
            s += expression.accept(this);
        }

        s += ("ifeq " + elseLabel) + "\n";

        for (Statement statement : ifStatement.getThenBody()) {
            s += statement.accept(this);
        }

        s += "goto " + endLabel + "\n";

        if (!ifStatement.getElseBody().isEmpty()) {
            for (Statement statement : ifStatement.getElseBody()) {
                s += statement.accept(this);
            }
        }
        s += endLabel + "\n";
        return s;
    }
    @Override
    public String visit(PutStatement putStatement){
        //TODO
        String s = "";
        Type type;
        s += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        s += putStatement.getExpression().accept(this);
        type = putStatement.getExpression().accept(typeChecker);

        if (type instanceof IntType){
            s += "invokevirtual java/io/PrintStream/println(I)V\n";
        }
        else if (type instanceof BoolType){
            s += "invokevirtual java/io/PrintStream/println(Z)V\n";
        }
        else if(type instanceof StringType){
            s += "invokevirtual java/io/PrintStream/println(Z)V\n";
        }
        else if(type instanceof FloatType){
            s += "invokevirtual java/io/PrintStream/println(F)V\n";
        }
        return s;
    }
    @Override
    public String visit(ReturnStatement returnStatement){
        //TODO
        Type type = curFunction.getReturnType();
        String s = "";
        if (type instanceof NoType) {
            s += "return\n";
        } else {
            s += returnStatement.getReturnExp().accept(this);
            s += (getType(type) + "return\n");
        }
        return s;
    }
    @Override
    public String visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public String visit(BinaryExpression binaryExpression){
        //TODO
        String s1 = binaryExpression.getFirstOperand().accept(this);
        String s2 = binaryExpression.getSecondOperand().accept(this);
        Type type = binaryExpression.getFirstOperand().accept(typeChecker);
        BinaryOperator binaryOperator = binaryExpression.getOperator();

        if (binaryOperator.equals(BinaryOperator.PLUS)) {
            return s1 + s2 + getType(type) + "add" + "\n";
        } else if (binaryOperator.equals(BinaryOperator.MINUS)) {
            return s1 + s2 + getType(type) + "sub" + "\n";
        } else if (binaryOperator.equals(BinaryOperator.MULT)) {
            return s1 + s2 + getType(type) + "mul" + "\n";
        } else if (binaryOperator.equals(BinaryOperator.DIVIDE)) {
            return s1 + s2 + getType(type) + "div" + "\n";
        } else if (binaryOperator.equals(BinaryOperator.EQUAL)) {
            String accLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            String s = "";
            s += s1;
            s += s2;
            if (type instanceof IntType || type instanceof BoolType) {
                s += "if_icmpeq " + accLabel + "\n";
            }
            else{
                s += "if_acmpeq " + accLabel + "\n";
            }
            s += "ldc 0\n";
            s +=  "goto " + endLabel + "\n";
            s += accLabel + ":\n";
            s += "ldc 1\n";
            s += endLabel + ":\n";
            return s;
        } else if (binaryOperator.equals(BinaryOperator.NOT_EQUAL)) {
            String accLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            String s = "";
            s += s1;
            s += s2;
            if (type instanceof IntType || type instanceof BoolType) {
                s += "if_icmpeq " + accLabel + "\n";
            }
            else{
                s += "if_acmpeq " + accLabel + "\n";
            }
            s += "ldc 1\n";
            s +=  "goto " + endLabel + "\n";
            s += accLabel + ":\n";
            s += "ldc 0\n";
            s += endLabel + ":\n";
            return s;
        } else if (binaryOperator.equals(BinaryOperator.GREATER_THAN)) {
            String accLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            String s = "";
            s += s1;
            s += s2;
            if (type instanceof IntType || type instanceof BoolType) {
                s += "if_icmpgt " + accLabel + "\n";
            }
            else{
                s += "if_acmpgt " + accLabel + "\n";
            }
            s += "ldc 0\n";
            s +=  "goto " + endLabel + "\n";
            s += accLabel + ":\n";
            s += "ldc 1\n";
            s += endLabel + ":\n";
            return s;
        } else if (binaryOperator.equals(BinaryOperator.LESS_THAN)) {
            String accLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            String s = "";
            s += s1;
            s += s2;
            if (type instanceof IntType || type instanceof BoolType) {
                s += "if_icmplt " + accLabel + "\n";
            }
            else{
                s += "if_acmplt " + accLabel + "\n";
            }
            s += "ldc 0\n";
            s +=  "goto " + endLabel + "\n";
            s += accLabel + ":\n";
            s += "ldc 1\n";
            s += endLabel + ":\n";
            return s;
        } else if (binaryOperator.equals(BinaryOperator.GREATER_EQUAL_THAN)) {
            String accLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            String s = "";
            s += s1;
            s += s2;
            if (type instanceof IntType || type instanceof BoolType) {
                s += "if_icmpge " + accLabel + "\n";
            }
            else{
                s += "if_acmpge " + accLabel + "\n";
            }
            s += "ldc 0\n";
            s +=  "goto " + endLabel + "\n";
            s += accLabel + ":\n";
            s += "ldc 1\n";
            s += endLabel + ":\n";
            return s;
        } else if (binaryOperator.equals(BinaryOperator.LESS_EQUAL_THAN)) {
            String accLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            String s = "";
            s += s1;
            s += s2;
            if (type instanceof IntType || type instanceof BoolType) {
                s += "if_icmple " + accLabel + "\n";
            }
            else{
                s += "if_acmple " + accLabel + "\n";
            }
            s += "ldc 0\n";
            s +=  "goto " + endLabel + "\n";
            s += accLabel + ":\n";
            s += "ldc 1\n";
            s += endLabel + ":\n";
            return s;
        }
        return null;
    }
    @Override
    public String visit(UnaryExpression unaryExpression){
        //TODO
        Expression expression = unaryExpression.getExpression();
        String s = unaryExpression.getExpression().accept(this);
        int index = 0;

        if (expression instanceof Identifier) {
            Identifier identifier = (Identifier) expression;
            index = slotOf(identifier.getName());
        }

        Type type = expression.accept(typeChecker);
        UnaryOperator unaryOperator = unaryExpression.getOperator();

        if (unaryOperator.equals(UnaryOperator.INC)) {
            s += getType(type) + "inc " + index + ", " + "1\n";
        } else if (unaryOperator.equals(UnaryOperator.DEC)) {
            s += getType(type) + "inc " + index + ", " + "-1\n";
        } else if (unaryOperator.equals(UnaryOperator.MINUS)) {
            s += getType(type) + "neg\n";
        } else if (unaryOperator.equals(UnaryOperator.NOT)) {
            String eqLabel = getFreshLabel();
            String endLabel = getFreshLabel();

            s += "ifeq " + eqLabel +"\n";
            s += "ldc 0\n";
            s += "goto " + endLabel + "\n";
            s += eqLabel + ":\n";
            s += "ldc 1\n";
            s += endLabel + ":\n";
        }
        return s;
    }
    @Override
    public String visit(Identifier identifier){
        //TODO
        Type type = identifier.accept(typeChecker);
        int index = slotOf(identifier.getName());
        return create_commands(type, "load", index) + "\n";
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement){
        //TODO
        endLoopLabel = getFreshLabel();
        startLoopLabel = getFreshLabel();
        String s = "";
        s += startLoopLabel + ":\n";
        for (Statement statement : loopDoStatement.getLoopBodyStmts()) {
            s += statement.accept(this);
        }
        s += endLoopLabel + ":\n";
        return s;
    }
    @Override
    public String visit(BreakStatement breakStatement){
        String s = "";
        s += "goto " + endLoopLabel + "\n";
        return s;
    }
    @Override
    public String visit(NextStatement nextStatement){
        String s = "";
        s += "goto " + startLoopLabel + "\n";
        return s;
    }
    @Override
    public String visit(LenStatement lenStatement){
        //TODO
        String s = "";
        Type type = lenStatement.getExpression().accept(typeChecker);
        s += lenStatement.getExpression().accept(this);
        if (type instanceof ListType) {
            s += "arraylength\n";
        }
        else {
           s += "invokevirtual java/lang/String/length()\n";
        }
        return s;
    }
    @Override
    public String visit(ChopStatement chopStatement){
        //TODO
        String s = "";
        s += chopStatement.getChopExpression().accept(this);
        s += "iconst_0\n";
        s += "invokevirtual java/lang/String/length()\n";
        s += "iconst_1\n";
        s += "isub\n";
        s += "invokevirtual java/lang/String/substring(II)Ljava/lang/String;\n";
        return s;
    }
    @Override
    public String visit(FunctionPointer functionPointer){
        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }
    @Override
    public String visit(ListValue listValue){
        //TODO
        String s = "";
        
        s += "new java/util/ArrayList\n";
        s += "dup\n";
        s += "invokespecial java/util/ArrayList/<init>()V\n";

        for (Expression expression : listValue.getElements()) {
            s += "dup\n";
            s += expression.accept(this);
            Type type = expression.accept(typeChecker);

            if (type instanceof IntType) {
                s += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            }
            else if (type instanceof BoolType) {
                s += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            }

            s += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
            s += "pop\n";
        }

        s += "new List\n";
        s += "dup\n";
        s += "aload_0\n"; // Assuming the ArrayList is in local variable 0
        s += "invokespecial List/<init>(Ljava/util/ArrayList;)V\n";

        return s;
    }
    @Override
    public String visit(IntValue intValue){
        //TODO, use "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer" to convert to primitive
        return "ldc " + intValue.getIntVal() + "\n";
    }
    @Override
    public String visit(BoolValue boolValue){
        //TODO, use "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean" to convert to primitive
        String s = "";
        if (boolValue.getBool()) {
            s += "ldc 1\n";
        }
        else {
            s += "ldc 0\n";
        }
        s += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean\n";
        return s;
    }
    @Override
    public String visit(StringValue stringValue){
        //TODO
        return "ldc " + "\"" + stringValue.getStr() + "\"" + "\n";
    }



    public String create_commands(Type t, String command, int index){
        String type = "";
        if (t == null || t instanceof NoType){
            type = "a";
        }
        else if (t instanceof IntType || t instanceof  BoolType){
            type = "i";
        }
        else if (t instanceof StringType){
            type = "a";
        }
        else if (t instanceof FloatType){
            type = "f";
        }
        else {
            type = "a";
        }
        if (command.equals("astore") || command.equals("aload")){
            return type + command;
        }
        if (index > 3){
            return type + command + " " + index;
        }
        else{
            return type + command + "_" + index;
        }
    }

    private String makeTypeSignature(Type t) {
        if(t instanceof IntType){
            return "Ljava/lang/Integer;";
        }
        else if (t instanceof  BoolType){
            return "Ljava/lang/Boolean;";
        }
        else if (t instanceof  StringType){
            return "Ljava/lang/String;";
        }
        else if(t instanceof  FloatType){
            return "Ljava/lang/Float;";
        }
        return null;
    }

    public String nonPrimToPrim(Type type){
        if (type instanceof  IntType) {
            return "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }
        else if (type instanceof BoolType){
            return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        else {
            return "";
        }
    }

    private String makePrimTypes(Type t){
        if(t instanceof IntType){
            return "I";
        }
        else if (t instanceof  BoolType){
            return "Z";
        }
        else if (t instanceof  StringType){
            return "Ljava/lang/String;";
        }
        else if(t instanceof  FloatType){
            return "F";
        }
        return null;
    }
}