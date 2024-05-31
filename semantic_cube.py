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
                    '<': 'bool',
                    'and': 'bool'
                },
            'float': {
                    '+': 'float', 
                    '-': 'float', 
                    '*': 'float', 
                    '/': 'float', 
                    '=': 'bool', 
                    '!=': 'bool', 
                    '>': 'bool', 
                    'and': 'bool'
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
                    '<': 'bool',
                    'and': 'bool'
                },
            'float': {
                    '+': 'float', 
                    '-': 'float', 
                    '*': 'float', 
                    '/': 'float', 
                    '=': 'bool', 
                    '!=': 'bool', 
                    '>': 'bool',
                    'and': 'bool'
                }
        },
        'bool': {
            'bool' : {
                'and': 'bool'
            }
        }
}
