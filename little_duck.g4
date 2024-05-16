grammar little_duck;

programa: 'program' ID ';' vars funcs* 'main' body 'end';

type: 'int' | 'float';

cte: CTE_INT | CTE_FLOAT;

list_ids: ID (more_ids)?;
more_ids: ',' list_ids; 

vars: ('var' variables)?;
variables: list_ids ':' type ';' mas_variables;
mas_variables: variables?;

body: '{' list_body;
list_body: '}' | statement more_statements '}';
more_statements: (statement more_statements)?;

statement: assign | condition | cycle | f_call | print | expression;

assign: ID '=' expression ';';

expression: exp mas_exp;
mas_exp: (list_exp exp)?;
list_exp: '>' |'<' | '!=';

exp: (termino ('+' | '-'?))+;

termino: (factor ('*' | '/')?)+;

factor: '(' expression ')' | (factor_op value);
factor_op: ('+' | '-')?;
value: ID | cte;

print: 'print(' list_prints ')' ';';
list_prints: (expression print_more_expressions) | CTE_STRING print_more_expressions;
print_more_expressions: (',' list_prints)?;

cycle: 'do' body 'while' '(' expression ')' ';';

condition: 'if' '(' expression ')' body end_condition ';';
end_condition: ('else' body)?;

f_call: ID '(' has_exp ')' ';';
has_exp: (list_call_exp)?;
list_call_exp: expression more_call_expressions;
more_call_expressions: (',' list_call_exp)?;

funcs: ('void' ID '(' has_params ')' '[' add_vars body ']' ';');
has_params: (list_params)?;
list_params: ID ':' type more_params;
more_params: (',' list_params)?;
add_vars: vars;

start_ : programa EOF;

CTE_INT: [0-9]+;
CTE_FLOAT: [+-]? [0-9]* '.' [0-9]+;
ID: [a-zA-Z][a-zA-Z0-9_]*;
CTE_STRING: '"' (ESC | ~["\\])* '"';
fragment ESC : '\\' . ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines