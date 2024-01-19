package garage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Car kelly = new Car("Purple", "Ford", "Small", true);
		// kelly.print();

		Plane vulcan = new Plane("Green", "RAF", "Big", true);
		// vulcan.print();

		Boat iona = new Boat("White", "P&O", "Massive", false);
		// iona.print();

		Car henners = new Car("Black", "Ford", "Medium", true);
		// henners.print();

		Vehicle barbie = new Car("Pink", "Mattel", "Tiny", false);
		Vehicle barbie2 = new Car("Pink", "Mattel", "Tiny", false);

		Vehicle[] vehicles = { kelly, vulcan, iona, henners, barbie };
		for (Vehicle vehicle : vehicles) {
			// vehicle.print();
		}

		Garage myGarage = new Garage();
		myGarage.park(new Car("Green", "Volvo", "Big", false));
		myGarage.park(new Plane("Yellow", "NATO", "Massive", true));
		myGarage.park(new Boat());
		myGarage.park(barbie);
		myGarage.park(barbie2);
		myGarage.park(kelly);
		myGarage.park(iona);
		myGarage.park(vulcan);
		myGarage.park(henners);
		// myGarage.print();
		myGarage.sell(barbie2);

		// myGarage.print();
		// System.out.println(barbie.equals(barbie2));

		// System.out.println(kelly.toString());
		// System.out.println(kelly);
		// System.out.println(new Plane());
		// System.out.println(barbie2);
		// System.out.println(myGarage);

		// List<Vehicle> vroom = List.of(barbie, vulcan, iona);

		// for (Vehicle v : vroom) {
		// System.out.println(v.calcBill());
		// }
		// myGarage.fix();

		List<Vehicle> vroom = new ArrayList<>();
		vroom.add(kelly);
		vroom.add(barbie);
		vroom.add(henners);
		vroom.add(iona);
		vroom.add(vulcan);
		System.out.println(vroom);
		Collections.sort(vroom);
		System.out.println(vroom);

	}

}