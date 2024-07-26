package day0325;

public class Cat extends Animal {
   // 이름(name) 
	//품종 (breeds)
	//무게 (weight)
	//기본생성자 / 이름 품종 무게 초기화 하는 생성자
	//할퀴기 claw "할퀴기" 출력
	//야옹 meow "야옹" 출력
	String name;
	String breeds;
	double weight;
	public Cat() {
	super("나비", "고양이", 0.0);
	}
	
	public Cat (String name, String breeds, double weight) {
		super (name, breeds, weight);

	}
	void claw() {
		System.out.println("할퀴기");
	}
	void meow() {
		System.out.println("야옹");
	}
	//오버라이드 어노테이션
	@Override
	public String toString() {
	return "이름 : "+name+", 품종 : "+breeds+", 무게 : "+weight;
	}
	
 }
