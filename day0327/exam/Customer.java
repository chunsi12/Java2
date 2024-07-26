package day0327.exam;

public class Customer {
	
	private int money = 10000;
	private int point;
	
	public void order(Food f) {
		if(money < f.getPrice()) {
			System.out.println("주문 불가");
			return;
		}
		money -= f.getPrice();
		point += f.getPoint();
		System.out.println(f.getName()+ "을/를 주문하셨습니다.");
	}

	@Override
	public String toString() {
		return "현재남은 돈은" + money + "원 입니다.\n 현재 보너스 점수는 " + point + "점입니다.";
	}
	
		
	}


