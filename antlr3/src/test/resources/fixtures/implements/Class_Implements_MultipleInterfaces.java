package alekseybykov.pets.parsers.java.fixtures;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import alekseybykov.pets.parsers.java.some_package.SomeClass;

import java.text.ParseException;
import java.util.*;

/**
 * Test fixture for the parser test.
 *
 * @author bykov.alexey
 * @since 04.01.2024
 */
public class Class_Implements_MultipleInterfaces implements Interface1,Interface2,   Interface3,  Interface4 {

	private static final String someStringField = "someStringValue";
	private static final int someIntField = 1;

	private final Date someDateField = new Date();

	@Override
	protected String someMethod() {

		...
//SKIPPED
