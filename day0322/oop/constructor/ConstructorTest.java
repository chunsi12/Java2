package day0322.oop.constructor;

class Data1{
	int value;
	Data1(){}//기본 생성자 추가
	}
class Data2{
	int value;//인스턴스 변수
	Data2(int x){//생성자
		value = x;
	}
	Data2(){
		value = 10;
	}
}
public class ConstructorTest {
	ConstructorTest(){}//기본 생성자 추가 
	public static void main(String[] args) {
		//Data1 d1 = new Data1();
//		Data2 d2 = new Data2();
		//Data d2 = new Data2(20);

	}

}
