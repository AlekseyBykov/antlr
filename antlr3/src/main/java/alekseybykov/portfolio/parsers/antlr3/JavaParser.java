// $ANTLR 3.5.2 alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g 2023-12-24 20:54:01

	package alekseybykov.portfolio.parsers.antlr3;

	import alekseybykov.portfolio.parsers.models.JavaSource;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * A simple grammar of the Java source text for the ANTLR 3 parser.
 */
@SuppressWarnings("all")
public class JavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ASTERISK", "CLASS", 
		"COMMA", "COMMENT", "DOT", "EXTENDS", "FINAL", "IDENTIFIER", "IMPLEMENTS", 
		"IMPORT", "INTERFACE", "IdentifierPart", "IdentifierStart", "LINE_COMMENT", 
		"NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SEMICOLON", "STATIC", 
		"STRICTFP", "SYNCHRONIZED", "TRANSIENT", "VOLATILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ASTERISK=5;
	public static final int CLASS=6;
	public static final int COMMA=7;
	public static final int COMMENT=8;
	public static final int DOT=9;
	public static final int EXTENDS=10;
	public static final int FINAL=11;
	public static final int IDENTIFIER=12;
	public static final int IMPLEMENTS=13;
	public static final int IMPORT=14;
	public static final int INTERFACE=15;
	public static final int IdentifierPart=16;
	public static final int IdentifierStart=17;
	public static final int LINE_COMMENT=18;
	public static final int NATIVE=19;
	public static final int PACKAGE=20;
	public static final int PRIVATE=21;
	public static final int PROTECTED=22;
	public static final int PUBLIC=23;
	public static final int SEMICOLON=24;
	public static final int STATIC=25;
	public static final int STRICTFP=26;
	public static final int SYNCHRONIZED=27;
	public static final int TRANSIENT=28;
	public static final int VOLATILE=29;
	public static final int WS=30;

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
		this.state.ruleMemo = new HashMap[56+1];


	}

	@Override public String[] getTokenNames() { return JavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g"; }


		private JavaSource javaSource = new JavaSource();

		public JavaSource getJavaSource() {
			return javaSource;
		}



	// $ANTLR start "compilationUnit"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:26:1: compilationUnit : ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ;
	public final void compilationUnit() throws RecognitionException {
		int compilationUnit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:27:5: ( ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:27:9: ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
			{
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:27:9: ( packageDeclaration )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==PACKAGE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:27:10: packageDeclaration
					{
					pushFollow(FOLLOW_packageDeclaration_in_compilationUnit59);
					packageDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:28:9: ( importDeclaration )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IMPORT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:28:10: importDeclaration
					{
					pushFollow(FOLLOW_importDeclaration_in_compilationUnit72);
					importDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:29:9: ( typeDeclaration )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ABSTRACT||LA3_0==CLASS||LA3_0==FINAL||LA3_0==INTERFACE||LA3_0==NATIVE||(LA3_0 >= PRIVATE && LA3_0 <= VOLATILE)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:29:10: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_compilationUnit85);
					typeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
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
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:32:1: packageDeclaration : packageKeyword qualifiedName SEMICOLON ;
	public final void packageDeclaration() throws RecognitionException {
		int packageDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:33:5: ( packageKeyword qualifiedName SEMICOLON )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:33:9: packageKeyword qualifiedName SEMICOLON
			{
			pushFollow(FOLLOW_packageKeyword_in_packageDeclaration106);
			packageKeyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_qualifiedName_in_packageDeclaration108);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_packageDeclaration118); if (state.failed) return;
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
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:37:1: importDeclaration : ( importKeyword ( staticKeyword )? IDENTIFIER DOT ASTERISK SEMICOLON | importKeyword ( staticKeyword )? IDENTIFIER ( DOT IDENTIFIER )+ ( DOT ASTERISK )? SEMICOLON );
	public final void importDeclaration() throws RecognitionException {
		int importDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:38:5: ( importKeyword ( staticKeyword )? IDENTIFIER DOT ASTERISK SEMICOLON | importKeyword ( staticKeyword )? IDENTIFIER ( DOT IDENTIFIER )+ ( DOT ASTERISK )? SEMICOLON )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IMPORT) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==STATIC) ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2==IDENTIFIER) ) {
						int LA8_3 = input.LA(4);
						if ( (LA8_3==DOT) ) {
							int LA8_4 = input.LA(5);
							if ( (LA8_4==ASTERISK) ) {
								alt8=1;
							}
							else if ( (LA8_4==IDENTIFIER) ) {
								alt8=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 8, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA8_1==IDENTIFIER) ) {
					int LA8_3 = input.LA(3);
					if ( (LA8_3==DOT) ) {
						int LA8_4 = input.LA(4);
						if ( (LA8_4==ASTERISK) ) {
							alt8=1;
						}
						else if ( (LA8_4==IDENTIFIER) ) {
							alt8=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:38:9: importKeyword ( staticKeyword )? IDENTIFIER DOT ASTERISK SEMICOLON
					{
					pushFollow(FOLLOW_importKeyword_in_importDeclaration137);
					importKeyword();
					state._fsp--;
					if (state.failed) return;
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:38:23: ( staticKeyword )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==STATIC) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:38:24: staticKeyword
							{
							pushFollow(FOLLOW_staticKeyword_in_importDeclaration140);
							staticKeyword();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration144); if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_importDeclaration146); if (state.failed) return;
					match(input,ASTERISK,FOLLOW_ASTERISK_in_importDeclaration148); if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_importDeclaration150); if (state.failed) return;
					}
					break;
				case 2 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:39:9: importKeyword ( staticKeyword )? IDENTIFIER ( DOT IDENTIFIER )+ ( DOT ASTERISK )? SEMICOLON
					{
					pushFollow(FOLLOW_importKeyword_in_importDeclaration160);
					importKeyword();
					state._fsp--;
					if (state.failed) return;
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:39:23: ( staticKeyword )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==STATIC) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:39:24: staticKeyword
							{
							pushFollow(FOLLOW_staticKeyword_in_importDeclaration163);
							staticKeyword();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration167); if (state.failed) return;
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:39:51: ( DOT IDENTIFIER )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==DOT) ) {
							int LA6_1 = input.LA(2);
							if ( (LA6_1==IDENTIFIER) ) {
								alt6=1;
							}

						}

						switch (alt6) {
						case 1 :
							// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:39:52: DOT IDENTIFIER
							{
							match(input,DOT,FOLLOW_DOT_in_importDeclaration170); if (state.failed) return;
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration172); if (state.failed) return;
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

					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:39:69: ( DOT ASTERISK )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==DOT) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:39:70: DOT ASTERISK
							{
							match(input,DOT,FOLLOW_DOT_in_importDeclaration177); if (state.failed) return;
							match(input,ASTERISK,FOLLOW_ASTERISK_in_importDeclaration179); if (state.failed) return;
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_importDeclaration183); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "importDeclaration"



	// $ANTLR start "typeDeclaration"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:42:1: typeDeclaration : ( classOrInterfaceDeclaration | SEMICOLON );
	public final void typeDeclaration() throws RecognitionException {
		int typeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:43:5: ( classOrInterfaceDeclaration | SEMICOLON )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ABSTRACT||LA9_0==CLASS||LA9_0==FINAL||LA9_0==INTERFACE||LA9_0==NATIVE||(LA9_0 >= PRIVATE && LA9_0 <= PUBLIC)||(LA9_0 >= STATIC && LA9_0 <= VOLATILE)) ) {
				alt9=1;
			}
			else if ( (LA9_0==SEMICOLON) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:43:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration202);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:44:9: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_typeDeclaration212); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "typeDeclaration"



	// $ANTLR start "classOrInterfaceDeclaration"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:47:1: classOrInterfaceDeclaration : ( classDeclaration | interfaceDeclaration );
	public final void classOrInterfaceDeclaration() throws RecognitionException {
		int classOrInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:48:5: ( classDeclaration | interfaceDeclaration )
			int alt10=2;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:48:10: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration232);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:49:9: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration242);
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
			if ( state.backtracking>0 ) { memoize(input, 5, classOrInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceDeclaration"



	// $ANTLR start "classDeclaration"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:52:1: classDeclaration : accessModifier classKeyword className ( extendsKeyword superClassName )? ( implementsKeyword interfaceNameList )? ;
	public final void classDeclaration() throws RecognitionException {
		int classDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:53:5: ( accessModifier classKeyword className ( extendsKeyword superClassName )? ( implementsKeyword interfaceNameList )? )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:53:9: accessModifier classKeyword className ( extendsKeyword superClassName )? ( implementsKeyword interfaceNameList )?
			{
			pushFollow(FOLLOW_accessModifier_in_classDeclaration261);
			accessModifier();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_classKeyword_in_classDeclaration263);
			classKeyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_className_in_classDeclaration265);
			className();
			state._fsp--;
			if (state.failed) return;
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:54:9: ( extendsKeyword superClassName )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==EXTENDS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:54:10: extendsKeyword superClassName
					{
					pushFollow(FOLLOW_extendsKeyword_in_classDeclaration276);
					extendsKeyword();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_superClassName_in_classDeclaration278);
					superClassName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:55:9: ( implementsKeyword interfaceNameList )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IMPLEMENTS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:55:10: implementsKeyword interfaceNameList
					{
					pushFollow(FOLLOW_implementsKeyword_in_classDeclaration291);
					implementsKeyword();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_interfaceNameList_in_classDeclaration293);
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
			if ( state.backtracking>0 ) { memoize(input, 6, classDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classDeclaration"



	// $ANTLR start "accessModifier"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:58:1: accessModifier : ( publicKeyword | protectedKeyword | privateKeyword | staticKeyword | abstractKeyword | finalKeyword | nativeKeyword | synchronizedKeyword | transientKeyword | volatileKeyword | strictfpKeyword )* ;
	public final void accessModifier() throws RecognitionException {
		int accessModifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:59:5: ( ( publicKeyword | protectedKeyword | privateKeyword | staticKeyword | abstractKeyword | finalKeyword | nativeKeyword | synchronizedKeyword | transientKeyword | volatileKeyword | strictfpKeyword )* )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:60:5: ( publicKeyword | protectedKeyword | privateKeyword | staticKeyword | abstractKeyword | finalKeyword | nativeKeyword | synchronizedKeyword | transientKeyword | volatileKeyword | strictfpKeyword )*
			{
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:60:5: ( publicKeyword | protectedKeyword | privateKeyword | staticKeyword | abstractKeyword | finalKeyword | nativeKeyword | synchronizedKeyword | transientKeyword | volatileKeyword | strictfpKeyword )*
			loop13:
			while (true) {
				int alt13=12;
				switch ( input.LA(1) ) {
				case PUBLIC:
					{
					alt13=1;
					}
					break;
				case PROTECTED:
					{
					alt13=2;
					}
					break;
				case PRIVATE:
					{
					alt13=3;
					}
					break;
				case STATIC:
					{
					alt13=4;
					}
					break;
				case ABSTRACT:
					{
					alt13=5;
					}
					break;
				case FINAL:
					{
					alt13=6;
					}
					break;
				case NATIVE:
					{
					alt13=7;
					}
					break;
				case SYNCHRONIZED:
					{
					alt13=8;
					}
					break;
				case TRANSIENT:
					{
					alt13=9;
					}
					break;
				case VOLATILE:
					{
					alt13=10;
					}
					break;
				case STRICTFP:
					{
					alt13=11;
					}
					break;
				}
				switch (alt13) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:60:9: publicKeyword
					{
					pushFollow(FOLLOW_publicKeyword_in_accessModifier320);
					publicKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:61:9: protectedKeyword
					{
					pushFollow(FOLLOW_protectedKeyword_in_accessModifier330);
					protectedKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:62:9: privateKeyword
					{
					pushFollow(FOLLOW_privateKeyword_in_accessModifier340);
					privateKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:63:9: staticKeyword
					{
					pushFollow(FOLLOW_staticKeyword_in_accessModifier350);
					staticKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:64:9: abstractKeyword
					{
					pushFollow(FOLLOW_abstractKeyword_in_accessModifier360);
					abstractKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:65:9: finalKeyword
					{
					pushFollow(FOLLOW_finalKeyword_in_accessModifier370);
					finalKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:66:9: nativeKeyword
					{
					pushFollow(FOLLOW_nativeKeyword_in_accessModifier380);
					nativeKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:67:9: synchronizedKeyword
					{
					pushFollow(FOLLOW_synchronizedKeyword_in_accessModifier390);
					synchronizedKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:68:9: transientKeyword
					{
					pushFollow(FOLLOW_transientKeyword_in_accessModifier400);
					transientKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:69:9: volatileKeyword
					{
					pushFollow(FOLLOW_volatileKeyword_in_accessModifier410);
					volatileKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:70:9: strictfpKeyword
					{
					pushFollow(FOLLOW_strictfpKeyword_in_accessModifier420);
					strictfpKeyword();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop13;
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
			if ( state.backtracking>0 ) { memoize(input, 7, accessModifier_StartIndex); }

		}
	}
	// $ANTLR end "accessModifier"



	// $ANTLR start "className"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:74:1: className : classNameToken= IDENTIFIER ;
	public final void className() throws RecognitionException {
		int className_StartIndex = input.index();

		Token classNameToken=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:75:5: (classNameToken= IDENTIFIER )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:75:9: classNameToken= IDENTIFIER
			{
			classNameToken=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_className450); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            javaSource.setClassName(classNameToken.getText());
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, className_StartIndex); }

		}
	}
	// $ANTLR end "className"



	// $ANTLR start "superClassName"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:81:1: superClassName : parentClassNameToken= IDENTIFIER ;
	public final void superClassName() throws RecognitionException {
		int superClassName_StartIndex = input.index();

		Token parentClassNameToken=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:82:5: (parentClassNameToken= IDENTIFIER )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:82:9: parentClassNameToken= IDENTIFIER
			{
			parentClassNameToken=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superClassName483); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            javaSource.setParentClassName(parentClassNameToken.getText());
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, superClassName_StartIndex); }

		}
	}
	// $ANTLR end "superClassName"



	// $ANTLR start "interfaceName"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:88:1: interfaceName : IDENTIFIER ;
	public final void interfaceName() throws RecognitionException {
		int interfaceName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:89:5: ( IDENTIFIER )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:89:9: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceName512); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, interfaceName_StartIndex); }

		}
	}
	// $ANTLR end "interfaceName"



	// $ANTLR start "interfaceNameList"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:92:1: interfaceNameList : interfaceName ( COMMA interfaceName )* ;
	public final void interfaceNameList() throws RecognitionException {
		int interfaceNameList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:93:5: ( interfaceName ( COMMA interfaceName )* )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:93:9: interfaceName ( COMMA interfaceName )*
			{
			pushFollow(FOLLOW_interfaceName_in_interfaceNameList531);
			interfaceName();
			state._fsp--;
			if (state.failed) return;
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:93:23: ( COMMA interfaceName )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:93:24: COMMA interfaceName
					{
					match(input,COMMA,FOLLOW_COMMA_in_interfaceNameList534); if (state.failed) return;
					pushFollow(FOLLOW_interfaceName_in_interfaceNameList536);
					interfaceName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop14;
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
			if ( state.backtracking>0 ) { memoize(input, 11, interfaceNameList_StartIndex); }

		}
	}
	// $ANTLR end "interfaceNameList"



	// $ANTLR start "interfaceDeclaration"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:96:1: interfaceDeclaration : normalInterfaceDeclaration ;
	public final void interfaceDeclaration() throws RecognitionException {
		int interfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:97:5: ( normalInterfaceDeclaration )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:97:9: normalInterfaceDeclaration
			{
			pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration557);
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
			if ( state.backtracking>0 ) { memoize(input, 12, interfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceDeclaration"



	// $ANTLR start "normalInterfaceDeclaration"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:100:1: normalInterfaceDeclaration : accessModifier interfaceKeyword IDENTIFIER ;
	public final void normalInterfaceDeclaration() throws RecognitionException {
		int normalInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:101:5: ( accessModifier interfaceKeyword IDENTIFIER )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:101:9: accessModifier interfaceKeyword IDENTIFIER
			{
			pushFollow(FOLLOW_accessModifier_in_normalInterfaceDeclaration576);
			accessModifier();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_interfaceKeyword_in_normalInterfaceDeclaration578);
			interfaceKeyword();
			state._fsp--;
			if (state.failed) return;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration580); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, normalInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "normalInterfaceDeclaration"



	// $ANTLR start "qualifiedName"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:104:1: qualifiedName : IDENTIFIER ( DOT IDENTIFIER )* ;
	public final void qualifiedName() throws RecognitionException {
		int qualifiedName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:105:5: ( IDENTIFIER ( DOT IDENTIFIER )* )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:105:9: IDENTIFIER ( DOT IDENTIFIER )*
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName599); if (state.failed) return;
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:105:20: ( DOT IDENTIFIER )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DOT) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:105:21: DOT IDENTIFIER
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedName602); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName604); if (state.failed) return;
					}
					break;

				default :
					break loop15;
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
			if ( state.backtracking>0 ) { memoize(input, 14, qualifiedName_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedName"



	// $ANTLR start "packageKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:108:1: packageKeyword : PACKAGE ;
	public final void packageKeyword() throws RecognitionException {
		int packageKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:109:2: ( PACKAGE )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:109:4: PACKAGE
			{
			match(input,PACKAGE,FOLLOW_PACKAGE_in_packageKeyword620); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, packageKeyword_StartIndex); }

		}
	}
	// $ANTLR end "packageKeyword"



	// $ANTLR start "importKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:112:1: importKeyword : IMPORT ;
	public final void importKeyword() throws RecognitionException {
		int importKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:113:2: ( IMPORT )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:113:4: IMPORT
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_importKeyword631); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, importKeyword_StartIndex); }

		}
	}
	// $ANTLR end "importKeyword"



	// $ANTLR start "staticKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:116:1: staticKeyword : STATIC ;
	public final void staticKeyword() throws RecognitionException {
		int staticKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:117:2: ( STATIC )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:117:4: STATIC
			{
			match(input,STATIC,FOLLOW_STATIC_in_staticKeyword642); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, staticKeyword_StartIndex); }

		}
	}
	// $ANTLR end "staticKeyword"



	// $ANTLR start "classKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:120:1: classKeyword : CLASS ;
	public final void classKeyword() throws RecognitionException {
		int classKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:121:2: ( CLASS )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:121:4: CLASS
			{
			match(input,CLASS,FOLLOW_CLASS_in_classKeyword653); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, classKeyword_StartIndex); }

		}
	}
	// $ANTLR end "classKeyword"



	// $ANTLR start "extendsKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:124:1: extendsKeyword : EXTENDS ;
	public final void extendsKeyword() throws RecognitionException {
		int extendsKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:125:2: ( EXTENDS )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:125:4: EXTENDS
			{
			match(input,EXTENDS,FOLLOW_EXTENDS_in_extendsKeyword664); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, extendsKeyword_StartIndex); }

		}
	}
	// $ANTLR end "extendsKeyword"



	// $ANTLR start "implementsKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:128:1: implementsKeyword : IMPLEMENTS ;
	public final void implementsKeyword() throws RecognitionException {
		int implementsKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:129:2: ( IMPLEMENTS )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:129:4: IMPLEMENTS
			{
			match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_implementsKeyword675); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, implementsKeyword_StartIndex); }

		}
	}
	// $ANTLR end "implementsKeyword"



	// $ANTLR start "interfaceKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:132:1: interfaceKeyword : INTERFACE ;
	public final void interfaceKeyword() throws RecognitionException {
		int interfaceKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:133:2: ( INTERFACE )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:133:4: INTERFACE
			{
			match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceKeyword686); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, interfaceKeyword_StartIndex); }

		}
	}
	// $ANTLR end "interfaceKeyword"



	// $ANTLR start "publicKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:136:1: publicKeyword : PUBLIC ;
	public final void publicKeyword() throws RecognitionException {
		int publicKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:137:2: ( PUBLIC )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:137:4: PUBLIC
			{
			match(input,PUBLIC,FOLLOW_PUBLIC_in_publicKeyword697); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, publicKeyword_StartIndex); }

		}
	}
	// $ANTLR end "publicKeyword"



	// $ANTLR start "protectedKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:140:1: protectedKeyword : PROTECTED ;
	public final void protectedKeyword() throws RecognitionException {
		int protectedKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:141:2: ( PROTECTED )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:141:4: PROTECTED
			{
			match(input,PROTECTED,FOLLOW_PROTECTED_in_protectedKeyword708); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, protectedKeyword_StartIndex); }

		}
	}
	// $ANTLR end "protectedKeyword"



	// $ANTLR start "privateKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:144:1: privateKeyword : PRIVATE ;
	public final void privateKeyword() throws RecognitionException {
		int privateKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:145:2: ( PRIVATE )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:145:4: PRIVATE
			{
			match(input,PRIVATE,FOLLOW_PRIVATE_in_privateKeyword719); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, privateKeyword_StartIndex); }

		}
	}
	// $ANTLR end "privateKeyword"



	// $ANTLR start "abstractKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:148:1: abstractKeyword : ABSTRACT ;
	public final void abstractKeyword() throws RecognitionException {
		int abstractKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:149:2: ( ABSTRACT )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:149:4: ABSTRACT
			{
			match(input,ABSTRACT,FOLLOW_ABSTRACT_in_abstractKeyword730); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, abstractKeyword_StartIndex); }

		}
	}
	// $ANTLR end "abstractKeyword"



	// $ANTLR start "finalKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:152:1: finalKeyword : FINAL ;
	public final void finalKeyword() throws RecognitionException {
		int finalKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:153:2: ( FINAL )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:153:4: FINAL
			{
			match(input,FINAL,FOLLOW_FINAL_in_finalKeyword741); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, finalKeyword_StartIndex); }

		}
	}
	// $ANTLR end "finalKeyword"



	// $ANTLR start "nativeKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:156:1: nativeKeyword : NATIVE ;
	public final void nativeKeyword() throws RecognitionException {
		int nativeKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:157:2: ( NATIVE )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:157:4: NATIVE
			{
			match(input,NATIVE,FOLLOW_NATIVE_in_nativeKeyword752); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, nativeKeyword_StartIndex); }

		}
	}
	// $ANTLR end "nativeKeyword"



	// $ANTLR start "synchronizedKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:160:1: synchronizedKeyword : SYNCHRONIZED ;
	public final void synchronizedKeyword() throws RecognitionException {
		int synchronizedKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:161:2: ( SYNCHRONIZED )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:161:4: SYNCHRONIZED
			{
			match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_synchronizedKeyword763); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, synchronizedKeyword_StartIndex); }

		}
	}
	// $ANTLR end "synchronizedKeyword"



	// $ANTLR start "transientKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:164:1: transientKeyword : TRANSIENT ;
	public final void transientKeyword() throws RecognitionException {
		int transientKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:165:2: ( TRANSIENT )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:165:4: TRANSIENT
			{
			match(input,TRANSIENT,FOLLOW_TRANSIENT_in_transientKeyword774); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, transientKeyword_StartIndex); }

		}
	}
	// $ANTLR end "transientKeyword"



	// $ANTLR start "volatileKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:168:1: volatileKeyword : VOLATILE ;
	public final void volatileKeyword() throws RecognitionException {
		int volatileKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:169:2: ( VOLATILE )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:169:4: VOLATILE
			{
			match(input,VOLATILE,FOLLOW_VOLATILE_in_volatileKeyword785); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, volatileKeyword_StartIndex); }

		}
	}
	// $ANTLR end "volatileKeyword"



	// $ANTLR start "strictfpKeyword"
	// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:172:1: strictfpKeyword : STRICTFP ;
	public final void strictfpKeyword() throws RecognitionException {
		int strictfpKeyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:173:2: ( STRICTFP )
			// alekseybykov\\portfolio\\parsers\\antlr3\\JavaParser.g:173:4: STRICTFP
			{
			match(input,STRICTFP,FOLLOW_STRICTFP_in_strictfpKeyword796); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, strictfpKeyword_StartIndex); }

		}
	}
	// $ANTLR end "strictfpKeyword"

	// Delegated rules


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\16\uffff";
	static final String DFA10_eofS =
		"\16\uffff";
	static final String DFA10_minS =
		"\14\4\2\uffff";
	static final String DFA10_maxS =
		"\14\35\2\uffff";
	static final String DFA10_acceptS =
		"\14\uffff\1\1\1\2";
	static final String DFA10_specialS =
		"\16\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"\1\5\1\uffff\1\14\4\uffff\1\6\3\uffff\1\15\3\uffff\1\7\1\uffff\1\3\1"+
			"\2\1\1\1\uffff\1\4\1\13\1\10\1\11\1\12",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "47:1: classOrInterfaceDeclaration : ( classDeclaration | interfaceDeclaration );";
		}
	}

	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit59 = new BitSet(new long[]{0x000000003FE8C852L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit72 = new BitSet(new long[]{0x000000003FE8C852L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit85 = new BitSet(new long[]{0x000000003FE88852L});
	public static final BitSet FOLLOW_packageKeyword_in_packageDeclaration106 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration108 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_packageDeclaration118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_importKeyword_in_importDeclaration137 = new BitSet(new long[]{0x0000000002001000L});
	public static final BitSet FOLLOW_staticKeyword_in_importDeclaration140 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration144 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DOT_in_importDeclaration146 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASTERISK_in_importDeclaration148 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_importDeclaration150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_importKeyword_in_importDeclaration160 = new BitSet(new long[]{0x0000000002001000L});
	public static final BitSet FOLLOW_staticKeyword_in_importDeclaration163 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration167 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DOT_in_importDeclaration170 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration172 = new BitSet(new long[]{0x0000000001000200L});
	public static final BitSet FOLLOW_DOT_in_importDeclaration177 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASTERISK_in_importDeclaration179 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_importDeclaration183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_typeDeclaration212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_classDeclaration261 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_classKeyword_in_classDeclaration263 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_className_in_classDeclaration265 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_extendsKeyword_in_classDeclaration276 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_superClassName_in_classDeclaration278 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_implementsKeyword_in_classDeclaration291 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_interfaceNameList_in_classDeclaration293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_publicKeyword_in_accessModifier320 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_protectedKeyword_in_accessModifier330 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_privateKeyword_in_accessModifier340 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_staticKeyword_in_accessModifier350 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_abstractKeyword_in_accessModifier360 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_finalKeyword_in_accessModifier370 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_nativeKeyword_in_accessModifier380 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_synchronizedKeyword_in_accessModifier390 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_transientKeyword_in_accessModifier400 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_volatileKeyword_in_accessModifier410 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_strictfpKeyword_in_accessModifier420 = new BitSet(new long[]{0x000000003EE80812L});
	public static final BitSet FOLLOW_IDENTIFIER_in_className450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_superClassName483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_interfaceName512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceName_in_interfaceNameList531 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_COMMA_in_interfaceNameList534 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_interfaceName_in_interfaceNameList536 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_normalInterfaceDeclaration576 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_interfaceKeyword_in_normalInterfaceDeclaration578 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName599 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_DOT_in_qualifiedName602 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName604 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_PACKAGE_in_packageKeyword620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importKeyword631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_staticKeyword642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classKeyword653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_extendsKeyword664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_implementsKeyword675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERFACE_in_interfaceKeyword686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_publicKeyword697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_protectedKeyword708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_privateKeyword719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABSTRACT_in_abstractKeyword730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINAL_in_finalKeyword741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIVE_in_nativeKeyword752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_synchronizedKeyword763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSIENT_in_transientKeyword774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOLATILE_in_volatileKeyword785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRICTFP_in_strictfpKeyword796 = new BitSet(new long[]{0x0000000000000002L});
}
