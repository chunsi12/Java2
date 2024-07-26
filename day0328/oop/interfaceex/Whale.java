package day0328.oop.interfaceex;

public class Whale extends Fish implements Mammal {

	@Override
	public void bear() {
		System.out.println("고래는 새끼를 낳습니다.");
		
	}

	@Override
	public void swim() {
		System.out.println("고래는 바다에서 수영합니다.");
		
	}
	
	
	

}
