package zdd.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({
	ElementType.TYPE, 
	ElementType.FIELD, 
	ElementType.CONSTRUCTOR,
	ElementType.METHOD, 
	ElementType.PARAMETER, 
	ElementType.LOCAL_VARIABLE}
)
public @interface Guilty {
	public Culpability[] value();
}
