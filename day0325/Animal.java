package day0325;

public class Animal {
	
	String name;
	String breeds;
	double weight; 
	
	public Animal(String name, String breeds, double weight) {
		this.name =name;
		this.breeds = breeds;
		this.weight = weight;
	}

	void eat () {
		System.out.println("먹이를 먹는다.");
	}

}
