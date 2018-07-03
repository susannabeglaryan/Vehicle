
public class Truck extends Vehicle {

	private Trailer trailer;
	private boolean isTraileAttached = false;

	public Truck() {
		super();
	}

	public Truck(boolean isNew, String color, double weight, double length) {
		super(isNew, color, weight, length);
	}

	public void attacheTrailer(double length, double weight) {
		trailer = new Trailer(length, weight);
		isTraileAttached = true;
	}

	public void deattacheTrailer() {
		trailer = null;
		isTraileAttached = false;
	}

	@Override
	public double calcLength() {
		if (isTraileAttached)
			return (this.length + trailer.getLength());

		return this.length;
	}

	@Override
	public double calcWeight() {
		if (isTraileAttached)
			return (this.weight + trailer.getWeight());

		return this.weight;
	}

}
