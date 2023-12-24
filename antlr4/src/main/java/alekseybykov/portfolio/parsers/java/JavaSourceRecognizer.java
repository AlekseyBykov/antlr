package alekseybykov.portfolio.parsers.java;

import alekseybykov.portfolio.parsers.antlr4.JavaBaseListener;
import alekseybykov.portfolio.parsers.antlr4.JavaParser;
import alekseybykov.portfolio.parsers.models.JavaSource;
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
