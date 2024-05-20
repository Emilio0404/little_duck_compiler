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
		T__24=25, EXPRESSION_OPERATOR=26, ELSE=27, CTE_INT=28, CTE_FLOAT=29, ID=30, 
		CTE_STRING=31, WS=32;
	public static final int
		RULE_programa = 0, RULE_type = 1, RULE_cte = 2, RULE_list_ids = 3, RULE_more_ids = 4, 
		RULE_vars = 5, RULE_variables = 6, RULE_mas_variables = 7, RULE_body = 8, 
		RULE_list_body = 9, RULE_more_statements = 10, RULE_statement = 11, RULE_assign = 12, 
		RULE_expression = 13, RULE_mas_exp = 14, RULE_exp = 15, RULE_exp_operator = 16, 
		RULE_termino = 17, RULE_factor = 18, RULE_factor_operator = 19, RULE_value = 20, 
		RULE_print = 21, RULE_list_prints = 22, RULE_print_more_expressions = 23, 
		RULE_cycle = 24, RULE_condition = 25, RULE_end_condition = 26, RULE_f_call = 27, 
		RULE_has_exp = 28, RULE_list_call_exp = 29, RULE_more_call_expressions = 30, 
		RULE_funcs = 31, RULE_has_params = 32, RULE_list_params = 33, RULE_more_params = 34, 
		RULE_add_vars = 35, RULE_start_ = 36, RULE_equal_sign = 37, RULE_main = 38, 
		RULE_if = 39, RULE_while = 40, RULE_do = 41, RULE_close_parenthesis = 42, 
		RULE_open_parenthesis = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "type", "cte", "list_ids", "more_ids", "vars", "variables", 
			"mas_variables", "body", "list_body", "more_statements", "statement", 
			"assign", "expression", "mas_exp", "exp", "exp_operator", "termino", 
			"factor", "factor_operator", "value", "print", "list_prints", "print_more_expressions", 
			"cycle", "condition", "end_condition", "f_call", "has_exp", "list_call_exp", 
			"more_call_expressions", "funcs", "has_params", "list_params", "more_params", 
			"add_vars", "start_", "equal_sign", "main", "if", "while", "do", "close_parenthesis", 
			"open_parenthesis"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'end'", "'int'", "'float'", "','", "'var'", 
			"':'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'print('", 
			"'void'", "'['", "']'", "'='", "'main'", "'if'", "'while'", "'do'", null, 
			"'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "EXPRESSION_OPERATOR", "ELSE", "CTE_INT", "CTE_FLOAT", "ID", 
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
			setState(88);
			match(T__0);
			setState(89);
			match(ID);
			setState(90);
			match(T__1);
			setState(91);
			vars();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(92);
				funcs();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			main();
			setState(99);
			body();
			setState(100);
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
			setState(102);
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
			setState(104);
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
			setState(106);
			match(ID);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(107);
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
			setState(110);
			match(T__5);
			setState(111);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(113);
				match(T__6);
				setState(114);
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
			setState(117);
			list_ids();
			setState(118);
			match(T__7);
			setState(119);
			type();
			setState(120);
			match(T__1);
			setState(121);
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(123);
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
			setState(126);
			match(T__8);
			setState(127);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__9);
				}
				break;
			case T__10:
			case T__11:
			case T__14:
			case T__16:
			case T__22:
			case T__24:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				statement();
				setState(131);
				more_statements();
				setState(132);
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
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1921161216L) != 0)) {
				{
				setState(136);
				statement();
				setState(137);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
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
			setState(149);
			match(ID);
			setState(150);
			equal_sign();
			setState(151);
			expression();
			setState(152);
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
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			exp();
			setState(155);
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
		public TerminalNode EXPRESSION_OPERATOR() { return getToken(little_duckParser.EXPRESSION_OPERATOR, 0); }
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
		enterRule(_localctx, 28, RULE_mas_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPRESSION_OPERATOR) {
				{
				setState(157);
				match(EXPRESSION_OPERATOR);
				setState(158);
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
		enterRule(_localctx, 30, RULE_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(161);
					termino();
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(162);
						exp_operator();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 32, RULE_exp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termino);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					factor();
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__13) {
						{
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Factor_operatorContext factor_operator() {
			return getRuleContext(Factor_operatorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__14);
				setState(180);
				expression();
				setState(181);
				match(T__15);
				}
				break;
			case T__10:
			case T__11:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10 || _la==T__11) {
					{
					setState(183);
					factor_operator();
					}
				}

				setState(186);
				value();
				}
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
	public static class Factor_operatorContext extends ParserRuleContext {
		public Factor_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_operator; }
	}

	public final Factor_operatorContext factor_operator() throws RecognitionException {
		Factor_operatorContext _localctx = new Factor_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(ID);
				}
				break;
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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
		enterRule(_localctx, 42, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__16);
			setState(196);
			list_prints();
			setState(197);
			match(T__15);
			setState(198);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 44, RULE_list_prints);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__14:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(200);
				expression();
				setState(201);
				print_more_expressions();
				}
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(CTE_STRING);
				setState(204);
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
		enterRule(_localctx, 46, RULE_print_more_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(207);
				match(T__5);
				setState(208);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 48, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			do_();
			setState(212);
			body();
			setState(213);
			while_();
			setState(214);
			open_parenthesis();
			setState(215);
			expression();
			setState(216);
			close_parenthesis();
			setState(217);
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
		public Open_parenthesisContext open_parenthesis() {
			return getRuleContext(Open_parenthesisContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Close_parenthesisContext close_parenthesis() {
			return getRuleContext(Close_parenthesisContext.class,0);
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
		enterRule(_localctx, 50, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			if_();
			setState(220);
			open_parenthesis();
			setState(221);
			expression();
			setState(222);
			close_parenthesis();
			setState(223);
			body();
			setState(224);
			end_condition();
			setState(225);
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
		enterRule(_localctx, 52, RULE_end_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(227);
				match(ELSE);
				setState(228);
				body();
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
		enterRule(_localctx, 54, RULE_f_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ID);
			setState(232);
			match(T__14);
			setState(233);
			has_exp();
			setState(234);
			match(T__15);
			setState(235);
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
		enterRule(_localctx, 56, RULE_has_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879087104L) != 0)) {
				{
				setState(237);
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
		enterRule(_localctx, 58, RULE_list_call_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			expression();
			setState(241);
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
		enterRule(_localctx, 60, RULE_more_call_expressions);
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
		enterRule(_localctx, 62, RULE_funcs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(247);
			match(T__17);
			setState(248);
			match(ID);
			setState(249);
			match(T__14);
			setState(250);
			has_params();
			setState(251);
			match(T__15);
			setState(252);
			match(T__18);
			setState(253);
			add_vars();
			setState(254);
			body();
			setState(255);
			match(T__19);
			setState(256);
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
		enterRule(_localctx, 64, RULE_has_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(258);
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
		enterRule(_localctx, 66, RULE_list_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(262);
			match(T__7);
			setState(263);
			type();
			setState(264);
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
		enterRule(_localctx, 68, RULE_more_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(266);
				match(T__5);
				setState(267);
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
		enterRule(_localctx, 70, RULE_add_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 72, RULE_start_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			programa();
			setState(273);
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
		enterRule(_localctx, 74, RULE_equal_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__20);
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
		enterRule(_localctx, 76, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__21);
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
		enterRule(_localctx, 78, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__22);
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
		enterRule(_localctx, 80, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__23);
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
		enterRule(_localctx, 82, RULE_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
	public static class Close_parenthesisContext extends ParserRuleContext {
		public Close_parenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_parenthesis; }
	}

	public final Close_parenthesisContext close_parenthesis() throws RecognitionException {
		Close_parenthesisContext _localctx = new Close_parenthesisContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_close_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__15);
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
		enterRule(_localctx, 86, RULE_open_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__14);
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
		"\u0004\u0001 \u0122\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000"+
		"a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"m\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005t\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007}\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0087\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u008c\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0094\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00a0\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00a4"+
		"\b\u000f\u0004\u000f\u00a6\b\u000f\u000b\u000f\f\u000f\u00a7\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00ae\b\u0011\u0004\u0011"+
		"\u00b0\b\u0011\u000b\u0011\f\u0011\u00b1\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b9\b\u0012\u0001\u0012\u0003"+
		"\u0012\u00bc\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00c2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00ce\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00d2\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u00e6\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0003\u001c\u00ef\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u00f6\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0003"+
		" \u0104\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003\""+
		"\u010d\b\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000"+
		"\u0004\u0001\u0000\u0004\u0005\u0001\u0000\u001c\u001d\u0001\u0000\u000b"+
		"\f\u0001\u0000\r\u000e\u010f\u0000X\u0001\u0000\u0000\u0000\u0002f\u0001"+
		"\u0000\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000"+
		"\u0000\bn\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000\u0000\fu\u0001"+
		"\u0000\u0000\u0000\u000e|\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000"+
		"\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000"+
		"\u0000\u0016\u0093\u0001\u0000\u0000\u0000\u0018\u0095\u0001\u0000\u0000"+
		"\u0000\u001a\u009a\u0001\u0000\u0000\u0000\u001c\u009f\u0001\u0000\u0000"+
		"\u0000\u001e\u00a5\u0001\u0000\u0000\u0000 \u00a9\u0001\u0000\u0000\u0000"+
		"\"\u00af\u0001\u0000\u0000\u0000$\u00bb\u0001\u0000\u0000\u0000&\u00bd"+
		"\u0001\u0000\u0000\u0000(\u00c1\u0001\u0000\u0000\u0000*\u00c3\u0001\u0000"+
		"\u0000\u0000,\u00cd\u0001\u0000\u0000\u0000.\u00d1\u0001\u0000\u0000\u0000"+
		"0\u00d3\u0001\u0000\u0000\u00002\u00db\u0001\u0000\u0000\u00004\u00e5"+
		"\u0001\u0000\u0000\u00006\u00e7\u0001\u0000\u0000\u00008\u00ee\u0001\u0000"+
		"\u0000\u0000:\u00f0\u0001\u0000\u0000\u0000<\u00f5\u0001\u0000\u0000\u0000"+
		">\u00f7\u0001\u0000\u0000\u0000@\u0103\u0001\u0000\u0000\u0000B\u0105"+
		"\u0001\u0000\u0000\u0000D\u010c\u0001\u0000\u0000\u0000F\u010e\u0001\u0000"+
		"\u0000\u0000H\u0110\u0001\u0000\u0000\u0000J\u0113\u0001\u0000\u0000\u0000"+
		"L\u0115\u0001\u0000\u0000\u0000N\u0117\u0001\u0000\u0000\u0000P\u0119"+
		"\u0001\u0000\u0000\u0000R\u011b\u0001\u0000\u0000\u0000T\u011d\u0001\u0000"+
		"\u0000\u0000V\u011f\u0001\u0000\u0000\u0000XY\u0005\u0001\u0000\u0000"+
		"YZ\u0005\u001e\u0000\u0000Z[\u0005\u0002\u0000\u0000[_\u0003\n\u0005\u0000"+
		"\\^\u0003>\u001f\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0003L&\u0000cd\u0003\u0010\b"+
		"\u0000de\u0005\u0003\u0000\u0000e\u0001\u0001\u0000\u0000\u0000fg\u0007"+
		"\u0000\u0000\u0000g\u0003\u0001\u0000\u0000\u0000hi\u0007\u0001\u0000"+
		"\u0000i\u0005\u0001\u0000\u0000\u0000jl\u0005\u001e\u0000\u0000km\u0003"+
		"\b\u0004\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0007"+
		"\u0001\u0000\u0000\u0000no\u0005\u0006\u0000\u0000op\u0003\u0006\u0003"+
		"\u0000p\t\u0001\u0000\u0000\u0000qr\u0005\u0007\u0000\u0000rt\u0003\f"+
		"\u0006\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u000b"+
		"\u0001\u0000\u0000\u0000uv\u0003\u0006\u0003\u0000vw\u0005\b\u0000\u0000"+
		"wx\u0003\u0002\u0001\u0000xy\u0005\u0002\u0000\u0000yz\u0003\u000e\u0007"+
		"\u0000z\r\u0001\u0000\u0000\u0000{}\u0003\f\u0006\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u000f\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0003\u0012\t\u0000\u0080\u0011"+
		"\u0001\u0000\u0000\u0000\u0081\u0087\u0005\n\u0000\u0000\u0082\u0083\u0003"+
		"\u0016\u000b\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084\u0085\u0005\n"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0081\u0001\u0000"+
		"\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0087\u0013\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0003\u0016\u000b\u0000\u0089\u008a\u0003\u0014"+
		"\n\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0015\u0001\u0000\u0000"+
		"\u0000\u008d\u0094\u0003\u0018\f\u0000\u008e\u0094\u00032\u0019\u0000"+
		"\u008f\u0094\u00030\u0018\u0000\u0090\u0094\u00036\u001b\u0000\u0091\u0094"+
		"\u0003*\u0015\u0000\u0092\u0094\u0003\u001a\r\u0000\u0093\u008d\u0001"+
		"\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001"+
		"\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0017\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u001e\u0000\u0000\u0096\u0097\u0003"+
		"J%\u0000\u0097\u0098\u0003\u001a\r\u0000\u0098\u0099\u0005\u0002\u0000"+
		"\u0000\u0099\u0019\u0001\u0000\u0000\u0000\u009a\u009b\u0003\u001e\u000f"+
		"\u0000\u009b\u009c\u0003\u001c\u000e\u0000\u009c\u001b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u001a\u0000\u0000\u009e\u00a0\u0003\u001e\u000f"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u001d\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003\"\u0011\u0000"+
		"\u00a2\u00a4\u0003 \u0010\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u001f\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0002\u0000\u0000\u00aa"+
		"!\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003$\u0012\u0000\u00ac\u00ae\u0007"+
		"\u0003\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2#\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u000f\u0000\u0000\u00b4\u00b5\u0003\u001a"+
		"\r\u0000\u00b5\u00b6\u0005\u0010\u0000\u0000\u00b6\u00bc\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b9\u0003&\u0013\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bc\u0003(\u0014\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bc%\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0007\u0002\u0000\u0000\u00be\'\u0001\u0000\u0000\u0000\u00bf\u00c2\u0005"+
		"\u001e\u0000\u0000\u00c0\u00c2\u0003\u0004\u0002\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2)\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0011\u0000\u0000\u00c4\u00c5\u0003,\u0016"+
		"\u0000\u00c5\u00c6\u0005\u0010\u0000\u0000\u00c6\u00c7\u0005\u0002\u0000"+
		"\u0000\u00c7+\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u001a\r\u0000"+
		"\u00c9\u00ca\u0003.\u0017\u0000\u00ca\u00ce\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\u001f\u0000\u0000\u00cc\u00ce\u0003.\u0017\u0000\u00cd\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce-\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\u0006\u0000\u0000\u00d0\u00d2\u0003"+
		",\u0016\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2/\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003R)\u0000"+
		"\u00d4\u00d5\u0003\u0010\b\u0000\u00d5\u00d6\u0003P(\u0000\u00d6\u00d7"+
		"\u0003V+\u0000\u00d7\u00d8\u0003\u001a\r\u0000\u00d8\u00d9\u0003T*\u0000"+
		"\u00d9\u00da\u0005\u0002\u0000\u0000\u00da1\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0003N\'\u0000\u00dc\u00dd\u0003V+\u0000\u00dd\u00de\u0003\u001a"+
		"\r\u0000\u00de\u00df\u0003T*\u0000\u00df\u00e0\u0003\u0010\b\u0000\u00e0"+
		"\u00e1\u00034\u001a\u0000\u00e1\u00e2\u0005\u0002\u0000\u0000\u00e23\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0005\u001b\u0000\u0000\u00e4\u00e6\u0003"+
		"\u0010\b\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e65\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u001e\u0000"+
		"\u0000\u00e8\u00e9\u0005\u000f\u0000\u0000\u00e9\u00ea\u00038\u001c\u0000"+
		"\u00ea\u00eb\u0005\u0010\u0000\u0000\u00eb\u00ec\u0005\u0002\u0000\u0000"+
		"\u00ec7\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003:\u001d\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef9\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0003\u001a\r\u0000\u00f1\u00f2\u0003<"+
		"\u001e\u0000\u00f2;\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0006\u0000"+
		"\u0000\u00f4\u00f6\u0003:\u001d\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6=\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0012\u0000\u0000\u00f8\u00f9\u0005\u001e\u0000\u0000\u00f9"+
		"\u00fa\u0005\u000f\u0000\u0000\u00fa\u00fb\u0003@ \u0000\u00fb\u00fc\u0005"+
		"\u0010\u0000\u0000\u00fc\u00fd\u0005\u0013\u0000\u0000\u00fd\u00fe\u0003"+
		"F#\u0000\u00fe\u00ff\u0003\u0010\b\u0000\u00ff\u0100\u0005\u0014\u0000"+
		"\u0000\u0100\u0101\u0005\u0002\u0000\u0000\u0101?\u0001\u0000\u0000\u0000"+
		"\u0102\u0104\u0003B!\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104A\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"\u001e\u0000\u0000\u0106\u0107\u0005\b\u0000\u0000\u0107\u0108\u0003\u0002"+
		"\u0001\u0000\u0108\u0109\u0003D\"\u0000\u0109C\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005\u0006\u0000\u0000\u010b\u010d\u0003B!\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010dE\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0003\n\u0005\u0000\u010fG\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0003\u0000\u0000\u0000\u0111\u0112\u0005\u0000"+
		"\u0000\u0001\u0112I\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0015\u0000"+
		"\u0000\u0114K\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0016\u0000\u0000"+
		"\u0116M\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0017\u0000\u0000\u0118"+
		"O\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0018\u0000\u0000\u011aQ\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005\u0019\u0000\u0000\u011cS\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0005\u0010\u0000\u0000\u011eU\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005\u000f\u0000\u0000\u0120W\u0001\u0000\u0000\u0000"+
		"\u0016_ls|\u0086\u008b\u0093\u009f\u00a3\u00a7\u00ad\u00b1\u00b8\u00bb"+
		"\u00c1\u00cd\u00d1\u00e5\u00ee\u00f5\u0103\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}