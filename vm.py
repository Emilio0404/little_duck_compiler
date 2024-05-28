class VirtualMachine():
    def __init__(self, quads, memory):
        self.quadruples = quads
        self.memory = memory
        self.ip = 0 # instruction pointer

    def run(self):
        self.executeQuadruples()

    def executeQuadruples(self):
        while self.ip < len(self.quadruples):
            #print(self.quadruples[self.ip].__str__())
            self.executeInstruction()
            self.ip += 1

    def executeInstruction(self):
        quad = self.quadruples[self.ip]
        operation, left, right, result = quad.op, quad.arg1, quad.arg2, quad.result

        if operation == 0:
            sum_of_values = self.memory.getValue(left) + self.memory.getValue(right)
            self.memory.updateValue(sum_of_values, result)

        elif operation == 1:
            subtraction = self.memory.getValue(left) - self.memory.getValue(right)
            self.memory.updateValue(subtraction, result)

        elif operation == 2:
            mutiplication = self.memory.getValue(left) * self.memory.getValue(right)
            self.memory.updateValue(mutiplication, result)

        elif operation == 3:
            division = self.memory.getValue(left) / self.memory.getValue(right)
            self.memory.updateValue(division, result)

        elif operation == 4:
            value_to_assign = self.memory.getValue(left)
            self.memory.updateValue(value_to_assign, result)

        elif operation == 5:
            left_value = self.memory.getValue(left)
            right_value = self.memory.getValue(right)
            condition_result = left_value != right_value
            self.memory.updateValue(condition_result, result)

        elif operation == 6:
            left_value = self.memory.getValue(left)
            right_value = self.memory.getValue(right)
            condition_result = left_value > right_value
            self.memory.updateValue(condition_result, result)

        elif operation == 7:
            left_value = self.memory.getValue(left)
            right_value = self.memory.getValue(right)
            condition_result = left_value < right_value
            self.memory.updateValue(condition_result, result)

        elif operation == 8:
            value_to_print = self.memory.getValue(result)
            print(str(value_to_print))

        elif operation == 9:
            # subtract 2, one because of index, 
            # another because it's added immediately after exiting executeInstruction
            self.ip = result - 2

        elif operation == 10:
            condition = self.memory.getValue(left)
            if condition is not True:
                self.ip = result - 2

        elif operation == 11:
            condition = self.memory.getValue(left)
            if condition is True:
                self.ip = result - 2;

        elif operation == 12:
            value_to_print = self.memory.getValue(result)
            print(str(value_to_print), end=' ')