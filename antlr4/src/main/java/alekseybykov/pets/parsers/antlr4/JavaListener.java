// Generated from alekseybykov\pets\parsers\antlr4\Java.g4 by ANTLR 4.7.1
package alekseybykov.pets.parsers.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceDeclaration(JavaParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceDeclaration(JavaParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(JavaParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(JavaParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(JavaParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(JavaParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#superClassName}.
	 * @param ctx the parse tree
	 */
	void enterSuperClassName(JavaParser.SuperClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#superClassName}.
	 * @param ctx the parse tree
	 */
	void exitSuperClassName(JavaParser.SuperClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(JavaParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(JavaParser.InterfaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceNameList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceNameList(JavaParser.InterfaceNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceNameList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceNameList(JavaParser.InterfaceNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JavaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JavaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageKeyword}.
	 * @param ctx the parse tree
	 */
	void enterPackageKeyword(JavaParser.PackageKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageKeyword}.
	 * @param ctx the parse tree
	 */
	void exitPackageKeyword(JavaParser.PackageKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importKeyword}.
	 * @param ctx the parse tree
	 */
	void enterImportKeyword(JavaParser.ImportKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importKeyword}.
	 * @param ctx the parse tree
	 */
	void exitImportKeyword(JavaParser.ImportKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#staticKeyword}.
	 * @param ctx the parse tree
	 */
	void enterStaticKeyword(JavaParser.StaticKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#staticKeyword}.
	 * @param ctx the parse tree
	 */
	void exitStaticKeyword(JavaParser.StaticKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceKeyword}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceKeyword(JavaParser.InterfaceKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceKeyword}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceKeyword(JavaParser.InterfaceKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classKeyword}.
	 * @param ctx the parse tree
	 */
	void enterClassKeyword(JavaParser.ClassKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classKeyword}.
	 * @param ctx the parse tree
	 */
	void exitClassKeyword(JavaParser.ClassKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#implementsKeyword}.
	 * @param ctx the parse tree
	 */
	void enterImplementsKeyword(JavaParser.ImplementsKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#implementsKeyword}.
	 * @param ctx the parse tree
	 */
	void exitImplementsKeyword(JavaParser.ImplementsKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#extendsKeyword}.
	 * @param ctx the parse tree
	 */
	void enterExtendsKeyword(JavaParser.ExtendsKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#extendsKeyword}.
	 * @param ctx the parse tree
	 */
	void exitExtendsKeyword(JavaParser.ExtendsKeywordContext ctx);
}