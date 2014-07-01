package zdd.annotations.example;

import zdd.annotations.Complaints;
import zdd.annotations.Guilty;

@Guilty({Complaints.NEED_DOCUMENT, Complaints.BAD_NAME_FOR_IMPLEMENTATION})
public class Example {

	@Guilty({Complaints.BAD_NAME_TO_UNDERSTAND})
	private String hoge;
	
	@Deprecated
	@Guilty({Complaints.BAD_NAME_TO_UNDERSTAND})
	public void hoge(){
		
	}
	
	@Guilty({Complaints.BAD_NAME_TO_UNDERSTAND})
	public void foo(){
		hoge();
	}
	
}
