package day0326.exam;

public class ClassMain {

	public static void main(String[] args) {
		
		Teacher t = new Teacher("김자바","남","PYTHON");
		Student[] stus = {new Student("김메리", "여",1),
				new Student("김메리", "여",2),
				new Student("최자바", "남",3),
				new Student("윤오라클", "남",4),
				new Student("김파이", "여",5)}; 
		Class c1 = new Class(1,1,stus,t);
		
		System.out.println(c1);

	}

}
