package alekseybykov.pets.parsers.parser.fixtures;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import alekseybykov.pets.parsers.parser.some_package.Parent;

import java.util.*;

/**
 * Test fixture for the {@link JavaClassParser} test.
 *
 * @author bykov.alexey
 * @since 04.01.2024
 */
@Slf4j
public class ChildL1_1 extends Parent {

	private static final String someStringField = "someStringValue";
	private static final int someIntField = 1;

	private final Date someDateField = new Date();

	@Override
	protected String someAnotherMethod() {

		...
//SKIPPED
