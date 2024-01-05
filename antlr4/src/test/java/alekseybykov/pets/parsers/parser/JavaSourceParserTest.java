package alekseybykov.pets.parsers.parser;

import alekseybykov.pets.parsers.model.JavaSource;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class JavaSourceParserTest {

	@Test
	public void testClassRelationships() {

		JavaSourceParser parser = new JavaSourceParser();

		JavaSource javaSource = parser.parse("public class ClassA extends ClassB");
		assertEquals("ClassA", javaSource.getClassName());
		assertEquals("ClassB", javaSource.getParentClassName());

		javaSource = parser.parse("public class ClassC");
		assertEquals("ClassC", javaSource.getClassName());
		assertNull(javaSource.getParentClassName());

		javaSource = parser.parse("public class ClassD implements InterfaceA");
		assertEquals("ClassD", javaSource.getClassName());
		assertNull(javaSource.getParentClassName());

		javaSource = parser.parse("public class ClassE extends ClassF implements InterfaceA, InterfaceB");
		assertEquals("ClassE", javaSource.getClassName());
		assertEquals("ClassF", javaSource.getParentClassName());
	}
}
