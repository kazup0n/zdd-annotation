package zdd.annotations.processers;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

import zdd.annotations.Complaints;
import zdd.annotations.Guilty;

@SuppressWarnings("restriction")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedAnnotationTypes("zdd.annotations.Guilty")
public class GuiltyAnnotationProcesser extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
			RoundEnvironment roundEnv) {
		for (TypeElement annotation : annotations) {
			for (Element element : roundEnv.getElementsAnnotatedWith(annotation)) {
				Guilty guilty = element.getAnnotation(Guilty.class);
				for(Complaints culp: guilty.value()){
					Messager messager = processingEnv.getMessager();
					messager.printMessage(Diagnostic.Kind.WARNING, culp.warningMessage(), element);
				}
			}
		}
		return true;
	}

}
