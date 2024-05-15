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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, CTE_INT=30, CTE_FLOAT=31, 
		ID=32, CTE_STRING=33, WS=34;
	public static final int
		RULE_programa = 0, RULE_type = 1, RULE_cte = 2, RULE_list_ids = 3, RULE_more_ids = 4, 
		RULE_vars = 5, RULE_variables = 6, RULE_mas_variables = 7, RULE_body = 8, 
		RULE_list_body = 9, RULE_more_statements = 10, RULE_statement = 11, RULE_assign = 12, 
		RULE_expression = 13, RULE_mas_exp = 14, RULE_list_exp = 15, RULE_exp = 16, 
		RULE_termino = 17, RULE_factor = 18, RULE_factor_op = 19, RULE_value = 20, 
		RULE_print = 21, RULE_list_prints = 22, RULE_print_more_expressions = 23, 
		RULE_cycle = 24, RULE_condition = 25, RULE_end_condition = 26, RULE_f_call = 27, 
		RULE_has_exp = 28, RULE_list_call_exp = 29, RULE_more_call_expressions = 30, 
		RULE_funcs = 31, RULE_has_params = 32, RULE_list_params = 33, RULE_more_params = 34, 
		RULE_add_vars = 35, RULE_start_ = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "type", "cte", "list_ids", "more_ids", "vars", "variables", 
			"mas_variables", "body", "list_body", "more_statements", "statement", 
			"assign", "expression", "mas_exp", "list_exp", "exp", "termino", "factor", 
			"factor_op", "value", "print", "list_prints", "print_more_expressions", 
			"cycle", "condition", "end_condition", "f_call", "has_exp", "list_call_exp", 
			"more_call_expressions", "funcs", "has_params", "list_params", "more_params", 
			"add_vars", "start_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'main'", "'end'", "'int'", "'float'", "','", 
			"'var'", "':'", "'{'", "'}'", "'='", "'>'", "'<'", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "'('", "')'", "'print('", "'do'", "'while'", "'if'", "'else'", 
			"'void'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "CTE_INT", "CTE_FLOAT", "ID", "CTE_STRING", 
			"WS"
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
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(75);
			match(ID);
			setState(76);
			match(T__1);
			setState(77);
			vars();
			setState(78);
			funcs();
			setState(79);
			match(T__2);
			setState(80);
			body();
			setState(81);
			match(T__3);
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
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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
			setState(85);
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
			setState(87);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(88);
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
			setState(91);
			match(T__6);
			setState(92);
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
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(94);
				match(T__7);
				setState(95);
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
			setState(98);
			list_ids();
			setState(99);
			match(T__8);
			setState(100);
			type();
			setState(101);
			match(T__1);
			setState(102);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(104);
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
			setState(107);
			match(T__9);
			setState(108);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__10);
				}
				break;
			case T__15:
			case T__16:
			case T__19:
			case T__21:
			case T__22:
			case T__24:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				statement();
				setState(112);
				more_statements();
				setState(113);
				match(T__10);
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7563575296L) != 0)) {
				{
				setState(117);
				statement();
				setState(118);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
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
			setState(130);
			match(ID);
			setState(131);
			match(T__11);
			setState(132);
			expression();
			setState(133);
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
			setState(135);
			exp();
			setState(136);
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
		public List_expContext list_exp() {
			return getRuleContext(List_expContext.class,0);
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
		enterRule(_localctx, 28, RULE_mas_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
				{
				setState(138);
				list_exp();
				setState(139);
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
	public static class List_expContext extends ParserRuleContext {
		public List_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_exp; }
	}

	public final List_expContext list_exp() throws RecognitionException {
		List_expContext _localctx = new List_expContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(145);
					termino();
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(146);
						match(T__15);
						}
						break;
					case 2:
						{
						setState(148);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(147);
							match(T__16);
							}
							break;
						}
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
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
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					factor();
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__17 || _la==T__18) {
						{
						setState(157);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
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
				setState(162); 
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
		public Factor_opContext factor_op() {
			return getRuleContext(Factor_opContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__19);
				setState(165);
				expression();
				setState(166);
				match(T__20);
				}
				break;
			case T__15:
			case T__16:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(168);
				factor_op();
				setState(169);
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
	public static class Factor_opContext extends ParserRuleContext {
		public Factor_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_op; }
	}

	public final Factor_opContext factor_op() throws RecognitionException {
		Factor_opContext _localctx = new Factor_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15 || _la==T__16) {
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(ID);
				}
				break;
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
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
			setState(180);
			match(T__21);
			setState(181);
			list_prints();
			setState(182);
			match(T__20);
			setState(183);
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__19:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(185);
				expression();
				setState(186);
				print_more_expressions();
				}
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(CTE_STRING);
				setState(189);
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
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(192);
				match(T__6);
				setState(193);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(196);
			match(T__22);
			setState(197);
			body();
			setState(198);
			match(T__23);
			setState(199);
			match(T__19);
			setState(200);
			expression();
			setState(201);
			match(T__20);
			setState(202);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(204);
			match(T__24);
			setState(205);
			match(T__19);
			setState(206);
			expression();
			setState(207);
			match(T__20);
			setState(208);
			body();
			setState(209);
			end_condition();
			setState(210);
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
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(212);
				match(T__25);
				setState(213);
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
			setState(216);
			match(ID);
			setState(217);
			match(T__19);
			setState(218);
			has_exp();
			setState(219);
			match(T__20);
			setState(220);
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
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7517437952L) != 0)) {
				{
				setState(222);
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
			setState(225);
			expression();
			setState(226);
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
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(228);
				match(T__6);
				setState(229);
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
		public List<TerminalNode> ID() { return getTokens(little_duckParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(little_duckParser.ID, i);
		}
		public List<Has_paramsContext> has_params() {
			return getRuleContexts(Has_paramsContext.class);
		}
		public Has_paramsContext has_params(int i) {
			return getRuleContext(Has_paramsContext.class,i);
		}
		public List<Add_varsContext> add_vars() {
			return getRuleContexts(Add_varsContext.class);
		}
		public Add_varsContext add_vars(int i) {
			return getRuleContext(Add_varsContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(232);
				match(T__26);
				setState(233);
				match(ID);
				setState(234);
				match(T__19);
				setState(235);
				has_params();
				setState(236);
				match(T__20);
				setState(237);
				match(T__27);
				setState(238);
				add_vars();
				setState(239);
				body();
				setState(240);
				match(T__28);
				setState(241);
				match(T__1);
				}
				}
				setState(247);
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
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(248);
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
			setState(251);
			match(ID);
			setState(252);
			match(T__8);
			setState(253);
			type();
			setState(254);
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
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(256);
				match(T__6);
				setState(257);
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
			setState(260);
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
			setState(262);
			programa();
			setState(263);
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

	public static final String _serializedATN =
		"\u0004\u0001\"\u010a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Z\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005a\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007j\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tt\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\ny\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0081\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u008e\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0095\b\u0010\u0003\u0010\u0097\b"+
		"\u0010\u0004\u0010\u0099\b\u0010\u000b\u0010\f\u0010\u009a\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u009f\b\u0011\u0004\u0011\u00a1\b\u0011\u000b"+
		"\u0011\f\u0011\u00a2\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ac\b\u0012\u0001\u0013\u0003"+
		"\u0013\u00af\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00b3\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00bf\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00c3\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u00d7\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0003\u001c\u00e0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u00e7\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u00f4\b\u001f\n\u001f"+
		"\f\u001f\u00f7\t\u001f\u0001 \u0003 \u00fa\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0003\"\u0103\b\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000"+
		"\u0005\u0001\u0000\u0005\u0006\u0001\u0000\u001e\u001f\u0001\u0000\r\u000f"+
		"\u0001\u0000\u0012\u0013\u0001\u0000\u0010\u0011\u00ff\u0000J\u0001\u0000"+
		"\u0000\u0000\u0002S\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000"+
		"\u0006W\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\n`\u0001\u0000"+
		"\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000"+
		"\u0010k\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014x"+
		"\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u0082"+
		"\u0001\u0000\u0000\u0000\u001a\u0087\u0001\u0000\u0000\u0000\u001c\u008d"+
		"\u0001\u0000\u0000\u0000\u001e\u008f\u0001\u0000\u0000\u0000 \u0098\u0001"+
		"\u0000\u0000\u0000\"\u00a0\u0001\u0000\u0000\u0000$\u00ab\u0001\u0000"+
		"\u0000\u0000&\u00ae\u0001\u0000\u0000\u0000(\u00b2\u0001\u0000\u0000\u0000"+
		"*\u00b4\u0001\u0000\u0000\u0000,\u00be\u0001\u0000\u0000\u0000.\u00c2"+
		"\u0001\u0000\u0000\u00000\u00c4\u0001\u0000\u0000\u00002\u00cc\u0001\u0000"+
		"\u0000\u00004\u00d6\u0001\u0000\u0000\u00006\u00d8\u0001\u0000\u0000\u0000"+
		"8\u00df\u0001\u0000\u0000\u0000:\u00e1\u0001\u0000\u0000\u0000<\u00e6"+
		"\u0001\u0000\u0000\u0000>\u00f5\u0001\u0000\u0000\u0000@\u00f9\u0001\u0000"+
		"\u0000\u0000B\u00fb\u0001\u0000\u0000\u0000D\u0102\u0001\u0000\u0000\u0000"+
		"F\u0104\u0001\u0000\u0000\u0000H\u0106\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0001\u0000\u0000KL\u0005 \u0000\u0000LM\u0005\u0002\u0000\u0000MN\u0003"+
		"\n\u0005\u0000NO\u0003>\u001f\u0000OP\u0005\u0003\u0000\u0000PQ\u0003"+
		"\u0010\b\u0000QR\u0005\u0004\u0000\u0000R\u0001\u0001\u0000\u0000\u0000"+
		"ST\u0007\u0000\u0000\u0000T\u0003\u0001\u0000\u0000\u0000UV\u0007\u0001"+
		"\u0000\u0000V\u0005\u0001\u0000\u0000\u0000WY\u0005 \u0000\u0000XZ\u0003"+
		"\b\u0004\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0007"+
		"\u0001\u0000\u0000\u0000[\\\u0005\u0007\u0000\u0000\\]\u0003\u0006\u0003"+
		"\u0000]\t\u0001\u0000\u0000\u0000^_\u0005\b\u0000\u0000_a\u0003\f\u0006"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u000b\u0001"+
		"\u0000\u0000\u0000bc\u0003\u0006\u0003\u0000cd\u0005\t\u0000\u0000de\u0003"+
		"\u0002\u0001\u0000ef\u0005\u0002\u0000\u0000fg\u0003\u000e\u0007\u0000"+
		"g\r\u0001\u0000\u0000\u0000hj\u0003\f\u0006\u0000ih\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0005"+
		"\n\u0000\u0000lm\u0003\u0012\t\u0000m\u0011\u0001\u0000\u0000\u0000nt"+
		"\u0005\u000b\u0000\u0000op\u0003\u0016\u000b\u0000pq\u0003\u0014\n\u0000"+
		"qr\u0005\u000b\u0000\u0000rt\u0001\u0000\u0000\u0000sn\u0001\u0000\u0000"+
		"\u0000so\u0001\u0000\u0000\u0000t\u0013\u0001\u0000\u0000\u0000uv\u0003"+
		"\u0016\u000b\u0000vw\u0003\u0014\n\u0000wy\u0001\u0000\u0000\u0000xu\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0015\u0001\u0000\u0000"+
		"\u0000z\u0081\u0003\u0018\f\u0000{\u0081\u00032\u0019\u0000|\u0081\u0003"+
		"0\u0018\u0000}\u0081\u00036\u001b\u0000~\u0081\u0003*\u0015\u0000\u007f"+
		"\u0081\u0003\u001a\r\u0000\u0080z\u0001\u0000\u0000\u0000\u0080{\u0001"+
		"\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0017\u0001\u0000\u0000\u0000\u0082\u0083\u0005 \u0000\u0000\u0083"+
		"\u0084\u0005\f\u0000\u0000\u0084\u0085\u0003\u001a\r\u0000\u0085\u0086"+
		"\u0005\u0002\u0000\u0000\u0086\u0019\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0003 \u0010\u0000\u0088\u0089\u0003\u001c\u000e\u0000\u0089\u001b\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0003\u001e\u000f\u0000\u008b\u008c\u0003"+
		" \u0010\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u001d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0007\u0002\u0000\u0000\u0090\u001f\u0001\u0000"+
		"\u0000\u0000\u0091\u0096\u0003\"\u0011\u0000\u0092\u0097\u0005\u0010\u0000"+
		"\u0000\u0093\u0095\u0005\u0011\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000"+
		"\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0091\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b!\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0003$\u0012\u0000\u009d\u009f\u0007\u0003\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3#\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0014\u0000\u0000\u00a5\u00a6\u0003\u001a\r\u0000\u00a6\u00a7\u0005"+
		"\u0015\u0000\u0000\u00a7\u00ac\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003"+
		"&\u0013\u0000\u00a9\u00aa\u0003(\u0014\u0000\u00aa\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac%\u0001\u0000\u0000\u0000\u00ad\u00af\u0007\u0004\u0000\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\'\u0001\u0000\u0000\u0000\u00b0\u00b3\u0005 \u0000\u0000\u00b1"+
		"\u00b3\u0003\u0004\u0002\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3)\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0016\u0000\u0000\u00b5\u00b6\u0003,\u0016\u0000\u00b6\u00b7\u0005"+
		"\u0015\u0000\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8+\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0003\u001a\r\u0000\u00ba\u00bb\u0003.\u0017"+
		"\u0000\u00bb\u00bf\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005!\u0000\u0000"+
		"\u00bd\u00bf\u0003.\u0017\u0000\u00be\u00b9\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf-\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0007\u0000\u0000\u00c1\u00c3\u0003,\u0016\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3/\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0017\u0000\u0000\u00c5\u00c6\u0003\u0010"+
		"\b\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000\u00c7\u00c8\u0005\u0014\u0000"+
		"\u0000\u00c8\u00c9\u0003\u001a\r\u0000\u00c9\u00ca\u0005\u0015\u0000\u0000"+
		"\u00ca\u00cb\u0005\u0002\u0000\u0000\u00cb1\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005\u0019\u0000\u0000\u00cd\u00ce\u0005\u0014\u0000\u0000\u00ce"+
		"\u00cf\u0003\u001a\r\u0000\u00cf\u00d0\u0005\u0015\u0000\u0000\u00d0\u00d1"+
		"\u0003\u0010\b\u0000\u00d1\u00d2\u00034\u001a\u0000\u00d2\u00d3\u0005"+
		"\u0002\u0000\u0000\u00d33\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u001a"+
		"\u0000\u0000\u00d5\u00d7\u0003\u0010\b\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d75\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005 \u0000\u0000\u00d9\u00da\u0005\u0014\u0000\u0000\u00da"+
		"\u00db\u00038\u001c\u0000\u00db\u00dc\u0005\u0015\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0002\u0000\u0000\u00dd7\u0001\u0000\u0000\u0000\u00de\u00e0\u0003"+
		":\u001d\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e09\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u001a\r"+
		"\u0000\u00e2\u00e3\u0003<\u001e\u0000\u00e3;\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005\u0007\u0000\u0000\u00e5\u00e7\u0003:\u001d\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7=\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\u001b\u0000\u0000\u00e9\u00ea\u0005"+
		" \u0000\u0000\u00ea\u00eb\u0005\u0014\u0000\u0000\u00eb\u00ec\u0003@ "+
		"\u0000\u00ec\u00ed\u0005\u0015\u0000\u0000\u00ed\u00ee\u0005\u001c\u0000"+
		"\u0000\u00ee\u00ef\u0003F#\u0000\u00ef\u00f0\u0003\u0010\b\u0000\u00f0"+
		"\u00f1\u0005\u001d\u0000\u0000\u00f1\u00f2\u0005\u0002\u0000\u0000\u00f2"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6?\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003B!\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00faA\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005 \u0000\u0000\u00fc\u00fd\u0005\t\u0000\u0000"+
		"\u00fd\u00fe\u0003\u0002\u0001\u0000\u00fe\u00ff\u0003D\"\u0000\u00ff"+
		"C\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0007\u0000\u0000\u0101\u0103"+
		"\u0003B!\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103E\u0001\u0000\u0000\u0000\u0104\u0105\u0003\n\u0005"+
		"\u0000\u0105G\u0001\u0000\u0000\u0000\u0106\u0107\u0003\u0000\u0000\u0000"+
		"\u0107\u0108\u0005\u0000\u0000\u0001\u0108I\u0001\u0000\u0000\u0000\u0017"+
		"Y`isx\u0080\u008d\u0094\u0096\u009a\u009e\u00a2\u00ab\u00ae\u00b2\u00be"+
		"\u00c2\u00d6\u00df\u00e6\u00f5\u00f9\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}