package alekseybykov.pets.parsers.parser.some_package;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * Test fixture for the parser test.
 *
 * @author bykov.alexey
 * @since 04.01.2024
 */
@Slf4j
public class Parent {

	private static final String someStringField = "someStringValue";
	private static final int someIntField = 1;

	private final Date someDateField = new Date();

	@Override
	protected String someAnotherMethod() {

		...
//SKIPPED
