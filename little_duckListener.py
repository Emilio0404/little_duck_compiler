from antlr4 import *
from little_duckParser import little_duckParser
from semantics import DirFunc, VarsTable, Variable

# This class defines a complete listener for a parse tree produced by little_duckParser.
class little_duckListener(ParseTreeListener):
    def __init__(self):
        self.current_function = None
        self.current_type = None
        #self.current_vartable = None
        self.dir_func = None
        self.variables_to_add = []

    # Enter a parse tree produced by little_duckParser#programa.
    def enterPrograma(self, ctx:little_duckParser.ProgramaContext):
        # 1. Create dirFunc
        self.dir_func = DirFunc()
        
        # 2. Add id name to DirFunc
        # Funciona como contexto global
        program_name = ctx.ID().getText()
        self.dir_func.addFunction(program_name, 'void') # 3. creating a vartable is done automatically, 8. type is always void
        self.current_function = program_name

    # Exit a parse tree produced by little_duckParser#programa.
    def exitPrograma(self, ctx:little_duckParser.ProgramaContext):
        self.dir_func.printFunctions()

        # 6. Delete DirFunc and current VarTable
        del self.dir_func
        #del self.current_vartable


    # Enter a parse tree produced by little_duckParser#type.
    def enterType(self, ctx:little_duckParser.TypeContext):
        pass

    # Exit a parse tree produced by little_duckParser#type.
    def exitType(self, ctx:little_duckParser.TypeContext):
        # 4. current_type = type
        current_type = ctx.getText()

        # 5. Search for id-name in current VarTable
        #    if found -> Error “multiple declaration”
        #    if not -> add id-name and current-type to current VarTable
        for var in self.variables_to_add:
            self.dir_func.addVariable(self.current_function, var, current_type)
        self.variables_to_add = []


    # Enter a parse tree produced by little_duckParser#cte.
    def enterCte(self, ctx:little_duckParser.CteContext):
        pass

    # Exit a parse tree produced by little_duckParser#cte.
    def exitCte(self, ctx:little_duckParser.CteContext):
        pass


    # Enter a parse tree produced by little_duckParser#list_ids.
    def enterList_ids(self, ctx:little_duckParser.List_idsContext):
        # For 5. save variables to a list and add them after having type
        variable_name = ctx.ID().getText()
        self.variables_to_add.append(variable_name)

    # Exit a parse tree produced by little_duckParser#list_ids.
    def exitList_ids(self, ctx:little_duckParser.List_idsContext):
        pass


    # Enter a parse tree produced by little_duckParser#more_ids.
    def enterMore_ids(self, ctx:little_duckParser.More_idsContext):
        pass

    # Exit a parse tree produced by little_duckParser#more_ids.
    def exitMore_ids(self, ctx:little_duckParser.More_idsContext):
        pass


    # Enter a parse tree produced by little_duckParser#vars.
    def enterVars(self, ctx:little_duckParser.VarsContext):
        pass

    # Exit a parse tree produced by little_duckParser#vars.
    def exitVars(self, ctx:little_duckParser.VarsContext):
        pass


    # Enter a parse tree produced by little_duckParser#variables.
    def enterVariables(self, ctx:little_duckParser.VariablesContext):
        pass

    # Exit a parse tree produced by little_duckParser#variables.
    def exitVariables(self, ctx:little_duckParser.VariablesContext):
        pass


    # Enter a parse tree produced by little_duckParser#mas_variables.
    def enterMas_variables(self, ctx:little_duckParser.Mas_variablesContext):
        pass

    # Exit a parse tree produced by little_duckParser#mas_variables.
    def exitMas_variables(self, ctx:little_duckParser.Mas_variablesContext):
        pass


    # Enter a parse tree produced by little_duckParser#body.
    def enterBody(self, ctx:little_duckParser.BodyContext):
        pass

    # Exit a parse tree produced by little_duckParser#body.
    def exitBody(self, ctx:little_duckParser.BodyContext):
        pass


    # Enter a parse tree produced by little_duckParser#list_body.
    def enterList_body(self, ctx:little_duckParser.List_bodyContext):
        pass

    # Exit a parse tree produced by little_duckParser#list_body.
    def exitList_body(self, ctx:little_duckParser.List_bodyContext):
        pass


    # Enter a parse tree produced by little_duckParser#more_statements.
    def enterMore_statements(self, ctx:little_duckParser.More_statementsContext):
        pass

    # Exit a parse tree produced by little_duckParser#more_statements.
    def exitMore_statements(self, ctx:little_duckParser.More_statementsContext):
        pass


    # Enter a parse tree produced by little_duckParser#statement.
    def enterStatement(self, ctx:little_duckParser.StatementContext):
        pass

    # Exit a parse tree produced by little_duckParser#statement.
    def exitStatement(self, ctx:little_duckParser.StatementContext):
        pass


    # Enter a parse tree produced by little_duckParser#assign.
    def enterAssign(self, ctx:little_duckParser.AssignContext):
        pass

    # Exit a parse tree produced by little_duckParser#assign.
    def exitAssign(self, ctx:little_duckParser.AssignContext):
        pass


    # Enter a parse tree produced by little_duckParser#expression.
    def enterExpression(self, ctx:little_duckParser.ExpressionContext):
        pass

    # Exit a parse tree produced by little_duckParser#expression.
    def exitExpression(self, ctx:little_duckParser.ExpressionContext):
        pass


    # Enter a parse tree produced by little_duckParser#mas_exp.
    def enterMas_exp(self, ctx:little_duckParser.Mas_expContext):
        pass

    # Exit a parse tree produced by little_duckParser#mas_exp.
    def exitMas_exp(self, ctx:little_duckParser.Mas_expContext):
        pass


    # Enter a parse tree produced by little_duckParser#list_exp.
    def enterList_exp(self, ctx:little_duckParser.List_expContext):
        pass

    # Exit a parse tree produced by little_duckParser#list_exp.
    def exitList_exp(self, ctx:little_duckParser.List_expContext):
        pass


    # Enter a parse tree produced by little_duckParser#exp.
    def enterExp(self, ctx:little_duckParser.ExpContext):
        pass

    # Exit a parse tree produced by little_duckParser#exp.
    def exitExp(self, ctx:little_duckParser.ExpContext):
        pass


    # Enter a parse tree produced by little_duckParser#termino.
    def enterTermino(self, ctx:little_duckParser.TerminoContext):
        pass

    # Exit a parse tree produced by little_duckParser#termino.
    def exitTermino(self, ctx:little_duckParser.TerminoContext):
        pass


    # Enter a parse tree produced by little_duckParser#factor.
    def enterFactor(self, ctx:little_duckParser.FactorContext):
        pass

    # Exit a parse tree produced by little_duckParser#factor.
    def exitFactor(self, ctx:little_duckParser.FactorContext):
        pass


    # Enter a parse tree produced by little_duckParser#factor_op.
    def enterFactor_op(self, ctx:little_duckParser.Factor_opContext):
        pass

    # Exit a parse tree produced by little_duckParser#factor_op.
    def exitFactor_op(self, ctx:little_duckParser.Factor_opContext):
        pass


    # Enter a parse tree produced by little_duckParser#value.
    def enterValue(self, ctx:little_duckParser.ValueContext):
        pass

    # Exit a parse tree produced by little_duckParser#value.
    def exitValue(self, ctx:little_duckParser.ValueContext):
        pass


    # Enter a parse tree produced by little_duckParser#print.
    def enterPrint(self, ctx:little_duckParser.PrintContext):
        pass

    # Exit a parse tree produced by little_duckParser#print.
    def exitPrint(self, ctx:little_duckParser.PrintContext):
        pass


    # Enter a parse tree produced by little_duckParser#list_prints.
    def enterList_prints(self, ctx:little_duckParser.List_printsContext):
        pass

    # Exit a parse tree produced by little_duckParser#list_prints.
    def exitList_prints(self, ctx:little_duckParser.List_printsContext):
        pass


    # Enter a parse tree produced by little_duckParser#print_more_expressions.
    def enterPrint_more_expressions(self, ctx:little_duckParser.Print_more_expressionsContext):
        pass

    # Exit a parse tree produced by little_duckParser#print_more_expressions.
    def exitPrint_more_expressions(self, ctx:little_duckParser.Print_more_expressionsContext):
        pass


    # Enter a parse tree produced by little_duckParser#cycle.
    def enterCycle(self, ctx:little_duckParser.CycleContext):
        pass

    # Exit a parse tree produced by little_duckParser#cycle.
    def exitCycle(self, ctx:little_duckParser.CycleContext):
        pass


    # Enter a parse tree produced by little_duckParser#condition.
    def enterCondition(self, ctx:little_duckParser.ConditionContext):
        pass

    # Exit a parse tree produced by little_duckParser#condition.
    def exitCondition(self, ctx:little_duckParser.ConditionContext):
        pass


    # Enter a parse tree produced by little_duckParser#end_condition.
    def enterEnd_condition(self, ctx:little_duckParser.End_conditionContext):
        pass

    # Exit a parse tree produced by little_duckParser#end_condition.
    def exitEnd_condition(self, ctx:little_duckParser.End_conditionContext):
        pass


    # Enter a parse tree produced by little_duckParser#f_call.
    def enterF_call(self, ctx:little_duckParser.F_callContext):
        pass

    # Exit a parse tree produced by little_duckParser#f_call.
    def exitF_call(self, ctx:little_duckParser.F_callContext):
        pass


    # Enter a parse tree produced by little_duckParser#has_exp.
    def enterHas_exp(self, ctx:little_duckParser.Has_expContext):
        pass

    # Exit a parse tree produced by little_duckParser#has_exp.
    def exitHas_exp(self, ctx:little_duckParser.Has_expContext):
        pass


    # Enter a parse tree produced by little_duckParser#list_call_exp.
    def enterList_call_exp(self, ctx:little_duckParser.List_call_expContext):
        pass

    # Exit a parse tree produced by little_duckParser#list_call_exp.
    def exitList_call_exp(self, ctx:little_duckParser.List_call_expContext):
        pass


    # Enter a parse tree produced by little_duckParser#more_call_expressions.
    def enterMore_call_expressions(self, ctx:little_duckParser.More_call_expressionsContext):
        pass

    # Exit a parse tree produced by little_duckParser#more_call_expressions.
    def exitMore_call_expressions(self, ctx:little_duckParser.More_call_expressionsContext):
        pass


    # Enter a parse tree produced by little_duckParser#funcs.
    def enterFuncs(self, ctx:little_duckParser.FuncsContext):
        # 7. Prepare DirFunc to add new function
        func = ctx.ID().getText()
        self.current_function = func
        self.current_type = 'void' # 8. function type is always void
        
        # 9. Add function to dir_func, 10. VarsTable creation is done automatically
        self.dir_func.addFunction(self.current_function, self.current_type)

    # Exit a parse tree produced by little_duckParser#funcs.
    def exitFuncs(self, ctx:little_duckParser.FuncsContext):
        pass


    # Enter a parse tree produced by little_duckParser#has_params.
    def enterHas_params(self, ctx:little_duckParser.Has_paramsContext):
        pass

    # Exit a parse tree produced by little_duckParser#has_params.
    def exitHas_params(self, ctx:little_duckParser.Has_paramsContext):
        pass


    # Enter a parse tree produced by little_duckParser#list_params.
    def enterList_params(self, ctx:little_duckParser.List_paramsContext):
        id_name = ctx.ID().getText()
        self.variables_to_add.append(id_name)

    # Exit a parse tree produced by little_duckParser#list_params.
    def exitList_params(self, ctx:little_duckParser.List_paramsContext):
        pass


    # Enter a parse tree produced by little_duckParser#more_params.
    def enterMore_params(self, ctx:little_duckParser.More_paramsContext):
        pass

    # Exit a parse tree produced by little_duckParser#more_params.
    def exitMore_params(self, ctx:little_duckParser.More_paramsContext):
        pass


    # Enter a parse tree produced by little_duckParser#add_vars.
    def enterAdd_vars(self, ctx:little_duckParser.Add_varsContext):
        pass

    # Exit a parse tree produced by little_duckParser#add_vars.
    def exitAdd_vars(self, ctx:little_duckParser.Add_varsContext):
        pass


    # Enter a parse tree produced by little_duckParser#start_.
    def enterStart_(self, ctx:little_duckParser.Start_Context):
        pass

    # Exit a parse tree produced by little_duckParser#start_.
    def exitStart_(self, ctx:little_duckParser.Start_Context):
        pass



del little_duckParser