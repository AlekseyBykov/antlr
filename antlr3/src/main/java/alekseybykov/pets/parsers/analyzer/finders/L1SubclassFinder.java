package alekseybykov.pets.parsers.analyzer.finders;

import alekseybykov.pets.parsers.model.JavaClass;

import java.util.List;

/**
 * @author bykov.alexey
 * @since 08.01.2024
 */
public class L1SubclassFinder extends SubclassFinder {

	@Override
	public List<JavaClass> find(JavaClass superclass, List<JavaClass> classes) {
		return findSubclasses(superclass, classes);
	}
}
