package day0325;

public class PhoneMain {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.receive("010-1111-1234");
	//p1.internet();
		
		SmartPhone p2 = new SmartPhone();
		//super와 sub의 멤버가 합쳐진 객체 생성
		p2.receive("010-1111-1234");
		p2.wifi = true;
		p2.internet();
		System.out.println(p2.toString());

	}

}
