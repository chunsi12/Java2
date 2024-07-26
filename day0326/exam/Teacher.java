package day0326.exam;

public class Teacher extends Person {
	
	String subject;
	
	public Teacher() {}
	public Teacher(String name, String gender, String subject) {
		
	super(name, gender);
	this.subject = subject;
	}
	@Override
	public String toString() {
		return name + " "+ subject + " 교사"; 
	}
	

}
