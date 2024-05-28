class MemoryManager():
    def __init__(self):
        self.memory = [None] * 5000
        self.cte_block = MemoryBlock(0, 999)
        self.int_block = MemoryBlock(1000, 1999)
        self.float_block = MemoryBlock(2000, 2999)
        self.bool_block = MemoryBlock(3000, 3999)
        self.tmp_block = MemoryBlock(4000, 5000)
        self.blocks = {
            'cte' : self.cte_block,
            'int' : self.int_block, 
            'float' : self.float_block,
            'bool' : self.bool_block,
            'tmp' : self.tmp_block
        }

    def allocate(self, type):
        block = self.blocks[type]
        address = block.reserve_space()
        self.memory[address] = None
        return address
    
    def updateValue(self, value, toAddress):
        self.memory[toAddress] = value
    

class MemoryBlock():
    def __init__(self, begin_range, end_range):
        self.range = (begin_range, end_range)
        self.last_assigned = begin_range

    def reserve_space(self):
        address = self.last_assigned
        self.last_assigned += 1
        return address