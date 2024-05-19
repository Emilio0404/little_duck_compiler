# Generated from little_duck.g4 by ANTLR 4.13.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,34,266,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,
        7,33,2,34,7,34,2,35,7,35,2,36,7,36,1,0,1,0,1,0,1,0,1,0,5,0,80,8,
        0,10,0,12,0,83,9,0,1,0,1,0,1,0,1,0,1,1,1,1,1,2,1,2,1,3,1,3,3,3,95,
        8,3,1,4,1,4,1,4,1,5,1,5,3,5,102,8,5,1,6,1,6,1,6,1,6,1,6,1,6,1,7,
        3,7,111,8,7,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,3,9,121,8,9,1,10,1,10,
        1,10,3,10,126,8,10,1,11,1,11,1,11,1,11,1,11,1,11,3,11,134,8,11,1,
        12,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,14,1,14,1,14,3,14,147,8,
        14,1,15,1,15,1,16,1,16,1,16,3,16,154,8,16,3,16,156,8,16,4,16,158,
        8,16,11,16,12,16,159,1,17,1,17,3,17,164,8,17,4,17,166,8,17,11,17,
        12,17,167,1,18,1,18,1,18,1,18,1,18,1,18,1,18,3,18,177,8,18,1,19,
        3,19,180,8,19,1,20,1,20,3,20,184,8,20,1,21,1,21,1,21,1,21,1,21,1,
        22,1,22,1,22,1,22,1,22,3,22,196,8,22,1,23,1,23,3,23,200,8,23,1,24,
        1,24,1,24,1,24,1,24,1,24,1,24,1,24,1,25,1,25,1,25,1,25,1,25,1,25,
        1,25,1,25,1,26,1,26,3,26,220,8,26,1,27,1,27,1,27,1,27,1,27,1,27,
        1,28,3,28,229,8,28,1,29,1,29,1,29,1,30,1,30,3,30,236,8,30,1,31,1,
        31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,32,3,32,250,8,
        32,1,33,1,33,1,33,1,33,1,33,1,34,1,34,3,34,259,8,34,1,35,1,35,1,
        36,1,36,1,36,1,36,0,0,37,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,
        30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,
        0,5,1,0,5,6,1,0,30,31,1,0,13,15,1,0,18,19,1,0,16,17,255,0,74,1,0,
        0,0,2,88,1,0,0,0,4,90,1,0,0,0,6,92,1,0,0,0,8,96,1,0,0,0,10,101,1,
        0,0,0,12,103,1,0,0,0,14,110,1,0,0,0,16,112,1,0,0,0,18,120,1,0,0,
        0,20,125,1,0,0,0,22,133,1,0,0,0,24,135,1,0,0,0,26,140,1,0,0,0,28,
        146,1,0,0,0,30,148,1,0,0,0,32,157,1,0,0,0,34,165,1,0,0,0,36,176,
        1,0,0,0,38,179,1,0,0,0,40,183,1,0,0,0,42,185,1,0,0,0,44,195,1,0,
        0,0,46,199,1,0,0,0,48,201,1,0,0,0,50,209,1,0,0,0,52,219,1,0,0,0,
        54,221,1,0,0,0,56,228,1,0,0,0,58,230,1,0,0,0,60,235,1,0,0,0,62,237,
        1,0,0,0,64,249,1,0,0,0,66,251,1,0,0,0,68,258,1,0,0,0,70,260,1,0,
        0,0,72,262,1,0,0,0,74,75,5,1,0,0,75,76,5,32,0,0,76,77,5,2,0,0,77,
        81,3,10,5,0,78,80,3,62,31,0,79,78,1,0,0,0,80,83,1,0,0,0,81,79,1,
        0,0,0,81,82,1,0,0,0,82,84,1,0,0,0,83,81,1,0,0,0,84,85,5,3,0,0,85,
        86,3,16,8,0,86,87,5,4,0,0,87,1,1,0,0,0,88,89,7,0,0,0,89,3,1,0,0,
        0,90,91,7,1,0,0,91,5,1,0,0,0,92,94,5,32,0,0,93,95,3,8,4,0,94,93,
        1,0,0,0,94,95,1,0,0,0,95,7,1,0,0,0,96,97,5,7,0,0,97,98,3,6,3,0,98,
        9,1,0,0,0,99,100,5,8,0,0,100,102,3,12,6,0,101,99,1,0,0,0,101,102,
        1,0,0,0,102,11,1,0,0,0,103,104,3,6,3,0,104,105,5,9,0,0,105,106,3,
        2,1,0,106,107,5,2,0,0,107,108,3,14,7,0,108,13,1,0,0,0,109,111,3,
        12,6,0,110,109,1,0,0,0,110,111,1,0,0,0,111,15,1,0,0,0,112,113,5,
        10,0,0,113,114,3,18,9,0,114,17,1,0,0,0,115,121,5,11,0,0,116,117,
        3,22,11,0,117,118,3,20,10,0,118,119,5,11,0,0,119,121,1,0,0,0,120,
        115,1,0,0,0,120,116,1,0,0,0,121,19,1,0,0,0,122,123,3,22,11,0,123,
        124,3,20,10,0,124,126,1,0,0,0,125,122,1,0,0,0,125,126,1,0,0,0,126,
        21,1,0,0,0,127,134,3,24,12,0,128,134,3,50,25,0,129,134,3,48,24,0,
        130,134,3,54,27,0,131,134,3,42,21,0,132,134,3,26,13,0,133,127,1,
        0,0,0,133,128,1,0,0,0,133,129,1,0,0,0,133,130,1,0,0,0,133,131,1,
        0,0,0,133,132,1,0,0,0,134,23,1,0,0,0,135,136,5,32,0,0,136,137,5,
        12,0,0,137,138,3,26,13,0,138,139,5,2,0,0,139,25,1,0,0,0,140,141,
        3,32,16,0,141,142,3,28,14,0,142,27,1,0,0,0,143,144,3,30,15,0,144,
        145,3,32,16,0,145,147,1,0,0,0,146,143,1,0,0,0,146,147,1,0,0,0,147,
        29,1,0,0,0,148,149,7,2,0,0,149,31,1,0,0,0,150,155,3,34,17,0,151,
        156,5,16,0,0,152,154,5,17,0,0,153,152,1,0,0,0,153,154,1,0,0,0,154,
        156,1,0,0,0,155,151,1,0,0,0,155,153,1,0,0,0,156,158,1,0,0,0,157,
        150,1,0,0,0,158,159,1,0,0,0,159,157,1,0,0,0,159,160,1,0,0,0,160,
        33,1,0,0,0,161,163,3,36,18,0,162,164,7,3,0,0,163,162,1,0,0,0,163,
        164,1,0,0,0,164,166,1,0,0,0,165,161,1,0,0,0,166,167,1,0,0,0,167,
        165,1,0,0,0,167,168,1,0,0,0,168,35,1,0,0,0,169,170,5,20,0,0,170,
        171,3,26,13,0,171,172,5,21,0,0,172,177,1,0,0,0,173,174,3,38,19,0,
        174,175,3,40,20,0,175,177,1,0,0,0,176,169,1,0,0,0,176,173,1,0,0,
        0,177,37,1,0,0,0,178,180,7,4,0,0,179,178,1,0,0,0,179,180,1,0,0,0,
        180,39,1,0,0,0,181,184,5,32,0,0,182,184,3,4,2,0,183,181,1,0,0,0,
        183,182,1,0,0,0,184,41,1,0,0,0,185,186,5,22,0,0,186,187,3,44,22,
        0,187,188,5,21,0,0,188,189,5,2,0,0,189,43,1,0,0,0,190,191,3,26,13,
        0,191,192,3,46,23,0,192,196,1,0,0,0,193,194,5,33,0,0,194,196,3,46,
        23,0,195,190,1,0,0,0,195,193,1,0,0,0,196,45,1,0,0,0,197,198,5,7,
        0,0,198,200,3,44,22,0,199,197,1,0,0,0,199,200,1,0,0,0,200,47,1,0,
        0,0,201,202,5,23,0,0,202,203,3,16,8,0,203,204,5,24,0,0,204,205,5,
        20,0,0,205,206,3,26,13,0,206,207,5,21,0,0,207,208,5,2,0,0,208,49,
        1,0,0,0,209,210,5,25,0,0,210,211,5,20,0,0,211,212,3,26,13,0,212,
        213,5,21,0,0,213,214,3,16,8,0,214,215,3,52,26,0,215,216,5,2,0,0,
        216,51,1,0,0,0,217,218,5,26,0,0,218,220,3,16,8,0,219,217,1,0,0,0,
        219,220,1,0,0,0,220,53,1,0,0,0,221,222,5,32,0,0,222,223,5,20,0,0,
        223,224,3,56,28,0,224,225,5,21,0,0,225,226,5,2,0,0,226,55,1,0,0,
        0,227,229,3,58,29,0,228,227,1,0,0,0,228,229,1,0,0,0,229,57,1,0,0,
        0,230,231,3,26,13,0,231,232,3,60,30,0,232,59,1,0,0,0,233,234,5,7,
        0,0,234,236,3,58,29,0,235,233,1,0,0,0,235,236,1,0,0,0,236,61,1,0,
        0,0,237,238,5,27,0,0,238,239,5,32,0,0,239,240,5,20,0,0,240,241,3,
        64,32,0,241,242,5,21,0,0,242,243,5,28,0,0,243,244,3,70,35,0,244,
        245,3,16,8,0,245,246,5,29,0,0,246,247,5,2,0,0,247,63,1,0,0,0,248,
        250,3,66,33,0,249,248,1,0,0,0,249,250,1,0,0,0,250,65,1,0,0,0,251,
        252,5,32,0,0,252,253,5,9,0,0,253,254,3,2,1,0,254,255,3,68,34,0,255,
        67,1,0,0,0,256,257,5,7,0,0,257,259,3,66,33,0,258,256,1,0,0,0,258,
        259,1,0,0,0,259,69,1,0,0,0,260,261,3,10,5,0,261,71,1,0,0,0,262,263,
        3,0,0,0,263,264,5,0,0,1,264,73,1,0,0,0,23,81,94,101,110,120,125,
        133,146,153,155,159,163,167,176,179,183,195,199,219,228,235,249,
        258
    ]

