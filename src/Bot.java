
public class Bot extends Vehicle {

	private boolean hasSpeaker;

	public Bot() {
		super();
	}

	public Bot(boolean isNew, String color, double weight, double length, boolean hasSpeaker) {
		super(isNew, color, weight, length);
		this.hasSpeaker = hasSpeaker;
	}

	public boolean isHasSpeaker() {
		return hasSpeaker;
	}

	public void setHasSpeaker(boolean hasSpeaker) {
		this.hasSpeaker = hasSpeaker;
	}
	
}
