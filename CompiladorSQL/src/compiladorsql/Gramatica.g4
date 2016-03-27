/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
grammar Gramatica;

//Keywords
CREATE:	('C'|'c')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e');
DATABASE: ('D'|'d')('A'|'a')('T'|'t')('A'|'a')('B'|'b')('A'|'a')('S'|'s')('E'|'e');
DATABASES: ('D'|'d')('A'|'a')('T'|'t')('A'|'a')('B'|'b')('A'|'a')('S'|'s')('E'|'e')('S'|'s') ;
DROP: ('D'|'d')('R'|'r')('O'|'o')('P'|'p');
USE: ('U'|'u')('S'|'s')('E'|'e');
SHOW: ('S'|'s')('H'|'h')('O'|'o')('W'|'w');
ALTER: ('A'|'a')('L'|'l')('T'|'t')('E'|'e')('R'|'r');
RENAME: ('R'|'r')('E'|'e')('N'|'n')('A'|'a')('M'|'m')('E'|'e');
TO: ('T'|'t')('O'|'o');
TABLE: ('T'|'t')('A'|'a')('B'|'b')('L'|'l')('E'|'e');
TABLES: ('T'|'t')('A'|'a')('B'|'b')('L'|'l')('E'|'e')('S'|'s');
CONSTRAINT: ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('R'|'r')('A'|'a')('I'|'i')('N'|'n')('T'|'t');
COLUMN: ('C'|'c')('O'|'o')('L'|'l')('U'|'u')('M'|'m')('N'|'n');
COLUMNS: ('C'|'c')('O'|'o')('L'|'l')('U'|'u')('M'|'m')('N'|'n')('S'|'s');
FROM: ('F'|'f')('R'|'r')('O'|'o')('M'|'m');
ADD: ('A'|'a')('D'|'d')('D'|'d');
SELECT: ('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t');
WHERE: ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');
INT: ('I'|'i')('N'|'n')('T'|'t');
DATE: ('D'|'d')('A'|'a')('T'|'t')('E'|'e');
CHAR: ('C'|'c')('H'|'h')('A'|'a')('R'|'r');
FLOAT: ('F'|'f')('L'|'l')('O'|'o')('A'|'a')('T'|'t');
PRIMARY: ('P'|'p')('R'|'r')('I'|'i')('M'|'m')('A'|'a')('R'|'r')('Y'|'y');
CHECK: ('C'|'c')('H'|'h')('E'|'e')('C'|'c')('K'|'k');
REFERENCES: ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e')('S'|'s');
FOREIGN: ('F'|'f')('O'|'o')('R'|'r')('E'|'e')('I'|'i')('G'|'g')('N'|'n');
KEY: ('K'|'k')('E'|'e')('Y'|'y');
INSERT: ('I'|'i')('N'|'n')('S'|'s')('E'|'e')('R'|'r')('T'|'t');
INTO: ('I'|'i')('N'|'n')('T'|'t')('O'|'o');
VALUES: ('V'|'v')('A'|'a')('L'|'l')('U'|'u')('E'|'e')('S'|'s');
ORDER: ('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r');
SET: ('S'|'s')('E'|'e')('T'|'t');
UPDATE: ('U'|'u')('P'|'p')('D'|'d')('A'|'a')('T'|'t')('E'|'e');
BY: ('B'|'b')('Y'|'y');
ASC: ('A'|'a')('S'|'s')('C'|'c');
DESC: ('D'|'d')('E'|'e')('S'|'s')('C'|'c');
AND: ('A'|'a')('N'|'n')('D'|'d');
OR: ('O'|'o')('R'|'r');
NOT: ('N'|'n')('O'|'o')('T'|'t');
NULL: ('N'|'n')('U'|'u')('L'|'l') ('L'|'l');
DELETE: ('D'|'d')('E'|'e')('L'|'l')('E'|'e')('T'|'t')('E'|'e');

//Characters

