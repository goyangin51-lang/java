package remotecontrol;

public class Television implements Remotecontrol{
	int volume;
	
	public void TurnOn() {
		System.out.println("Turn on TV");
		
	}
	
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("Tv volume : " + volume);
		
	}

}
