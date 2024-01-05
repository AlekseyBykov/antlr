package alekseybykov.pets.parsers.parser.fixtures;

import alekseybykov.pets.parsers.parser.some_package.SomeClass;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * Test fixture for the parser test.
 *
 * @author bykov.alexey
 * @since 04.01.2024
 */
public class Class_Implements_Interface implements Interface {

	private static final String someStringField = "someStringValue";
	private static final int someIntField = 1;

	private final Date someDateField = new Date();

	@Override
	protected String someMethod() {

		...
//SKIPPED
