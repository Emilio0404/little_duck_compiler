from antlr4 import *
from little_duckParser import little_duckParser
from semantics import DirFunc, SemanticCube, ConstTable
from quadruples import QuadruplesGenerator, Quadruple
from memory import MemoryManager
from codes import operation_codes

# This class defines a complete listener for a parse tree produced by little_duckParser.
class little_duckListener(ParseTreeListener):
    def __init__(self):
        self.current_function = None
        self.current_type = None
        self.dir_func = None
        self.variables_to_add = []
        self.quadruples_helper = QuadruplesGenerator()
        self.semantic_cube = SemanticCube()
        self.constTable = ConstTable()
        self.memoryManager = MemoryManager()

    # Enter a parse tree produced by little_duckParser#programa.
    def enterPrograma(self, ctx:little_duckParser.ProgramaContext):
        # 1. Create dirFunc
        self.dir_func = DirFunc()
        
        # 2. Add id_name and type to DirFunc
        # program id_name works as global context
        program_name = ctx.ID().getText()
        self.dir_func.addFunction(program_name, 'void') # 3. creating a vartable is done inside addFunction
        self.current_function = program_name

    # Exit a parse tree produced by little_duckParser#programa.
    def exitPrograma(self, ctx:little_duckParser.ProgramaContext):
        #self.dir_func.printFunctions()
        #self.constTable.printConstants()
        #self.quadruples_helper.printQuadruples()

        # 6. Delete DirFunc and current VarTable
        del self.dir_func


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
            address = self.memoryManager.allocate(current_type)
            created_var = self.dir_func.getVariable(self.current_function, var)
            created_var.updateMemoryAddress(address)
        self.variables_to_add = []


    # Enter a parse tree produced by little_duckParser#cte.
    def enterCte(self, ctx:little_duckParser.CteContext):
        pass

    # Exit a parse tree produced by little_duckParser#cte.
    def exitCte(self, ctx:little_duckParser.CteContext):
        if ctx.CTE_INT():
            address = self.constTable.addConstant(ctx.CTE_INT().getText(), 'int')
            if address is None:
                address = self.memoryManager.allocate('cte')
                const = self.constTable.getConstant(ctx.CTE_INT().getText())
                const.updateMemoryAddress(address)
                self.memoryManager.updateValue(int(ctx.CTE_INT().getText()), const.address)
        elif ctx.CTE_FLOAT():
            address = self.constTable.addConstant(ctx.CTE_FLOAT().getText(), 'float')
            if address is None:
                address = self.memoryManager.allocate('cte')
                const = self.constTable.getConstant(ctx.CTE_FLOAT().getText())
                const.updateMemoryAddress(address)
                self.memoryManager.updateValue(float(ctx.CTE_FLOAT().getText()), const.address)
        else:
            print("ERROR ADDING TO CONST TABLE")


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
        id_name = ctx.ID().getText()
        var = self.dir_func.getVariable(self.current_function, id_name)

        self.quadruples_helper.pushOperand(var.address)
        self.quadruples_helper.pushOperator('=')

    # Exit a parse tree produced by little_duckParser#assign.
    def exitAssign(self, ctx:little_duckParser.AssignContext):
        topOperator = self.quadruples_helper.topOperator()
        if topOperator == '=':
            right_operand = self.quadruples_helper.popOperand()
            left_operand = self.quadruples_helper.popOperand()
            operator = self.quadruples_helper.popOperator()
            quad = Quadruple(operation_codes[operator], right_operand, -1, left_operand)
            self.quadruples_helper.addQuadruple(quad)


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
        topOperator = self.quadruples_helper.topOperator()
        if topOperator == '>' or topOperator == '<' or topOperator == '!=':
            right_operand = self.quadruples_helper.popOperand()
            right_type = self.quadruples_helper.popType()
            left_operand = self.quadruples_helper.popOperand()
            left_type = self.quadruples_helper.popType()
            operator = self.quadruples_helper.popOperator()

            # result = self.quadruples_helper.generateTempVariable()
            result_type = self.semantic_cube.resolveType(left_type, right_type, operator)
            result_address = self.memoryManager.allocate('bool')

            self.quadruples_helper.pushOperand(result_address)
            self.quadruples_helper.pushType(result_type)
            quad = Quadruple(operation_codes[operator], left_operand, right_operand, result_address)
            self.quadruples_helper.addQuadruple(quad)


    # Enter a parse tree produced by little_duckParser#expression_operator.
    def enterExpression_operator(self, ctx:little_duckParser.Expression_operatorContext):
        comparision_operator = ctx.getText()
        self.quadruples_helper.pushOperator(comparision_operator)

    # Exit a parse tree produced by little_duckParser#expression_operator.
    def exitExpression_operator(self, ctx:little_duckParser.Expression_operatorContext):
        pass


    # Enter a parse tree produced by little_duckParser#exp.
    def enterExp(self, ctx:little_duckParser.ExpContext):
        pass

    # Exit a parse tree produced by little_duckParser#exp.
    def exitExp(self, ctx:little_duckParser.ExpContext):
        pass


    # Enter a parse tree produced by little_duckParser#exp_operator.
    def enterExp_operator(self, ctx:little_duckParser.Exp_operatorContext):
        operator = ctx.getText()
        self.quadruples_helper.pushOperator(operator)

    # Exit a parse tree produced by little_duckParser#exp_operator.
    def exitExp_operator(self, ctx:little_duckParser.Exp_operatorContext):
        pass


    # Enter a parse tree produced by little_duckParser#termino.
    def enterTermino(self, ctx:little_duckParser.TerminoContext):
        pass

    # Exit a parse tree produced by little_duckParser#termino.
    def exitTermino(self, ctx:little_duckParser.TerminoContext):
        topOperator = self.quadruples_helper.topOperator()
        if topOperator == '+' or topOperator == '-':
            right_operand = self.quadruples_helper.popOperand()
            right_type = self.quadruples_helper.popType()
            left_operand = self.quadruples_helper.popOperand()
            left_type = self.quadruples_helper.popType()
            operator = self.quadruples_helper.popOperator()

            # result = self.quadruples_helper.generateTempVariable()
            result_type = self.semantic_cube.resolveType(left_type, right_type, operator)
            result_address = self.memoryManager.allocate('tmp')

            self.quadruples_helper.pushOperand(result_address)
            self.quadruples_helper.pushType(result_type)
            quad = Quadruple(operation_codes[operator], left_operand, right_operand, result_address)
            self.quadruples_helper.addQuadruple(quad)


    # Enter a parse tree produced by little_duckParser#termino_operator.
    def enterTermino_operator(self, ctx:little_duckParser.Termino_operatorContext):
        operator = ctx.getText()
        self.quadruples_helper.pushOperator(operator)

    # Exit a parse tree produced by little_duckParser#termino_operator.
    def exitTermino_operator(self, ctx:little_duckParser.Termino_operatorContext):
        pass


    # Enter a parse tree produced by little_duckParser#factor.
    def enterFactor(self, ctx:little_duckParser.FactorContext):
        pass

    # Exit a parse tree produced by little_duckParser#factor.
    def exitFactor(self, ctx:little_duckParser.FactorContext):
        topOperator = self.quadruples_helper.topOperator()
        if topOperator == '*' or topOperator == '/':
            right_operand = self.quadruples_helper.popOperand()
            right_type = self.quadruples_helper.popType()
            left_operand = self.quadruples_helper.popOperand()
            left_type = self.quadruples_helper.popType()
            operator = self.quadruples_helper.popOperator()

            # result = self.quadruples_helper.generateTempVariable()
            result_type = self.semantic_cube.resolveType(left_type, right_type, operator)
            result_address = self.memoryManager.allocate('tmp')
            
            self.quadruples_helper.pushOperand(result_address)
            self.quadruples_helper.pushType(result_type)
            quad = Quadruple(operation_codes[operator], left_operand, right_operand, result_address)
            self.quadruples_helper.addQuadruple(quad)


    # Enter a parse tree produced by little_duckParser#parenthesis_factor_expression.
    def enterParenthesis_factor_expression(self, ctx:little_duckParser.Parenthesis_factor_expressionContext):
        self.quadruples_helper.pushOperator('(')

    # Exit a parse tree produced by little_duckParser#parenthesis_factor_expression.
    def exitParenthesis_factor_expression(self, ctx:little_duckParser.Parenthesis_factor_expressionContext):
        self.quadruples_helper.popOperator()


    # Enter a parse tree produced by little_duckParser#factor_value.
    def enterFactor_value(self, ctx:little_duckParser.Factor_valueContext):
        pass

    # Exit a parse tree produced by little_duckParser#factor_value.
    def exitFactor_value(self, ctx:little_duckParser.Factor_valueContext):
        pass


    # Enter a parse tree produced by little_duckParser#factor_operator.
    def enterFactor_operator(self, ctx:little_duckParser.Factor_operatorContext):
        pass

    # Exit a parse tree produced by little_duckParser#factor_operator.
    def exitFactor_operator(self, ctx:little_duckParser.Factor_operatorContext):
        pass


    # Enter a parse tree produced by little_duckParser#value.
    def enterValue(self, ctx:little_duckParser.ValueContext):
        pass

    # Exit a parse tree produced by little_duckParser#value.
    def exitValue(self, ctx:little_duckParser.ValueContext):
        # 1. 
        if ctx.ID():
            id_name = ctx.ID().getText()
            variable = self.dir_func.getVariable(self.current_function, id_name)
            self.quadruples_helper.pushOperand(variable.address)
            self.quadruples_helper.pushType(variable.type)
        elif ctx.cte():
            cte_type = None
            if ctx.cte().CTE_INT():
                cte_type = 'int'
            elif ctx.cte().CTE_FLOAT():
                cte_type = 'float'
            constant_value = ctx.getText()
            const = self.constTable.getConstant(constant_value)
            self.quadruples_helper.pushOperand(const.address)
            self.quadruples_helper.pushType(cte_type)


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
        result = None

        if ctx.parentCtx.expression():
            result = self.quadruples_helper.popOperand()
        elif ctx.parentCtx.CTE_STRING():
            result = ctx.parentCtx.CTE_STRING().getText()
        else:
            print("ERROR")

        quad = Quadruple(operation_codes['print'], -1, -1, result)
        self.quadruples_helper.addQuadruple(quad)


    # Exit a parse tree produced by little_duckParser#print_more_expressions.
    def exitPrint_more_expressions(self, ctx:little_duckParser.Print_more_expressionsContext):
        pass


    # Enter a parse tree produced by little_duckParser#cycle.
    def enterCycle(self, ctx:little_duckParser.CycleContext):
        pass

    # Exit a parse tree produced by little_duckParser#cycle.
    def exitCycle(self, ctx:little_duckParser.CycleContext):
        return_to_do = self.quadruples_helper.popJump()
        condition_result = self.quadruples_helper.popOperand()

        condition_type = self.quadruples_helper.popType()
        if condition_type == 'bool':
            quad = Quadruple(operation_codes['GOTOV'], condition_result, -1, return_to_do)
            self.quadruples_helper.addQuadruple(quad)
        else:
            print("ERROR: TYPE MISMATCH") # TODO: HANDLE IN SEMANTICS


    # Enter a parse tree produced by little_duckParser#condition.
    def enterCondition(self, ctx:little_duckParser.ConditionContext):
        pass

    # Exit a parse tree produced by little_duckParser#condition.
    def exitCondition(self, ctx:little_duckParser.ConditionContext):
        end = self.quadruples_helper.popJump()
        self.quadruples_helper.fillJump(end)
    
        # Enter a parse tree produced by little_duckParser#if_condition.
    def enterIf_condition(self, ctx:little_duckParser.If_conditionContext):
        pass

    # Exit a parse tree produced by little_duckParser#if_condition.
    def exitIf_condition(self, ctx:little_duckParser.If_conditionContext):
        condition_type = self.quadruples_helper.popType()
        if condition_type == 'bool':
            result = self.quadruples_helper.popOperand()
            quad = Quadruple(operation_codes['GOTOF'], result, -1, None)
            self.quadruples_helper.pushJump()
            self.quadruples_helper.addQuadruple(quad)
        else:
            print("ERROR: TYPE MISMATCH") # TODO: HANDLE IN SEMANTICS


    # Enter a parse tree produced by little_duckParser#end_condition.
    def enterEnd_condition(self, ctx:little_duckParser.End_conditionContext):
        quad = Quadruple(operation_codes['GOTO'], -1, -1, None)
        false = self.quadruples_helper.popJump()
        self.quadruples_helper.pushJump()
        self.quadruples_helper.addQuadruple(quad)
        self.quadruples_helper.fillJump(false)
        

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


    # Enter a parse tree produced by little_duckParser#equal_sign.
    def enterEqual_sign(self, ctx:little_duckParser.Equal_signContext):
        pass

    # Exit a parse tree produced by little_duckParser#equal_sign.
    def exitEqual_sign(self, ctx:little_duckParser.Equal_signContext):
        pass


    # Enter a parse tree produced by little_duckParser#main.
    def enterMain(self, ctx:little_duckParser.MainContext):
        pass

    # Exit a parse tree produced by little_duckParser#main.
    def exitMain(self, ctx:little_duckParser.MainContext):
        pass


    # Enter a parse tree produced by little_duckParser#if.
    def enterIf(self, ctx:little_duckParser.IfContext):
        pass

    # Exit a parse tree produced by little_duckParser#if.
    def exitIf(self, ctx:little_duckParser.IfContext):
        pass


    # Enter a parse tree produced by little_duckParser#while.
    def enterWhile(self, ctx:little_duckParser.WhileContext):
        pass

    # Exit a parse tree produced by little_duckParser#while.
    def exitWhile(self, ctx:little_duckParser.WhileContext):
        pass


    # Enter a parse tree produced by little_duckParser#do.
    def enterDo(self, ctx:little_duckParser.DoContext):
        self.quadruples_helper.pushJump()

    # Exit a parse tree produced by little_duckParser#do.
    def exitDo(self, ctx:little_duckParser.DoContext):
        pass


    # Enter a parse tree produced by little_duckParser#close_parenthesis.
    def enterClose_parenthesis(self, ctx:little_duckParser.Close_parenthesisContext):
        pass

    # Exit a parse tree produced by little_duckParser#close_parenthesis.
    def exitClose_parenthesis(self, ctx:little_duckParser.Close_parenthesisContext):
        pass


    # Enter a parse tree produced by little_duckParser#open_parenthesis.
    def enterOpen_parenthesis(self, ctx:little_duckParser.Open_parenthesisContext):
        pass

    # Exit a parse tree produced by little_duckParser#open_parenthesis.
    def exitOpen_parenthesis(self, ctx:little_duckParser.Open_parenthesisContext):
        pass


    def returnMemoryManager(self):
        return self.memoryManager
    
    def returnQuadruples(self):
        return self.quadruples_helper.quadruples



del little_duckParser