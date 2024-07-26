package day0322.oop.constructor;

public class CarTest {

	public static void main(String[] args) {
		// 기본 생서자로 생성
		Car1 c1 = new Car1();
		c1.model = "포르쉐";
		c1.color = "red";
		c1.door = 2;
		
		c1.printCar();
		//매개변수 있는 생성자로 생성
		Car1 c2 = new Car1("람보르기니", "yellow", 4);
		c2.printCar();

	}

}
