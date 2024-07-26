package day0326.exercise;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book ("SQL Plue", 50000,5.0);
		
		Book[] books = { b1,
				new Book("Java", 40000, 3.0),
				new Book("Jsp Servlet", 60000, 6.0)
		};
		System.out.println("책이름\t가격\t할인율\t할인후금액");
		System.out.println("--------------------------------");
		for(Book b : books) {
			System.out.println(b);
		}

	}

}
