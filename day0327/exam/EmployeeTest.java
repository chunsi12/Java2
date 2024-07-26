package day0327.exam;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new Employee("A1892", "이진선", "AI개발부", "사원",3500),
				new Employee("B8077", "심용권", "web개발부", "부장",7000),
				new Employee("F5691", "신지영", "총괄개발부", "전무",9000),
		};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사원번호 > ");
		String input = scanner.next();
		
		int count = 0 ; //찾은 사원 수 
		for(Employee e : emps) {
			if(input.equals(e.getNo())) {
				System.out.println(e);
				count++;
				break;
			}
		}
		if(count == 0 ){
			 System.out.println("검색한 사원 없습니다.");
		}

	}

}
