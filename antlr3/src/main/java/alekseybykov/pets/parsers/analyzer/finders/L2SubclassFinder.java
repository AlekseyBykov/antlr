package alekseybykov.pets.parsers.analyzer.finders;

import alekseybykov.pets.parsers.model.JavaClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bykov.alexey
 * @since 08.01.2024
 */
public class L2SubclassFinder extends SubclassFinder {

	@Override
	public List<JavaClass> find(JavaClass superclass, List<JavaClass> classes) {
		List<JavaClass> subclassesL1 = findSubclasses(superclass, classes);
		classes.removeAll(subclassesL1);

		List<JavaClass> subclassesL2 = new ArrayList<>();
		for (JavaClass superclassL1 : subclassesL1) {
			subclassesL2.addAll(findSubclasses(superclassL1, classes));
		}

		return unionClasses(subclassesL1, subclassesL2);
	}
}
