package alekseybykov.portfolio.parsers.java;

import alekseybykov.portfolio.parsers.antlr3.JavaLexer;
import alekseybykov.portfolio.parsers.antlr3.JavaParser;
import alekseybykov.portfolio.parsers.models.JavaSource;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class ANTLR3JavaSourceParser {

	/**
	 * The method parses Java source text into objects.
	 *
	 * @param javaText - Java source code.
	 * @return - the object representation of the text.
	 */
	public JavaSource parse(String javaText) throws RecognitionException {
		CommonTokenStream javaTokens = tokenizeText(javaText);
		return parse(javaTokens);
	}

	/**
	 * The method splits the text into tokens - lexer {@link JavaLexer}
	 * scans the text {@param javaText} and transforms each character into a token
	 * according to the grammar described in JavaLexer.g. The token is an elementary atomic block,
	 * which is then used by the parser to compose the logical structure of the text.
	 *
	 * @param javaText - tokenized text.
	 * @return - the text converted into a set of tokens.
	 */
	private CommonTokenStream tokenizeText(String javaText) {
		JavaLexer lexer = new JavaLexer(new ANTLRStringStream(javaText));
		return new CommonTokenStream(lexer);
	}

	private JavaSource parse(CommonTokenStream javaTokens) throws RecognitionException {
		JavaParser parser = new JavaParser(javaTokens);
		parser.compilationUnit();
		return parser.getJavaSource();
	}
}
