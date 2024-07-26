package day0322.oop.constructor;

public class Car2 {
	String model;
	String color;
	int door;
	
	public Car2(String model, String color, int door) {
		this.model = model;
		this.color = color;
		this.door = door;
	}



	public Car2() {
		// TODO Auto-generated constructor stub
	}



	void printCar(){
		System.out.println("model : "+model+" color : "+color+" door : "+door);
	}
}


