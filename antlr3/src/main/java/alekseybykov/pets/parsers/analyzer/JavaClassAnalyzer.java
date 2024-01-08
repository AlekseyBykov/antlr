package alekseybykov.pets.parsers.analyzer;

import alekseybykov.pets.parsers.analyzer.consts.DeepLevel;
import alekseybykov.pets.parsers.analyzer.finders.SubclassFinder;
import alekseybykov.pets.parsers.analyzer.finders.SubclassFindersPool;
import alekseybykov.pets.parsers.model.JavaClass;

import java.util.*;

/**
 * Parsing results analyzer. Analyzes the contents of the {@link JavaClass} list
 * (search for subclasses, etc).
 *
 * @author bykov.alexey
 * @since 05.01.2024
 */
public class JavaClassAnalyzer {

	private final SubclassFindersPool finders = new SubclassFindersPool();

	/**
	 * The method searches for all child classes for the {@code parent} class.
	 * Search is performed among the {@code classes} list at the specified {@code level}.
	 *
	 * For example, the following tree shows the levels:
	 *
	 *            (ClassA)              - Level 0
	 *              /   \
	 *            /      \
	 *      (ClassB)   (ClassC)         - Level 1
	 *         /          /  \
	 *       /          /     \
	 *  (ClassD)   (ClassE)  (ClassF)   - Level 2
	 *                \
	 *                 \
	 *                (ClassG)          - Level 3
	 *
	 * If search is performed for all child classes for "ClassA" class at "L2" level,
	 * then the following will be found: "ClassB", "ClassC", "ClassD", "ClassE", "ClassF".
	 * If at the "L3" level, then the "ClassG" class will be added to them.
	 *
	 * @param parent - (sub)tree root.
	 * @param classes - list for subclasses search.
	 * @param level - level (depth) of the search.
	 * @return - list of all subclasses.
	 */
	public List<JavaClass> findSubclassesForLevel(JavaClass parent,
	                                              List<JavaClass> classes,
	                                              DeepLevel level) {
		SubclassFinder finder = finders.getFinderByLevel(level);
		return finder.find(parent, classes);
	}
}
