package day0325;

public class Panda extends Animal {
	
	int age;
	public Panda () {
		super (null, "판다",0.0);
	}
	public Panda (int age, String name, String breeds, double weight) {
		super(name, breeds, weight);
		this.age= age;
	}
	void eat() {
		System.out.println("대나무를 먹습니다.");
		
	}			
				@Override
	public String toString() {
		return "Panda [age=" + age + ", name=" + name + ", breeds=" + breeds + ", weight=" + weight + ", toString()="
				+ super.toString() + "]";
	}
				void play () {
			System.out.println("손으로 장남감을 잡고 논다.");
		}
								
}
