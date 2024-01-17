package garage;

public class App {

	public static void main(String[] args) {
		Car kelly = new Car("Purple", "Ford", "Small", true);
		kelly.print();

		Plane vulcan = new Plane("Green", "RAF", "Big");
		vulcan.print();

		Boat iona = new Boat("White", "P&O", "Massive");
		iona.print();

		Car henners = new Car("Black", "Ford", "Medium", true);
		henners.print();
	}

}