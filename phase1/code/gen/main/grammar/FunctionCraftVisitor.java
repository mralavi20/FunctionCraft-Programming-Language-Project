// Generated from C:/Users/Mohammad Reza/Desktop/New folder (12)/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(FunctionCraftParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(FunctionCraftParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or(FunctionCraftParser.Expr_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_and(FunctionCraftParser.Expr_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_and_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_and_op(FunctionCraftParser.Expr_and_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_eq(FunctionCraftParser.Expr_eqContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_eq_op(FunctionCraftParser.Expr_eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_compare(FunctionCraftParser.Expr_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_compare_op(FunctionCraftParser.Expr_compare_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_plus(FunctionCraftParser.Expr_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_plus_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_plus_op(FunctionCraftParser.Expr_plus_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_multi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_multi(FunctionCraftParser.Expr_multiContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_multi_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_multi_op(FunctionCraftParser.Expr_multi_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_unary(FunctionCraftParser.Expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_other(FunctionCraftParser.Expr_otherContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_one_dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_one_dim(FunctionCraftParser.List_one_dimContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#primitive_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_val(FunctionCraftParser.Primitive_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_body_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body_function(FunctionCraftParser.Loop_body_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#body_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_function(FunctionCraftParser.Body_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_identifier(FunctionCraftParser.List_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#builtin_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin_statement(FunctionCraftParser.Builtin_statementContext ctx);
}