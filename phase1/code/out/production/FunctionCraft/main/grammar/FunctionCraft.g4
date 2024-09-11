grammar FunctionCraft;


program:
    (function
    | COMMENT
    | pattern)*
    main
    COMMENT*;

main:
    DEF
    MAIN { System.out.println("MAIN"); }
    LPAR
    RPAR
    body_function
    END;

puts:
    PUTS { System.out.println("Built-In: PUTS"); }
    LPAR
    builtin_statement
    RPAR;

push:
    PUSH { System.out.println("Built-In: PUSH"); }
    LBRAC
    builtin_statement
    COMMA
    builtin_statement
    RBRAC;

len:
    LEN { System.out.println("Built-In: LEN"); }
    LPAR
    builtin_statement
    RPAR;

chop:
    CHOP { System.out.println("Built-In: CHOP"); }
    LPAR
    builtin_statement
    RPAR;

chomp:
    CHOMP { System.out.println("Built-In: CHOMP"); }
    LPAR
    builtin_statement
    RPAR;

match:
    IDENTIFIER { System.out.println("Built-In: MATCH"); }
    DOT
    MATCH
    LPAR
    (expr
    (COMMA
    expr)*)?
    RPAR;

loop:
    LOOP
    DO { System.out.println("Loop: DO"); }
    loop_body_function
    END;

for:
    FOR { System.out.println("Loop: FOR"); }
    IDENTIFIER
    IN
    (IDENTIFIER
    | (LPAR
    (expr
    (TWODOT expr)?)
    RPAR))
    loop_body_function
    END;

if:
    IF { System.out.println("Decision: IF");}
    expr
    body_function
    elseif*
    else*
    END;

else:
    ELSE { System.out.println("Decision: ELSE");}
    body_function;

elseif:
    ELSEIF { System.out.println("Decision: ELSEIF"); }
    expr
    body_function;

next:
    NEXT { System.out.println("Control: NEXT"); };

break:
    BREAK { System.out.println("Control: BREAK"); };

next_if:
    NEXT { System.out.println("Control: NEXT"); }
    IF
    LPAR
    expr
    RPAR
    SEMICOLON;

break_if:
    BREAK { System.out.println("Control: BREAK"); }
    IF
    LPAR
    expr
    RPAR
    SEMICOLON;

pattern:
    PATTERN
    pattern_name = IDENTIFIER { System.out.println("PatternDec: " + $pattern_name.text); }
    LPAR
    (IDENTIFIER
    (COMMA
    IDENTIFIER)*
    (LBRAC
    IDENTIFIER
    ASSIGN
    primitive_val
    (COMMA
    IDENTIFIER
    ASSIGN
    primitive_val)*
    LBRAC)?)?
    RPAR
    '    |' expr ASSIGN expr
    ('    |' expr ASSIGN expr)*
    SEMICOLON;

return:
    RETURN { System.out.println("RETURN"); }
    expr;

expr:
    expr_and
    expr_or
    (JOIN
    expr_and
    expr_or { System.out.println("Operator: <<"); })*;

expr_or:
    OR
    expr_and
    expr_or { System.out.println("Operator: ||"); }
    | ;

expr_and:
    expr_eq
    expr_and_op;

expr_and_op:
    AND
    expr_eq
    expr_and_op { System.out.println("Operator: &&"); }
    | ;

expr_eq:
    expr_compare
    expr_eq_op;

expr_eq_op:
    EQL
    expr_compare
    expr_eq_op { System.out.println("Operator: =="); }
    | NEQ
    expr_compare
    expr_eq_op { System.out.println("Operator: !="); }
    | ;

expr_compare:
    expr_plus
    expr_compare_op;

expr_compare_op:
    GREATER
    expr_plus
    expr_compare_op { System.out.println("Operator: >"); }
    | GEQ
    expr_plus
    expr_compare_op { System.out.println("Operator: >="); }
    | LESS
    expr_plus
    expr_compare_op { System.out.println("Operator: <"); }
    | LEQ
    expr_plus
    expr_compare_op { System.out.println("Operator: <="); }
    | ;

expr_plus:
    expr_multi
    expr_plus_op;

expr_plus_op:
    PLUS
    expr_multi  { System.out.println("Operator: +"); }
    expr_plus_op
    | MINUS
    expr_multi  { System.out.println("Operator: -"); }
    expr_plus_op
    | ;

expr_multi:
    expr_unary
    expr_multi_op;

expr_multi_op:
    MULTIPLY
    expr_unary { System.out.println("Operator: *"); }
    expr_multi_op
    | DIVIDE
    expr_unary  { System.out.println("Operator: /"); }
    expr_multi_op
    | ;

expr_unary:
    PLUS { System.out.println("Operator: +"); }
    expr_other
    | MINUS { System.out.println("Operator: -"); }
    expr_other
    | NOT { System.out.println("Operator: !"); }
    expr_other
    | expr_other;

