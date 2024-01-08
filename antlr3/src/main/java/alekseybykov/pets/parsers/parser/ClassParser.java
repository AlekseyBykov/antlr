package alekseybykov.pets.parsers.parser;

import alekseybykov.pets.parsers.model.JavaClass;
import org.antlr.runtime.RecognitionException;

import java.util.List;

/**
 * @author bykov.alexey
 * @since 05.01.2024
 */
public interface ClassParser {

	JavaClass parse(String path) throws RecognitionException;

	List<JavaClass> parse(List<String> paths) throws RecognitionException;
}
