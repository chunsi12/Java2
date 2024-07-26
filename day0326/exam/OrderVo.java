package day0326.exam;

public class OrderVo {
	//VO: value object - 값을 표현(저장)하기 위한 객체. 캡슐화 패턴을 적용한다.
	//접근제어자변수선언;
	//생성자;
	//getter/[setter]로 구성됨
	
	private String food;
	private int quantity;
	
	public OrderVo(String food, int quantity) {
		this.food = food;
		this.quantity = quantity;
	}
	//String food
	public String getFood() {
		return food;
	}
	//int quantity
	public int getQuantity() {
		return quantity;
	}
	//int quantity;
	public void setQuantity(int quantity) {
		this.quantity = quantity;	
	}
	@Override
	public String toString() {
		return "OrderVo [food=" + food + ", quantity=" + quantity + "]";
	}
	


	}
	
	
	


