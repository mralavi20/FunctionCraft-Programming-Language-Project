package main.symbolTable;

import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.utils.Stack;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();
    private Map<String, SymbolTableItem> items;
    private int funcArgsCount = 0;
    private int funcDefaultArgsCount = 0;
    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }
    public static void pop() {
        top = stack.pop();
    }
    public SymbolTable() {
        this.items = new HashMap<>();
    }
    public void put(SymbolTableItem item) throws ItemAlreadyExists {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExists();
        items.put(item.getKey(), item);
    }
    public SymbolTableItem getItem(String key) throws ItemNotFound {
        SymbolTableItem symbolTableItem = this.items.get(key);
        if( symbolTableItem != null ){
            return symbolTableItem;
        }
        throw new ItemNotFound();
    }

    public void addArg() {
        funcArgsCount += 1;
    }
    public void addDefaultArg() {
        funcArgsCount += 1;
        funcDefaultArgsCount += 1;
    }
    public int getFuncArgsCount() {
        return funcArgsCount;
    }
    public int getFuncDefaultArgsCount() {
        return funcDefaultArgsCount;
    }

    public SymbolTable copy() {
        SymbolTable newTable = new SymbolTable();
        newTable.items.putAll(this.items);
        newTable.funcArgsCount = this.funcArgsCount;
        newTable.funcDefaultArgsCount = this.funcDefaultArgsCount;
        return newTable;
    }
}
