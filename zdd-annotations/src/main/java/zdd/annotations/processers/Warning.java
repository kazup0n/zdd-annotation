package zdd.annotations.processers;

import zdd.annotations.Culpability;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;

public class Warning {
	/**
	 * ファイル名。
	 */
	private String filename;
	/**
	 * 行数
	 */
	private String line;
	
	private Culpability[] crime;
	/**
	 * ワーニングの対象。
	 */
	private String targettype;
	/**
	 * 対象の名前。
	 */
	private String targetname;
	/**
	 * クラス名。
	 */
	private String classname;
	/**
	 * メソッド名。
	 */
	private String methodname;
	
	
	static Warning createInstance(Element element){
		Warning warn = new Warning();
		
		warn.setTargetname(element.getSimpleName().toString());
		warn.setTargettype(element.getKind().toString());
		
		Element parent = element.getEnclosingElement();
		if(parent == null){
			warn.setClassname(element.getSimpleName().toString());
			return warn;
		}
		
		while(true){
			if(parent.getKind() == ElementKind.METHOD){
				warn.setMethodname(parent.getSimpleName().toString());
			}
			if(parent.getEnclosingElement() == null){
				break;
			}else{
				parent = parent.getEnclosingElement();
			}
		}
		
		warn.setClassname(parent.getSimpleName().toString());
		return warn;
	}
	
	
	
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public Culpability[] getCrime() {
		return crime;
	}
	public void setCrime(Culpability[] crime) {
		this.crime = crime;
	}
	public String getTargettype() {
		return targettype;
	}
	public void setTargettype(String targettype) {
		this.targettype = targettype;
	}
	public String getTargetname() {
		return targetname;
	}
	public void setTargetname(String targetname) {
		this.targetname = targetname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getMethodname() {
		return methodname;
	}
	public void setMethodname(String methodname) {
		this.methodname = methodname;
	}
	
}