class little_duckParser ( Parser ):

    grammarFileName = "little_duck.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'program'", "';'", "'main'", "'end'", 
                     "'int'", "'float'", "','", "'var'", "':'", "'{'", "'}'", 
                     "'='", "'>'", "'<'", "'!='", "'+'", "'-'", "'*'", "'/'", 
                     "'('", "')'", "'print('", "'do'", "'while'", "'if'", 
                     "'else'", "'void'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "CTE_INT", "CTE_FLOAT", 
                      "ID", "CTE_STRING", "WS" ]

    RULE_programa = 0
    RULE_type = 1
    RULE_cte = 2
    RULE_list_ids = 3
    RULE_more_ids = 4
    RULE_vars = 5
    RULE_variables = 6
    RULE_mas_variables = 7
    RULE_body = 8
    RULE_list_body = 9
    RULE_more_statements = 10
    RULE_statement = 11
    RULE_assign = 12
    RULE_expression = 13
    RULE_mas_exp = 14
    RULE_list_exp = 15
    RULE_exp = 16
    RULE_termino = 17
    RULE_factor = 18
    RULE_factor_op = 19
    RULE_value = 20
    RULE_print = 21
    RULE_list_prints = 22
    RULE_print_more_expressions = 23
    RULE_cycle = 24
    RULE_condition = 25
    RULE_end_condition = 26
    RULE_f_call = 27
    RULE_has_exp = 28
    RULE_list_call_exp = 29
    RULE_more_call_expressions = 30
    RULE_funcs = 31
    RULE_has_params = 32
    RULE_list_params = 33
    RULE_more_params = 34
    RULE_add_vars = 35
    RULE_start_ = 36

    ruleNames =  [ "programa", "type", "cte", "list_ids", "more_ids", "vars", 
                   "variables", "mas_variables", "body", "list_body", "more_statements", 
                   "statement", "assign", "expression", "mas_exp", "list_exp", 
                   "exp", "termino", "factor", "factor_op", "value", "print", 
                   "list_prints", "print_more_expressions", "cycle", "condition", 
                   "end_condition", "f_call", "has_exp", "list_call_exp", 
                   "more_call_expressions", "funcs", "has_params", "list_params", 
                   "more_params", "add_vars", "start_" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    CTE_INT=30
    CTE_FLOAT=31
    ID=32
    CTE_STRING=33
    WS=34

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(little_duckParser.ID, 0)

        def vars_(self):
            return self.getTypedRuleContext(little_duckParser.VarsContext,0)


        def body(self):
            return self.getTypedRuleContext(little_duckParser.BodyContext,0)


        def funcs(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(little_duckParser.FuncsContext)
            else:
                return self.getTypedRuleContext(little_duckParser.FuncsContext,i)


        def getRuleIndex(self):
            return little_duckParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrograma" ):
                return visitor.visitPrograma(self)
            else:
                return visitor.visitChildren(self)




    def programa(self):

        localctx = little_duckParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self.match(little_duckParser.T__0)
            self.state = 75
            self.match(little_duckParser.ID)
            self.state = 76
            self.match(little_duckParser.T__1)
            self.state = 77
            self.vars_()
            self.state = 81
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==27:
                self.state = 78
                self.funcs()
                self.state = 83
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 84
            self.match(little_duckParser.T__2)
            self.state = 85
            self.body()
            self.state = 86
            self.match(little_duckParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return little_duckParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitType" ):
                return visitor.visitType(self)
            else:
                return visitor.visitChildren(self)




    def type_(self):

        localctx = little_duckParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 88
            _la = self._input.LA(1)
            if not(_la==5 or _la==6):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CTE_INT(self):
            return self.getToken(little_duckParser.CTE_INT, 0)

        def CTE_FLOAT(self):
            return self.getToken(little_duckParser.CTE_FLOAT, 0)

        def getRuleIndex(self):
            return little_duckParser.RULE_cte

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCte" ):
                listener.enterCte(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCte" ):
                listener.exitCte(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCte" ):
                return visitor.visitCte(self)
            else:
                return visitor.visitChildren(self)




    def cte(self):

        localctx = little_duckParser.CteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_cte)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            _la = self._input.LA(1)
            if not(_la==30 or _la==31):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_idsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(little_duckParser.ID, 0)

        def more_ids(self):
            return self.getTypedRuleContext(little_duckParser.More_idsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_list_ids

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_ids" ):
                listener.enterList_ids(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_ids" ):
                listener.exitList_ids(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitList_ids" ):
                return visitor.visitList_ids(self)
            else:
                return visitor.visitChildren(self)




    def list_ids(self):

        localctx = little_duckParser.List_idsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_list_ids)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.match(little_duckParser.ID)
            self.state = 94
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==7:
                self.state = 93
                self.more_ids()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class More_idsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_ids(self):
            return self.getTypedRuleContext(little_duckParser.List_idsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_more_ids

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMore_ids" ):
                listener.enterMore_ids(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMore_ids" ):
                listener.exitMore_ids(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMore_ids" ):
                return visitor.visitMore_ids(self)
            else:
                return visitor.visitChildren(self)




    def more_ids(self):

        localctx = little_duckParser.More_idsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_more_ids)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 96
            self.match(little_duckParser.T__6)
            self.state = 97
            self.list_ids()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variables(self):
            return self.getTypedRuleContext(little_duckParser.VariablesContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_vars

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVars" ):
                listener.enterVars(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVars" ):
                listener.exitVars(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVars" ):
                return visitor.visitVars(self)
            else:
                return visitor.visitChildren(self)




    def vars_(self):

        localctx = little_duckParser.VarsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_vars)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 101
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==8:
                self.state = 99
                self.match(little_duckParser.T__7)
                self.state = 100
                self.variables()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariablesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_ids(self):
            return self.getTypedRuleContext(little_duckParser.List_idsContext,0)


        def type_(self):
            return self.getTypedRuleContext(little_duckParser.TypeContext,0)


        def mas_variables(self):
            return self.getTypedRuleContext(little_duckParser.Mas_variablesContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_variables

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariables" ):
                listener.enterVariables(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariables" ):
                listener.exitVariables(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariables" ):
                return visitor.visitVariables(self)
            else:
                return visitor.visitChildren(self)




    def variables(self):

        localctx = little_duckParser.VariablesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_variables)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 103
            self.list_ids()
            self.state = 104
            self.match(little_duckParser.T__8)
            self.state = 105
            self.type_()
            self.state = 106
            self.match(little_duckParser.T__1)
            self.state = 107
            self.mas_variables()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Mas_variablesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variables(self):
            return self.getTypedRuleContext(little_duckParser.VariablesContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_mas_variables

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_variables" ):
                listener.enterMas_variables(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_variables" ):
                listener.exitMas_variables(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_variables" ):
                return visitor.visitMas_variables(self)
            else:
                return visitor.visitChildren(self)




    def mas_variables(self):

        localctx = little_duckParser.Mas_variablesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_mas_variables)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 110
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==32:
                self.state = 109
                self.variables()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_body(self):
            return self.getTypedRuleContext(little_duckParser.List_bodyContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_body

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBody" ):
                listener.enterBody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBody" ):
                listener.exitBody(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBody" ):
                return visitor.visitBody(self)
            else:
                return visitor.visitChildren(self)




    def body(self):

        localctx = little_duckParser.BodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_body)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 112
            self.match(little_duckParser.T__9)
            self.state = 113
            self.list_body()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_bodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self):
            return self.getTypedRuleContext(little_duckParser.StatementContext,0)


        def more_statements(self):
            return self.getTypedRuleContext(little_duckParser.More_statementsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_list_body

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_body" ):
                listener.enterList_body(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_body" ):
                listener.exitList_body(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitList_body" ):
                return visitor.visitList_body(self)
            else:
                return visitor.visitChildren(self)




    def list_body(self):

        localctx = little_duckParser.List_bodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_list_body)
        try:
            self.state = 120
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [11]:
                self.enterOuterAlt(localctx, 1)
                self.state = 115
                self.match(little_duckParser.T__10)
                pass
            elif token in [16, 17, 20, 22, 23, 25, 30, 31, 32]:
                self.enterOuterAlt(localctx, 2)
                self.state = 116
                self.statement()
                self.state = 117
                self.more_statements()
                self.state = 118
                self.match(little_duckParser.T__10)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class More_statementsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self):
            return self.getTypedRuleContext(little_duckParser.StatementContext,0)


        def more_statements(self):
            return self.getTypedRuleContext(little_duckParser.More_statementsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_more_statements

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMore_statements" ):
                listener.enterMore_statements(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMore_statements" ):
                listener.exitMore_statements(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMore_statements" ):
                return visitor.visitMore_statements(self)
            else:
                return visitor.visitChildren(self)




    def more_statements(self):

        localctx = little_duckParser.More_statementsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_more_statements)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 125
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 7563575296) != 0):
                self.state = 122
                self.statement()
                self.state = 123
                self.more_statements()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assign(self):
            return self.getTypedRuleContext(little_duckParser.AssignContext,0)


        def condition(self):
            return self.getTypedRuleContext(little_duckParser.ConditionContext,0)


        def cycle(self):
            return self.getTypedRuleContext(little_duckParser.CycleContext,0)


        def f_call(self):
            return self.getTypedRuleContext(little_duckParser.F_callContext,0)


        def print_(self):
            return self.getTypedRuleContext(little_duckParser.PrintContext,0)


        def expression(self):
            return self.getTypedRuleContext(little_duckParser.ExpressionContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = little_duckParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_statement)
        try:
            self.state = 133
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 127
                self.assign()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 128
                self.condition()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 129
                self.cycle()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 130
                self.f_call()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 131
                self.print_()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 132
                self.expression()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(little_duckParser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(little_duckParser.ExpressionContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_assign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign" ):
                listener.enterAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign" ):
                listener.exitAssign(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign" ):
                return visitor.visitAssign(self)
            else:
                return visitor.visitChildren(self)




    def assign(self):

        localctx = little_duckParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_assign)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 135
            self.match(little_duckParser.ID)
            self.state = 136
            self.match(little_duckParser.T__11)
            self.state = 137
            self.expression()
            self.state = 138
            self.match(little_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(little_duckParser.ExpContext,0)


        def mas_exp(self):
            return self.getTypedRuleContext(little_duckParser.Mas_expContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)




    def expression(self):

        localctx = little_duckParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 140
            self.exp()
            self.state = 141
            self.mas_exp()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Mas_expContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_exp(self):
            return self.getTypedRuleContext(little_duckParser.List_expContext,0)


        def exp(self):
            return self.getTypedRuleContext(little_duckParser.ExpContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_mas_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_exp" ):
                listener.enterMas_exp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_exp" ):
                listener.exitMas_exp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_exp" ):
                return visitor.visitMas_exp(self)
            else:
                return visitor.visitChildren(self)




    def mas_exp(self):

        localctx = little_duckParser.Mas_expContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_mas_exp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 146
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 57344) != 0):
                self.state = 143
                self.list_exp()
                self.state = 144
                self.exp()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_expContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return little_duckParser.RULE_list_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_exp" ):
                listener.enterList_exp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_exp" ):
                listener.exitList_exp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitList_exp" ):
                return visitor.visitList_exp(self)
            else:
                return visitor.visitChildren(self)




    def list_exp(self):

        localctx = little_duckParser.List_expContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_list_exp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 148
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 57344) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def termino(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(little_duckParser.TerminoContext)
            else:
                return self.getTypedRuleContext(little_duckParser.TerminoContext,i)


        def getRuleIndex(self):
            return little_duckParser.RULE_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp" ):
                listener.enterExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp" ):
                listener.exitExp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp" ):
                return visitor.visitExp(self)
            else:
                return visitor.visitChildren(self)




    def exp(self):

        localctx = little_duckParser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_exp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 157 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 150
                    self.termino()
                    self.state = 155
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
                    if la_ == 1:
                        self.state = 151
                        self.match(little_duckParser.T__15)
                        pass

                    elif la_ == 2:
                        self.state = 153
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
                        if la_ == 1:
                            self.state = 152
                            self.match(little_duckParser.T__16)


                        pass



                else:
                    raise NoViableAltException(self)
                self.state = 159 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,10,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TerminoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(little_duckParser.FactorContext)
            else:
                return self.getTypedRuleContext(little_duckParser.FactorContext,i)


        def getRuleIndex(self):
            return little_duckParser.RULE_termino

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermino" ):
                listener.enterTermino(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermino" ):
                listener.exitTermino(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTermino" ):
                return visitor.visitTermino(self)
            else:
                return visitor.visitChildren(self)




    def termino(self):

        localctx = little_duckParser.TerminoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_termino)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 165 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 161
                    self.factor()
                    self.state = 163
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==18 or _la==19:
                        self.state = 162
                        _la = self._input.LA(1)
                        if not(_la==18 or _la==19):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()



                else:
                    raise NoViableAltException(self)
                self.state = 167 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,12,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(little_duckParser.ExpressionContext,0)


        def factor_op(self):
            return self.getTypedRuleContext(little_duckParser.Factor_opContext,0)


        def value(self):
            return self.getTypedRuleContext(little_duckParser.ValueContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFactor" ):
                return visitor.visitFactor(self)
            else:
                return visitor.visitChildren(self)




    def factor(self):

        localctx = little_duckParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_factor)
        try:
            self.state = 176
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [20]:
                self.enterOuterAlt(localctx, 1)
                self.state = 169
                self.match(little_duckParser.T__19)
                self.state = 170
                self.expression()
                self.state = 171
                self.match(little_duckParser.T__20)
                pass
            elif token in [16, 17, 30, 31, 32]:
                self.enterOuterAlt(localctx, 2)
                self.state = 173
                self.factor_op()
                self.state = 174
                self.value()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Factor_opContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return little_duckParser.RULE_factor_op

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor_op" ):
                listener.enterFactor_op(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor_op" ):
                listener.exitFactor_op(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFactor_op" ):
                return visitor.visitFactor_op(self)
            else:
                return visitor.visitChildren(self)




    def factor_op(self):

        localctx = little_duckParser.Factor_opContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_factor_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 179
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==16 or _la==17:
                self.state = 178
                _la = self._input.LA(1)
                if not(_la==16 or _la==17):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(little_duckParser.ID, 0)

        def cte(self):
            return self.getTypedRuleContext(little_duckParser.CteContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValue" ):
                return visitor.visitValue(self)
            else:
                return visitor.visitChildren(self)




    def value(self):

        localctx = little_duckParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_value)
        try:
            self.state = 183
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 181
                self.match(little_duckParser.ID)
                pass
            elif token in [30, 31]:
                self.enterOuterAlt(localctx, 2)
                self.state = 182
                self.cte()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrintContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_prints(self):
            return self.getTypedRuleContext(little_duckParser.List_printsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_print

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint" ):
                listener.enterPrint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint" ):
                listener.exitPrint(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrint" ):
                return visitor.visitPrint(self)
            else:
                return visitor.visitChildren(self)




    def print_(self):

        localctx = little_duckParser.PrintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_print)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 185
            self.match(little_duckParser.T__21)
            self.state = 186
            self.list_prints()
            self.state = 187
            self.match(little_duckParser.T__20)
            self.state = 188
            self.match(little_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_printsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(little_duckParser.ExpressionContext,0)


        def print_more_expressions(self):
            return self.getTypedRuleContext(little_duckParser.Print_more_expressionsContext,0)


        def CTE_STRING(self):
            return self.getToken(little_duckParser.CTE_STRING, 0)

        def getRuleIndex(self):
            return little_duckParser.RULE_list_prints

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_prints" ):
                listener.enterList_prints(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_prints" ):
                listener.exitList_prints(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitList_prints" ):
                return visitor.visitList_prints(self)
            else:
                return visitor.visitChildren(self)




    def list_prints(self):

        localctx = little_duckParser.List_printsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_list_prints)
        try:
            self.state = 195
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16, 17, 20, 30, 31, 32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 190
                self.expression()
                self.state = 191
                self.print_more_expressions()
                pass
            elif token in [33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 193
                self.match(little_duckParser.CTE_STRING)
                self.state = 194
                self.print_more_expressions()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Print_more_expressionsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_prints(self):
            return self.getTypedRuleContext(little_duckParser.List_printsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_print_more_expressions

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint_more_expressions" ):
                listener.enterPrint_more_expressions(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint_more_expressions" ):
                listener.exitPrint_more_expressions(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrint_more_expressions" ):
                return visitor.visitPrint_more_expressions(self)
            else:
                return visitor.visitChildren(self)




    def print_more_expressions(self):

        localctx = little_duckParser.Print_more_expressionsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_print_more_expressions)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 199
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==7:
                self.state = 197
                self.match(little_duckParser.T__6)
                self.state = 198
                self.list_prints()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CycleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def body(self):
            return self.getTypedRuleContext(little_duckParser.BodyContext,0)


        def expression(self):
            return self.getTypedRuleContext(little_duckParser.ExpressionContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_cycle

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCycle" ):
                listener.enterCycle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCycle" ):
                listener.exitCycle(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCycle" ):
                return visitor.visitCycle(self)
            else:
                return visitor.visitChildren(self)




    def cycle(self):

        localctx = little_duckParser.CycleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_cycle)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 201
            self.match(little_duckParser.T__22)
            self.state = 202
            self.body()
            self.state = 203
            self.match(little_duckParser.T__23)
            self.state = 204
            self.match(little_duckParser.T__19)
            self.state = 205
            self.expression()
            self.state = 206
            self.match(little_duckParser.T__20)
            self.state = 207
            self.match(little_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(little_duckParser.ExpressionContext,0)


        def body(self):
            return self.getTypedRuleContext(little_duckParser.BodyContext,0)


        def end_condition(self):
            return self.getTypedRuleContext(little_duckParser.End_conditionContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = little_duckParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 209
            self.match(little_duckParser.T__24)
            self.state = 210
            self.match(little_duckParser.T__19)
            self.state = 211
            self.expression()
            self.state = 212
            self.match(little_duckParser.T__20)
            self.state = 213
            self.body()
            self.state = 214
            self.end_condition()
            self.state = 215
            self.match(little_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class End_conditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def body(self):
            return self.getTypedRuleContext(little_duckParser.BodyContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_end_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEnd_condition" ):
                listener.enterEnd_condition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEnd_condition" ):
                listener.exitEnd_condition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEnd_condition" ):
                return visitor.visitEnd_condition(self)
            else:
                return visitor.visitChildren(self)




    def end_condition(self):

        localctx = little_duckParser.End_conditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_end_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 219
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==26:
                self.state = 217
                self.match(little_duckParser.T__25)
                self.state = 218
                self.body()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class F_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(little_duckParser.ID, 0)

        def has_exp(self):
            return self.getTypedRuleContext(little_duckParser.Has_expContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_f_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterF_call" ):
                listener.enterF_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitF_call" ):
                listener.exitF_call(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitF_call" ):
                return visitor.visitF_call(self)
            else:
                return visitor.visitChildren(self)




    def f_call(self):

        localctx = little_duckParser.F_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_f_call)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 221
            self.match(little_duckParser.ID)
            self.state = 222
            self.match(little_duckParser.T__19)
            self.state = 223
            self.has_exp()
            self.state = 224
            self.match(little_duckParser.T__20)
            self.state = 225
            self.match(little_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Has_expContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_call_exp(self):
            return self.getTypedRuleContext(little_duckParser.List_call_expContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_has_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHas_exp" ):
                listener.enterHas_exp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHas_exp" ):
                listener.exitHas_exp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitHas_exp" ):
                return visitor.visitHas_exp(self)
            else:
                return visitor.visitChildren(self)




    def has_exp(self):

        localctx = little_duckParser.Has_expContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_has_exp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 228
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 7517437952) != 0):
                self.state = 227
                self.list_call_exp()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_call_expContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(little_duckParser.ExpressionContext,0)


        def more_call_expressions(self):
            return self.getTypedRuleContext(little_duckParser.More_call_expressionsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_list_call_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_call_exp" ):
                listener.enterList_call_exp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_call_exp" ):
                listener.exitList_call_exp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitList_call_exp" ):
                return visitor.visitList_call_exp(self)
            else:
                return visitor.visitChildren(self)




    def list_call_exp(self):

        localctx = little_duckParser.List_call_expContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_list_call_exp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 230
            self.expression()
            self.state = 231
            self.more_call_expressions()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class More_call_expressionsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_call_exp(self):
            return self.getTypedRuleContext(little_duckParser.List_call_expContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_more_call_expressions

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMore_call_expressions" ):
                listener.enterMore_call_expressions(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMore_call_expressions" ):
                listener.exitMore_call_expressions(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMore_call_expressions" ):
                return visitor.visitMore_call_expressions(self)
            else:
                return visitor.visitChildren(self)




    def more_call_expressions(self):

        localctx = little_duckParser.More_call_expressionsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_more_call_expressions)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 235
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==7:
                self.state = 233
                self.match(little_duckParser.T__6)
                self.state = 234
                self.list_call_exp()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(little_duckParser.ID, 0)

        def has_params(self):
            return self.getTypedRuleContext(little_duckParser.Has_paramsContext,0)


        def add_vars(self):
            return self.getTypedRuleContext(little_duckParser.Add_varsContext,0)


        def body(self):
            return self.getTypedRuleContext(little_duckParser.BodyContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_funcs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncs" ):
                listener.enterFuncs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncs" ):
                listener.exitFuncs(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFuncs" ):
                return visitor.visitFuncs(self)
            else:
                return visitor.visitChildren(self)




    def funcs(self):

        localctx = little_duckParser.FuncsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_funcs)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 237
            self.match(little_duckParser.T__26)
            self.state = 238
            self.match(little_duckParser.ID)
            self.state = 239
            self.match(little_duckParser.T__19)
            self.state = 240
            self.has_params()
            self.state = 241
            self.match(little_duckParser.T__20)
            self.state = 242
            self.match(little_duckParser.T__27)
            self.state = 243
            self.add_vars()
            self.state = 244
            self.body()
            self.state = 245
            self.match(little_duckParser.T__28)
            self.state = 246
            self.match(little_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Has_paramsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_params(self):
            return self.getTypedRuleContext(little_duckParser.List_paramsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_has_params

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHas_params" ):
                listener.enterHas_params(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHas_params" ):
                listener.exitHas_params(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitHas_params" ):
                return visitor.visitHas_params(self)
            else:
                return visitor.visitChildren(self)




    def has_params(self):

        localctx = little_duckParser.Has_paramsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_has_params)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 249
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==32:
                self.state = 248
                self.list_params()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_paramsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(little_duckParser.ID, 0)

        def type_(self):
            return self.getTypedRuleContext(little_duckParser.TypeContext,0)


        def more_params(self):
            return self.getTypedRuleContext(little_duckParser.More_paramsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_list_params

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_params" ):
                listener.enterList_params(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_params" ):
                listener.exitList_params(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitList_params" ):
                return visitor.visitList_params(self)
            else:
                return visitor.visitChildren(self)




    def list_params(self):

        localctx = little_duckParser.List_paramsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_list_params)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 251
            self.match(little_duckParser.ID)
            self.state = 252
            self.match(little_duckParser.T__8)
            self.state = 253
            self.type_()
            self.state = 254
            self.more_params()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class More_paramsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_params(self):
            return self.getTypedRuleContext(little_duckParser.List_paramsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_more_params

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMore_params" ):
                listener.enterMore_params(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMore_params" ):
                listener.exitMore_params(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMore_params" ):
                return visitor.visitMore_params(self)
            else:
                return visitor.visitChildren(self)




    def more_params(self):

        localctx = little_duckParser.More_paramsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_more_params)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 258
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==7:
                self.state = 256
                self.match(little_duckParser.T__6)
                self.state = 257
                self.list_params()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Add_varsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vars_(self):
            return self.getTypedRuleContext(little_duckParser.VarsContext,0)


        def getRuleIndex(self):
            return little_duckParser.RULE_add_vars

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAdd_vars" ):
                listener.enterAdd_vars(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAdd_vars" ):
                listener.exitAdd_vars(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdd_vars" ):
                return visitor.visitAdd_vars(self)
            else:
                return visitor.visitChildren(self)




    def add_vars(self):

        localctx = little_duckParser.Add_varsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_add_vars)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 260
            self.vars_()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Start_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def programa(self):
            return self.getTypedRuleContext(little_duckParser.ProgramaContext,0)


        def EOF(self):
            return self.getToken(little_duckParser.EOF, 0)

        def getRuleIndex(self):
            return little_duckParser.RULE_start_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart_" ):
                listener.enterStart_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart_" ):
                listener.exitStart_(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart_" ):
                return visitor.visitStart_(self)
            else:
                return visitor.visitChildren(self)




    def start_(self):

        localctx = little_duckParser.Start_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_start_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 262
            self.programa()
            self.state = 263
            self.match(little_duckParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





