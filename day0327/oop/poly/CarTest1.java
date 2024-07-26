package day0327.oop.poly;

public class CarTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe;
		car.drive();
		//car.water();//에러가 왜  나는지?
		
		fe2 = (FireEngine)car; //에러 수정
		fe2.drive();
		fe2.water();

	}

}
