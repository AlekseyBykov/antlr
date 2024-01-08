package alekseybykov.pets.parsers.model;

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
public class JavaClass {

	private String packageName;

	private List<String> imports = new ArrayList<>();
	private List<String> interfaces = new ArrayList<>();

	private String classSimpleName;
	@Getter(AccessLevel.NONE)
	private String classFullName;

	private String superclassSimpleName;
	@Getter(AccessLevel.NONE)
	private String superclassFullName;

	public String getClassFullName() {
		return packageName + "." + classSimpleName;
	}

	/**
	 * The method evals the full name of the superclass
	 * (includes a package prefix).
	 *
	 * If the superclass name is not specified in the import list,
	 * then the superclass is in the same package as the subclass.
	 *
	 * @return - name with package prefix.
	 */
	public String getSuperclassFullName() {
		if (superclassSimpleName != null) {
			val name = evalByImports();
			return name == null
			       ? evalByCurrentPackage()
			       : name;
		}
		return null;
	}

	public boolean hasParent() {
		return !StringUtils.isEmpty(superclassSimpleName);
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
