package alekseybykov.pets.parsers.parser;

import alekseybykov.pets.parsers.helpers.SourceReader;
import alekseybykov.pets.parsers.model.JavaSource;
import alekseybykov.pets.parsers.antlr3.JavaLexer;
import alekseybykov.pets.parsers.antlr3.JavaParser;
import lombok.val;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class JavaSourceParser implements SourceParser {

	private final SourceReader sourceReader = new SourceReader();

	/**
	 * The method parses one Java source into objects.
	 *
	 * @param path - path to Java source code file.
	 * @return - the object representation of the text.
	 */
	@Override
	public JavaSource parse(String path) throws RecognitionException {
		return parseByPath(path);
	}

	/**
	 * The method parses a list of Java sources into objects.
	 *
	 * @param paths - list of Java source files.
	 * @return - list of object representations.
	 */
	@Override
	public List<JavaSource> parse(List<String> paths) throws RecognitionException {
		List<JavaSource> result = new ArrayList<>();
		for (String path : paths) {
			result.add(parseByPath(path));
		}
		return result;
	}

	private JavaSource parseByPath(String path) throws RecognitionException {
		val javaText = sourceReader.readByClasspath(JavaSourceParser.class, path);
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
