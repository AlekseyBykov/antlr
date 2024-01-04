package alekseybykov.pets.parsers.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.val;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Bykov
 * @since 24.12.2023
 */
@Data
public class JavaSource {

	private String packageName;

	private List<String> imports = new ArrayList<>();
	private List<String> interfaces = new ArrayList<>();

	private String classSimpleName;
	@Getter(AccessLevel.NONE)
	private String classFullName;

	private String superclassSimpleName;
	@Getter(AccessLevel.NONE)
	private String superclassFullName;

	@Getter(AccessLevel.NONE)
	private boolean leaf;

	public boolean isLeaf() {
		return StringUtils.isEmpty(superclassSimpleName);
	}

	public String getClassFullName() {
		return packageName + "." + classSimpleName;
	}

	public String getSuperclassFullName() {
		if (superclassSimpleName != null) {
			val name = evalByImports();
			return name == null
			       ? evalByCurrentPackage()
			       : name;
		}
		return null;
	}

	private String evalByImports() {
		for (val importName : imports) {
			if (StringUtils.contains(importName, superclassSimpleName)) {
				return importName;
			}
		}
		return null;
	}

	private String evalByCurrentPackage() {
		return packageName + "." + superclassSimpleName;
	}
}
