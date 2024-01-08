package alekseybykov.pets.parsers.analyzer.finders;

import alekseybykov.pets.parsers.model.JavaClass;

import java.util.ArrayList;
import java.util.List;

/**
 * The class performs a search at the L3 level.
 *
 * @author bykov.alexey
 * @since 08.01.2024
 */
public class L3SubclassFinder extends SubclassFinder {

	@Override
	public List<JavaClass> find(JavaClass parent, List<JavaClass> classes) {
		// Search for L1 subclasses.
		List<JavaClass> subclassesL1 = findSubclasses(parent, classes);
		// The found classes should be deleted.
		classes.removeAll(subclassesL1);

		List<JavaClass> subclassesL2 = new ArrayList<>();
		// The L1 level subclasses found above may be the parent classes for the L2 level.
		for (JavaClass superclassL1 : subclassesL1) {
			// Search for L2 subclasses.
			subclassesL2.addAll(findSubclasses(superclassL1, classes));
		}

		// The found classes should be deleted.
		classes.removeAll(subclassesL2);

		List<JavaClass> subclassesL3 = new ArrayList<>();
		// The L2 level subclasses found above may be the parent classes for the L3 level.
		for (JavaClass superclassL2 : subclassesL2) {
			// Search for L3 subclasses.
			subclassesL3.addAll(findSubclasses(superclassL2, classes));
		}

		return unionClasses(subclassesL1, subclassesL2, subclassesL3);
	}
}
