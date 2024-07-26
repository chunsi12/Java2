package day0325;

public class Phone {
	String tel;
	String model;
	String color;
	
	void receive(String tel) {
		System.out.println(tel+"으로부터 전화를 받습니다.");
	}
	void send(String tel) {
		System.out.println(tel+"에게 전화를 겁니다.");
	}
	void hangUP() {
		System.out.println("전화를 끊습니다");
	}
		
		
	}


