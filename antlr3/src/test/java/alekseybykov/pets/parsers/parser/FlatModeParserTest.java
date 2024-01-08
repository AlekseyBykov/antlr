package alekseybykov.pets.parsers.parser;

import alekseybykov.pets.parsers.analyzer.JavaClassAnalyzer;
import alekseybykov.pets.parsers.analyzer.consts.DeepLevel;
import alekseybykov.pets.parsers.model.JavaClass;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author bykov.alexey
 * @since 08.01.2024
 */
public class FlatModeParserTest {

	private final ClassParser classParser = new JavaClassParser();

	@Test
	public void whenClassExtendsSuperclass() throws RecognitionException {
		JavaClass aClass = classParser.parse("/fixtures/flat/extends/ClassA.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", aClass.getPackageName());

		assertEquals("ClassA", aClass.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.ClassA", aClass.getClassFullName());

		assertEquals("ClassB", aClass.getSuperclassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.some_package.ClassB", aClass.getSuperclassFullName());

		assertThat(aClass.getInterfaces().size(), is(0));
	}

	@Test
	public void whenClassIsOrphan() throws RecognitionException {
		JavaClass aClass = classParser.parse("/fixtures/flat/orphan/OrphanClass.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", aClass.getPackageName());

		assertEquals("OrphanClass", aClass.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.OrphanClass", aClass.getClassFullName());

		assertNull(aClass.getSuperclassSimpleName());
		assertNull(aClass.getSuperclassFullName());

		assertThat(aClass.getInterfaces().size(), is(0));
	}

	@Test
	public void whenClassImplementsOnlyOneInterface() throws RecognitionException {
		JavaClass aClass = classParser.parse("/fixtures/flat/implements/ClassD.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", aClass.getPackageName());

		assertEquals("ClassD", aClass.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.ClassD", aClass.getClassFullName());

		assertNull(aClass.getSuperclassSimpleName());
		assertNull(aClass.getSuperclassFullName());

		List<String> interfaceNames = aClass.getInterfaces();
		assertThat(interfaceNames.size(), is(1));
		assertEquals("Interface", interfaceNames.get(0));
	}

	@Test
	public void whenClassImplementsMultipleInterfaces() throws RecognitionException {
		JavaClass aClass = classParser.parse("/fixtures/flat/implements/ClassE.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", aClass.getPackageName());

		assertEquals("ClassE", aClass.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.ClassE", aClass.getClassFullName());

		assertNull(aClass.getSuperclassSimpleName());
		assertNull(aClass.getSuperclassFullName());

		List<String> interfaceNames = aClass.getInterfaces();
		assertThat(interfaceNames.size(), is(4));
		assertThat(interfaceNames, hasItems("Interface1", "Interface2", "Interface3", "Interface4"));
	}

	@Test
	public void whenClassExtendsSuperclass_and_ImplementsMultipleInterfaces() throws RecognitionException {
		JavaClass aClass = classParser.parse("/fixtures/flat/extends_implements/ClassC.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", aClass.getPackageName());

		assertEquals("ClassC", aClass.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.ClassC", aClass.getClassFullName());

		assertEquals("Superclass", aClass.getSuperclassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.Superclass", aClass.getSuperclassFullName());

		List<String> interfaceNames = aClass.getInterfaces();
		assertThat(interfaceNames.size(), is(4));
		assertThat(interfaceNames, hasItems("Interface1", "Interface2", "Interface3", "Interface4"));
	}
}
