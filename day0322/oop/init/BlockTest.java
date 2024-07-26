package day0322.oop.init;

public class BlockTest {
	
	static {
		System.out.println("static{}");
	}
	{
		System.out.println("instanc{}");
	}
	public BlockTest() {
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		BlockTest bt1 = new BlockTest();
		BlockTest bt2 = new BlockTest();

	}

}
