package day0328.com.volume;

public class Speaker implements Volume {
	
    int volLevel;
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
	
		if(volLevel > 100) {
			volLevel = 100;
		}
		System.out.println("Speaker볼륨 올립니다."+volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		
		if(volLevel < 0) {
			volLevel = 0;
		}
		System.out.println("Speaker볼륨 내립니다."+volLevel);
		
	}
}
