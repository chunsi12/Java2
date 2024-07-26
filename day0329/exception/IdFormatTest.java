package day0329.exception;

import java.util.Scanner;

public class IdFormatTest {
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws IdFormatException {
		if(userId == null) {
			throw new IdFormatException("아이디는 null일 수 없습니다.");
		}else if(userId.length() < 5 || userId.length() > 10) {
			throw new IdFormatException("아이디는 5자이상 10자 이하로 작성하세요.");
		}
		this.userId = userId;
	}

	public static void main(String[] args) {
		IdFormatTest idt = new IdFormatTest();
		Scanner scanner = new Scanner(System.in);
		
		while(idt.getUserId() == null) {
			System.out.print("저장할 id값을 입력하세요.");
			String id = scanner.next();
			
		try {	
			idt.setUserId(id);
			System.out.println("저장되었습니다."+idt.getUserId());
		}catch(IdFormatException e) {
			System.out.println(e.getMessage());
		}	
	}
	}
}


