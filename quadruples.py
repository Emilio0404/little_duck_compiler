class Quadruple():
    def __init__(self, op, arg1, arg2, result):
        self.op = op
        self.arg1 = arg1
        self.arg2 = arg2
        self.result = result

    def __str__(self):
        return f"({self.op}, {self.arg1}, {self.arg2}, {self.result})"
        

class QuadruplesGenerator():
    def __init__(self):
        self.quadruples = []
        self.operators_stack = []
        self.operands_stack = []
        self.types_stack = []
        self.jumps_stack = []
        self.temp_counter = 1

    def addQuadruple(self, quad):
        self.quadruples.append(quad)

    def generateTempVariable(self):
        tmp_var = 't' + str(self.temp_counter)
        self.temp_counter += 1
        return tmp_var

    def pushOperator(self, operator):
        self.operators_stack.append(operator)

    def popOperator(self):
        return self.operators_stack.pop()
    
    def topOperator(self):
        if len(self.operators_stack) > 0:
            return self.operators_stack[-1]
        return None
    
    def pushOperand(self, operator):
        self.operands_stack.append(operator)

    def popOperand(self):
        return self.operands_stack.pop()
    
    def topOperand(self):
        if len(self.operands_stack) > 0:
            return self.operands_stack[-1]
        return None
    
    def pushType(self, operator):
        self.types_stack.append(operator)

    def popType(self):
        return self.types_stack.pop()
    
    def topType(self):
        if len(self.types_stack) > 0:
            return self.types_stack[-1]
        return None
    
    def pushJump(self, operator):
        self.jumps_stack.append(operator)

    def popJump(self):
        return self.jumps_stack.pop()
    
    def topJump(self):
        if len(self.jumps_stack) > 0:
            return self.jumps_stack[-1]
        return None

    def printQuadruples(self):
        for i in range(len(self.quadruples)):
            print(i + 1, self.quadruples[i].__str__())