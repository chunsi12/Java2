package day0326.exercise;

public class Goods {
	
	private String name;
	private int price;
	private int quantity;
	
	public Goods() {}
	public Goods(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
