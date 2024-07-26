package day0325;
class Parent {int x = 10;}
class Child extends Parent{
	void method() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class ChildMain {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
