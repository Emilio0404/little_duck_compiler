semantic_cube = {
    'int': {
            'int': {
                    '+': 'int', 
                    '-': 'int', 
                    '*': 'int', 
                    '/': 'int', 
                    '=': 'int', 
                    '!=': 'bool', 
                    '>': 'bool', 
                    '<': 'bool'
                },
            'float': {
                    '+': 'float', 
                    '-': 'float', 
                    '*': 'float', 
                    '/': 'float', 
                    '=': 'bool', 
                    '!=': 'bool', 
                    '>': 'bool', 
                }
        },
    'float': {
            'int': {
                    '+': 'float', 
                    '-': 'float', 
                    '*': 'float', 
                    '/': 'float', 
                    '=': 'float', 
                    '!=': 'bool', 
                    '>': 'bool', 
                    '<': 'bool'
                },
            'float': {
                    '+': 'float', 
                    '-': 'float', 
                    '*': 'float', 
                    '/': 'float', 
                    '=': 'bool', 
                    '!=': 'bool', 
                    '>': 'bool', 
                }
        }
}
