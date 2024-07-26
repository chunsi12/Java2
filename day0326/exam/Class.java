package day0326.exam;

import java.util.Arrays;

public class Class {
	int grade;
	int className;
	
	Student[] students;
	Teacher teacher;
	
	public Class () {}
	public Class(int grade, int className, Student[] students, Teacher teacher) {
		this.grade = grade;
		this.className =  className;
		this.students = students;
		this.teacher = teacher;
		
	}
	@Override
	public String toString() {
		return grade+"학년 " +className+"반 "+ teacher + "\n"+
		Arrays.toString(students);
	}
	
	
	
	
	
	
	

}
