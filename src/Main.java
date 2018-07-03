
public class Main {

	public static void main(String[] args) {

		Car car = new Car(true, false, "Black", 1000, 4.3);
		Truck truck = new Truck(false, "Blue", 7000, 13.2);
		Bot bot = new Bot(true, "White", 1300.45, 3, true);

		// Truck's parameters when trailer is not attached
		System.out.println("Truck's length and weight when trailer is not attached\n" + truck.calcLength() + ", "
				+ truck.calcWeight());

		truck.attacheTrailer(5, 2000);

		// Truck's parameters when trailer is attached
		System.out.println("Truck's length and weight when trailer is attached\n" + truck.calcLength() + ", "
				+ truck.calcWeight());

		truck.deattacheTrailer();

		// Truck's parameters after deattaching trailer
		System.out.println("Truck's length and weight after deattaching trailer\n" + truck.calcLength() + ", "
				+ truck.calcWeight());

		System.out.println("\nCar's length and weight\n" + car.calcLength() + ", " + car.calcWeight());
		System.out.println("\nBot's length and weight\n" + bot.calcLength() + ", " + bot.calcWeight());

	}

}
