package day0327.exam;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		Noodle n = new Noodle();
		Rice rc = new Rice();
		
		c.order(n);
		c.order(rc);
		
		System.out.println(c);

	}
}
