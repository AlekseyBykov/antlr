package alekseybykov.pets.parsers.parser;

import alekseybykov.pets.parsers.helpers.ClassReader;
import alekseybykov.pets.parsers.model.JavaClass;
import alekseybykov.pets.parsers.antlr3.JavaLexer;
import alekseybykov.pets.parsers.antlr3.JavaParser;
import lombok.val;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class JavaClassParser implements ClassParser {

	private final ClassReader classReader = new ClassReader();

	/**
	 * The method parses one Java source into objects.
	 *
	 * @param path - path to Java source code file.
	 * @return - the object representation of the text.
	 */
	@Override
	public JavaClass parse(String path) throws RecognitionException {
		return parseByPath(path);
	}

	/**
	 * The method parses a list of Java sources into objects.
	 *
	 * @param paths - list of Java source files.
	 * @return - list of object representations.
	 */
	@Override
	public List<JavaClass> parse(List<String> paths) throws RecognitionException {
		List<JavaClass> result = new ArrayList<>();
		for (String path : paths) {
			result.add(parseByPath(path));
		}
		return result;
	}

	private JavaClass parseByPath(String path) throws RecognitionException {
		val javaText = classReader.readByClasspath(JavaClassParser.class, path);
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

	private JavaClass parse(CommonTokenStream javaTokens) throws RecognitionException {
		JavaParser parser = new JavaParser(javaTokens);
		parser.compilationUnit();
		return parser.getJavaClass();
	}
}
