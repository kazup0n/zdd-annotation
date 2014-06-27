package zdd.annotations.example;

import zdd.annotations.Culpability;
import zdd.annotations.Guilty;

@Guilty({Culpability.NEED_DOCUMENT, Culpability.BAD_NAME_FOR_IMPLEMENTATION})
public class Example {

	@Guilty({Culpability.BAD_NAME_TO_UNDERSTAND})
	private String hoge;
}
