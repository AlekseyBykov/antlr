package alekseybykov.pets.parsers.java;

import alekseybykov.pets.parsers.antlr4.JavaBaseListener;
import alekseybykov.pets.parsers.antlr4.JavaLexer;
import alekseybykov.pets.parsers.antlr4.JavaParser;
import alekseybykov.pets.parsers.models.JavaSource;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class ANTLR4JavaSourceParser {

	/**
	 * The method parses the Java source text into objects.
	 *
	 * @param javaText - Java source code.
	 * @return - the object representation of the text.
	 */
	public JavaSource parse(String javaText) {
		CommonTokenStream javaTokens = tokenizeText(javaText);
		JavaSourceRecognizer recognizer = analyzeAbstractSyntaxTree(javaTokens);

		return recognizer.getJavaSource();
	}

	/**
	 * The method splits the text into tokens - lexer {@link JavaLexer}
	 * scans the text {@param javaText} and transforms each character into a token
	 * according to the grammar described in Java.g4. The token is an atomic block,
	 * which is then used by the parser to compose the logical structure of the text.
	 *
	 * @param javaText - tokenized text.
	 * @return - the text converted into a set of tokens.
	 */
	private CommonTokenStream tokenizeText(String javaText) {
		JavaLexer lexer = new JavaLexer(CharStreams.fromString(javaText));
		return new CommonTokenStream(lexer);
	}

	/**
	 * The method builds an abstract syntax tree (AST) from tokens
	 * received by the lexer in {@link #tokenizeText}.
	 *
	 * AST is a logical representation of the original text, which can now be disassembled
	 * into its components according to the grammar described in Java.g4.
	 * {@link ParseTreeWalker} traverses the AST tree and generates an event for {@link JavaSourceRecognizer}
	 * (a custom listener) every time it encounters a logic block described in the grammar.
	 * For example, if the keyword "className" is encountered, the listener method
	 * {@link JavaBaseListener#enterClassName} is called, next, this keyword has ended, hence called
	 * {@link JavaBaseListener#exitClassName} and so on for the rest of the blocks.
	 *
	 * @param javaTokens - a set of tokens representing the source text.
	 * @return - the listener object from which the final parsing result can be extracted.
	 */
	private JavaSourceRecognizer analyzeAbstractSyntaxTree(CommonTokenStream javaTokens) {
		JavaParser parser = new JavaParser(javaTokens);
		JavaSourceRecognizer recognizer = new JavaSourceRecognizer();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(recognizer, parser.compilationUnit());

		return recognizer;
	}
}
