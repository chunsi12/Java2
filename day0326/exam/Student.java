package day0326.exam;

public class Student extends Person {
	
	int id;

	public Student() {}
	public Student(String name, String gender, int id) {
		super(name, gender);
		this.id = id;
	}
	@Override
	public String toString() {
		return id+"번 "+ super.toString() + "\n"; 
	}
	

	
}
