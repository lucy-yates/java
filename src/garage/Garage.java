package garage;

import java.util.ArrayList;

public class Garage {
	;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	public void park(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void sell(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void print() {
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}
	}

}