WH: [ \t\r\n\f]+ -> channel(HIDDEN);
SINGLE_LINE_COMMENT: '//' ~('\r' | '\n' )*  -> channel(HIDDEN);
//dont know if its neccesary
MULTILINE_COMMENT: '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN);
ID : LETTER (LETTER | DIGIT)* ;
NUM: DIGIT(DIGIT)* ;
fragment LETTER: ( 'a'..'z' | 'A'..'Z') ;
fragment DIGIT: '0'..'9' ;
NUM_DATE:  '\'' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '\'';
CHARACTER: '\''~('\r'|'\n'|'\'')* '\'';
DOTCOMMA: ';';
LPARENT: '(';
RPARENT: '(';
COMMA: ',';
DOT: '.';
EQ: '=';
NOTEQ: '<>';
LTHAN: '<';
EQLTHAN: '<=';
GTHAN: '>';
EQGTHAN: '>=';
MINUS: '-';
ASTERISK: '*';
//prods
sqlProgram : statement (DOTCOMMA statement)* (DOTCOMMA)?;

statement: dbOperation | tOperation | dOperation;

dbOperation: CREATE DATABASE ID 
| DROP DATABASE ID 
| USE DATABASE ID 
| SHOW DATABASES 
| ALTER DATABASE ID RENAME TO ID;

dOperation: insert 
| update 
| delete 
| query;

tOperation: CREATE TABLE ID LPARENT (ID type (COMMA ID type)*)+ (constraints) RPARENT
| ALTER TABLE ID (tableAction (COMMA tableAction)*)+
| DROP TABLE ID
| SHOW TABLES
| SHOW COLUMNS FROM ID;

constraints: (CONSTRAINT constraint (COMMA CONSTRAINT constraint)*)*;

tableAction: ADD COLUMN ID type (constraints)
| ADD CONSTRAINT constraint
| DROP COLUMN ID
| DROP CONSTRAINT ID;

type: INT | FLOAT | DATE | CHAR LPARENT NUM RPARENT;

constraint: ID PRIMARY KEY LPARENT (ID(COMMA ID)*)* RPARENT
| ID FOREIGN KEY LPARENT (ID(COMMA ID)*)*RPARENT
| ID CHECK (exp1);

references: REFERENCES ID LPARENT (ID(COMMA ID)*)*RPARENT;

exp1: exp2;

exp2: exp2 andExp exp3 | exp3;

exp3: exp3 orExp exp4 | exp4;

exp4: exp4 eqExp exp5 | exp5;

exp5: exp5 glExp unarianFactorExp | unarianFactorExp;

unarianFactorExp: NOT factor | factor;

factor: literal
| LPARENT exp1 RPARENT
| ID(DOT ID)?;

literal: value;

exp: andExp | orExp | notExp;

notExp: NOT;
orExp: OR;
andExp: AND;
eqExp: EQ | NOTEQ;
glExp: LTHAN | EQLTHAN | GTHAN | EQGTHAN;

relExp: eqExp | glExp;

insert: INSERT INTO ID (LPARENT(ID(COMMA ID)*)*RPARENT)? VALUES LPARENT (value (COMMA value)*)* RPARENT;

value: entero | decimal | fecha | character | null;
null: NULL;
entero:(MINUS)? NUM;
decimal: entero DOT NUM;
fecha: DATE;
character: CHAR;

update: UPDATE ID SET asignacion (COMMA asignacion)* (WHERE exp1)?;

asignacion: ID EQ literal;
cond: (expression relExp ( value | expression)) (exp cond)?;

delete: DELETE FROM ID (WHERE exp)?;

query: SELECT (ASTERISK | column (COMMA column ) * ) FROM ID (COMMA ID)* (WHERE exp1)? (ORDER BY orderBy (COMMA orderBy)*)?;

column: ID(DOT ID)?;

orderBy: expression (ASC | DESC)?;

expression: ID(DOT ID)?;

