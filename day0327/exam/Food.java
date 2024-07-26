package day0327.exam;

public class Food {
	
	private int price;
	private int point;
	
	Food(int price) {
		this.price = price;
		point = price/10;
	}

	public String getName() {
		return "음식이름";
	}

	public int getPrice() {
		return price;
	}

	public int getPoint() {
		return point;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	}
	
	


