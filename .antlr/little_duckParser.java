// Generated from c:/Users/emili/Desktop/TEC/Clases/Compis/BabyDuck/little_duck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class little_duckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, ELSE=30, CTE_INT=31, 
		CTE_FLOAT=32, ID=33, CTE_STRING=34, WS=35;
	public static final int
		RULE_programa = 0, RULE_type = 1, RULE_cte = 2, RULE_list_ids = 3, RULE_more_ids = 4, 
		RULE_vars = 5, RULE_variables = 6, RULE_mas_variables = 7, RULE_body = 8, 
		RULE_list_body = 9, RULE_more_statements = 10, RULE_statement = 11, RULE_assign = 12, 
		RULE_mega_expression = 13, RULE_mas_mega_exp = 14, RULE_mega_exp_op = 15, 
		RULE_expression = 16, RULE_mas_exp = 17, RULE_expression_operator = 18, 
		RULE_exp = 19, RULE_exp_operator = 20, RULE_termino = 21, RULE_termino_operator = 22, 
		RULE_factor = 23, RULE_parenthesis_factor_expression = 24, RULE_factor_value = 25, 
		RULE_factor_operator = 26, RULE_value = 27, RULE_print = 28, RULE_list_prints = 29, 
		RULE_print_more_expressions = 30, RULE_cycle = 31, RULE_condition = 32, 
		RULE_if_condition = 33, RULE_end_condition = 34, RULE_f_call = 35, RULE_has_exp = 36, 
		RULE_list_call_exp = 37, RULE_more_call_expressions = 38, RULE_funcs = 39, 
		RULE_has_params = 40, RULE_list_params = 41, RULE_more_params = 42, RULE_add_vars = 43, 
		RULE_start_ = 44, RULE_equal_sign = 45, RULE_main = 46, RULE_if = 47, 
		RULE_while = 48, RULE_do = 49, RULE_close_parenthesis = 50, RULE_open_parenthesis = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "type", "cte", "list_ids", "more_ids", "vars", "variables", 
			"mas_variables", "body", "list_body", "more_statements", "statement", 
			"assign", "mega_expression", "mas_mega_exp", "mega_exp_op", "expression", 
			"mas_exp", "expression_operator", "exp", "exp_operator", "termino", "termino_operator", 
			"factor", "parenthesis_factor_expression", "factor_value", "factor_operator", 
			"value", "print", "list_prints", "print_more_expressions", "cycle", "condition", 
			"if_condition", "end_condition", "f_call", "has_exp", "list_call_exp", 
			"more_call_expressions", "funcs", "has_params", "list_params", "more_params", 
			"add_vars", "start_", "equal_sign", "main", "if", "while", "do", "close_parenthesis", 
			"open_parenthesis"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'end'", "'int'", "'float'", "','", "'var'", 
			"':'", "'{'", "'}'", "'and'", "'>'", "'<'", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'('", "')'", "'print('", "'void'", "'['", "']'", "'='", "'main'", 
			"'if'", "'while'", "'do'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ELSE", "CTE_INT", "CTE_FLOAT", "ID", 
			"CTE_STRING", "WS"
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
	public String getGrammarFileName() { return "little_duck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public little_duckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(little_duckParser.ID, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<FuncsContext> funcs() {
			return getRuleContexts(FuncsContext.class);
		}
		public FuncsContext funcs(int i) {
			return getRuleContext(FuncsContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__0);
			setState(105);
			match(ID);
			setState(106);
			match(T__1);
			setState(107);
			vars();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(108);
				funcs();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			main();
			setState(115);
			body();
			setState(116);
			match(T__2);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
	public static class CteContext extends ParserRuleContext {
		public TerminalNode CTE_INT() { return getToken(little_duckParser.CTE_INT, 0); }
		public TerminalNode CTE_FLOAT() { return getToken(little_duckParser.CTE_FLOAT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==CTE_INT || _la==CTE_FLOAT) ) {
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
	public static class List_idsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(little_duckParser.ID, 0); }
		public More_idsContext more_ids() {
			return getRuleContext(More_idsContext.class,0);
		}
		public List_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_ids; }
	}

	public final List_idsContext list_ids() throws RecognitionException {
		List_idsContext _localctx = new List_idsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(123);
				more_ids();
				}
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
	public static class More_idsContext extends ParserRuleContext {
		public List_idsContext list_ids() {
			return getRuleContext(List_idsContext.class,0);
		}
		public More_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_ids; }
	}

	public final More_idsContext more_ids() throws RecognitionException {
		More_idsContext _localctx = new More_idsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_more_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__5);
			setState(127);
			list_ids();
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
	public static class VarsContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(129);
				match(T__6);
				setState(130);
				variables();
				}
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
	public static class VariablesContext extends ParserRuleContext {
		public List_idsContext list_ids() {
			return getRuleContext(List_idsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Mas_variablesContext mas_variables() {
			return getRuleContext(Mas_variablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			list_ids();
			setState(134);
			match(T__7);
			setState(135);
			type();
			setState(136);
			match(T__1);
			setState(137);
			mas_variables();
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
	public static class Mas_variablesContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public Mas_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_variables; }
	}

	public final Mas_variablesContext mas_variables() throws RecognitionException {
		Mas_variablesContext _localctx = new Mas_variablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mas_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(139);
				variables();
				}
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
	public static class BodyContext extends ParserRuleContext {
		public List_bodyContext list_body() {
			return getRuleContext(List_bodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__8);
			setState(143);
			list_body();
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
	public static class List_bodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public More_statementsContext more_statements() {
			return getRuleContext(More_statementsContext.class,0);
		}
		public List_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_body; }
	}

	public final List_bodyContext list_body() throws RecognitionException {
		List_bodyContext _localctx = new List_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list_body);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__9);
				}
				break;
			case T__14:
			case T__15:
			case T__18:
			case T__20:
			case T__26:
			case T__28:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				statement();
				setState(147);
				more_statements();
				setState(148);
				match(T__9);
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
	public static class More_statementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public More_statementsContext more_statements() {
			return getRuleContext(More_statementsContext.class,0);
		}
		public More_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_statements; }
	}

	public final More_statementsContext more_statements() throws RecognitionException {
		More_statementsContext _localctx = new More_statementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_more_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15706193920L) != 0)) {
				{
				setState(152);
				statement();
				setState(153);
				more_statements();
				}
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				expression();
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(little_duckParser.ID, 0); }
		public Equal_signContext equal_sign() {
			return getRuleContext(Equal_signContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			setState(166);
			equal_sign();
			setState(167);
			expression();
			setState(168);
			match(T__1);
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
	public static class Mega_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Mas_mega_expContext mas_mega_exp() {
			return getRuleContext(Mas_mega_expContext.class,0);
		}
		public Mega_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mega_expression; }
	}

	public final Mega_expressionContext mega_expression() throws RecognitionException {
		Mega_expressionContext _localctx = new Mega_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mega_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			expression();
			setState(171);
			mas_mega_exp();
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
	public static class Mas_mega_expContext extends ParserRuleContext {
		public Mega_exp_opContext mega_exp_op() {
			return getRuleContext(Mega_exp_opContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Mas_mega_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_mega_exp; }
	}

	public final Mas_mega_expContext mas_mega_exp() throws RecognitionException {
		Mas_mega_expContext _localctx = new Mas_mega_expContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mas_mega_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(173);
				mega_exp_op();
				setState(174);
				expression();
				}
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
	public static class Mega_exp_opContext extends ParserRuleContext {
		public Mega_exp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mega_exp_op; }
	}

	public final Mega_exp_opContext mega_exp_op() throws RecognitionException {
		Mega_exp_opContext _localctx = new Mega_exp_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mega_exp_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__10);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Mas_expContext mas_exp() {
			return getRuleContext(Mas_expContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			exp();
			setState(181);
			mas_exp();
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
	public static class Mas_expContext extends ParserRuleContext {
		public Expression_operatorContext expression_operator() {
			return getRuleContext(Expression_operatorContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Mas_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_exp; }
	}

	public final Mas_expContext mas_exp() throws RecognitionException {
		Mas_expContext _localctx = new Mas_expContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mas_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) {
				{
				setState(183);
				expression_operator();
				setState(184);
				exp();
				}
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
	public static class Expression_operatorContext extends ParserRuleContext {
		public Expression_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_operator; }
	}

	public final Expression_operatorContext expression_operator() throws RecognitionException {
		Expression_operatorContext _localctx = new Expression_operatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
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
	public static class ExpContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<Exp_operatorContext> exp_operator() {
			return getRuleContexts(Exp_operatorContext.class);
		}
		public Exp_operatorContext exp_operator(int i) {
			return getRuleContext(Exp_operatorContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			termino();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					exp_operator();
					setState(192);
					termino();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class Exp_operatorContext extends ParserRuleContext {
		public Exp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_operator; }
	}

	public final Exp_operatorContext exp_operator() throws RecognitionException {
		Exp_operatorContext _localctx = new Exp_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Termino_operatorContext> termino_operator() {
			return getRuleContexts(Termino_operatorContext.class);
		}
		public Termino_operatorContext termino_operator(int i) {
			return getRuleContext(Termino_operatorContext.class,i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			factor();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				{
				setState(202);
				termino_operator();
				setState(203);
				factor();
				}
				}
				setState(209);
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
	public static class Termino_operatorContext extends ParserRuleContext {
		public Termino_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_operator; }
	}

	public final Termino_operatorContext termino_operator() throws RecognitionException {
		Termino_operatorContext _localctx = new Termino_operatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_termino_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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
	public static class FactorContext extends ParserRuleContext {
		public Parenthesis_factor_expressionContext parenthesis_factor_expression() {
			return getRuleContext(Parenthesis_factor_expressionContext.class,0);
		}
		public Factor_valueContext factor_value() {
			return getRuleContext(Factor_valueContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				parenthesis_factor_expression();
				}
				break;
			case T__14:
			case T__15:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				factor_value();
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
	public static class Parenthesis_factor_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parenthesis_factor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_factor_expression; }
	}

	public final Parenthesis_factor_expressionContext parenthesis_factor_expression() throws RecognitionException {
		Parenthesis_factor_expressionContext _localctx = new Parenthesis_factor_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parenthesis_factor_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__18);
			setState(217);
			expression();
			setState(218);
			match(T__19);
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
	public static class Factor_valueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Factor_operatorContext factor_operator() {
			return getRuleContext(Factor_operatorContext.class,0);
		}
		public Factor_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_value; }
	}

	public final Factor_valueContext factor_value() throws RecognitionException {
		Factor_valueContext _localctx = new Factor_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__15) {
				{
				setState(220);
				factor_operator();
				}
			}

			setState(223);
			value();
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
	public static class Factor_operatorContext extends ParserRuleContext {
		public Factor_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_operator; }
	}

	public final Factor_operatorContext factor_operator() throws RecognitionException {
		Factor_operatorContext _localctx = new Factor_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(little_duckParser.ID, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(ID);
				}
				break;
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				cte();
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
	public static class PrintContext extends ParserRuleContext {
		public List_printsContext list_prints() {
			return getRuleContext(List_printsContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__20);
			setState(232);
			list_prints();
			setState(233);
			match(T__19);
			setState(234);
			match(T__1);
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
	public static class List_printsContext extends ParserRuleContext {
		public Mega_expressionContext mega_expression() {
			return getRuleContext(Mega_expressionContext.class,0);
		}
		public Print_more_expressionsContext print_more_expressions() {
			return getRuleContext(Print_more_expressionsContext.class,0);
		}
		public TerminalNode CTE_STRING() { return getToken(little_duckParser.CTE_STRING, 0); }
		public List_printsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_prints; }
	}

	public final List_printsContext list_prints() throws RecognitionException {
		List_printsContext _localctx = new List_printsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_list_prints);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__18:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(236);
				mega_expression();
				setState(237);
				print_more_expressions();
				}
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(CTE_STRING);
				setState(240);
				print_more_expressions();
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
	public static class Print_more_expressionsContext extends ParserRuleContext {
		public List_printsContext list_prints() {
			return getRuleContext(List_printsContext.class,0);
		}
		public Print_more_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_more_expressions; }
	}

	public final Print_more_expressionsContext print_more_expressions() throws RecognitionException {
		Print_more_expressionsContext _localctx = new Print_more_expressionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_print_more_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(243);
				match(T__5);
				setState(244);
				list_prints();
				}
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
	public static class CycleContext extends ParserRuleContext {
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public Open_parenthesisContext open_parenthesis() {
			return getRuleContext(Open_parenthesisContext.class,0);
		}
		public Mega_expressionContext mega_expression() {
			return getRuleContext(Mega_expressionContext.class,0);
		}
		public Close_parenthesisContext close_parenthesis() {
			return getRuleContext(Close_parenthesisContext.class,0);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			do_();
			setState(248);
			body();
			setState(249);
			while_();
			setState(250);
			open_parenthesis();
			setState(251);
			mega_expression();
			setState(252);
			close_parenthesis();
			setState(253);
			match(T__1);
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
	public static class ConditionContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public End_conditionContext end_condition() {
			return getRuleContext(End_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			if_();
			setState(256);
			if_condition();
			setState(257);
			body();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(258);
				end_condition();
				}
			}

			setState(261);
			match(T__1);
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
	public static class If_conditionContext extends ParserRuleContext {
		public Open_parenthesisContext open_parenthesis() {
			return getRuleContext(Open_parenthesisContext.class,0);
		}
		public Mega_expressionContext mega_expression() {
			return getRuleContext(Mega_expressionContext.class,0);
		}
		public Close_parenthesisContext close_parenthesis() {
			return getRuleContext(Close_parenthesisContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_if_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			open_parenthesis();
			setState(264);
			mega_expression();
			setState(265);
			close_parenthesis();
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
	public static class End_conditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(little_duckParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public End_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_condition; }
	}

	public final End_conditionContext end_condition() throws RecognitionException {
		End_conditionContext _localctx = new End_conditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_end_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ELSE);
			setState(268);
			body();
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
	public static class F_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(little_duckParser.ID, 0); }
		public Has_expContext has_exp() {
			return getRuleContext(Has_expContext.class,0);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_f_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(271);
			match(T__18);
			setState(272);
			has_exp();
			setState(273);
			match(T__19);
			setState(274);
			match(T__1);
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
	public static class Has_expContext extends ParserRuleContext {
		public List_call_expContext list_call_exp() {
			return getRuleContext(List_call_expContext.class,0);
		}
		public Has_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_exp; }
	}

	public final Has_expContext has_exp() throws RecognitionException {
		Has_expContext _localctx = new Has_expContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_has_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15033008128L) != 0)) {
				{
				setState(276);
				list_call_exp();
				}
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
	public static class List_call_expContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public More_call_expressionsContext more_call_expressions() {
			return getRuleContext(More_call_expressionsContext.class,0);
		}
		public List_call_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_call_exp; }
	}

	public final List_call_expContext list_call_exp() throws RecognitionException {
		List_call_expContext _localctx = new List_call_expContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list_call_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expression();
			setState(280);
			more_call_expressions();
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
	public static class More_call_expressionsContext extends ParserRuleContext {
		public List_call_expContext list_call_exp() {
			return getRuleContext(List_call_expContext.class,0);
		}
		public More_call_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_call_expressions; }
	}

	public final More_call_expressionsContext more_call_expressions() throws RecognitionException {
		More_call_expressionsContext _localctx = new More_call_expressionsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_more_call_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(282);
				match(T__5);
				setState(283);
				list_call_exp();
				}
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
	public static class FuncsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(little_duckParser.ID, 0); }
		public Has_paramsContext has_params() {
			return getRuleContext(Has_paramsContext.class,0);
		}
		public Add_varsContext add_vars() {
			return getRuleContext(Add_varsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_funcs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286);
			match(T__21);
			setState(287);
			match(ID);
			setState(288);
			match(T__18);
			setState(289);
			has_params();
			setState(290);
			match(T__19);
			setState(291);
			match(T__22);
			setState(292);
			add_vars();
			setState(293);
			body();
			setState(294);
			match(T__23);
			setState(295);
			match(T__1);
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
	public static class Has_paramsContext extends ParserRuleContext {
		public List_paramsContext list_params() {
			return getRuleContext(List_paramsContext.class,0);
		}
		public Has_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_params; }
	}

	public final Has_paramsContext has_params() throws RecognitionException {
		Has_paramsContext _localctx = new Has_paramsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_has_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(297);
				list_params();
				}
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
	public static class List_paramsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(little_duckParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public More_paramsContext more_params() {
			return getRuleContext(More_paramsContext.class,0);
		}
		public List_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_params; }
	}

	public final List_paramsContext list_params() throws RecognitionException {
		List_paramsContext _localctx = new List_paramsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_list_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(ID);
			setState(301);
			match(T__7);
			setState(302);
			type();
			setState(303);
			more_params();
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
	public static class More_paramsContext extends ParserRuleContext {
		public List_paramsContext list_params() {
			return getRuleContext(List_paramsContext.class,0);
		}
		public More_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_params; }
	}

	public final More_paramsContext more_params() throws RecognitionException {
		More_paramsContext _localctx = new More_paramsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_more_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(305);
				match(T__5);
				setState(306);
				list_params();
				}
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
	public static class Add_varsContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public Add_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_vars; }
	}

	public final Add_varsContext add_vars() throws RecognitionException {
		Add_varsContext _localctx = new Add_varsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_add_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			vars();
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
	public static class Start_Context extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(little_duckParser.EOF, 0); }
		public Start_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_; }
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_start_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			programa();
			setState(312);
			match(EOF);
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
	public static class Equal_signContext extends ParserRuleContext {
		public Equal_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_sign; }
	}

	public final Equal_signContext equal_sign() throws RecognitionException {
		Equal_signContext _localctx = new Equal_signContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_equal_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__24);
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
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__25);
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
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__26);
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
	public static class WhileContext extends ParserRuleContext {
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__27);
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
	public static class DoContext extends ParserRuleContext {
		public DoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do; }
	}

	public final DoContext do_() throws RecognitionException {
		DoContext _localctx = new DoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__28);
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
	public static class Close_parenthesisContext extends ParserRuleContext {
		public Close_parenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_parenthesis; }
	}

	public final Close_parenthesisContext close_parenthesis() throws RecognitionException {
		Close_parenthesisContext _localctx = new Close_parenthesisContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_close_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__19);
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
	public static class Open_parenthesisContext extends ParserRuleContext {
		public Open_parenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_parenthesis; }
	}

	public final Open_parenthesisContext open_parenthesis() throws RecognitionException {
		Open_parenthesisContext _localctx = new Open_parenthesisContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_open_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__18);
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
		"\u0004\u0001#\u0149\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000n\b\u0000\n\u0000\f\u0000q\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0084\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0003\u0007\u008d\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0097\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u009c\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00a4\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b1\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00bb\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00c3\b\u0013\n\u0013\f\u0013\u00c6\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00ce"+
		"\b\u0015\n\u0015\f\u0015\u00d1\t\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u00d7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0003\u0019\u00de\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u00e6\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u00f2\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u00f6\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u0104\b \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0003$\u0116\b$\u0001%\u0001%\u0001%\u0001&\u0001&\u0003"+
		"&\u011d\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0003(\u012b\b(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0003*\u0134\b*\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u0001"+
		"1\u00011\u00012\u00012\u00013\u00013\u00013\u0000\u00004\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0005\u0001\u0000\u0004\u0005"+
		"\u0001\u0000\u001f \u0001\u0000\f\u000e\u0001\u0000\u000f\u0010\u0001"+
		"\u0000\u0011\u0012\u012d\u0000h\u0001\u0000\u0000\u0000\u0002v\u0001\u0000"+
		"\u0000\u0000\u0004x\u0001\u0000\u0000\u0000\u0006z\u0001\u0000\u0000\u0000"+
		"\b~\u0001\u0000\u0000\u0000\n\u0083\u0001\u0000\u0000\u0000\f\u0085\u0001"+
		"\u0000\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u008e\u0001"+
		"\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014\u009b\u0001"+
		"\u0000\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000\u0018\u00a5\u0001"+
		"\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000\u0000\u001c\u00b0\u0001"+
		"\u0000\u0000\u0000\u001e\u00b2\u0001\u0000\u0000\u0000 \u00b4\u0001\u0000"+
		"\u0000\u0000\"\u00ba\u0001\u0000\u0000\u0000$\u00bc\u0001\u0000\u0000"+
		"\u0000&\u00be\u0001\u0000\u0000\u0000(\u00c7\u0001\u0000\u0000\u0000*"+
		"\u00c9\u0001\u0000\u0000\u0000,\u00d2\u0001\u0000\u0000\u0000.\u00d6\u0001"+
		"\u0000\u0000\u00000\u00d8\u0001\u0000\u0000\u00002\u00dd\u0001\u0000\u0000"+
		"\u00004\u00e1\u0001\u0000\u0000\u00006\u00e5\u0001\u0000\u0000\u00008"+
		"\u00e7\u0001\u0000\u0000\u0000:\u00f1\u0001\u0000\u0000\u0000<\u00f5\u0001"+
		"\u0000\u0000\u0000>\u00f7\u0001\u0000\u0000\u0000@\u00ff\u0001\u0000\u0000"+
		"\u0000B\u0107\u0001\u0000\u0000\u0000D\u010b\u0001\u0000\u0000\u0000F"+
		"\u010e\u0001\u0000\u0000\u0000H\u0115\u0001\u0000\u0000\u0000J\u0117\u0001"+
		"\u0000\u0000\u0000L\u011c\u0001\u0000\u0000\u0000N\u011e\u0001\u0000\u0000"+
		"\u0000P\u012a\u0001\u0000\u0000\u0000R\u012c\u0001\u0000\u0000\u0000T"+
		"\u0133\u0001\u0000\u0000\u0000V\u0135\u0001\u0000\u0000\u0000X\u0137\u0001"+
		"\u0000\u0000\u0000Z\u013a\u0001\u0000\u0000\u0000\\\u013c\u0001\u0000"+
		"\u0000\u0000^\u013e\u0001\u0000\u0000\u0000`\u0140\u0001\u0000\u0000\u0000"+
		"b\u0142\u0001\u0000\u0000\u0000d\u0144\u0001\u0000\u0000\u0000f\u0146"+
		"\u0001\u0000\u0000\u0000hi\u0005\u0001\u0000\u0000ij\u0005!\u0000\u0000"+
		"jk\u0005\u0002\u0000\u0000ko\u0003\n\u0005\u0000ln\u0003N\'\u0000ml\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rs\u0003\\.\u0000st\u0003\u0010\b\u0000tu\u0005\u0003\u0000\u0000"+
		"u\u0001\u0001\u0000\u0000\u0000vw\u0007\u0000\u0000\u0000w\u0003\u0001"+
		"\u0000\u0000\u0000xy\u0007\u0001\u0000\u0000y\u0005\u0001\u0000\u0000"+
		"\u0000z|\u0005!\u0000\u0000{}\u0003\b\u0004\u0000|{\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u0007\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0006\u0000\u0000\u007f\u0080\u0003\u0006\u0003\u0000\u0080\t\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u0084\u0003"+
		"\f\u0006\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u000b\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u0006"+
		"\u0003\u0000\u0086\u0087\u0005\b\u0000\u0000\u0087\u0088\u0003\u0002\u0001"+
		"\u0000\u0088\u0089\u0005\u0002\u0000\u0000\u0089\u008a\u0003\u000e\u0007"+
		"\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b\u008d\u0003\f\u0006\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f"+
		"\u0090\u0003\u0012\t\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0097"+
		"\u0005\n\u0000\u0000\u0092\u0093\u0003\u0016\u000b\u0000\u0093\u0094\u0003"+
		"\u0014\n\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u0097\u0001\u0000"+
		"\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000"+
		"\u0000\u0000\u0097\u0013\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0016"+
		"\u000b\u0000\u0099\u009a\u0003\u0014\n\u0000\u009a\u009c\u0001\u0000\u0000"+
		"\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u0015\u0001\u0000\u0000\u0000\u009d\u00a4\u0003\u0018\f\u0000"+
		"\u009e\u00a4\u0003@ \u0000\u009f\u00a4\u0003>\u001f\u0000\u00a0\u00a4"+
		"\u0003F#\u0000\u00a1\u00a4\u00038\u001c\u0000\u00a2\u00a4\u0003 \u0010"+
		"\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000"+
		"\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u0017\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005!\u0000\u0000"+
		"\u00a6\u00a7\u0003Z-\u0000\u00a7\u00a8\u0003 \u0010\u0000\u00a8\u00a9"+
		"\u0005\u0002\u0000\u0000\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0003 \u0010\u0000\u00ab\u00ac\u0003\u001c\u000e\u0000\u00ac\u001b\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0003\u001e\u000f\u0000\u00ae\u00af\u0003"+
		" \u0010\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u001d\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u000b\u0000\u0000\u00b3\u001f\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0003&\u0013\u0000\u00b5\u00b6\u0003\"\u0011"+
		"\u0000\u00b6!\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003$\u0012\u0000\u00b8"+
		"\u00b9\u0003&\u0013\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b7"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb#\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0007\u0002\u0000\u0000\u00bd%\u0001\u0000"+
		"\u0000\u0000\u00be\u00c4\u0003*\u0015\u0000\u00bf\u00c0\u0003(\u0014\u0000"+
		"\u00c0\u00c1\u0003*\u0015\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\'\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0007\u0003\u0000\u0000\u00c8)\u0001\u0000\u0000\u0000\u00c9\u00cf\u0003"+
		".\u0017\u0000\u00ca\u00cb\u0003,\u0016\u0000\u00cb\u00cc\u0003.\u0017"+
		"\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0+\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0007\u0004\u0000\u0000"+
		"\u00d3-\u0001\u0000\u0000\u0000\u00d4\u00d7\u00030\u0018\u0000\u00d5\u00d7"+
		"\u00032\u0019\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7/\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0013"+
		"\u0000\u0000\u00d9\u00da\u0003 \u0010\u0000\u00da\u00db\u0005\u0014\u0000"+
		"\u0000\u00db1\u0001\u0000\u0000\u0000\u00dc\u00de\u00034\u001a\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u00036\u001b\u0000\u00e03\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0007\u0003\u0000\u0000\u00e25\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0005!\u0000\u0000\u00e4\u00e6\u0003\u0004\u0002"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e67\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0015\u0000\u0000"+
		"\u00e8\u00e9\u0003:\u001d\u0000\u00e9\u00ea\u0005\u0014\u0000\u0000\u00ea"+
		"\u00eb\u0005\u0002\u0000\u0000\u00eb9\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0003\u001a\r\u0000\u00ed\u00ee\u0003<\u001e\u0000\u00ee\u00f2\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005\"\u0000\u0000\u00f0\u00f2\u0003<"+
		"\u001e\u0000\u00f1\u00ec\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2;\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0006\u0000"+
		"\u0000\u00f4\u00f6\u0003:\u001d\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6=\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0003b1\u0000\u00f8\u00f9\u0003\u0010\b\u0000\u00f9\u00fa\u0003"+
		"`0\u0000\u00fa\u00fb\u0003f3\u0000\u00fb\u00fc\u0003\u001a\r\u0000\u00fc"+
		"\u00fd\u0003d2\u0000\u00fd\u00fe\u0005\u0002\u0000\u0000\u00fe?\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0003^/\u0000\u0100\u0101\u0003B!\u0000"+
		"\u0101\u0103\u0003\u0010\b\u0000\u0102\u0104\u0003D\"\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u0002\u0000\u0000\u0106A\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0003f3\u0000\u0108\u0109\u0003\u001a\r"+
		"\u0000\u0109\u010a\u0003d2\u0000\u010aC\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005\u001e\u0000\u0000\u010c\u010d\u0003\u0010\b\u0000\u010dE"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0005!\u0000\u0000\u010f\u0110\u0005"+
		"\u0013\u0000\u0000\u0110\u0111\u0003H$\u0000\u0111\u0112\u0005\u0014\u0000"+
		"\u0000\u0112\u0113\u0005\u0002\u0000\u0000\u0113G\u0001\u0000\u0000\u0000"+
		"\u0114\u0116\u0003J%\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116I\u0001\u0000\u0000\u0000\u0117\u0118\u0003"+
		" \u0010\u0000\u0118\u0119\u0003L&\u0000\u0119K\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u0006\u0000\u0000\u011b\u011d\u0003J%\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011dM\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0005\u0016\u0000\u0000\u011f\u0120\u0005"+
		"!\u0000\u0000\u0120\u0121\u0005\u0013\u0000\u0000\u0121\u0122\u0003P("+
		"\u0000\u0122\u0123\u0005\u0014\u0000\u0000\u0123\u0124\u0005\u0017\u0000"+
		"\u0000\u0124\u0125\u0003V+\u0000\u0125\u0126\u0003\u0010\b\u0000\u0126"+
		"\u0127\u0005\u0018\u0000\u0000\u0127\u0128\u0005\u0002\u0000\u0000\u0128"+
		"O\u0001\u0000\u0000\u0000\u0129\u012b\u0003R)\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012bQ\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0005!\u0000\u0000\u012d\u012e\u0005\b\u0000"+
		"\u0000\u012e\u012f\u0003\u0002\u0001\u0000\u012f\u0130\u0003T*\u0000\u0130"+
		"S\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0006\u0000\u0000\u0132\u0134"+
		"\u0003R)\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000"+
		"\u0000\u0000\u0134U\u0001\u0000\u0000\u0000\u0135\u0136\u0003\n\u0005"+
		"\u0000\u0136W\u0001\u0000\u0000\u0000\u0137\u0138\u0003\u0000\u0000\u0000"+
		"\u0138\u0139\u0005\u0000\u0000\u0001\u0139Y\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005\u0019\u0000\u0000\u013b[\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0005\u001a\u0000\u0000\u013d]\u0001\u0000\u0000\u0000\u013e\u013f\u0005"+
		"\u001b\u0000\u0000\u013f_\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u001c"+
		"\u0000\u0000\u0141a\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u001d\u0000"+
		"\u0000\u0143c\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u0014\u0000\u0000"+
		"\u0145e\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u0013\u0000\u0000\u0147"+
		"g\u0001\u0000\u0000\u0000\u0015o|\u0083\u008c\u0096\u009b\u00a3\u00b0"+
		"\u00ba\u00c4\u00cf\u00d6\u00dd\u00e5\u00f1\u00f5\u0103\u0115\u011c\u012a"+
		"\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}