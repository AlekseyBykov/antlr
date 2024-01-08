parser grammar JavaParser;

options {
    tokenVocab = JavaLexer;
    backtrack = true;
    memoize = true;
}

@header {
    package alekseybykov.pets.parsers.antlr3;

    import alekseybykov.pets.parsers.model.JavaClass;
}

@members {
    private JavaClass javaClass = new JavaClass();

    public JavaClass getJavaClass() {
        return javaClass;
    }
}

compilationUnit
    :   (packageDeclaration)?
        (importDeclaration)*
        (annotations)*
        (typeDeclaration)*
        ANY*
    ;

packageDeclaration
    :   packageKeyword fullyQualifiedPackageName
        SEMICOLON
    ;

importDeclaration
    :   importKeyword fullyQualifiedImportName
        SEMICOLON
    ;

annotations
    :   (ANNOTATION)+
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
            javaClass.setClassSimpleName(classNameToken.getText());
        }
    ;

superClassName
    :   superclassNameToken = IDENTIFIER
        {
            javaClass.setSuperclassSimpleName(superclassNameToken.getText());
        }
    ;

interfaceName
    :   interfaceNameToken = IDENTIFIER
        {
            javaClass.getInterfaces().add(interfaceNameToken.getText());
        }
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

fullyQualifiedPackageName returns [StringBuilder packageName]
    : packageStartPart = IDENTIFIER
        { packageName = new StringBuilder(packageStartPart.getText()); }
            (
            dotToken = DOT
            { packageName.append(dotToken.getText()); }
            packagePart = IDENTIFIER
            { packageName.append(packagePart.getText()); }
            )* // loop
        {
            javaClass.setPackageName(packageName.toString());
        }
    ;

fullyQualifiedImportName returns [StringBuilder importName]
	: importStartPart = IDENTIFIER
        { importName = new StringBuilder(importStartPart.getText()); }
            (
            dotToken = DOT
            { importName.append(dotToken.getText()); }
            importPart = IDENTIFIER
            { importName.append(importPart.getText()); }
            )* //loop
            (
            dotToken = DOT
            { importName.append(dotToken.getText()); }
            asteriskToken = ASTERISK
            { importName.append(asteriskToken.getText()); }
            )? // 0..1
        {
            javaClass.getImports().add(importName.toString());
        }
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
