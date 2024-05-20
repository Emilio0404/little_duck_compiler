from semantic_cube import semantic_cube


class DirFunc():
    def __init__(self):
        self.functions = {}

    def addFunction(self, function_name, function_type):
        if function_name not in self.functions:
            self.functions[function_name] = VarsTable(function_name, function_type)
        else:
            raise Exception('MULTIPLE DECLARATION ERROR: FUNCTION NAME ALREADY IN USE')
        
    def addVariable(self, function_name, var_name, var_type):
        if function_name in self.functions:
            self.functions[function_name].addVariable(var_name, var_type)
        else:
            raise Exception('ERROR MISSING SYMBOL:', function_name, 'FUNCTION NAME NOT FOUND')

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
            raise Exception('MULTIPLE DECLARATION ERROR: VARIABLE NAME ALREADY IN USE')

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

    def resolveType(self, operator1, operator2, operation):
        pass
