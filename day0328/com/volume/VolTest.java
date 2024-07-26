package day0328.com.volume;

public class VolTest {

	public static void main(String[] args) {
		Volume[] v = {new Speaker(), new Radio(), new Tv()};
		for(int i = 0; i < v.length; i++) {
			for(int j = 1; j<=3; j++) {
				v[i].volumeUp(200); 	
				}
			for(int j = 1; j<=3; j++) {
				v[j].volumeDown(300);
			}
			}
		}
 		

	}


