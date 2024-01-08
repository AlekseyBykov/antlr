package alekseybykov.pets.parsers.parser.fixtures;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import alekseybykov.pets.parsers.parser.fixtures.ChildL2_1;

import java.util.*;

/**
 * Test fixture for the {@link JavaClassParser} test.
 *
 * @author bykov.alexey
 * @since 08.01.2024
 */
@Slf4j
public class ChildL3 extends ChildL2_1 {

	private static final String someStringField = "someStringValue";
	private static final int someIntField = 1;

	private final Date someDateField = new Date();

	@Override
	protected String someAnotherMethod() {

		...
//SKIPPED
