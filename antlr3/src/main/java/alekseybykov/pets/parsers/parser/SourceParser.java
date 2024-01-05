package alekseybykov.pets.parsers.parser;

import alekseybykov.pets.parsers.model.JavaSource;
import org.antlr.runtime.RecognitionException;

import java.io.File;
import java.util.List;

/**
 * @author bykov.alexey
 * @since 05.01.2024
 */
public interface SourceParser {

	JavaSource parse(String path) throws RecognitionException;

	List<JavaSource> parse(List<String> paths) throws RecognitionException;
}
