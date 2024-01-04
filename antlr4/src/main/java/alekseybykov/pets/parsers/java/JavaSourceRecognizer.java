package alekseybykov.pets.parsers.java;

import alekseybykov.pets.parsers.antlr4.JavaParser;
import alekseybykov.pets.parsers.models.JavaSource;
import alekseybykov.pets.parsers.antlr4.JavaBaseListener;
import lombok.Getter;

/**
 * @author bykov.alexey
 * @since 24.12.2023
 */
public class JavaSourceRecognizer extends JavaBaseListener {

	@Getter
	private JavaSource javaSource;

	@Override
	public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
		javaSource = new JavaSource();
	}

	@Override
	public void enterClassName(JavaParser.ClassNameContext ctx) {
		javaSource.setClassName(ctx.getText());
	}

	@Override
	public void enterSuperClassName(JavaParser.SuperClassNameContext ctx) {
		javaSource.setParentClassName(ctx.getText());
	}
}
