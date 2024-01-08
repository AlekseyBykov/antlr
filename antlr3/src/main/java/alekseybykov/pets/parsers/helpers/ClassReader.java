package alekseybykov.pets.parsers.helpers;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author bykov.alexey
 * @since 04.01.2024
 */
public class ClassReader {

	@SneakyThrows
	public String readByClasspath(Class<?> clazz, String path) {
		InputStream inputStream = clazz.getResourceAsStream(path);
		return read(inputStream);
	}

	@SneakyThrows
	private String read(InputStream inputStream) {
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String stringLine;
			while ((stringLine = br.readLine()) != null) {
				resultStringBuilder
						.append(stringLine)
						.append("\n");
			}
		}
		return resultStringBuilder.toString();
	}
}
