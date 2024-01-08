package alekseybykov.pets.parsers.parser;

import alekseybykov.pets.parsers.analyzer.consts.DeepLevel;
import alekseybykov.pets.parsers.analyzer.JavaClassAnalyzer;
import alekseybykov.pets.parsers.model.JavaClass;
import org.antlr.runtime.RecognitionException;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class HierarchyModeParserTest {

	private final ClassParser classParser = new JavaClassParser();

	@Test
	public void testDeepLevel1() throws RecognitionException {
		JavaClass parent = classParser.parse("/fixtures/hierarchy/Parent.java");

		List<JavaClass> classes = classParser.parse(Arrays.asList(
				"/fixtures/hierarchy/ChildL1_1.java",
				"/fixtures/hierarchy/ChildL1_2.java",
				"/fixtures/hierarchy/ChildL2_1.java",
				"/fixtures/hierarchy/ChildL2_2.java",
				"/fixtures/hierarchy/ChildL3.java"
		));

		JavaClassAnalyzer analyzer = new JavaClassAnalyzer();
		List<JavaClass> subclasses = analyzer.findSubclassesForLevel(parent, classes, DeepLevel.L1);

		assertThat(subclasses.size(), is(2));

		// All the L1 subclasses for parent class.
		assertThat(subclasses, containsInAnyOrder(
				hasProperty("classSimpleName", is("ChildL1_1")),
				hasProperty("classSimpleName", is("ChildL1_2"))
		));
	}

	@Test
	public void testDeepLevel2() throws RecognitionException {
		JavaClass parent = classParser.parse("/fixtures/hierarchy/Parent.java");

		List<JavaClass> classes = classParser.parse(Arrays.asList(
				"/fixtures/hierarchy/ChildL1_1.java",
				"/fixtures/hierarchy/ChildL1_2.java",
				"/fixtures/hierarchy/ChildL2_1.java",
				"/fixtures/hierarchy/ChildL2_2.java",
				"/fixtures/hierarchy/ChildL3.java"
		));

		JavaClassAnalyzer analyzer = new JavaClassAnalyzer();
		List<JavaClass> subclasses = analyzer.findSubclassesForLevel(parent, classes, DeepLevel.L2);

		assertThat(subclasses.size(), is(4));

		// All the L2 subclasses for parent class.
		assertThat(subclasses, containsInAnyOrder(
				hasProperty("classSimpleName", is("ChildL1_1")),
				hasProperty("classSimpleName", is("ChildL1_2")),
				hasProperty("classSimpleName", is("ChildL2_1")),
				hasProperty("classSimpleName", is("ChildL2_2"))
		));

		assertThat(
				subclasses,
				hasItem(allOf(
						Matchers.<JavaClass>hasProperty("classSimpleName", is("ChildL1_1")),
						Matchers.<JavaClass>hasProperty("classFullName", is("alekseybykov.pets.parsers.parser.fixtures.ChildL1_1")),
						Matchers.<JavaClass>hasProperty("packageName", is("alekseybykov.pets.parsers.parser.fixtures")),
						Matchers.<JavaClass>hasProperty("superclassSimpleName", is("Parent")),
						Matchers.<JavaClass>hasProperty("superclassFullName", is("alekseybykov.pets.parsers.parser.fixtures.Parent"))
				))
		);

		assertThat(
				subclasses,
				hasItem(allOf(
						Matchers.<JavaClass>hasProperty("classSimpleName", is("ChildL1_2")),
						Matchers.<JavaClass>hasProperty("classFullName", is("alekseybykov.pets.parsers.parser.fixtures.ChildL1_2")),
						Matchers.<JavaClass>hasProperty("packageName", is("alekseybykov.pets.parsers.parser.fixtures")),
						Matchers.<JavaClass>hasProperty("superclassSimpleName", is("Parent")),
						Matchers.<JavaClass>hasProperty("superclassFullName", is("alekseybykov.pets.parsers.parser.fixtures.Parent"))
				))
		);
	}
}
