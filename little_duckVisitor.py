# Generated from little_duck.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .little_duckParser import little_duckParser
else:
    from little_duckParser import little_duckParser

# This class defines a complete generic visitor for a parse tree produced by little_duckParser.

class little_duckVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by little_duckParser#programa.
    def visitPrograma(self, ctx:little_duckParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#type.
    def visitType(self, ctx:little_duckParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#cte.
    def visitCte(self, ctx:little_duckParser.CteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#list_ids.
    def visitList_ids(self, ctx:little_duckParser.List_idsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#more_ids.
    def visitMore_ids(self, ctx:little_duckParser.More_idsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#vars.
    def visitVars(self, ctx:little_duckParser.VarsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#variables.
    def visitVariables(self, ctx:little_duckParser.VariablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#mas_variables.
    def visitMas_variables(self, ctx:little_duckParser.Mas_variablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#body.
    def visitBody(self, ctx:little_duckParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#list_body.
    def visitList_body(self, ctx:little_duckParser.List_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#more_statements.
    def visitMore_statements(self, ctx:little_duckParser.More_statementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#statement.
    def visitStatement(self, ctx:little_duckParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#assign.
    def visitAssign(self, ctx:little_duckParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#expression.
    def visitExpression(self, ctx:little_duckParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#mas_exp.
    def visitMas_exp(self, ctx:little_duckParser.Mas_expContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#expression_operator.
    def visitExpression_operator(self, ctx:little_duckParser.Expression_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#exp.
    def visitExp(self, ctx:little_duckParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#exp_operator.
    def visitExp_operator(self, ctx:little_duckParser.Exp_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#termino.
    def visitTermino(self, ctx:little_duckParser.TerminoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#termino_operator.
    def visitTermino_operator(self, ctx:little_duckParser.Termino_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#factor.
    def visitFactor(self, ctx:little_duckParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#factor_operator.
    def visitFactor_operator(self, ctx:little_duckParser.Factor_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#value.
    def visitValue(self, ctx:little_duckParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#print.
    def visitPrint(self, ctx:little_duckParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#list_prints.
    def visitList_prints(self, ctx:little_duckParser.List_printsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#print_more_expressions.
    def visitPrint_more_expressions(self, ctx:little_duckParser.Print_more_expressionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#cycle.
    def visitCycle(self, ctx:little_duckParser.CycleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#condition.
    def visitCondition(self, ctx:little_duckParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#end_condition.
    def visitEnd_condition(self, ctx:little_duckParser.End_conditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#f_call.
    def visitF_call(self, ctx:little_duckParser.F_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#has_exp.
    def visitHas_exp(self, ctx:little_duckParser.Has_expContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#list_call_exp.
    def visitList_call_exp(self, ctx:little_duckParser.List_call_expContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#more_call_expressions.
    def visitMore_call_expressions(self, ctx:little_duckParser.More_call_expressionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#funcs.
    def visitFuncs(self, ctx:little_duckParser.FuncsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#has_params.
    def visitHas_params(self, ctx:little_duckParser.Has_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#list_params.
    def visitList_params(self, ctx:little_duckParser.List_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#more_params.
    def visitMore_params(self, ctx:little_duckParser.More_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#add_vars.
    def visitAdd_vars(self, ctx:little_duckParser.Add_varsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#start_.
    def visitStart_(self, ctx:little_duckParser.Start_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#equal_sign.
    def visitEqual_sign(self, ctx:little_duckParser.Equal_signContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#main.
    def visitMain(self, ctx:little_duckParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#if.
    def visitIf(self, ctx:little_duckParser.IfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#while.
    def visitWhile(self, ctx:little_duckParser.WhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#do.
    def visitDo(self, ctx:little_duckParser.DoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#close_parenthesis.
    def visitClose_parenthesis(self, ctx:little_duckParser.Close_parenthesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by little_duckParser#open_parenthesis.
    def visitOpen_parenthesis(self, ctx:little_duckParser.Open_parenthesisContext):
        return self.visitChildren(ctx)



del little_duckParser