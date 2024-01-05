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
public class Class_Extends_Superclass_Implements_MultipleInterfaces extends Superclass implements Interface1,Interface2,
                                                                                                  Interface3,  Interface4 {
	private static final String someStringField = "someStringValue";
	private static final int someIntField = 1;

	private final Date someDateField = new Date();

	@Override
	protected String someMethod() {

		...
//SKIPPED
