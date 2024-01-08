package alekseybykov.pets.parsers.analyzer.finders;

import alekseybykov.pets.parsers.model.JavaClass;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bykov.alexey
 * @since 08.01.2024
 */
public abstract class SubclassFinder {

	public abstract List<JavaClass> find(JavaClass superclass, List<JavaClass> classes);

	protected List<JavaClass> findSubclasses(JavaClass superclass, List<JavaClass> classes) {
		List<JavaClass> subclasses = new ArrayList<>();
		for (JavaClass aClass : classes) {
			if (aClass.hasParent() && isAChild(superclass, aClass)) {
				subclasses.add(aClass);
			}
		}
		return subclasses;
	}

	protected boolean isAChild(JavaClass superclass, JavaClass aClass) {
		return StringUtils.equals(superclass.getClassFullName(), aClass.getSuperclassFullName());
	}

	protected List<JavaClass> unionClasses(List<JavaClass>... classes) {
		return Arrays.stream(classes)
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
	}
}
