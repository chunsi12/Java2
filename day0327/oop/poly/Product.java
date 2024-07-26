package day0327.oop.poly;

public class Product {
	int price;
	int bonus;
	
	Product(int price) {
		this.price = price;
		bonus = price / 10;
	}

}