expr_other:
    LPAR
    expr
    RPAR
    | list
    | list_identifier
    | IDENTIFIER
    | primitive_val
    | function_call
    | (IDENTIFIER TWOPLUS)
    | (IDENTIFIER TWOMINUS)
    | lambda;

assignment:
    (PLUS | MINUS | )
    assignment_name = IDENTIFIER
    (LBRAC
    (INT_VAL
    | IDENTIFIER)
    RBRAC)*
    ((((ASSIGN
    | PLUSASSIGN
    | MINUSASSIGN
    | MULTIPLYASSIGN
    | DIVIDEASSIGN
    | MODASSIGN)
    (match
    | expr))
    | ASSIGN
    function_ptr)
    | TWOPLUS
    | TWOMINUS) { System.out.println("Assignment: " + $assignment_name.text); };

list_one_dim:
    (primitive_val COMMA)*
    primitive_val;

list:
    LBRAC
    (((list
    | list_one_dim)
    (COMMA
    (list
    | list_one_dim))*)
    | )
    RBRAC;

primitive_val:
    INT_VAL
    | FLOAT_VAL
    | STRING_VAL
    | BOOLEAN_VAL;

function:
    DEF
    function_name = IDENTIFIER { System.out.println("FuncDec: " + $function_name.text); }
    LPAR
    (IDENTIFIER
    (COMMA
    IDENTIFIER)*
    COMMA?
    (LBRAC
    IDENTIFIER
    ASSIGN
    primitive_val
    (COMMA
    IDENTIFIER
    ASSIGN
    primitive_val)*
    RBRAC)?)?
    RPAR
    body_function
    END;

function_ptr:
    METHOD
    LPAR
    COLON
    IDENTIFIER
    RPAR;

function_call:
    IDENTIFIER { System.out.println("FunctionCall"); }
    LPAR
    (expr
    (COMMA
    expr)*)?
    RPAR;

lambda:
    RARROW { System.out.println("Structure: LAMBDA"); }
    LPAR
    (IDENTIFIER
    (COMMA
    IDENTIFIER)*
    (LBRAC
    IDENTIFIER
    ASSIGN
    primitive_val
    (COMMA
    IDENTIFIER
    ASSIGN
    primitive_val)*
    LBRAC)?)?
    RPAR
    LCBRAC
    body_function
    RCBRAC
    (LPAR
    (IDENTIFIER | primitive_val)
    (COMMA
    (IDENTIFIER | primitive_val))*
    RPAR)?;

loop_body_function:
    (statement
    | break
    | next
    | break_if
    | next_if
    | COMMENT)*;

body_function:
    (statement
    | COMMENT)*;

list_identifier:
    IDENTIFIER
    LBRAC
    (INT_VAL
    | IDENTIFIER)
    RBRAC
    (LBRAC
    (INT_VAL
    | IDENTIFIER)
    RBRAC)*;

statement:
    (puts
    | push
    | len
    | chop
    | chomp
    | assignment
    | return
    | lambda
    | expr)
    SEMICOLON
    | if
    | for
    | loop;

builtin_statement:
    (puts
    | push
    | len
    | chop
    | chomp
    | list
    | list_identifier
    | function_call
    | primitive_val
    | expr);

// lexer

DEF: 'def';
END: 'end';
MAIN: 'main';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';
CHOP: 'chop';
CHOMP: 'chomp';
PUSH: 'push';
PUTS: 'puts';
METHOD: 'method';
LEN: 'len';
PATTERN: 'pattern';
MATCH: 'match';
NEXT: 'next';
BREAK: 'break';
LOOP: 'loop';
DO: 'do';
FOR: 'for';
IN: 'in';

ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
TWOPLUS: '++';
TWOMINUS: '--';
EQL: '==';
NEQ: '!=';
GREATER: '>';
LESS: '<';
GEQ: '>=';
LEQ: '<=';
AND: '&&';
OR: '||';
NOT: '!';
PLUSASSIGN: '+=';
MINUSASSIGN: '-=';
MULTIPLYASSIGN: '*=';
DIVIDEASSIGN: '/=';
MODASSIGN: '%=';
RPAR: ')';
LPAR: '(';
RBRAC: ']';
LBRAC: '[';
RCBRAC: '}';
LCBRAC: '{';
TWODOT: '..';

JOIN: '<<';
DOT: '.';
DQUT: '"';
SEMICOLON: ';';
COLON: ':';
COMMA: ',';
RARROW: '->';

INT_VAL: '0' | [1-9][0-9]*;
FLOAT_VAL: INT_VAL '.' [0-9]+ | '0.' [0-9]*;
STRING_VAL: '"' ~["]* '"';
BOOLEAN_VAL: 'true' | 'false';

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
COMMENT: (('#' ~[\r\n]*) | ('-begin' .*? '-end')) -> skip;
WS: ([ \t\r\n]) -> skip;
