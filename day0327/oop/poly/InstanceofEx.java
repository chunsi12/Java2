package day0327.oop.poly;

public class InstanceofEx {
	public static void method(Object obj) {//모든 타입의 객체를 받아올 수 있다.
		if(obj instanceof Car) {//전달받은 객체가 Car객체거나 Car자손객체
			((Car)obj).drive();//Car객체에 있는 모든 멤버를 사용할 수 있ㄷ로고 Car 타입으로 변환
			System.out.println("Object -> Car");
			}
		if(obj instanceof String) {
			char c = ((String)obj).charAt(0);
			System.out.println("첫번째 글자 : "+c);
			System.out.println("Object -> String");
		}
	}

	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		Car car = new Car();
		
		method(car);
		method("JAVA");
		
		if(fe instanceof Car) {
			Car c1 = (Car)fe;
			System.out.println("Car타입 변환 가능");
		}
		if(car instanceof FireEngine) {
			FireEngine fe1 = (FireEngine)car;
			System.out.println("FireEngine타입 변환 가능");
		}else {
			System.out.println("FireEngine타입 변환 불가능");
		}

	}

}
