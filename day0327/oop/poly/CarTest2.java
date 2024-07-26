package day0327.oop.poly;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		FireEngine fe = null;
		
		fe = (FireEngine)car;// error 객체가 서로 다름
		
		fe.drive();
	}

}
