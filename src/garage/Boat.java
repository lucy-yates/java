package garage;

public class Boat extends Vehicle {

	public Boat() {
	}

	public Boat(String colour, String brand, String size) {
		setColour(colour);
		setBrand(brand);
		setSize(size);
	}

	public void honk() {
		System.out.println("honk");
	}

}