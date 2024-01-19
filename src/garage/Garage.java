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

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

	public void fix() {
		int sum = 0;
		for (Vehicle vehicle : vehicles) {
			System.out.println("Bill: " + vehicle.calcBill());
			sum = sum + vehicle.calcBill();
		}
		System.out.println("Total Bill: " + sum);
	}
}
