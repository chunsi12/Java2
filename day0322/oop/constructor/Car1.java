package day0322.oop.constructor;

public class Car1 {
		
		String model;
		String color;
		int door;
		
		//기본 생성자
		Car1(){}
		//매개변수 있는 생성자
		Car1(String m, String c, int d){
			model = m;
			color = c;
			door = d;
		} 
		void printCar(){
			System.out.println("model : "+model+" color : "+color+" door : "+door);
		}

}
