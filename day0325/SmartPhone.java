package day0325;

public class SmartPhone extends Phone {
	
	boolean wifi;
	
	void internet() {
		if(wifi) {
			System.out.println("인터넷 사용");
		}else {
			System.out.println("wifi 연결 안됨");
		}
	}

}
