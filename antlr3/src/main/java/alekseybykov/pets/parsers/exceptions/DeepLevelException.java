package alekseybykov.pets.parsers.exceptions;

/**
 * @author bykov.alexey
 * @since 08.01.2024
 */
public class DeepLevelException extends RuntimeException {

	public static DeepLevelException unknownLevel() {
		return new DeepLevelException("Указан не поддерживаемый уровень.");
	}

	private DeepLevelException(String message) {
		super(message);
	}
}
