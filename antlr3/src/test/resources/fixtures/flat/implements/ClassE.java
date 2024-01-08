package alekseybykov.pets.parsers.parser.fixtures;

import org.apache.commons.lang.StringUtils;
import alekseybykov.pets.parsers.parser.some_package.SomeClass;

import java.util.*;

/**
 * Test fixture for the {@link JavaClassParser} test.
 *
 * @author bykov.alexey
 * @since 04.01.2024
 */
public class ClassE implements Interface1,Interface2,   Interface3,  Interface4 {

	private static final String someStringField = "someStringValue";
	private static final int someIntField = 1;

	private final Date someDateField = new Date();

	@Override
	protected String someMethod() {

		...
//SKIPPED
