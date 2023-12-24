/**
 * A simple grammar of the Java source text for the ANTLR 4 lexer and parser.
 */
grammar Java;

compilationUnit
    :   (packageDeclaration)?
        (importDeclaration)*
        (typeDeclaration)*
        ANY*
    ;

packageDeclaration
    :   packageKeyword qualifiedName
        SEMICOLON
    ;

importDeclaration
    :   importKeyword (staticKeyword)? IDENTIFIER DOT ASTERISK SEMICOLON
    |   importKeyword (staticKeyword)? IDENTIFIER (DOT IDENTIFIER)+ (DOT ASTERISK)? SEMICOLON
    ;

typeDeclaration
    :   classOrInterfaceDeclaration
    |   SEMICOLON
    ;

classOrInterfaceDeclaration
    :    classDeclaration
    |   interfaceDeclaration
    ;

classDeclaration
    :   accessModifier classKeyword className
        (extendsKeyword superClassName)?
        (implementsKeyword interfaceNameList)?
    ;

accessModifier
    :
    (   'public '
    |   'protected '
    |   'private '
    |   'static '
    |   'abstract '
    |   'final '
    |   'native '
    |   'synchronized '
    |   'transient '
    |   'volatile '
    |   'strictfp '
    )*
    ;

className
    :   IDENTIFIER
    ;

superClassName
    :   IDENTIFIER
    ;

interfaceName
    :   IDENTIFIER
    ;

interfaceNameList
    :   interfaceName (COMMA interfaceName)*
    ;

interfaceDeclaration
    :   normalInterfaceDeclaration
    ;

normalInterfaceDeclaration
    :   accessModifier interfaceKeyword IDENTIFIER
    ;

qualifiedName
    :   IDENTIFIER (DOT IDENTIFIER)*
    ;

/**
 * Lexer rules section.
 * The order of the lexer rules is important.
 */
packageKeyword
	: 'package '
	;

importKeyword
	: 'import '
	;

staticKeyword
	: 'static '
	;

interfaceKeyword
	: 'interface '
	;

classKeyword
	: 'class '
	;

implementsKeyword
	: ' implements '
	;

extendsKeyword
	: ' extends '
	;

ASTERISK
	: '*'
	;

DOT
	: '.'
	;

COMMA
	: ','
	;

SEMICOLON
    : ';'
    ;

IDENTIFIER
	: [a-zA-Z] [a-zA-Z_0-9]*
	;

SPACE
	: [\t\r\n]+ -> channel(HIDDEN)
	;

COMMENT
	:  '/*' .*? '*/'
		{
			skip();
		}
	| '//' ~('\n'|'\r')*  ('\r\n' | '\r' | '\n')
		{
			skip();
		}
	| '//' ~('\n'|'\r')*
		{
			skip();
		}
	;

ANY
    : .
    ;
