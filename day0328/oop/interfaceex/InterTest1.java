package day0328.oop.interfaceex;

interface A {
	public static final int A = 100;//public static fianl int A  =100;
	public abstract int getA(); // public : 인터페이스에 선언된 추상 메서드는 항상 public 메서드임!
}

public class InterTest1 implements A{
	
	@Override
	public int getA( ) {
		return A;
		} 

	public static void main(String[] args) {
		A a = new InterTest1(); //구현 객체
		System.out.println(A);
		System.out.println(a.getA());//오버라이딩 된 메서드 호출

	}

}
