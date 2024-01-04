package alekseybykov.pets.parsers.java.fixtures;

import alekseybykov.pets.parsers.java.some_package.SomeClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import alekseybykov.pets.parsers.java.some_package.Superclass;
import java.text.ParseException;
import java.util.*;

/**
 * Test fixture for the parser test.
 *
 * @author bykov.alexey
 * @since 04.01.2024
 */
@Slf4j
public class Class_Extends_Superclass extends Superclass {

	private static final String someStringField = "someStringValue";
	private static final int someIntField = 1;

	private final Date someDateField = new Date();

	@Override
	protected String someAnotherMethod() {

		...
//SKIPPED

public Superclass {

}

