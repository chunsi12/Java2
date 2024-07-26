package day0326.exam;

abstract class A{//추상 클래스
	abstract void move();//메서드
}
class B extends A{

	@Override
	void move() {
		System.out.println("B에서 오버라이딩 함");
		
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		//A a = new A();
		B b = new B();
		b.move();

	}

}
