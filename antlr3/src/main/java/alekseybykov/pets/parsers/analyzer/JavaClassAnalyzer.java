package alekseybykov.pets.parsers.analyzer;

import alekseybykov.pets.parsers.analyzer.consts.DeepLevel;
import alekseybykov.pets.parsers.analyzer.finders.SubclassFinder;
import alekseybykov.pets.parsers.analyzer.finders.SubclassFindersPool;
import alekseybykov.pets.parsers.model.JavaClass;

import java.util.*;

/**
 * @author bykov.alexey
 * @since 05.01.2024
 */
public class JavaClassAnalyzer {

	private final SubclassFindersPool finders = new SubclassFindersPool();

	public List<JavaClass> findSubclassesForLevel(JavaClass parent,
	                                              List<JavaClass> classes,
	                                              DeepLevel level) {
		SubclassFinder finder = finders.getFinderByLevel(level);
		return finder.find(parent, classes);
	}
}
