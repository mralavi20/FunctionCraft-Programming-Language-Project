// Generated from C:/Users/Mohammad Reza/Desktop/New folder (12)/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(FunctionCraftParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(FunctionCraftParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 */
	void enterNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 */
	void exitNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 */
	void enterBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 */
	void exitBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(FunctionCraftParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(FunctionCraftParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(FunctionCraftParser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(FunctionCraftParser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(FunctionCraftParser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(FunctionCraftParser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_and_op}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_op(FunctionCraftParser.Expr_and_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_and_op}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_op(FunctionCraftParser.Expr_and_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(FunctionCraftParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(FunctionCraftParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_eq_op}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq_op(FunctionCraftParser.Expr_eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_eq_op}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq_op(FunctionCraftParser.Expr_eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_compare}.
	 * @param ctx the parse tree
	 */
	void enterExpr_compare(FunctionCraftParser.Expr_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_compare}.
	 * @param ctx the parse tree
	 */
	void exitExpr_compare(FunctionCraftParser.Expr_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_compare_op}.
	 * @param ctx the parse tree
	 */
	void enterExpr_compare_op(FunctionCraftParser.Expr_compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_compare_op}.
	 * @param ctx the parse tree
	 */
	void exitExpr_compare_op(FunctionCraftParser.Expr_compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_plus}.
	 * @param ctx the parse tree
	 */
	void enterExpr_plus(FunctionCraftParser.Expr_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_plus}.
	 * @param ctx the parse tree
	 */
	void exitExpr_plus(FunctionCraftParser.Expr_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_plus_op}.
	 * @param ctx the parse tree
	 */
	void enterExpr_plus_op(FunctionCraftParser.Expr_plus_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_plus_op}.
	 * @param ctx the parse tree
	 */
	void exitExpr_plus_op(FunctionCraftParser.Expr_plus_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_multi}.
	 * @param ctx the parse tree
	 */
	void enterExpr_multi(FunctionCraftParser.Expr_multiContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_multi}.
	 * @param ctx the parse tree
	 */
	void exitExpr_multi(FunctionCraftParser.Expr_multiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_multi_op}.
	 * @param ctx the parse tree
	 */
	void enterExpr_multi_op(FunctionCraftParser.Expr_multi_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_multi_op}.
	 * @param ctx the parse tree
	 */
	void exitExpr_multi_op(FunctionCraftParser.Expr_multi_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterExpr_unary(FunctionCraftParser.Expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitExpr_unary(FunctionCraftParser.Expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(FunctionCraftParser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(FunctionCraftParser.Expr_otherContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_one_dim}.
	 * @param ctx the parse tree
	 */
	void enterList_one_dim(FunctionCraftParser.List_one_dimContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_one_dim}.
	 * @param ctx the parse tree
	 */
	void exitList_one_dim(FunctionCraftParser.List_one_dimContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FunctionCraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#primitive_val}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_val(FunctionCraftParser.Primitive_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#primitive_val}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_val(FunctionCraftParser.Primitive_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_body_function}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body_function(FunctionCraftParser.Loop_body_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_body_function}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body_function(FunctionCraftParser.Loop_body_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#body_function}.
	 * @param ctx the parse tree
	 */
	void enterBody_function(FunctionCraftParser.Body_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#body_function}.
	 * @param ctx the parse tree
	 */
	void exitBody_function(FunctionCraftParser.Body_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_identifier}.
	 * @param ctx the parse tree
	 */
	void enterList_identifier(FunctionCraftParser.List_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_identifier}.
	 * @param ctx the parse tree
	 */
	void exitList_identifier(FunctionCraftParser.List_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#builtin_statement}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_statement(FunctionCraftParser.Builtin_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#builtin_statement}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_statement(FunctionCraftParser.Builtin_statementContext ctx);
}