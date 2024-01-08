package alekseybykov.pets.parsers.analyzer.finders;

import alekseybykov.pets.parsers.analyzer.consts.DeepLevel;
import alekseybykov.pets.parsers.exceptions.DeepLevelException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author bykov.alexey
 * @since 08.01.2024
 */
public class SubclassFindersPool {

	private final Map<DeepLevel, SubclassFinder> finders = new HashMap<DeepLevel, SubclassFinder>() {{
		put(DeepLevel.L1, new L1SubclassFinder());
		put(DeepLevel.L2, new L2SubclassFinder());
		put(DeepLevel.L3, new L3SubclassFinder());
	}};

	public SubclassFinder getFinderByLevel(DeepLevel level) {
		return Optional.ofNullable(finders.get(level))
				.orElseThrow(DeepLevelException::unknownLevel);
	}
}
