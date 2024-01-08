// $ANTLR 3.5.2 alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g 2024-01-08 13:18:29

    package alekseybykov.pets.parsers.antlr3;

    import alekseybykov.pets.parsers.model.JavaClass;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class JavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ALPHA", "ANNOTATION", 
		"ANY", "ASTERISK", "CLASS", "COMMA", "COMMENT", "DOT", "EXTENDS", "FINAL", 
		"IDENTIFIER", "IMPLEMENTS", "IMPORT", "INTERFACE", "IdentifierPart", "IdentifierStart", 
		"LINE_COMMENT", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
		"SEMICOLON", "STATIC", "STRICTFP", "SYNCHRONIZED", "TRANSIENT", "VOLATILE", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ALPHA=5;
	public static final int ANNOTATION=6;
	public static final int ANY=7;
	public static final int ASTERISK=8;
	public static final int CLASS=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int DOT=12;
	public static final int EXTENDS=13;
	public static final int FINAL=14;
	public static final int IDENTIFIER=15;
	public static final int IMPLEMENTS=16;
	public static final int IMPORT=17;
	public static final int INTERFACE=18;
	public static final int IdentifierPart=19;
	public static final int IdentifierStart=20;
	public static final int LINE_COMMENT=21;
	public static final int NATIVE=22;
	public static final int PACKAGE=23;
	public static final int PRIVATE=24;
	public static final int PROTECTED=25;
	public static final int PUBLIC=26;
	public static final int SEMICOLON=27;
	public static final int STATIC=28;
	public static final int STRICTFP=29;
	public static final int SYNCHRONIZED=30;
	public static final int TRANSIENT=31;
	public static final int VOLATILE=32;
	public static final int WS=33;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JavaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[58+1];


	}

	@Override public String[] getTokenNames() { return JavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g"; }


	    private JavaClass javaClass = new JavaClass();

	    public JavaClass getJavaClass() {
	        return javaClass;
	    }



	// $ANTLR start "compilationUnit"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:23:1: compilationUnit : ( packageDeclaration )? ( importDeclaration )* ( annotations )* ( typeDeclaration )* ( ANY )* ;
	public final void compilationUnit() throws RecognitionException {
		int compilationUnit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:24:5: ( ( packageDeclaration )? ( importDeclaration )* ( annotations )* ( typeDeclaration )* ( ANY )* )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:24:9: ( packageDeclaration )? ( importDeclaration )* ( annotations )* ( typeDeclaration )* ( ANY )*
			{
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:24:9: ( packageDeclaration )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==PACKAGE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:24:10: packageDeclaration
					{
					pushFollow(FOLLOW_packageDeclaration_in_compilationUnit69);
					packageDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:25:9: ( importDeclaration )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IMPORT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:25:10: importDeclaration
					{
					pushFollow(FOLLOW_importDeclaration_in_compilationUnit82);
					importDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:26:9: ( annotations )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ANNOTATION) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:26:10: annotations
					{
					pushFollow(FOLLOW_annotations_in_compilationUnit95);
					annotations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:27:9: ( typeDeclaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ABSTRACT||LA4_0==CLASS||LA4_0==FINAL||LA4_0==INTERFACE||LA4_0==NATIVE||(LA4_0 >= PRIVATE && LA4_0 <= VOLATILE)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:27:10: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_compilationUnit108);
					typeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:28:9: ( ANY )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ANY) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:28:9: ANY
					{
					match(input,ANY,FOLLOW_ANY_in_compilationUnit120); if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

		}
	}
	// $ANTLR end "compilationUnit"



	// $ANTLR start "packageDeclaration"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:31:1: packageDeclaration : packageKeyword fullyQualifiedPackageName SEMICOLON ;
	public final void packageDeclaration() throws RecognitionException {
		int packageDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:32:5: ( packageKeyword fullyQualifiedPackageName SEMICOLON )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:32:9: packageKeyword fullyQualifiedPackageName SEMICOLON
			{
			pushFollow(FOLLOW_packageKeyword_in_packageDeclaration140);
			packageKeyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_fullyQualifiedPackageName_in_packageDeclaration142);
			fullyQualifiedPackageName();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_packageDeclaration152); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "packageDeclaration"



	// $ANTLR start "importDeclaration"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:36:1: importDeclaration : importKeyword fullyQualifiedImportName SEMICOLON ;
	public final void importDeclaration() throws RecognitionException {
		int importDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:37:5: ( importKeyword fullyQualifiedImportName SEMICOLON )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:37:9: importKeyword fullyQualifiedImportName SEMICOLON
			{
			pushFollow(FOLLOW_importKeyword_in_importDeclaration171);
			importKeyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_fullyQualifiedImportName_in_importDeclaration173);
			fullyQualifiedImportName();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_importDeclaration183); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "importDeclaration"



	// $ANTLR start "annotations"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:41:1: annotations : ( ANNOTATION )+ ;
	public final void annotations() throws RecognitionException {
		int annotations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:42:5: ( ( ANNOTATION )+ )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:42:9: ( ANNOTATION )+
			{
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:42:9: ( ANNOTATION )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ANNOTATION) ) {
					int LA6_2 = input.LA(2);
					if ( (synpred6_JavaParser()) ) {
						alt6=1;
					}

				}

				switch (alt6) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:42:10: ANNOTATION
					{
					match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotations203); if (state.failed) return;
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, annotations_StartIndex); }

		}
	}
	// $ANTLR end "annotations"



	// $ANTLR start "typeDeclaration"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:45:1: typeDeclaration : ( classOrInterfaceDeclaration | SEMICOLON );
	public final void typeDeclaration() throws RecognitionException {
		int typeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:46:5: ( classOrInterfaceDeclaration | SEMICOLON )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ABSTRACT||LA7_0==CLASS||LA7_0==FINAL||LA7_0==INTERFACE||LA7_0==NATIVE||(LA7_0 >= PRIVATE && LA7_0 <= PUBLIC)||(LA7_0 >= STATIC && LA7_0 <= VOLATILE)) ) {
				alt7=1;
			}
			else if ( (LA7_0==SEMICOLON) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:46:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration224);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:47:9: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_typeDeclaration234); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, typeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "typeDeclaration"



	// $ANTLR start "classOrInterfaceDeclaration"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:50:1: classOrInterfaceDeclaration : ( classDeclaration | interfaceDeclaration );
	public final void classOrInterfaceDeclaration() throws RecognitionException {
		int classOrInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:51:5: ( classDeclaration | interfaceDeclaration )
			int alt8=2;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:51:10: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration254);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:52:9: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration264);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, classOrInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceDeclaration"



	// $ANTLR start "classDeclaration"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:55:1: classDeclaration : accessModifier classKeyword className ( extendsKeyword superClassName )? ( implementsKeyword interfaceNameList )? ;
	public final void classDeclaration() throws RecognitionException {
		int classDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:56:5: ( accessModifier classKeyword className ( extendsKeyword superClassName )? ( implementsKeyword interfaceNameList )? )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:56:9: accessModifier classKeyword className ( extendsKeyword superClassName )? ( implementsKeyword interfaceNameList )?
			{
			pushFollow(FOLLOW_accessModifier_in_classDeclaration283);
			accessModifier();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_classKeyword_in_classDeclaration285);
			classKeyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_className_in_classDeclaration287);
			className();
			state._fsp--;
			if (state.failed) return;
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:57:9: ( extendsKeyword superClassName )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==EXTENDS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:57:10: extendsKeyword superClassName
					{
					pushFollow(FOLLOW_extendsKeyword_in_classDeclaration298);
					extendsKeyword();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_superClassName_in_classDeclaration300);
					superClassName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:58:9: ( implementsKeyword interfaceNameList )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==IMPLEMENTS) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:58:10: implementsKeyword interfaceNameList
					{
					pushFollow(FOLLOW_implementsKeyword_in_classDeclaration313);
					implementsKeyword();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_interfaceNameList_in_classDeclaration315);
					interfaceNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, classDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classDeclaration"



	// $ANTLR start "accessModifier"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:61:1: accessModifier : ( publicKeyword | protectedKeyword | privateKeyword | staticKeyword | abstractKeyword | finalKeyword | nativeKeyword | synchronizedKeyword | transientKeyword | volatileKeyword | strictfpKeyword )* ;
	public final void accessModifier() throws RecognitionException {
		int accessModifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:62:5: ( ( publicKeyword | protectedKeyword | privateKeyword | staticKeyword | abstractKeyword | finalKeyword | nativeKeyword | synchronizedKeyword | transientKeyword | volatileKeyword | strictfpKeyword )* )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:63:5: ( publicKeyword | protectedKeyword | privateKeyword | staticKeyword | abstractKeyword | finalKeyword | nativeKeyword | synchronizedKeyword | transientKeyword | volatileKeyword | strictfpKeyword )*
			{
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:63:5: ( publicKeyword | protectedKeyword | privateKeyword | staticKeyword | abstractKeyword | finalKeyword | nativeKeyword | synchronizedKeyword | transientKeyword | volatileKeyword | strictfpKeyword )*
			loop11:
			while (true) {
				int alt11=12;
				switch ( input.LA(1) ) {
				case PUBLIC:
					{
					alt11=1;
					}
					break;
				case PROTECTED:
					{
					alt11=2;
					}
					break;
				case PRIVATE:
					{
					alt11=3;
					}
					break;
				case STATIC:
					{
					alt11=4;
					}
					break;
				case ABSTRACT:
					{
					alt11=5;
					}
					break;
				case FINAL:
					{
					alt11=6;
					}
					break;
				case NATIVE:
					{
					alt11=7;
					}
					break;
				case SYNCHRONIZED:
					{
					alt11=8;
					}
					break;
				case TRANSIENT:
					{
					alt11=9;
					}
					break;
				case VOLATILE:
					{
					alt11=10;
					}
					break;
				case STRICTFP:
					{
					alt11=11;
					}
					break;
				}
				switch (alt11) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:63:9: publicKeyword
					{
					pushFollow(FOLLOW_publicKeyword_in_accessModifier342);
					publicKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:64:9: protectedKeyword
					{
					pushFollow(FOLLOW_protectedKeyword_in_accessModifier352);
					protectedKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:65:9: privateKeyword
					{
					pushFollow(FOLLOW_privateKeyword_in_accessModifier362);
					privateKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:66:9: staticKeyword
					{
					pushFollow(FOLLOW_staticKeyword_in_accessModifier372);
					staticKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:67:9: abstractKeyword
					{
					pushFollow(FOLLOW_abstractKeyword_in_accessModifier382);
					abstractKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:68:9: finalKeyword
					{
					pushFollow(FOLLOW_finalKeyword_in_accessModifier392);
					finalKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:69:9: nativeKeyword
					{
					pushFollow(FOLLOW_nativeKeyword_in_accessModifier402);
					nativeKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:70:9: synchronizedKeyword
					{
					pushFollow(FOLLOW_synchronizedKeyword_in_accessModifier412);
					synchronizedKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:71:9: transientKeyword
					{
					pushFollow(FOLLOW_transientKeyword_in_accessModifier422);
					transientKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:72:9: volatileKeyword
					{
					pushFollow(FOLLOW_volatileKeyword_in_accessModifier432);
					volatileKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:73:9: strictfpKeyword
					{
					pushFollow(FOLLOW_strictfpKeyword_in_accessModifier442);
					strictfpKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, accessModifier_StartIndex); }

		}
	}
	// $ANTLR end "accessModifier"



	// $ANTLR start "className"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:77:1: className : classNameToken= IDENTIFIER ;
	public final void className() throws RecognitionException {
		int className_StartIndex = input.index();

		Token classNameToken=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:78:5: (classNameToken= IDENTIFIER )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:78:9: classNameToken= IDENTIFIER
			{
			classNameToken=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_className472); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            javaClass.setClassSimpleName(classNameToken.getText());
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, className_StartIndex); }

		}
	}
	// $ANTLR end "className"



	// $ANTLR start "superClassName"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:84:1: superClassName : superclassNameToken= IDENTIFIER ;
	public final void superClassName() throws RecognitionException {
		int superClassName_StartIndex = input.index();

		Token superclassNameToken=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:85:5: (superclassNameToken= IDENTIFIER )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:85:9: superclassNameToken= IDENTIFIER
			{
			superclassNameToken=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superClassName505); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            javaClass.setSuperclassSimpleName(superclassNameToken.getText());
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, superClassName_StartIndex); }

		}
	}
	// $ANTLR end "superClassName"



	// $ANTLR start "interfaceName"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:91:1: interfaceName : interfaceNameToken= IDENTIFIER ;
	public final void interfaceName() throws RecognitionException {
		int interfaceName_StartIndex = input.index();

		Token interfaceNameToken=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:92:5: (interfaceNameToken= IDENTIFIER )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:92:9: interfaceNameToken= IDENTIFIER
			{
			interfaceNameToken=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceName538); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            javaClass.getInterfaces().add(interfaceNameToken.getText());
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, interfaceName_StartIndex); }

		}
	}
	// $ANTLR end "interfaceName"



	// $ANTLR start "interfaceNameList"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:98:1: interfaceNameList : interfaceName ( COMMA interfaceName )* ;
	public final void interfaceNameList() throws RecognitionException {
		int interfaceNameList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:99:5: ( interfaceName ( COMMA interfaceName )* )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:99:9: interfaceName ( COMMA interfaceName )*
			{
			pushFollow(FOLLOW_interfaceName_in_interfaceNameList567);
			interfaceName();
			state._fsp--;
			if (state.failed) return;
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:99:23: ( COMMA interfaceName )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:99:24: COMMA interfaceName
					{
					match(input,COMMA,FOLLOW_COMMA_in_interfaceNameList570); if (state.failed) return;
					pushFollow(FOLLOW_interfaceName_in_interfaceNameList572);
					interfaceName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, interfaceNameList_StartIndex); }

		}
	}
	// $ANTLR end "interfaceNameList"



	// $ANTLR start "interfaceDeclaration"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:102:1: interfaceDeclaration : normalInterfaceDeclaration ;
	public final void interfaceDeclaration() throws RecognitionException {
		int interfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:103:5: ( normalInterfaceDeclaration )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:103:9: normalInterfaceDeclaration
			{
			pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration593);
			normalInterfaceDeclaration();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, interfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceDeclaration"



	// $ANTLR start "normalInterfaceDeclaration"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:106:1: normalInterfaceDeclaration : accessModifier interfaceKeyword IDENTIFIER ;
	public final void normalInterfaceDeclaration() throws RecognitionException {
		int normalInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:107:5: ( accessModifier interfaceKeyword IDENTIFIER )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:107:9: accessModifier interfaceKeyword IDENTIFIER
			{
			pushFollow(FOLLOW_accessModifier_in_normalInterfaceDeclaration612);
			accessModifier();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_interfaceKeyword_in_normalInterfaceDeclaration614);
			interfaceKeyword();
			state._fsp--;
			if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration616); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, normalInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "normalInterfaceDeclaration"



	// $ANTLR start "fullyQualifiedPackageName"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:110:1: fullyQualifiedPackageName returns [StringBuilder packageName] : packageStartPart= IDENTIFIER (dotToken= DOT packagePart= IDENTIFIER )* ;
	public final StringBuilder fullyQualifiedPackageName() throws RecognitionException {
		StringBuilder packageName = null;

		int fullyQualifiedPackageName_StartIndex = input.index();

		Token packageStartPart=null;
		Token dotToken=null;
		Token packagePart=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return packageName; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:111:5: (packageStartPart= IDENTIFIER (dotToken= DOT packagePart= IDENTIFIER )* )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:111:7: packageStartPart= IDENTIFIER (dotToken= DOT packagePart= IDENTIFIER )*
			{
			packageStartPart=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullyQualifiedPackageName641); if (state.failed) return packageName;
			if ( state.backtracking==0 ) { packageName = new StringBuilder(packageStartPart.getText()); }
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:113:13: (dotToken= DOT packagePart= IDENTIFIER )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DOT) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:114:13: dotToken= DOT packagePart= IDENTIFIER
					{
					dotToken=(Token)match(input,DOT,FOLLOW_DOT_in_fullyQualifiedPackageName683); if (state.failed) return packageName;
					if ( state.backtracking==0 ) { packageName.append(dotToken.getText()); }
					packagePart=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullyQualifiedPackageName715); if (state.failed) return packageName;
					if ( state.backtracking==0 ) { packageName.append(packagePart.getText()); }
					}
					break;

				default :
					break loop13;
				}
			}

			if ( state.backtracking==0 ) {
			            javaClass.setPackageName(packageName.toString());
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, fullyQualifiedPackageName_StartIndex); }

		}
		return packageName;
	}
	// $ANTLR end "fullyQualifiedPackageName"



	// $ANTLR start "fullyQualifiedImportName"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:124:1: fullyQualifiedImportName returns [StringBuilder importName] : importStartPart= IDENTIFIER (dotToken= DOT importPart= IDENTIFIER )* (dotToken= DOT asteriskToken= ASTERISK )? ;
	public final StringBuilder fullyQualifiedImportName() throws RecognitionException {
		StringBuilder importName = null;

		int fullyQualifiedImportName_StartIndex = input.index();

		Token importStartPart=null;
		Token dotToken=null;
		Token importPart=null;
		Token asteriskToken=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return importName; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:125:2: (importStartPart= IDENTIFIER (dotToken= DOT importPart= IDENTIFIER )* (dotToken= DOT asteriskToken= ASTERISK )? )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:125:4: importStartPart= IDENTIFIER (dotToken= DOT importPart= IDENTIFIER )* (dotToken= DOT asteriskToken= ASTERISK )?
			{
			importStartPart=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullyQualifiedImportName777); if (state.failed) return importName;
			if ( state.backtracking==0 ) { importName = new StringBuilder(importStartPart.getText()); }
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:127:13: (dotToken= DOT importPart= IDENTIFIER )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DOT) ) {
					int LA14_1 = input.LA(2);
					if ( (LA14_1==IDENTIFIER) ) {
						alt14=1;
					}

				}

				switch (alt14) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:128:13: dotToken= DOT importPart= IDENTIFIER
					{
					dotToken=(Token)match(input,DOT,FOLLOW_DOT_in_fullyQualifiedImportName819); if (state.failed) return importName;
					if ( state.backtracking==0 ) { importName.append(dotToken.getText()); }
					importPart=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullyQualifiedImportName851); if (state.failed) return importName;
					if ( state.backtracking==0 ) { importName.append(importPart.getText()); }
					}
					break;

				default :
					break loop14;
				}
			}

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:133:13: (dotToken= DOT asteriskToken= ASTERISK )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==DOT) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:134:13: dotToken= DOT asteriskToken= ASTERISK
					{
					dotToken=(Token)match(input,DOT,FOLLOW_DOT_in_fullyQualifiedImportName913); if (state.failed) return importName;
					if ( state.backtracking==0 ) { importName.append(dotToken.getText()); }
					asteriskToken=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_fullyQualifiedImportName945); if (state.failed) return importName;
					if ( state.backtracking==0 ) { importName.append(asteriskToken.getText()); }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			            javaClass.getImports().add(importName.toString());
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, fullyQualifiedImportName_StartIndex); }

		}
		return importName;
	}
	// $ANTLR end "fullyQualifiedImportName"



	// $ANTLR start "packageKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:144:1: packageKeyword : PACKAGE ;
	public final void packageKeyword() throws RecognitionException {
		int packageKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:145:2: ( PACKAGE )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:145:4: PACKAGE
			{
			match(input,PACKAGE,FOLLOW_PACKAGE_in_packageKeyword996); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, packageKeyword_StartIndex); }

		}
	}
	// $ANTLR end "packageKeyword"



	// $ANTLR start "importKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:148:1: importKeyword : IMPORT ;
	public final void importKeyword() throws RecognitionException {
		int importKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:149:2: ( IMPORT )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:149:4: IMPORT
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_importKeyword1007); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, importKeyword_StartIndex); }

		}
	}
	// $ANTLR end "importKeyword"



	// $ANTLR start "staticKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:152:1: staticKeyword : STATIC ;
	public final void staticKeyword() throws RecognitionException {
		int staticKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:153:2: ( STATIC )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:153:4: STATIC
			{
			match(input,STATIC,FOLLOW_STATIC_in_staticKeyword1018); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, staticKeyword_StartIndex); }

		}
	}
	// $ANTLR end "staticKeyword"



	// $ANTLR start "classKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:156:1: classKeyword : CLASS ;
	public final void classKeyword() throws RecognitionException {
		int classKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:157:2: ( CLASS )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:157:4: CLASS
			{
			match(input,CLASS,FOLLOW_CLASS_in_classKeyword1029); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, classKeyword_StartIndex); }

		}
	}
	// $ANTLR end "classKeyword"



	// $ANTLR start "extendsKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:160:1: extendsKeyword : EXTENDS ;
	public final void extendsKeyword() throws RecognitionException {
		int extendsKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:161:2: ( EXTENDS )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:161:4: EXTENDS
			{
			match(input,EXTENDS,FOLLOW_EXTENDS_in_extendsKeyword1040); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, extendsKeyword_StartIndex); }

		}
	}
	// $ANTLR end "extendsKeyword"



	// $ANTLR start "implementsKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:164:1: implementsKeyword : IMPLEMENTS ;
	public final void implementsKeyword() throws RecognitionException {
		int implementsKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:165:2: ( IMPLEMENTS )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:165:4: IMPLEMENTS
			{
			match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_implementsKeyword1051); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, implementsKeyword_StartIndex); }

		}
	}
	// $ANTLR end "implementsKeyword"



	// $ANTLR start "interfaceKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:168:1: interfaceKeyword : INTERFACE ;
	public final void interfaceKeyword() throws RecognitionException {
		int interfaceKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:169:2: ( INTERFACE )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:169:4: INTERFACE
			{
			match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceKeyword1062); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceKeyword_StartIndex); }

		}
	}
	// $ANTLR end "interfaceKeyword"



	// $ANTLR start "publicKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:172:1: publicKeyword : PUBLIC ;
	public final void publicKeyword() throws RecognitionException {
		int publicKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:173:2: ( PUBLIC )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:173:4: PUBLIC
			{
			match(input,PUBLIC,FOLLOW_PUBLIC_in_publicKeyword1073); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, publicKeyword_StartIndex); }

		}
	}
	// $ANTLR end "publicKeyword"



	// $ANTLR start "protectedKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:176:1: protectedKeyword : PROTECTED ;
	public final void protectedKeyword() throws RecognitionException {
		int protectedKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:177:2: ( PROTECTED )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:177:4: PROTECTED
			{
			match(input,PROTECTED,FOLLOW_PROTECTED_in_protectedKeyword1084); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, protectedKeyword_StartIndex); }

		}
	}
	// $ANTLR end "protectedKeyword"



	// $ANTLR start "privateKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:180:1: privateKeyword : PRIVATE ;
	public final void privateKeyword() throws RecognitionException {
		int privateKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:181:2: ( PRIVATE )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:181:4: PRIVATE
			{
			match(input,PRIVATE,FOLLOW_PRIVATE_in_privateKeyword1095); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, privateKeyword_StartIndex); }

		}
	}
	// $ANTLR end "privateKeyword"



	// $ANTLR start "abstractKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:184:1: abstractKeyword : ABSTRACT ;
	public final void abstractKeyword() throws RecognitionException {
		int abstractKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:185:2: ( ABSTRACT )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:185:4: ABSTRACT
			{
			match(input,ABSTRACT,FOLLOW_ABSTRACT_in_abstractKeyword1106); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, abstractKeyword_StartIndex); }

		}
	}
	// $ANTLR end "abstractKeyword"



	// $ANTLR start "finalKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:188:1: finalKeyword : FINAL ;
	public final void finalKeyword() throws RecognitionException {
		int finalKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:189:2: ( FINAL )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:189:4: FINAL
			{
			match(input,FINAL,FOLLOW_FINAL_in_finalKeyword1117); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, finalKeyword_StartIndex); }

		}
	}
	// $ANTLR end "finalKeyword"



	// $ANTLR start "nativeKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:192:1: nativeKeyword : NATIVE ;
	public final void nativeKeyword() throws RecognitionException {
		int nativeKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:193:2: ( NATIVE )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:193:4: NATIVE
			{
			match(input,NATIVE,FOLLOW_NATIVE_in_nativeKeyword1128); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, nativeKeyword_StartIndex); }

		}
	}
	// $ANTLR end "nativeKeyword"



	// $ANTLR start "synchronizedKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:196:1: synchronizedKeyword : SYNCHRONIZED ;
	public final void synchronizedKeyword() throws RecognitionException {
		int synchronizedKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:197:2: ( SYNCHRONIZED )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:197:4: SYNCHRONIZED
			{
			match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_synchronizedKeyword1139); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, synchronizedKeyword_StartIndex); }

		}
	}
	// $ANTLR end "synchronizedKeyword"



	// $ANTLR start "transientKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:200:1: transientKeyword : TRANSIENT ;
	public final void transientKeyword() throws RecognitionException {
		int transientKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:201:2: ( TRANSIENT )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:201:4: TRANSIENT
			{
			match(input,TRANSIENT,FOLLOW_TRANSIENT_in_transientKeyword1150); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, transientKeyword_StartIndex); }

		}
	}
	// $ANTLR end "transientKeyword"



	// $ANTLR start "volatileKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:204:1: volatileKeyword : VOLATILE ;
	public final void volatileKeyword() throws RecognitionException {
		int volatileKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:205:2: ( VOLATILE )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:205:4: VOLATILE
			{
			match(input,VOLATILE,FOLLOW_VOLATILE_in_volatileKeyword1161); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, volatileKeyword_StartIndex); }

		}
	}
	// $ANTLR end "volatileKeyword"



	// $ANTLR start "strictfpKeyword"
	// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:208:1: strictfpKeyword : STRICTFP ;
	public final void strictfpKeyword() throws RecognitionException {
		int strictfpKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return; }

			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:209:2: ( STRICTFP )
			// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:209:4: STRICTFP
			{
			match(input,STRICTFP,FOLLOW_STRICTFP_in_strictfpKeyword1172); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, strictfpKeyword_StartIndex); }

		}
	}
	// $ANTLR end "strictfpKeyword"

	// $ANTLR start synpred6_JavaParser
	public final void synpred6_JavaParser_fragment() throws RecognitionException {
		// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:42:10: ( ANNOTATION )
		// alekseybykov\\pets\\parsers\\antlr3\\JavaParser.g:42:10: ANNOTATION
		{
		match(input,ANNOTATION,FOLLOW_ANNOTATION_in_synpred6_JavaParser203); if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_JavaParser

	// Delegated rules

	public final boolean synpred6_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\16\uffff";
	static final String DFA8_eofS =
		"\16\uffff";
	static final String DFA8_minS =
		"\14\4\2\uffff";
	static final String DFA8_maxS =
		"\14\40\2\uffff";
	static final String DFA8_acceptS =
		"\14\uffff\1\1\1\2";
	static final String DFA8_specialS =
		"\16\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\4\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "50:1: classOrInterfaceDeclaration : ( classDeclaration | interfaceDeclaration );";
		}
	}

	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit69 = new BitSet(new long[]{0x00000001FF4642D2L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit82 = new BitSet(new long[]{0x00000001FF4642D2L});
	public static final BitSet FOLLOW_annotations_in_compilationUnit95 = new BitSet(new long[]{0x00000001FF4442D2L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit108 = new BitSet(new long[]{0x00000001FF444292L});
	public static final BitSet FOLLOW_ANY_in_compilationUnit120 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_packageKeyword_in_packageDeclaration140 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_fullyQualifiedPackageName_in_packageDeclaration142 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_packageDeclaration152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_importKeyword_in_importDeclaration171 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_fullyQualifiedImportName_in_importDeclaration173 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_importDeclaration183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_in_annotations203 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_typeDeclaration234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_classDeclaration283 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_classKeyword_in_classDeclaration285 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_className_in_classDeclaration287 = new BitSet(new long[]{0x0000000000012002L});
	public static final BitSet FOLLOW_extendsKeyword_in_classDeclaration298 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_superClassName_in_classDeclaration300 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_implementsKeyword_in_classDeclaration313 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_interfaceNameList_in_classDeclaration315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_publicKeyword_in_accessModifier342 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_protectedKeyword_in_accessModifier352 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_privateKeyword_in_accessModifier362 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_staticKeyword_in_accessModifier372 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_abstractKeyword_in_accessModifier382 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_finalKeyword_in_accessModifier392 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_nativeKeyword_in_accessModifier402 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_synchronizedKeyword_in_accessModifier412 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_transientKeyword_in_accessModifier422 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_volatileKeyword_in_accessModifier432 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_strictfpKeyword_in_accessModifier442 = new BitSet(new long[]{0x00000001F7404012L});
	public static final BitSet FOLLOW_IDENTIFIER_in_className472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_superClassName505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_interfaceName538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceName_in_interfaceNameList567 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_interfaceNameList570 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_interfaceName_in_interfaceNameList572 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_normalInterfaceDeclaration612 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_interfaceKeyword_in_normalInterfaceDeclaration614 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fullyQualifiedPackageName641 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOT_in_fullyQualifiedPackageName683 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fullyQualifiedPackageName715 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fullyQualifiedImportName777 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOT_in_fullyQualifiedImportName819 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fullyQualifiedImportName851 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOT_in_fullyQualifiedImportName913 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ASTERISK_in_fullyQualifiedImportName945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_packageKeyword996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importKeyword1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_staticKeyword1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classKeyword1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_extendsKeyword1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_implementsKeyword1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERFACE_in_interfaceKeyword1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_publicKeyword1073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_protectedKeyword1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_privateKeyword1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABSTRACT_in_abstractKeyword1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINAL_in_finalKeyword1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIVE_in_nativeKeyword1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_synchronizedKeyword1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSIENT_in_transientKeyword1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOLATILE_in_volatileKeyword1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRICTFP_in_strictfpKeyword1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_in_synpred6_JavaParser203 = new BitSet(new long[]{0x0000000000000002L});
}
