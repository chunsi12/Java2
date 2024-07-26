package day0326.exam;

public class OrderMain {

	public static void main(String[] args) {
		OrderVo order1 = new OrderVo("규카츠",1);
		System.out.println(order1);
		
		order1.setQuantity(3);
		System.out.println(order1);
		
//		order1.setFood("김치볶음밥");
	//	order1.food = "김치볶음밥";
		
	}

}
