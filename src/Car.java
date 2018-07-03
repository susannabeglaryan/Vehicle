
public class Car extends Vehicle {

	private boolean isManual;

	public Car() {
		super();
	}

	public Car(boolean isAutomatic, boolean isNew, String color, double weight, double length) {
		super(isNew, color, weight, length);
		this.isManual = isAutomatic;
	}
	
	public boolean isAutomatic() {
		return isManual;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isManual = isAutomatic;
	}
}
