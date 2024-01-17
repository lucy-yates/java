package garage;

public class App {

	public static void main(String[] args) {
		Car kelly = new Car("Purple", "Ford", "Small", true);
		kelly.print();

		Plane vulcan = new Plane("Green", "RAF", "Big", true);
		vulcan.print();

		Boat iona = new Boat("White", "P&O", "Massive", false);
		iona.print();

		Car henners = new Car("Black", "Ford", "Medium", true);
		henners.print();

		Vehicle pinkmobile = new Car("Pink", "Mattel", "Tiny", false);

		Vehicle[] vehicles = { kelly, vulcan, iona, henners, pinkmobile };
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}
	}

}