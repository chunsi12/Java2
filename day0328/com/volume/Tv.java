package day0328.com.volume;

public class Tv implements Volume {
	
	int volLevel;
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("Tv볼륨 올립니다"+volLevel);
	}
	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		if(volLevel < 0) {
			volLevel=0;
			}
		System.out.println(getClass().getName()+"볼륨 내립니다"+volLevel);
		}
		
	

}
