package alekseybykov.pets.parsers.parser;

import alekseybykov.pets.parsers.helpers.SourceReader;
import alekseybykov.pets.parsers.model.JavaSource;
import lombok.val;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class JavaSourceParserTest {

	private final SourceParser sourceParser = new JavaSourceParser();

	@Test
	public void flatTest_whenClassExtendsSuperclass() throws RecognitionException {
		JavaSource javaSource = sourceParser.parse("/fixtures/flat/extends/Class_Extends_Superclass.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", javaSource.getPackageName());

		assertEquals("Class_Extends_Superclass", javaSource.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.Class_Extends_Superclass", javaSource.getClassFullName());

		assertEquals("Superclass", javaSource.getSuperclassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.some_package.Superclass", javaSource.getSuperclassFullName());

		assertThat(javaSource.getInterfaces().size(), is(0));
	}

	@Test
	public void flatTest_whenClassIsALeaf() throws RecognitionException {
		JavaSource javaSource = sourceParser.parse("/fixtures/flat/leaf/LeafClass.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", javaSource.getPackageName());

		assertEquals("LeafClass", javaSource.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.LeafClass", javaSource.getClassFullName());

		Assert.assertNull(javaSource.getSuperclassSimpleName());
		Assert.assertNull(javaSource.getSuperclassFullName());

		assertThat(javaSource.getInterfaces().size(), is(0));
	}

	@Test
	public void flatTest_whenClassImplementsOnlyOneInterface() throws RecognitionException {
		JavaSource javaSource = sourceParser.parse("/fixtures/flat/implements/Class_Implements_Interface.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", javaSource.getPackageName());

		assertEquals("Class_Implements_Interface", javaSource.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.Class_Implements_Interface", javaSource.getClassFullName());

		Assert.assertNull(javaSource.getSuperclassSimpleName());
		Assert.assertNull(javaSource.getSuperclassFullName());

		List<String> interfaceNames = javaSource.getInterfaces();
		assertThat(interfaceNames.size(), is(1));
		assertEquals("Interface", interfaceNames.get(0));
	}

	@Test
	public void flatTest_whenClassImplementsMultipleInterfaces() throws RecognitionException {
		JavaSource javaSource = sourceParser.parse("/fixtures/flat/implements/Class_Implements_MultipleInterfaces.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", javaSource.getPackageName());

		assertEquals("Class_Implements_MultipleInterfaces", javaSource.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.Class_Implements_MultipleInterfaces", javaSource.getClassFullName());

		Assert.assertNull(javaSource.getSuperclassSimpleName());
		Assert.assertNull(javaSource.getSuperclassFullName());

		List<String> interfaceNames = javaSource.getInterfaces();
		assertThat(interfaceNames.size(), is(4));
		assertThat(interfaceNames, hasItems("Interface1", "Interface2", "Interface3", "Interface4"));
	}

	@Test
	public void flatTest_whenClassExtendsSuperclass_and_ImplementsMultipleInterfaces() throws RecognitionException {
		JavaSource javaSource = sourceParser.parse("/fixtures/flat/extends_implements/Class_Extends_Superclass_Implements_MultipleInterfaces.java");

		assertEquals("alekseybykov.pets.parsers.parser.fixtures", javaSource.getPackageName());

		assertEquals("Class_Extends_Superclass_Implements_MultipleInterfaces", javaSource.getClassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.Class_Extends_Superclass_Implements_MultipleInterfaces", javaSource.getClassFullName());

		assertEquals("Superclass", javaSource.getSuperclassSimpleName());
		assertEquals("alekseybykov.pets.parsers.parser.fixtures.Superclass", javaSource.getSuperclassFullName());

		List<String> interfaceNames = javaSource.getInterfaces();
		assertThat(interfaceNames.size(), is(4));
		assertThat(interfaceNames, hasItems("Interface1", "Interface2", "Interface3", "Interface4"));
	}
}
