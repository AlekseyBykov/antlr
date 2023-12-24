/**
 * A simple grammar of the Java source text for the ANTLR 3 parser.
 */
parser grammar JavaParser;

options {
	tokenVocab=JavaLexer;
	backtrack=true;
    memoize=true;
}

@header {
	package alekseybykov.portfolio.parsers.antlr3;

	import alekseybykov.portfolio.parsers.models.JavaSource;
}

@members {
	private JavaSource javaSource = new JavaSource();

	public JavaSource getJavaSource() {
		return javaSource;
	}
}

compilationUnit
    :   (packageDeclaration)?
        (importDeclaration)*
        (typeDeclaration)*
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
    (   publicKeyword
    |   protectedKeyword
    |   privateKeyword
    |   staticKeyword
    |   abstractKeyword
    |   finalKeyword
    |   nativeKeyword
    |   synchronizedKeyword
    |   transientKeyword
    |   volatileKeyword
    |   strictfpKeyword
    )*
    ;

className
    :   classNameToken = IDENTIFIER
        {
            javaSource.setClassName(classNameToken.getText());
        }
    ;

superClassName
    :   parentClassNameToken = IDENTIFIER
        {
            javaSource.setParentClassName(parentClassNameToken.getText());
        }
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

packageKeyword
	: PACKAGE
	;

importKeyword
	: IMPORT
	;

staticKeyword
	: STATIC
	;

classKeyword
	: CLASS
	;

extendsKeyword
	: EXTENDS
	;

implementsKeyword
	: IMPLEMENTS
	;

interfaceKeyword
	: INTERFACE
	;

publicKeyword
	: PUBLIC
	;

protectedKeyword
	: PROTECTED
	;

privateKeyword
	: PRIVATE
	;

abstractKeyword
	: ABSTRACT
	;

finalKeyword
	: FINAL
	;

nativeKeyword
	: NATIVE
	;

synchronizedKeyword
	: SYNCHRONIZED
	;

transientKeyword
	: TRANSIENT
	;

volatileKeyword
	: VOLATILE
	;

strictfpKeyword
	: STRICTFP
	;
