package day0328.com.volume;

public class Radio implements Volume {
	
    int volLevel;
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("Radio볼륨 올립니다."+volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("Radio볼륨 내립니다."+volLevel);
	}
}

