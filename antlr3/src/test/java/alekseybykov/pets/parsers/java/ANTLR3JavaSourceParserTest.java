package alekseybykov.pets.parsers.java;

import alekseybykov.pets.parsers.io.FileSourceReader;
import alekseybykov.pets.parsers.models.JavaSource;
import lombok.val;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class ANTLR3JavaSourceParserTest {

	private final ANTLR3JavaSourceParser sourceParser = new ANTLR3JavaSourceParser();
	private final FileSourceReader sourceReader = new FileSourceReader();

	@Test
	public void whenClassExtendsSuperclass() throws RecognitionException {
		val fixture = "/fixtures/extends/Class_Extends_Superclass.java";
		val sourceText = sourceReader.readByClasspath(ANTLR3JavaSourceParserTest.class, fixture);

		JavaSource javaSource = sourceParser.parse(sourceText);

		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures", javaSource.getPackageName());

		Assert.assertEquals("Class_Extends_Superclass", javaSource.getClassSimpleName());
		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures.Class_Extends_Superclass", javaSource.getClassFullName());

		Assert.assertEquals("Superclass", javaSource.getSuperclassSimpleName());
		Assert.assertEquals("alekseybykov.pets.parsers.java.some_package.Superclass", javaSource.getSuperclassFullName());

		assertThat(javaSource.getInterfaces().size(), is(0));
	}

	@Test
	public void whenClassIsALeaf() throws RecognitionException {
		val fixture = "/fixtures/leaf/LeafClass.java";
		val sourceText = sourceReader.readByClasspath(ANTLR3JavaSourceParserTest.class, fixture);

		JavaSource javaSource = sourceParser.parse(sourceText);

		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures", javaSource.getPackageName());

		Assert.assertEquals("LeafClass", javaSource.getClassSimpleName());
		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures.LeafClass", javaSource.getClassFullName());

		Assert.assertNull(javaSource.getSuperclassSimpleName());
		Assert.assertNull(javaSource.getSuperclassFullName());

		assertThat(javaSource.getInterfaces().size(), is(0));
	}

	@Test
	public void whenClassImplementsOnlyOneInterface() throws RecognitionException {
		val fixture = "/fixtures/implements/Class_Implements_Interface.java";
		val sourceText = sourceReader.readByClasspath(ANTLR3JavaSourceParserTest.class, fixture);

		JavaSource javaSource = sourceParser.parse(sourceText);

		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures", javaSource.getPackageName());

		Assert.assertEquals("Class_Implements_Interface", javaSource.getClassSimpleName());
		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures.Class_Implements_Interface", javaSource.getClassFullName());

		Assert.assertNull(javaSource.getSuperclassSimpleName());
		Assert.assertNull(javaSource.getSuperclassFullName());

		List<String> interfaceNames = javaSource.getInterfaces();
		assertThat(interfaceNames.size(), is(1));
		Assert.assertEquals("Interface", interfaceNames.get(0));
	}

	@Test
	public void whenClassImplementsMultipleInterfaces() throws RecognitionException {
		val fixture = "/fixtures/implements/Class_Implements_MultipleInterfaces.java";
		val sourceText = sourceReader.readByClasspath(ANTLR3JavaSourceParserTest.class, fixture);

		JavaSource javaSource = sourceParser.parse(sourceText);

		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures", javaSource.getPackageName());

		Assert.assertEquals("Class_Implements_MultipleInterfaces", javaSource.getClassSimpleName());
		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures.Class_Implements_MultipleInterfaces", javaSource.getClassFullName());

		Assert.assertNull(javaSource.getSuperclassSimpleName());
		Assert.assertNull(javaSource.getSuperclassFullName());

		List<String> interfaceNames = javaSource.getInterfaces();
		assertThat(interfaceNames.size(), is(4));
		assertThat(interfaceNames, hasItems("Interface1", "Interface2", "Interface3", "Interface4"));
	}

	@Test
	public void whenClassExtendsSuperclass_and_ImplementsMultipleInterfaces() throws RecognitionException {
		val fixture = "/fixtures/extends_implements/Class_Extends_Superclass_Implements_MultipleInterfaces.java";
		val sourceText = sourceReader.readByClasspath(ANTLR3JavaSourceParserTest.class, fixture);

		JavaSource javaSource = sourceParser.parse(sourceText);

		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures", javaSource.getPackageName());

		Assert.assertEquals("Class_Extends_Superclass_Implements_MultipleInterfaces", javaSource.getClassSimpleName());
		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures.Class_Extends_Superclass_Implements_MultipleInterfaces", javaSource.getClassFullName());

		Assert.assertEquals("Superclass", javaSource.getSuperclassSimpleName());
		Assert.assertEquals("alekseybykov.pets.parsers.java.fixtures.Superclass", javaSource.getSuperclassFullName());

		List<String> interfaceNames = javaSource.getInterfaces();
		assertThat(interfaceNames.size(), is(4));
		assertThat(interfaceNames, hasItems("Interface1", "Interface2", "Interface3", "Interface4"));
	}
}
