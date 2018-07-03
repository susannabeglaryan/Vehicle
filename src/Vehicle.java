
public abstract class Vehicle {

	protected boolean isNew;
	protected String color;
	protected double weight;
	protected double length;

	public Vehicle() {
		super();
	}

	public Vehicle(boolean isNew, String color, double weight, double length) {
		super();
		this.isNew = isNew;
		this.color = color;
		this.weight = weight;
		this.length = length;
	}

	public double calcWeight() {
		return this.weight;
	}

	public double calcLength() {
		return this.length;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
