from semantic_cube import semantic_cube
import sys

class DirFunc():
    def __init__(self):
        self.functions = {}

    def addFunction(self, function_name, function_type):
        if function_name not in self.functions:
            self.functions[function_name] = VarsTable(function_name, function_type)
        else:
            print('MULTIPLE DECLARATION ERROR: FUNCTION NAME', function_name, 'ALREADY IN USE')
            sys.exit(1)
        
    def addVariable(self, function_name, var_name, var_type):
        if function_name in self.functions:
            self.functions[function_name].addVariable(var_name, var_type)
        else:
            print('MULTIPLE DECLARATION ERROR: NAME ALREADY IN USE')
            sys.exit(1)

    def getVariable(self, function_name, variable_name):
        var_table = self.functions[function_name]
        return var_table.getVariable(variable_name)

    def printFunctions(self):
        print("DirFunc")
        for key, value in self.functions.items():
            print("    ", value.name, value.type)
        print("\n=========================================\n")

        print("VARS TABLES")
        for key, value in self.functions.items():
            print("    FUNCTION_NAME:", value.name)
            print("    TYPE:", value.type)
            print("    VARIABLES:")
            value.printVars()
            print()


class VarsTable():
    def __init__(self, name, type):
        self.name = name
        self.type = type
        self.variables = {}

    def checkGlobalScope(self):
        pass

    def addVariable(self, name, type):
        if name not in self.variables:
            value = "NaN"
            self.variables[name] = Variable(name, type, value)
        else:
            print('MULTIPLE DECLARATION ERROR: VARIABLE NAME', name, 'ALREADY IN USE')
            sys.exit(1)

    def getVariable(self, var):
        return self.variables[var]

    def deleteVariable(self):
        pass

    def printVars(self):
        for key, value in self.variables.items():
            print("        ", value.name, value.type)


class Variable():
    def __init__(self, name, type, value):
        self.name = name
        self.type = type
        self.value = value


class SemanticCube():
    def __init__(self):
        self.cube = semantic_cube

    def resolveType(self, left_type, right_type, operator):
        if self.cube[left_type][right_type][operator]:
            return self.cube[left_type][right_type][operator]

        print("ERROR: SEMANTIC CUBE")
        sys.exit(1)
