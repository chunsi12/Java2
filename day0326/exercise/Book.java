package day0326.exercise;

public class Book {
	
	private String bookname;
	private int bookprice;
	private double bookDiscountRate;
	
	public Book() {}

	public Book(String bookname, int bookprice, double bookDiscountRate) {
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public double getDiscountBookPrice() {
		return bookprice * (1 - bookDiscountRate * 0.01); 
		
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}

	@Override
	public String toString() {
		return bookname+ "\t" + bookprice + "\t"+ bookDiscountRate 
				+ "%\t" + getDiscountBookPrice() + "원";
				
	}
	
	
	
	
	
	
	
 
}
