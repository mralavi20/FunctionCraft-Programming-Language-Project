// Generated from C:/Users/Mohammad Reza/Desktop/New folder (12)/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DEF=2, END=3, MAIN=4, RETURN=5, IF=6, ELSE=7, ELSEIF=8, CHOP=9, 
		CHOMP=10, PUSH=11, PUTS=12, METHOD=13, LEN=14, PATTERN=15, MATCH=16, NEXT=17, 
		BREAK=18, LOOP=19, DO=20, FOR=21, IN=22, ASSIGN=23, PLUS=24, MINUS=25, 
		MULTIPLY=26, DIVIDE=27, TWOPLUS=28, TWOMINUS=29, EQL=30, NEQ=31, GREATER=32, 
		LESS=33, GEQ=34, LEQ=35, AND=36, OR=37, NOT=38, PLUSASSIGN=39, MINUSASSIGN=40, 
		MULTIPLYASSIGN=41, DIVIDEASSIGN=42, MODASSIGN=43, RPAR=44, LPAR=45, RBRAC=46, 
		LBRAC=47, RCBRAC=48, LCBRAC=49, TWODOT=50, JOIN=51, DOT=52, DQUT=53, SEMICOLON=54, 
		COLON=55, COMMA=56, RARROW=57, INT_VAL=58, FLOAT_VAL=59, STRING_VAL=60, 
		BOOLEAN_VAL=61, IDENTIFIER=62, COMMENT=63, WS=64;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_puts = 2, RULE_push = 3, RULE_len = 4, 
		RULE_chop = 5, RULE_chomp = 6, RULE_match = 7, RULE_loop = 8, RULE_for = 9, 
		RULE_if = 10, RULE_else = 11, RULE_elseif = 12, RULE_next = 13, RULE_break = 14, 
		RULE_next_if = 15, RULE_break_if = 16, RULE_pattern = 17, RULE_return = 18, 
		RULE_expr = 19, RULE_expr_or = 20, RULE_expr_and = 21, RULE_expr_and_op = 22, 
		RULE_expr_eq = 23, RULE_expr_eq_op = 24, RULE_expr_compare = 25, RULE_expr_compare_op = 26, 
		RULE_expr_plus = 27, RULE_expr_plus_op = 28, RULE_expr_multi = 29, RULE_expr_multi_op = 30, 
		RULE_expr_unary = 31, RULE_expr_other = 32, RULE_assignment = 33, RULE_list_one_dim = 34, 
		RULE_list = 35, RULE_primitive_val = 36, RULE_function = 37, RULE_function_ptr = 38, 
		RULE_function_call = 39, RULE_lambda = 40, RULE_loop_body_function = 41, 
		RULE_body_function = 42, RULE_list_identifier = 43, RULE_statement = 44, 
		RULE_builtin_statement = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "puts", "push", "len", "chop", "chomp", "match", "loop", 
			"for", "if", "else", "elseif", "next", "break", "next_if", "break_if", 
			"pattern", "return", "expr", "expr_or", "expr_and", "expr_and_op", "expr_eq", 
			"expr_eq_op", "expr_compare", "expr_compare_op", "expr_plus", "expr_plus_op", 
			"expr_multi", "expr_multi_op", "expr_unary", "expr_other", "assignment", 
			"list_one_dim", "list", "primitive_val", "function", "function_ptr", 
			"function_call", "lambda", "loop_body_function", "body_function", "list_identifier", 
			"statement", "builtin_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'    |'", "'def'", "'end'", "'main'", "'return'", "'if'", "'else'", 
			"'elseif'", "'chop'", "'chomp'", "'push'", "'puts'", "'method'", "'len'", 
			"'pattern'", "'match'", "'next'", "'break'", "'loop'", "'do'", "'for'", 
			"'in'", "'='", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'!'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "')'", "'('", "']'", "'['", "'}'", "'{'", "'..'", 
			"'<<'", "'.'", "'\"'", "';'", "':'", "','", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DEF", "END", "MAIN", "RETURN", "IF", "ELSE", "ELSEIF", "CHOP", 
			"CHOMP", "PUSH", "PUTS", "METHOD", "LEN", "PATTERN", "MATCH", "NEXT", 
			"BREAK", "LOOP", "DO", "FOR", "IN", "ASSIGN", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "TWOPLUS", "TWOMINUS", "EQL", "NEQ", "GREATER", "LESS", "GEQ", 
			"LEQ", "AND", "OR", "NOT", "PLUSASSIGN", "MINUSASSIGN", "MULTIPLYASSIGN", 
			"DIVIDEASSIGN", "MODASSIGN", "RPAR", "LPAR", "RBRAC", "LBRAC", "RCBRAC", 
			"LCBRAC", "TWODOT", "JOIN", "DOT", "DQUT", "SEMICOLON", "COLON", "COMMA", 
			"RARROW", "INT_VAL", "FLOAT_VAL", "STRING_VAL", "BOOLEAN_VAL", "IDENTIFIER", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(95);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(92);
						function();
						}
						break;
					case COMMENT:
						{
						setState(93);
						match(COMMENT);
						}
						break;
					case PATTERN:
						{
						setState(94);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(100);
			main();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(101);
				match(COMMENT);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Body_functionContext body_function() {
			return getRuleContext(Body_functionContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(DEF);
			setState(108);
			match(MAIN);
			 System.out.println("MAIN"); 
			setState(110);
			match(LPAR);
			setState(111);
			match(RPAR);
			setState(112);
			body_function();
			setState(113);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Builtin_statementContext builtin_statement() {
			return getRuleContext(Builtin_statementContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PUTS);
			 System.out.println("Built-In: PUTS"); 
			setState(117);
			match(LPAR);
			setState(118);
			builtin_statement();
			setState(119);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LBRAC() { return getToken(FunctionCraftParser.LBRAC, 0); }
		public List<Builtin_statementContext> builtin_statement() {
			return getRuleContexts(Builtin_statementContext.class);
		}
		public Builtin_statementContext builtin_statement(int i) {
			return getRuleContext(Builtin_statementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public TerminalNode RBRAC() { return getToken(FunctionCraftParser.RBRAC, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(PUSH);
			 System.out.println("Built-In: PUSH"); 
			setState(123);
			match(LBRAC);
			setState(124);
			builtin_statement();
			setState(125);
			match(COMMA);
			setState(126);
			builtin_statement();
			setState(127);
			match(RBRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Builtin_statementContext builtin_statement() {
			return getRuleContext(Builtin_statementContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(LEN);
			 System.out.println("Built-In: LEN"); 
			setState(131);
			match(LPAR);
			setState(132);
			builtin_statement();
			setState(133);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Builtin_statementContext builtin_statement() {
			return getRuleContext(Builtin_statementContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CHOP);
			 System.out.println("Built-In: CHOP"); 
			setState(137);
			match(LPAR);
			setState(138);
			builtin_statement();
			setState(139);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Builtin_statementContext builtin_statement() {
			return getRuleContext(Builtin_statementContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(CHOMP);
			 System.out.println("Built-In: CHOMP"); 
			setState(143);
			match(LPAR);
			setState(144);
			builtin_statement();
			setState(145);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDENTIFIER);
			 System.out.println("Built-In: MATCH"); 
			setState(149);
			match(DOT);
			setState(150);
			match(MATCH);
			setState(151);
			match(LPAR);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079433045567602688L) != 0)) {
				{
				setState(152);
				expr();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(153);
					match(COMMA);
					setState(154);
					expr();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(162);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public Loop_body_functionContext loop_body_function() {
			return getRuleContext(Loop_body_functionContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LOOP);
			setState(165);
			match(DO);
			 System.out.println("Loop: DO"); 
			setState(167);
			loop_body_function();
			setState(168);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public Loop_body_functionContext loop_body_function() {
			return getRuleContext(Loop_body_functionContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TWODOT() { return getToken(FunctionCraftParser.TWODOT, 0); }
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(FOR);
			 System.out.println("Loop: FOR"); 
			setState(172);
			match(IDENTIFIER);
			setState(173);
			match(IN);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(174);
				match(IDENTIFIER);
				}
				break;
			case LPAR:
				{
				{
				setState(175);
				match(LPAR);
				{
				setState(176);
				expr();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOT) {
					{
					setState(177);
					match(TWODOT);
					setState(178);
					expr();
					}
				}

				}
				setState(181);
				match(RPAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			loop_body_function();
			setState(186);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Body_functionContext body_function() {
			return getRuleContext(Body_functionContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public List<ElseContext> else_() {
			return getRuleContexts(ElseContext.class);
		}
		public ElseContext else_(int i) {
			return getRuleContext(ElseContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IF);
			 System.out.println("Decision: IF");
			setState(190);
			expr();
			setState(191);
			body_function();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(192);
				elseif();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(198);
				else_();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public Body_functionContext body_function() {
			return getRuleContext(Body_functionContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ELSE);
			 System.out.println("Decision: ELSE");
			setState(208);
			body_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Body_functionContext body_function() {
			return getRuleContext(Body_functionContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ELSEIF);
			 System.out.println("Decision: ELSEIF"); 
			setState(212);
			expr();
			setState(213);
			body_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NextContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(NEXT);
			 System.out.println("Control: NEXT"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(BREAK);
			 System.out.println("Control: BREAK"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Next_ifContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Next_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_ifContext next_if() throws RecognitionException {
		Next_ifContext _localctx = new Next_ifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_next_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(NEXT);
			 System.out.println("Control: NEXT"); 
			setState(223);
			match(IF);
			setState(224);
			match(LPAR);
			setState(225);
			expr();
			setState(226);
			match(RPAR);
			setState(227);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_ifContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Break_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_ifContext break_if() throws RecognitionException {
		Break_ifContext _localctx = new Break_ifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_break_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(BREAK);
			 System.out.println("Control: BREAK"); 
			setState(231);
			match(IF);
			setState(232);
			match(LPAR);
			setState(233);
			expr();
			setState(234);
			match(RPAR);
			setState(235);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Token pattern_name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public List<TerminalNode> LBRAC() { return getTokens(FunctionCraftParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(FunctionCraftParser.LBRAC, i);
		}
		public List<Primitive_valContext> primitive_val() {
			return getRuleContexts(Primitive_valContext.class);
		}
		public Primitive_valContext primitive_val(int i) {
			return getRuleContext(Primitive_valContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(PATTERN);
			setState(238);
			((PatternContext)_localctx).pattern_name = match(IDENTIFIER);
			 System.out.println("PatternDec: " + (((PatternContext)_localctx).pattern_name!=null?((PatternContext)_localctx).pattern_name.getText():null)); 
			setState(240);
			match(LPAR);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(241);
				match(IDENTIFIER);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(242);
					match(COMMA);
					setState(243);
					match(IDENTIFIER);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRAC) {
					{
					setState(249);
					match(LBRAC);
					setState(250);
					match(IDENTIFIER);
					setState(251);
					match(ASSIGN);
					setState(252);
					primitive_val();
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(253);
						match(COMMA);
						setState(254);
						match(IDENTIFIER);
						setState(255);
						match(ASSIGN);
						setState(256);
						primitive_val();
						}
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(262);
					match(LBRAC);
					}
				}

				}
			}

			setState(268);
			match(RPAR);
			setState(269);
			match(T__0);
			setState(270);
			expr();
			setState(271);
			match(ASSIGN);
			setState(272);
			expr();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(273);
				match(T__0);
				setState(274);
				expr();
				setState(275);
				match(ASSIGN);
				setState(276);
				expr();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(RETURN);
			 System.out.println("RETURN"); 
			setState(287);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<Expr_andContext> expr_and() {
			return getRuleContexts(Expr_andContext.class);
		}
		public Expr_andContext expr_and(int i) {
			return getRuleContext(Expr_andContext.class,i);
		}
		public List<Expr_orContext> expr_or() {
			return getRuleContexts(Expr_orContext.class);
		}
		public Expr_orContext expr_or(int i) {
			return getRuleContext(Expr_orContext.class,i);
		}
		public List<TerminalNode> JOIN() { return getTokens(FunctionCraftParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(FunctionCraftParser.JOIN, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr_and();
			setState(290);
			expr_or();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JOIN) {
				{
				{
				setState(291);
				match(JOIN);
				setState(292);
				expr_and();
				setState(293);
				expr_or();
				 System.out.println("Operator: <<"); 
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_orContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_or);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(OR);
				setState(302);
				expr_and();
				setState(303);
				expr_or();
				 System.out.println("Operator: ||"); 
				}
				break;
			case T__0:
			case END:
			case RETURN:
			case IF:
			case ELSE:
			case ELSEIF:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case LOOP:
			case FOR:
			case ASSIGN:
			case PLUS:
			case MINUS:
			case NOT:
			case RPAR:
			case LPAR:
			case RBRAC:
			case LBRAC:
			case TWODOT:
			case JOIN:
			case SEMICOLON:
			case COMMA:
			case RARROW:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOLEAN_VAL:
			case IDENTIFIER:
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_andContext extends ParserRuleContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_opContext expr_and_op() {
			return getRuleContext(Expr_and_opContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expr_eq();
			setState(310);
			expr_and_op();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_and_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_opContext expr_and_op() {
			return getRuleContext(Expr_and_opContext.class,0);
		}
		public Expr_and_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_and_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_and_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_and_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_and_opContext expr_and_op() throws RecognitionException {
		Expr_and_opContext _localctx = new Expr_and_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_and_op);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(AND);
				setState(313);
				expr_eq();
				setState(314);
				expr_and_op();
				 System.out.println("Operator: &&"); 
				}
				break;
			case T__0:
			case END:
			case RETURN:
			case IF:
			case ELSE:
			case ELSEIF:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case LOOP:
			case FOR:
			case ASSIGN:
			case PLUS:
			case MINUS:
			case OR:
			case NOT:
			case RPAR:
			case LPAR:
			case RBRAC:
			case LBRAC:
			case TWODOT:
			case JOIN:
			case SEMICOLON:
			case COMMA:
			case RARROW:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOLEAN_VAL:
			case IDENTIFIER:
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_eqContext extends ParserRuleContext {
		public Expr_compareContext expr_compare() {
			return getRuleContext(Expr_compareContext.class,0);
		}
		public Expr_eq_opContext expr_eq_op() {
			return getRuleContext(Expr_eq_opContext.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_eq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			expr_compare();
			setState(321);
			expr_eq_op();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_eq_opContext extends ParserRuleContext {
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public Expr_compareContext expr_compare() {
			return getRuleContext(Expr_compareContext.class,0);
		}
		public Expr_eq_opContext expr_eq_op() {
			return getRuleContext(Expr_eq_opContext.class,0);
		}
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public Expr_eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_eq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_eq_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_eq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_eq_opContext expr_eq_op() throws RecognitionException {
		Expr_eq_opContext _localctx = new Expr_eq_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_eq_op);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQL:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(EQL);
				setState(324);
				expr_compare();
				setState(325);
				expr_eq_op();
				 System.out.println("Operator: =="); 
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(NEQ);
				setState(329);
				expr_compare();
				setState(330);
				expr_eq_op();
				 System.out.println("Operator: !="); 
				}
				break;
			case T__0:
			case END:
			case RETURN:
			case IF:
			case ELSE:
			case ELSEIF:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case LOOP:
			case FOR:
			case ASSIGN:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
			case NOT:
			case RPAR:
			case LPAR:
			case RBRAC:
			case LBRAC:
			case TWODOT:
			case JOIN:
			case SEMICOLON:
			case COMMA:
			case RARROW:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOLEAN_VAL:
			case IDENTIFIER:
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_compareContext extends ParserRuleContext {
		public Expr_plusContext expr_plus() {
			return getRuleContext(Expr_plusContext.class,0);
		}
		public Expr_compare_opContext expr_compare_op() {
			return getRuleContext(Expr_compare_opContext.class,0);
		}
		public Expr_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_compareContext expr_compare() throws RecognitionException {
		Expr_compareContext _localctx = new Expr_compareContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			expr_plus();
			setState(337);
			expr_compare_op();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_compare_opContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(FunctionCraftParser.GREATER, 0); }
		public Expr_plusContext expr_plus() {
			return getRuleContext(Expr_plusContext.class,0);
		}
		public Expr_compare_opContext expr_compare_op() {
			return getRuleContext(Expr_compare_opContext.class,0);
		}
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LESS() { return getToken(FunctionCraftParser.LESS, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public Expr_compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_compare_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_compare_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_compare_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_compare_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_compare_opContext expr_compare_op() throws RecognitionException {
		Expr_compare_opContext _localctx = new Expr_compare_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_compare_op);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(GREATER);
				setState(340);
				expr_plus();
				setState(341);
				expr_compare_op();
				 System.out.println("Operator: >"); 
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(GEQ);
				setState(345);
				expr_plus();
				setState(346);
				expr_compare_op();
				 System.out.println("Operator: >="); 
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(LESS);
				setState(350);
				expr_plus();
				setState(351);
				expr_compare_op();
				 System.out.println("Operator: <"); 
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(LEQ);
				setState(355);
				expr_plus();
				setState(356);
				expr_compare_op();
				 System.out.println("Operator: <="); 
				}
				break;
			case T__0:
			case END:
			case RETURN:
			case IF:
			case ELSE:
			case ELSEIF:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case LOOP:
			case FOR:
			case ASSIGN:
			case PLUS:
			case MINUS:
			case EQL:
			case NEQ:
			case AND:
			case OR:
			case NOT:
			case RPAR:
			case LPAR:
			case RBRAC:
			case LBRAC:
			case TWODOT:
			case JOIN:
			case SEMICOLON:
			case COMMA:
			case RARROW:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOLEAN_VAL:
			case IDENTIFIER:
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_plusContext extends ParserRuleContext {
		public Expr_multiContext expr_multi() {
			return getRuleContext(Expr_multiContext.class,0);
		}
		public Expr_plus_opContext expr_plus_op() {
			return getRuleContext(Expr_plus_opContext.class,0);
		}
		public Expr_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_plusContext expr_plus() throws RecognitionException {
		Expr_plusContext _localctx = new Expr_plusContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			expr_multi();
			setState(363);
			expr_plus_op();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_plus_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public Expr_multiContext expr_multi() {
			return getRuleContext(Expr_multiContext.class,0);
		}
		public Expr_plus_opContext expr_plus_op() {
			return getRuleContext(Expr_plus_opContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Expr_plus_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_plus_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_plus_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_plus_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_plus_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_plus_opContext expr_plus_op() throws RecognitionException {
		Expr_plus_opContext _localctx = new Expr_plus_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_plus_op);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(PLUS);
				setState(366);
				expr_multi();
				 System.out.println("Operator: +"); 
				setState(368);
				expr_plus_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(MINUS);
				setState(371);
				expr_multi();
				 System.out.println("Operator: -"); 
				setState(373);
				expr_plus_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_multiContext extends ParserRuleContext {
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public Expr_multi_opContext expr_multi_op() {
			return getRuleContext(Expr_multi_opContext.class,0);
		}
		public Expr_multiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_multi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_multi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_multi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_multi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_multiContext expr_multi() throws RecognitionException {
		Expr_multiContext _localctx = new Expr_multiContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_multi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			expr_unary();
			setState(379);
			expr_multi_op();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_multi_opContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(FunctionCraftParser.MULTIPLY, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public Expr_multi_opContext expr_multi_op() {
			return getRuleContext(Expr_multi_opContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(FunctionCraftParser.DIVIDE, 0); }
		public Expr_multi_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_multi_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_multi_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_multi_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_multi_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_multi_opContext expr_multi_op() throws RecognitionException {
		Expr_multi_opContext _localctx = new Expr_multi_opContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_multi_op);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(MULTIPLY);
				setState(382);
				expr_unary();
				 System.out.println("Operator: *"); 
				setState(384);
				expr_multi_op();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(DIVIDE);
				setState(387);
				expr_unary();
				 System.out.println("Operator: /"); 
				setState(389);
				expr_multi_op();
				}
				break;
			case T__0:
			case END:
			case RETURN:
			case IF:
			case ELSE:
			case ELSEIF:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case LOOP:
			case FOR:
			case ASSIGN:
			case PLUS:
			case MINUS:
			case EQL:
			case NEQ:
			case GREATER:
			case LESS:
			case GEQ:
			case LEQ:
			case AND:
			case OR:
			case NOT:
			case RPAR:
			case LPAR:
			case RBRAC:
			case LBRAC:
			case TWODOT:
			case JOIN:
			case SEMICOLON:
			case COMMA:
			case RARROW:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOLEAN_VAL:
			case IDENTIFIER:
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_unaryContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public Expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_unaryContext expr_unary() throws RecognitionException {
		Expr_unaryContext _localctx = new Expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_unary);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(PLUS);
				 System.out.println("Operator: +"); 
				setState(396);
				expr_other();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(MINUS);
				 System.out.println("Operator: -"); 
				setState(399);
				expr_other();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(NOT);
				 System.out.println("Operator: !"); 
				setState(402);
				expr_other();
				}
				break;
			case LPAR:
			case LBRAC:
			case RARROW:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOLEAN_VAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				expr_other();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_otherContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_identifierContext list_identifier() {
			return getRuleContext(List_identifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public Primitive_valContext primitive_val() {
			return getRuleContext(Primitive_valContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode TWOPLUS() { return getToken(FunctionCraftParser.TWOPLUS, 0); }
		public TerminalNode TWOMINUS() { return getToken(FunctionCraftParser.TWOMINUS, 0); }
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_other(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_other(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_other);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(LPAR);
				setState(407);
				expr();
				setState(408);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				list_identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				primitive_val();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				function_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(415);
				match(IDENTIFIER);
				setState(416);
				match(TWOPLUS);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(417);
				match(IDENTIFIER);
				setState(418);
				match(TWOMINUS);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(419);
				lambda();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token assignment_name;
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode TWOPLUS() { return getToken(FunctionCraftParser.TWOPLUS, 0); }
		public TerminalNode TWOMINUS() { return getToken(FunctionCraftParser.TWOMINUS, 0); }
		public List<TerminalNode> LBRAC() { return getTokens(FunctionCraftParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(FunctionCraftParser.LBRAC, i);
		}
		public List<TerminalNode> RBRAC() { return getTokens(FunctionCraftParser.RBRAC); }
		public TerminalNode RBRAC(int i) {
			return getToken(FunctionCraftParser.RBRAC, i);
		}
		public List<TerminalNode> INT_VAL() { return getTokens(FunctionCraftParser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(FunctionCraftParser.INT_VAL, i);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public Function_ptrContext function_ptr() {
			return getRuleContext(Function_ptrContext.class,0);
		}
		public TerminalNode PLUSASSIGN() { return getToken(FunctionCraftParser.PLUSASSIGN, 0); }
		public TerminalNode MINUSASSIGN() { return getToken(FunctionCraftParser.MINUSASSIGN, 0); }
		public TerminalNode MULTIPLYASSIGN() { return getToken(FunctionCraftParser.MULTIPLYASSIGN, 0); }
		public TerminalNode DIVIDEASSIGN() { return getToken(FunctionCraftParser.DIVIDEASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(FunctionCraftParser.MODASSIGN, 0); }
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				{
				setState(422);
				match(PLUS);
				}
				break;
			case MINUS:
				{
				setState(423);
				match(MINUS);
				}
				break;
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(427);
			((AssignmentContext)_localctx).assignment_name = match(IDENTIFIER);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRAC) {
				{
				{
				setState(428);
				match(LBRAC);
				setState(429);
				_la = _input.LA(1);
				if ( !(_la==INT_VAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(430);
				match(RBRAC);
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
			case PLUSASSIGN:
			case MINUSASSIGN:
			case MULTIPLYASSIGN:
			case DIVIDEASSIGN:
			case MODASSIGN:
				{
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					{
					setState(436);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042438619136L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(437);
						match();
						}
						break;
					case 2:
						{
						setState(438);
						expr();
						}
						break;
					}
					}
					}
					break;
				case 2:
					{
					setState(441);
					match(ASSIGN);
					setState(442);
					function_ptr();
					}
					break;
				}
				}
				break;
			case TWOPLUS:
				{
				setState(445);
				match(TWOPLUS);
				}
				break;
			case TWOMINUS:
				{
				setState(446);
				match(TWOMINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 System.out.println("Assignment: " + (((AssignmentContext)_localctx).assignment_name!=null?((AssignmentContext)_localctx).assignment_name.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_one_dimContext extends ParserRuleContext {
		public List<Primitive_valContext> primitive_val() {
			return getRuleContexts(Primitive_valContext.class);
		}
		public Primitive_valContext primitive_val(int i) {
			return getRuleContext(Primitive_valContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public List_one_dimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_one_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_one_dim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_one_dim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_one_dim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_one_dimContext list_one_dim() throws RecognitionException {
		List_one_dimContext _localctx = new List_one_dimContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_list_one_dim);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					primitive_val();
					setState(452);
					match(COMMA);
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(459);
			primitive_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRAC() { return getToken(FunctionCraftParser.LBRAC, 0); }
		public TerminalNode RBRAC() { return getToken(FunctionCraftParser.RBRAC, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<List_one_dimContext> list_one_dim() {
			return getRuleContexts(List_one_dimContext.class);
		}
		public List_one_dimContext list_one_dim(int i) {
			return getRuleContext(List_one_dimContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(LBRAC);
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRAC:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOLEAN_VAL:
				{
				{
				setState(464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRAC:
					{
					setState(462);
					list();
					}
					break;
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case BOOLEAN_VAL:
					{
					setState(463);
					list_one_dim();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(466);
					match(COMMA);
					setState(469);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRAC:
						{
						setState(467);
						list();
						}
						break;
					case INT_VAL:
					case FLOAT_VAL:
					case STRING_VAL:
					case BOOLEAN_VAL:
						{
						setState(468);
						list_one_dim();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case RBRAC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(479);
			match(RBRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primitive_valContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public TerminalNode BOOLEAN_VAL() { return getToken(FunctionCraftParser.BOOLEAN_VAL, 0); }
		public Primitive_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPrimitive_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPrimitive_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPrimitive_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_valContext primitive_val() throws RecognitionException {
		Primitive_valContext _localctx = new Primitive_valContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primitive_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4323455642275676160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token function_name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Body_functionContext body_function() {
			return getRuleContext(Body_functionContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public TerminalNode LBRAC() { return getToken(FunctionCraftParser.LBRAC, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<Primitive_valContext> primitive_val() {
			return getRuleContexts(Primitive_valContext.class);
		}
		public Primitive_valContext primitive_val(int i) {
			return getRuleContext(Primitive_valContext.class,i);
		}
		public TerminalNode RBRAC() { return getToken(FunctionCraftParser.RBRAC, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(DEF);
			setState(484);
			((FunctionContext)_localctx).function_name = match(IDENTIFIER);
			 System.out.println("FuncDec: " + (((FunctionContext)_localctx).function_name!=null?((FunctionContext)_localctx).function_name.getText():null)); 
			setState(486);
			match(LPAR);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(487);
				match(IDENTIFIER);
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(488);
						match(COMMA);
						setState(489);
						match(IDENTIFIER);
						}
						} 
					}
					setState(494);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(495);
					match(COMMA);
					}
				}

				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRAC) {
					{
					setState(498);
					match(LBRAC);
					setState(499);
					match(IDENTIFIER);
					setState(500);
					match(ASSIGN);
					setState(501);
					primitive_val();
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(502);
						match(COMMA);
						setState(503);
						match(IDENTIFIER);
						setState(504);
						match(ASSIGN);
						setState(505);
						primitive_val();
						}
						}
						setState(510);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(511);
					match(RBRAC);
					}
				}

				}
			}

			setState(517);
			match(RPAR);
			setState(518);
			body_function();
			setState(519);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_ptrContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_ptr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_ptr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_ptrContext function_ptr() throws RecognitionException {
		Function_ptrContext _localctx = new Function_ptrContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(METHOD);
			setState(522);
			match(LPAR);
			setState(523);
			match(COLON);
			setState(524);
			match(IDENTIFIER);
			setState(525);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(IDENTIFIER);
			 System.out.println("FunctionCall"); 
			setState(529);
			match(LPAR);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079433045567602688L) != 0)) {
				{
				setState(530);
				expr();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(531);
					match(COMMA);
					setState(532);
					expr();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(540);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(FunctionCraftParser.RARROW, 0); }
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public TerminalNode LCBRAC() { return getToken(FunctionCraftParser.LCBRAC, 0); }
		public Body_functionContext body_function() {
			return getRuleContext(Body_functionContext.class,0);
		}
		public TerminalNode RCBRAC() { return getToken(FunctionCraftParser.RCBRAC, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<Primitive_valContext> primitive_val() {
			return getRuleContexts(Primitive_valContext.class);
		}
		public Primitive_valContext primitive_val(int i) {
			return getRuleContext(Primitive_valContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public List<TerminalNode> LBRAC() { return getTokens(FunctionCraftParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(FunctionCraftParser.LBRAC, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(RARROW);
			 System.out.println("Structure: LAMBDA"); 
			setState(544);
			match(LPAR);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(545);
				match(IDENTIFIER);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(546);
					match(COMMA);
					setState(547);
					match(IDENTIFIER);
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRAC) {
					{
					setState(553);
					match(LBRAC);
					setState(554);
					match(IDENTIFIER);
					setState(555);
					match(ASSIGN);
					setState(556);
					primitive_val();
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(557);
						match(COMMA);
						setState(558);
						match(IDENTIFIER);
						setState(559);
						match(ASSIGN);
						setState(560);
						primitive_val();
						}
						}
						setState(565);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(566);
					match(LBRAC);
					}
				}

				}
			}

			setState(572);
			match(RPAR);
			setState(573);
			match(LCBRAC);
			setState(574);
			body_function();
			setState(575);
			match(RCBRAC);
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(576);
				match(LPAR);
				setState(579);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(577);
					match(IDENTIFIER);
					}
					break;
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case BOOLEAN_VAL:
					{
					setState(578);
					primitive_val();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(581);
					match(COMMA);
					setState(584);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(582);
						match(IDENTIFIER);
						}
						break;
					case INT_VAL:
					case FLOAT_VAL:
					case STRING_VAL:
					case BOOLEAN_VAL:
						{
						setState(583);
						primitive_val();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				match(RPAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_body_functionContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<BreakContext> break_() {
			return getRuleContexts(BreakContext.class);
		}
		public BreakContext break_(int i) {
			return getRuleContext(BreakContext.class,i);
		}
		public List<NextContext> next() {
			return getRuleContexts(NextContext.class);
		}
		public NextContext next(int i) {
			return getRuleContext(NextContext.class,i);
		}
		public List<Break_ifContext> break_if() {
			return getRuleContexts(Break_ifContext.class);
		}
		public Break_ifContext break_if(int i) {
			return getRuleContext(Break_ifContext.class,i);
		}
		public List<Next_ifContext> next_if() {
			return getRuleContexts(Next_ifContext.class);
		}
		public Next_ifContext next_if(int i) {
			return getRuleContext(Next_ifContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
		}
		public Loop_body_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_body_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_body_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_body_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_body_functionContext loop_body_function() throws RecognitionException {
		Loop_body_functionContext _localctx = new Loop_body_functionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_loop_body_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -143938991284134304L) != 0)) {
				{
				setState(600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(594);
					statement();
					}
					break;
				case 2:
					{
					setState(595);
					break_();
					}
					break;
				case 3:
					{
					setState(596);
					next();
					}
					break;
				case 4:
					{
					setState(597);
					break_if();
					}
					break;
				case 5:
					{
					setState(598);
					next_if();
					}
					break;
				case 6:
					{
					setState(599);
					match(COMMENT);
					}
					break;
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Body_functionContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
		}
		public Body_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBody_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBody_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBody_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_functionContext body_function() throws RecognitionException {
		Body_functionContext _localctx = new Body_functionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_body_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -143938991284527520L) != 0)) {
				{
				setState(607);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
				case IF:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case LEN:
				case LOOP:
				case FOR:
				case PLUS:
				case MINUS:
				case NOT:
				case LPAR:
				case LBRAC:
				case RARROW:
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case BOOLEAN_VAL:
				case IDENTIFIER:
					{
					setState(605);
					statement();
					}
					break;
				case COMMENT:
					{
					setState(606);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_identifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LBRAC() { return getTokens(FunctionCraftParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(FunctionCraftParser.LBRAC, i);
		}
		public List<TerminalNode> RBRAC() { return getTokens(FunctionCraftParser.RBRAC); }
		public TerminalNode RBRAC(int i) {
			return getToken(FunctionCraftParser.RBRAC, i);
		}
		public List<TerminalNode> INT_VAL() { return getTokens(FunctionCraftParser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(FunctionCraftParser.INT_VAL, i);
		}
		public List_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_identifierContext list_identifier() throws RecognitionException {
		List_identifierContext _localctx = new List_identifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_list_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(IDENTIFIER);
			setState(613);
			match(LBRAC);
			setState(614);
			_la = _input.LA(1);
			if ( !(_la==INT_VAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(615);
			match(RBRAC);
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(616);
					match(LBRAC);
					setState(617);
					_la = _input.LA(1);
					if ( !(_la==INT_VAL || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(618);
					match(RBRAC);
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case PLUS:
			case MINUS:
			case NOT:
			case LPAR:
			case LBRAC:
			case RARROW:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOLEAN_VAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(624);
					puts();
					}
					break;
				case 2:
					{
					setState(625);
					push();
					}
					break;
				case 3:
					{
					setState(626);
					len();
					}
					break;
				case 4:
					{
					setState(627);
					chop();
					}
					break;
				case 5:
					{
					setState(628);
					chomp();
					}
					break;
				case 6:
					{
					setState(629);
					assignment();
					}
					break;
				case 7:
					{
					setState(630);
					return_();
					}
					break;
				case 8:
					{
					setState(631);
					lambda();
					}
					break;
				case 9:
					{
					setState(632);
					expr();
					}
					break;
				}
				setState(635);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				if_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				for_();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Builtin_statementContext extends ParserRuleContext {
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_identifierContext list_identifier() {
			return getRuleContext(List_identifierContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Primitive_valContext primitive_val() {
			return getRuleContext(Primitive_valContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Builtin_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuiltin_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuiltin_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuiltin_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builtin_statementContext builtin_statement() throws RecognitionException {
		Builtin_statementContext _localctx = new Builtin_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_builtin_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(642);
				puts();
				}
				break;
			case 2:
				{
				setState(643);
				push();
				}
				break;
			case 3:
				{
				setState(644);
				len();
				}
				break;
			case 4:
				{
				setState(645);
				chop();
				}
				break;
			case 5:
				{
				setState(646);
				chomp();
				}
				break;
			case 6:
				{
				setState(647);
				list();
				}
				break;
			case 7:
				{
				setState(648);
				list_identifier();
				}
				break;
			case 8:
				{
				setState(649);
				function_call();
				}
				break;
			case 9:
				{
				setState(650);
				primitive_val();
				}
				break;
			case 10:
				{
				setState(651);
				expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u028f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000`\b\u0000\n\u0000"+
		"\f\u0000c\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000g\b\u0000\n\u0000"+
		"\f\u0000j\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u009c\b\u0007\n\u0007\f\u0007\u009f\t\u0007"+
		"\u0003\u0007\u00a1\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b4\b\t\u0001\t\u0001\t\u0003\t\u00b8"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00c2\b\n\n\n\f\n\u00c5\t\n\u0001\n\u0005\n\u00c8\b\n\n\n\f\n\u00cb"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00f5\b\u0011\n\u0011\f\u0011\u00f8\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0102\b\u0011\n\u0011\f\u0011\u0105\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0109\b\u0011\u0003\u0011\u010b\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0117"+
		"\b\u0011\n\u0011\f\u0011\u011a\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0129\b\u0013"+
		"\n\u0013\f\u0013\u012c\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0134\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u013f\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u014f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0169\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0179\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0189\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0195\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u01a5\b \u0001!\u0001!\u0001!\u0003!\u01aa"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0005!\u01b0\b!\n!\f!\u01b3\t!\u0001!"+
		"\u0001!\u0001!\u0003!\u01b8\b!\u0001!\u0001!\u0003!\u01bc\b!\u0001!\u0001"+
		"!\u0003!\u01c0\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u01c7"+
		"\b\"\n\"\f\"\u01ca\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u01d1"+
		"\b#\u0001#\u0001#\u0001#\u0003#\u01d6\b#\u0005#\u01d8\b#\n#\f#\u01db\t"+
		"#\u0001#\u0003#\u01de\b#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0005%\u01eb\b%\n%\f%\u01ee\t%\u0001%\u0003"+
		"%\u01f1\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u01fb\b%\n%\f%\u01fe\t%\u0001%\u0001%\u0003%\u0202\b%\u0003%\u0204\b"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0216\b\'\n"+
		"\'\f\'\u0219\t\'\u0003\'\u021b\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u0225\b(\n(\f(\u0228\t(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0232\b(\n(\f(\u0235\t(\u0001"+
		"(\u0001(\u0003(\u0239\b(\u0003(\u023b\b(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u0244\b(\u0001(\u0001(\u0001(\u0003(\u0249\b(\u0005"+
		"(\u024b\b(\n(\f(\u024e\t(\u0001(\u0003(\u0251\b(\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0001)\u0005)\u0259\b)\n)\f)\u025c\t)\u0001*\u0001*\u0005"+
		"*\u0260\b*\n*\f*\u0263\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u026c\b+\n+\f+\u026f\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u027a\b,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0281\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u028d\b-\u0001-\u0000\u0000.\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0003\u0002\u0000::>>\u0002\u0000\u0017"+
		"\u0017\'+\u0001\u0000:=\u02bf\u0000a\u0001\u0000\u0000\u0000\u0002k\u0001"+
		"\u0000\u0000\u0000\u0004s\u0001\u0000\u0000\u0000\u0006y\u0001\u0000\u0000"+
		"\u0000\b\u0081\u0001\u0000\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000"+
		"\f\u008d\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010"+
		"\u00a4\u0001\u0000\u0000\u0000\u0012\u00aa\u0001\u0000\u0000\u0000\u0014"+
		"\u00bc\u0001\u0000\u0000\u0000\u0016\u00ce\u0001\u0000\u0000\u0000\u0018"+
		"\u00d2\u0001\u0000\u0000\u0000\u001a\u00d7\u0001\u0000\u0000\u0000\u001c"+
		"\u00da\u0001\u0000\u0000\u0000\u001e\u00dd\u0001\u0000\u0000\u0000 \u00e5"+
		"\u0001\u0000\u0000\u0000\"\u00ed\u0001\u0000\u0000\u0000$\u011d\u0001"+
		"\u0000\u0000\u0000&\u0121\u0001\u0000\u0000\u0000(\u0133\u0001\u0000\u0000"+
		"\u0000*\u0135\u0001\u0000\u0000\u0000,\u013e\u0001\u0000\u0000\u0000."+
		"\u0140\u0001\u0000\u0000\u00000\u014e\u0001\u0000\u0000\u00002\u0150\u0001"+
		"\u0000\u0000\u00004\u0168\u0001\u0000\u0000\u00006\u016a\u0001\u0000\u0000"+
		"\u00008\u0178\u0001\u0000\u0000\u0000:\u017a\u0001\u0000\u0000\u0000<"+
		"\u0188\u0001\u0000\u0000\u0000>\u0194\u0001\u0000\u0000\u0000@\u01a4\u0001"+
		"\u0000\u0000\u0000B\u01a9\u0001\u0000\u0000\u0000D\u01c8\u0001\u0000\u0000"+
		"\u0000F\u01cd\u0001\u0000\u0000\u0000H\u01e1\u0001\u0000\u0000\u0000J"+
		"\u01e3\u0001\u0000\u0000\u0000L\u0209\u0001\u0000\u0000\u0000N\u020f\u0001"+
		"\u0000\u0000\u0000P\u021e\u0001\u0000\u0000\u0000R\u025a\u0001\u0000\u0000"+
		"\u0000T\u0261\u0001\u0000\u0000\u0000V\u0264\u0001\u0000\u0000\u0000X"+
		"\u0280\u0001\u0000\u0000\u0000Z\u028c\u0001\u0000\u0000\u0000\\`\u0003"+
		"J%\u0000]`\u0005?\u0000\u0000^`\u0003\"\u0011\u0000_\\\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dh\u0003\u0002\u0001\u0000"+
		"eg\u0005?\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0001\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005\u0002\u0000\u0000lm\u0005"+
		"\u0004\u0000\u0000mn\u0006\u0001\uffff\uffff\u0000no\u0005-\u0000\u0000"+
		"op\u0005,\u0000\u0000pq\u0003T*\u0000qr\u0005\u0003\u0000\u0000r\u0003"+
		"\u0001\u0000\u0000\u0000st\u0005\f\u0000\u0000tu\u0006\u0002\uffff\uffff"+
		"\u0000uv\u0005-\u0000\u0000vw\u0003Z-\u0000wx\u0005,\u0000\u0000x\u0005"+
		"\u0001\u0000\u0000\u0000yz\u0005\u000b\u0000\u0000z{\u0006\u0003\uffff"+
		"\uffff\u0000{|\u0005/\u0000\u0000|}\u0003Z-\u0000}~\u00058\u0000\u0000"+
		"~\u007f\u0003Z-\u0000\u007f\u0080\u0005.\u0000\u0000\u0080\u0007\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u000e\u0000\u0000\u0082\u0083\u0006"+
		"\u0004\uffff\uffff\u0000\u0083\u0084\u0005-\u0000\u0000\u0084\u0085\u0003"+
		"Z-\u0000\u0085\u0086\u0005,\u0000\u0000\u0086\t\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\t\u0000\u0000\u0088\u0089\u0006\u0005\uffff\uffff\u0000"+
		"\u0089\u008a\u0005-\u0000\u0000\u008a\u008b\u0003Z-\u0000\u008b\u008c"+
		"\u0005,\u0000\u0000\u008c\u000b\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\n\u0000\u0000\u008e\u008f\u0006\u0006\uffff\uffff\u0000\u008f\u0090\u0005"+
		"-\u0000\u0000\u0090\u0091\u0003Z-\u0000\u0091\u0092\u0005,\u0000\u0000"+
		"\u0092\r\u0001\u0000\u0000\u0000\u0093\u0094\u0005>\u0000\u0000\u0094"+
		"\u0095\u0006\u0007\uffff\uffff\u0000\u0095\u0096\u00054\u0000\u0000\u0096"+
		"\u0097\u0005\u0010\u0000\u0000\u0097\u00a0\u0005-\u0000\u0000\u0098\u009d"+
		"\u0003&\u0013\u0000\u0099\u009a\u00058\u0000\u0000\u009a\u009c\u0003&"+
		"\u0013\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u0098\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005,\u0000"+
		"\u0000\u00a3\u000f\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0013\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6\u00a7\u0006\b\uffff\uffff"+
		"\u0000\u00a7\u00a8\u0003R)\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9"+
		"\u0011\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0015\u0000\u0000\u00ab"+
		"\u00ac\u0006\t\uffff\uffff\u0000\u00ac\u00ad\u0005>\u0000\u0000\u00ad"+
		"\u00b7\u0005\u0016\u0000\u0000\u00ae\u00b8\u0005>\u0000\u0000\u00af\u00b0"+
		"\u0005-\u0000\u0000\u00b0\u00b3\u0003&\u0013\u0000\u00b1\u00b2\u00052"+
		"\u0000\u0000\u00b2\u00b4\u0003&\u0013\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005,\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003R)\u0000\u00ba\u00bb"+
		"\u0005\u0003\u0000\u0000\u00bb\u0013\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0005\u0006\u0000\u0000\u00bd\u00be\u0006\n\uffff\uffff\u0000\u00be\u00bf"+
		"\u0003&\u0013\u0000\u00bf\u00c3\u0003T*\u0000\u00c0\u00c2\u0003\u0018"+
		"\f\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c9\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c8\u0003\u0016\u000b\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0003\u0000"+
		"\u0000\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0007\u0000"+
		"\u0000\u00cf\u00d0\u0006\u000b\uffff\uffff\u0000\u00d0\u00d1\u0003T*\u0000"+
		"\u00d1\u0017\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\b\u0000\u0000\u00d3"+
		"\u00d4\u0006\f\uffff\uffff\u0000\u00d4\u00d5\u0003&\u0013\u0000\u00d5"+
		"\u00d6\u0003T*\u0000\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\u0011\u0000\u0000\u00d8\u00d9\u0006\r\uffff\uffff\u0000\u00d9\u001b\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\u0012\u0000\u0000\u00db\u00dc\u0006"+
		"\u000e\uffff\uffff\u0000\u00dc\u001d\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005\u0011\u0000\u0000\u00de\u00df\u0006\u000f\uffff\uffff\u0000\u00df"+
		"\u00e0\u0005\u0006\u0000\u0000\u00e0\u00e1\u0005-\u0000\u0000\u00e1\u00e2"+
		"\u0003&\u0013\u0000\u00e2\u00e3\u0005,\u0000\u0000\u00e3\u00e4\u00056"+
		"\u0000\u0000\u00e4\u001f\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0012"+
		"\u0000\u0000\u00e6\u00e7\u0006\u0010\uffff\uffff\u0000\u00e7\u00e8\u0005"+
		"\u0006\u0000\u0000\u00e8\u00e9\u0005-\u0000\u0000\u00e9\u00ea\u0003&\u0013"+
		"\u0000\u00ea\u00eb\u0005,\u0000\u0000\u00eb\u00ec\u00056\u0000\u0000\u00ec"+
		"!\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u000f\u0000\u0000\u00ee\u00ef"+
		"\u0005>\u0000\u0000\u00ef\u00f0\u0006\u0011\uffff\uffff\u0000\u00f0\u010a"+
		"\u0005-\u0000\u0000\u00f1\u00f6\u0005>\u0000\u0000\u00f2\u00f3\u00058"+
		"\u0000\u0000\u00f3\u00f5\u0005>\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u0108\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005/\u0000\u0000"+
		"\u00fa\u00fb\u0005>\u0000\u0000\u00fb\u00fc\u0005\u0017\u0000\u0000\u00fc"+
		"\u0103\u0003H$\u0000\u00fd\u00fe\u00058\u0000\u0000\u00fe\u00ff\u0005"+
		">\u0000\u0000\u00ff\u0100\u0005\u0017\u0000\u0000\u0100\u0102\u0003H$"+
		"\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005/\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000"+
		"\u0108\u00f9\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u00f1\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005,\u0000\u0000\u010d\u010e\u0005\u0001\u0000\u0000\u010e"+
		"\u010f\u0003&\u0013\u0000\u010f\u0110\u0005\u0017\u0000\u0000\u0110\u0118"+
		"\u0003&\u0013\u0000\u0111\u0112\u0005\u0001\u0000\u0000\u0112\u0113\u0003"+
		"&\u0013\u0000\u0113\u0114\u0005\u0017\u0000\u0000\u0114\u0115\u0003&\u0013"+
		"\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0111\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u00056\u0000\u0000"+
		"\u011c#\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0005\u0000\u0000\u011e"+
		"\u011f\u0006\u0012\uffff\uffff\u0000\u011f\u0120\u0003&\u0013\u0000\u0120"+
		"%\u0001\u0000\u0000\u0000\u0121\u0122\u0003*\u0015\u0000\u0122\u012a\u0003"+
		"(\u0014\u0000\u0123\u0124\u00053\u0000\u0000\u0124\u0125\u0003*\u0015"+
		"\u0000\u0125\u0126\u0003(\u0014\u0000\u0126\u0127\u0006\u0013\uffff\uffff"+
		"\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0123\u0001\u0000\u0000"+
		"\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\'\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005%\u0000\u0000\u012e"+
		"\u012f\u0003*\u0015\u0000\u012f\u0130\u0003(\u0014\u0000\u0130\u0131\u0006"+
		"\u0014\uffff\uffff\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0134"+
		"\u0001\u0000\u0000\u0000\u0133\u012d\u0001\u0000\u0000\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0134)\u0001\u0000\u0000\u0000\u0135\u0136\u0003"+
		".\u0017\u0000\u0136\u0137\u0003,\u0016\u0000\u0137+\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005$\u0000\u0000\u0139\u013a\u0003.\u0017\u0000\u013a"+
		"\u013b\u0003,\u0016\u0000\u013b\u013c\u0006\u0016\uffff\uffff\u0000\u013c"+
		"\u013f\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e"+
		"\u0138\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f"+
		"-\u0001\u0000\u0000\u0000\u0140\u0141\u00032\u0019\u0000\u0141\u0142\u0003"+
		"0\u0018\u0000\u0142/\u0001\u0000\u0000\u0000\u0143\u0144\u0005\u001e\u0000"+
		"\u0000\u0144\u0145\u00032\u0019\u0000\u0145\u0146\u00030\u0018\u0000\u0146"+
		"\u0147\u0006\u0018\uffff\uffff\u0000\u0147\u014f\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0005\u001f\u0000\u0000\u0149\u014a\u00032\u0019\u0000\u014a"+
		"\u014b\u00030\u0018\u0000\u014b\u014c\u0006\u0018\uffff\uffff\u0000\u014c"+
		"\u014f\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e"+
		"\u0143\u0001\u0000\u0000\u0000\u014e\u0148\u0001\u0000\u0000\u0000\u014e"+
		"\u014d\u0001\u0000\u0000\u0000\u014f1\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u00036\u001b\u0000\u0151\u0152\u00034\u001a\u0000\u01523\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0005 \u0000\u0000\u0154\u0155\u00036\u001b\u0000"+
		"\u0155\u0156\u00034\u001a\u0000\u0156\u0157\u0006\u001a\uffff\uffff\u0000"+
		"\u0157\u0169\u0001\u0000\u0000\u0000\u0158\u0159\u0005\"\u0000\u0000\u0159"+
		"\u015a\u00036\u001b\u0000\u015a\u015b\u00034\u001a\u0000\u015b\u015c\u0006"+
		"\u001a\uffff\uffff\u0000\u015c\u0169\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0005!\u0000\u0000\u015e\u015f\u00036\u001b\u0000\u015f\u0160\u00034"+
		"\u001a\u0000\u0160\u0161\u0006\u001a\uffff\uffff\u0000\u0161\u0169\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0005#\u0000\u0000\u0163\u0164\u00036\u001b"+
		"\u0000\u0164\u0165\u00034\u001a\u0000\u0165\u0166\u0006\u001a\uffff\uffff"+
		"\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000"+
		"\u0000\u0168\u0153\u0001\u0000\u0000\u0000\u0168\u0158\u0001\u0000\u0000"+
		"\u0000\u0168\u015d\u0001\u0000\u0000\u0000\u0168\u0162\u0001\u0000\u0000"+
		"\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u01695\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0003:\u001d\u0000\u016b\u016c\u00038\u001c\u0000\u016c7"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u0018\u0000\u0000\u016e\u016f"+
		"\u0003:\u001d\u0000\u016f\u0170\u0006\u001c\uffff\uffff\u0000\u0170\u0171"+
		"\u00038\u001c\u0000\u0171\u0179\u0001\u0000\u0000\u0000\u0172\u0173\u0005"+
		"\u0019\u0000\u0000\u0173\u0174\u0003:\u001d\u0000\u0174\u0175\u0006\u001c"+
		"\uffff\uffff\u0000\u0175\u0176\u00038\u001c\u0000\u0176\u0179\u0001\u0000"+
		"\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u016d\u0001\u0000"+
		"\u0000\u0000\u0178\u0172\u0001\u0000\u0000\u0000\u0178\u0177\u0001\u0000"+
		"\u0000\u0000\u01799\u0001\u0000\u0000\u0000\u017a\u017b\u0003>\u001f\u0000"+
		"\u017b\u017c\u0003<\u001e\u0000\u017c;\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0005\u001a\u0000\u0000\u017e\u017f\u0003>\u001f\u0000\u017f\u0180\u0006"+
		"\u001e\uffff\uffff\u0000\u0180\u0181\u0003<\u001e\u0000\u0181\u0189\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0005\u001b\u0000\u0000\u0183\u0184\u0003"+
		">\u001f\u0000\u0184\u0185\u0006\u001e\uffff\uffff\u0000\u0185\u0186\u0003"+
		"<\u001e\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000"+
		"\u0000\u0000\u0188\u017d\u0001\u0000\u0000\u0000\u0188\u0182\u0001\u0000"+
		"\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189=\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005\u0018\u0000\u0000\u018b\u018c\u0006\u001f\uffff"+
		"\uffff\u0000\u018c\u0195\u0003@ \u0000\u018d\u018e\u0005\u0019\u0000\u0000"+
		"\u018e\u018f\u0006\u001f\uffff\uffff\u0000\u018f\u0195\u0003@ \u0000\u0190"+
		"\u0191\u0005&\u0000\u0000\u0191\u0192\u0006\u001f\uffff\uffff\u0000\u0192"+
		"\u0195\u0003@ \u0000\u0193\u0195\u0003@ \u0000\u0194\u018a\u0001\u0000"+
		"\u0000\u0000\u0194\u018d\u0001\u0000\u0000\u0000\u0194\u0190\u0001\u0000"+
		"\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195?\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0005-\u0000\u0000\u0197\u0198\u0003&\u0013\u0000\u0198"+
		"\u0199\u0005,\u0000\u0000\u0199\u01a5\u0001\u0000\u0000\u0000\u019a\u01a5"+
		"\u0003F#\u0000\u019b\u01a5\u0003V+\u0000\u019c\u01a5\u0005>\u0000\u0000"+
		"\u019d\u01a5\u0003H$\u0000\u019e\u01a5\u0003N\'\u0000\u019f\u01a0\u0005"+
		">\u0000\u0000\u01a0\u01a5\u0005\u001c\u0000\u0000\u01a1\u01a2\u0005>\u0000"+
		"\u0000\u01a2\u01a5\u0005\u001d\u0000\u0000\u01a3\u01a5\u0003P(\u0000\u01a4"+
		"\u0196\u0001\u0000\u0000\u0000\u01a4\u019a\u0001\u0000\u0000\u0000\u01a4"+
		"\u019b\u0001\u0000\u0000\u0000\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4"+
		"\u019d\u0001\u0000\u0000\u0000\u01a4\u019e\u0001\u0000\u0000\u0000\u01a4"+
		"\u019f\u0001\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5A\u0001\u0000\u0000\u0000\u01a6\u01aa"+
		"\u0005\u0018\u0000\u0000\u01a7\u01aa\u0005\u0019\u0000\u0000\u01a8\u01aa"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a6\u0001\u0000\u0000\u0000\u01a9\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ab\u01b1\u0005>\u0000\u0000\u01ac\u01ad\u0005"+
		"/\u0000\u0000\u01ad\u01ae\u0007\u0000\u0000\u0000\u01ae\u01b0\u0005.\u0000"+
		"\u0000\u01af\u01ac\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01bf\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b7\u0007\u0001\u0000\u0000\u01b5\u01b8\u0003\u000e\u0007"+
		"\u0000\u01b6\u01b8\u0003&\u0013\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01bc\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0005\u0017\u0000\u0000\u01ba\u01bc\u0003L&\u0000\u01bb\u01b4"+
		"\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01c0"+
		"\u0001\u0000\u0000\u0000\u01bd\u01c0\u0005\u001c\u0000\u0000\u01be\u01c0"+
		"\u0005\u001d\u0000\u0000\u01bf\u01bb\u0001\u0000\u0000\u0000\u01bf\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0006!\uffff\uffff\u0000\u01c2C\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0003H$\u0000\u01c4\u01c5\u00058\u0000"+
		"\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0003H$\u0000\u01cc"+
		"E\u0001\u0000\u0000\u0000\u01cd\u01dd\u0005/\u0000\u0000\u01ce\u01d1\u0003"+
		"F#\u0000\u01cf\u01d1\u0003D\"\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d5\u00058\u0000\u0000\u01d3\u01d6\u0003F#\u0000\u01d4\u01d6"+
		"\u0003D\"\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01de\u0001"+
		"\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01de\u0001"+
		"\u0000\u0000\u0000\u01dd\u01d0\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0005"+
		".\u0000\u0000\u01e0G\u0001\u0000\u0000\u0000\u01e1\u01e2\u0007\u0002\u0000"+
		"\u0000\u01e2I\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u0002\u0000\u0000"+
		"\u01e4\u01e5\u0005>\u0000\u0000\u01e5\u01e6\u0006%\uffff\uffff\u0000\u01e6"+
		"\u0203\u0005-\u0000\u0000\u01e7\u01ec\u0005>\u0000\u0000\u01e8\u01e9\u0005"+
		"8\u0000\u0000\u01e9\u01eb\u0005>\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f1\u00058\u0000\u0000"+
		"\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f1\u0201\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005/\u0000\u0000\u01f3"+
		"\u01f4\u0005>\u0000\u0000\u01f4\u01f5\u0005\u0017\u0000\u0000\u01f5\u01fc"+
		"\u0003H$\u0000\u01f6\u01f7\u00058\u0000\u0000\u01f7\u01f8\u0005>\u0000"+
		"\u0000\u01f8\u01f9\u0005\u0017\u0000\u0000\u01f9\u01fb\u0003H$\u0000\u01fa"+
		"\u01f6\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u01ff\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0005.\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u01f2"+
		"\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204"+
		"\u0001\u0000\u0000\u0000\u0203\u01e7\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0005,\u0000\u0000\u0206\u0207\u0003T*\u0000\u0207\u0208\u0005\u0003"+
		"\u0000\u0000\u0208K\u0001\u0000\u0000\u0000\u0209\u020a\u0005\r\u0000"+
		"\u0000\u020a\u020b\u0005-\u0000\u0000\u020b\u020c\u00057\u0000\u0000\u020c"+
		"\u020d\u0005>\u0000\u0000\u020d\u020e\u0005,\u0000\u0000\u020eM\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0005>\u0000\u0000\u0210\u0211\u0006\'"+
		"\uffff\uffff\u0000\u0211\u021a\u0005-\u0000\u0000\u0212\u0217\u0003&\u0013"+
		"\u0000\u0213\u0214\u00058\u0000\u0000\u0214\u0216\u0003&\u0013\u0000\u0215"+
		"\u0213\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217"+
		"\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218"+
		"\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u021a"+
		"\u0212\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0005,\u0000\u0000\u021dO\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u00059\u0000\u0000\u021f\u0220\u0006(\uffff"+
		"\uffff\u0000\u0220\u023a\u0005-\u0000\u0000\u0221\u0226\u0005>\u0000\u0000"+
		"\u0222\u0223\u00058\u0000\u0000\u0223\u0225\u0005>\u0000\u0000\u0224\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0224"+
		"\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0238"+
		"\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0005/\u0000\u0000\u022a\u022b\u0005>\u0000\u0000\u022b\u022c\u0005\u0017"+
		"\u0000\u0000\u022c\u0233\u0003H$\u0000\u022d\u022e\u00058\u0000\u0000"+
		"\u022e\u022f\u0005>\u0000\u0000\u022f\u0230\u0005\u0017\u0000\u0000\u0230"+
		"\u0232\u0003H$\u0000\u0231\u022d\u0001\u0000\u0000\u0000\u0232\u0235\u0001"+
		"\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001"+
		"\u0000\u0000\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0233\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0005/\u0000\u0000\u0237\u0239\u0001\u0000"+
		"\u0000\u0000\u0238\u0229\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u0221\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000"+
		"\u0000\u0000\u023c\u023d\u0005,\u0000\u0000\u023d\u023e\u00051\u0000\u0000"+
		"\u023e\u023f\u0003T*\u0000\u023f\u0250\u00050\u0000\u0000\u0240\u0243"+
		"\u0005-\u0000\u0000\u0241\u0244\u0005>\u0000\u0000\u0242\u0244\u0003H"+
		"$\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0242\u0001\u0000\u0000"+
		"\u0000\u0244\u024c\u0001\u0000\u0000\u0000\u0245\u0248\u00058\u0000\u0000"+
		"\u0246\u0249\u0005>\u0000\u0000\u0247\u0249\u0003H$\u0000\u0248\u0246"+
		"\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024b"+
		"\u0001\u0000\u0000\u0000\u024a\u0245\u0001\u0000\u0000\u0000\u024b\u024e"+
		"\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d"+
		"\u0001\u0000\u0000\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u024c"+
		"\u0001\u0000\u0000\u0000\u024f\u0251\u0005,\u0000\u0000\u0250\u0240\u0001"+
		"\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251Q\u0001\u0000"+
		"\u0000\u0000\u0252\u0259\u0003X,\u0000\u0253\u0259\u0003\u001c\u000e\u0000"+
		"\u0254\u0259\u0003\u001a\r\u0000\u0255\u0259\u0003 \u0010\u0000\u0256"+
		"\u0259\u0003\u001e\u000f\u0000\u0257\u0259\u0005?\u0000\u0000\u0258\u0252"+
		"\u0001\u0000\u0000\u0000\u0258\u0253\u0001\u0000\u0000\u0000\u0258\u0254"+
		"\u0001\u0000\u0000\u0000\u0258\u0255\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259\u025c"+
		"\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0001\u0000\u0000\u0000\u025bS\u0001\u0000\u0000\u0000\u025c\u025a\u0001"+
		"\u0000\u0000\u0000\u025d\u0260\u0003X,\u0000\u025e\u0260\u0005?\u0000"+
		"\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000"+
		"\u0000\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262U\u0001\u0000\u0000\u0000"+
		"\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0265\u0005>\u0000\u0000\u0265"+
		"\u0266\u0005/\u0000\u0000\u0266\u0267\u0007\u0000\u0000\u0000\u0267\u026d"+
		"\u0005.\u0000\u0000\u0268\u0269\u0005/\u0000\u0000\u0269\u026a\u0007\u0000"+
		"\u0000\u0000\u026a\u026c\u0005.\u0000\u0000\u026b\u0268\u0001\u0000\u0000"+
		"\u0000\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000"+
		"\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026eW\u0001\u0000\u0000\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u027a\u0003\u0004\u0002\u0000"+
		"\u0271\u027a\u0003\u0006\u0003\u0000\u0272\u027a\u0003\b\u0004\u0000\u0273"+
		"\u027a\u0003\n\u0005\u0000\u0274\u027a\u0003\f\u0006\u0000\u0275\u027a"+
		"\u0003B!\u0000\u0276\u027a\u0003$\u0012\u0000\u0277\u027a\u0003P(\u0000"+
		"\u0278\u027a\u0003&\u0013\u0000\u0279\u0270\u0001\u0000\u0000\u0000\u0279"+
		"\u0271\u0001\u0000\u0000\u0000\u0279\u0272\u0001\u0000\u0000\u0000\u0279"+
		"\u0273\u0001\u0000\u0000\u0000\u0279\u0274\u0001\u0000\u0000\u0000\u0279"+
		"\u0275\u0001\u0000\u0000\u0000\u0279\u0276\u0001\u0000\u0000\u0000\u0279"+
		"\u0277\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u00056\u0000\u0000\u027c\u0281"+
		"\u0001\u0000\u0000\u0000\u027d\u0281\u0003\u0014\n\u0000\u027e\u0281\u0003"+
		"\u0012\t\u0000\u027f\u0281\u0003\u0010\b\u0000\u0280\u0279\u0001\u0000"+
		"\u0000\u0000\u0280\u027d\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000"+
		"\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281Y\u0001\u0000\u0000"+
		"\u0000\u0282\u028d\u0003\u0004\u0002\u0000\u0283\u028d\u0003\u0006\u0003"+
		"\u0000\u0284\u028d\u0003\b\u0004\u0000\u0285\u028d\u0003\n\u0005\u0000"+
		"\u0286\u028d\u0003\f\u0006\u0000\u0287\u028d\u0003F#\u0000\u0288\u028d"+
		"\u0003V+\u0000\u0289\u028d\u0003N\'\u0000\u028a\u028d\u0003H$\u0000\u028b"+
		"\u028d\u0003&\u0013\u0000\u028c\u0282\u0001\u0000\u0000\u0000\u028c\u0283"+
		"\u0001\u0000\u0000\u0000\u028c\u0284\u0001\u0000\u0000\u0000\u028c\u0285"+
		"\u0001\u0000\u0000\u0000\u028c\u0286\u0001\u0000\u0000\u0000\u028c\u0287"+
		"\u0001\u0000\u0000\u0000\u028c\u0288\u0001\u0000\u0000\u0000\u028c\u0289"+
		"\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028b"+
		"\u0001\u0000\u0000\u0000\u028d[\u0001\u0000\u0000\u00008_ah\u009d\u00a0"+
		"\u00b3\u00b7\u00c3\u00c9\u00f6\u0103\u0108\u010a\u0118\u012a\u0133\u013e"+
		"\u014e\u0168\u0178\u0188\u0194\u01a4\u01a9\u01b1\u01b7\u01bb\u01bf\u01c8"+
		"\u01d0\u01d5\u01d9\u01dd\u01ec\u01f0\u01fc\u0201\u0203\u0217\u021a\u0226"+
		"\u0233\u0238\u023a\u0243\u0248\u024c\u0250\u0258\u025a\u025f\u0261\u026d"+
		"\u0279\u0280\u028c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}