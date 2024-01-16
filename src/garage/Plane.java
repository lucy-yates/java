package garage;

public class Plane extends Vehicle {
	public Plane() {
	}

	public Plane(String colour, String brand, String size) {
		setColour(colour);
		setBrand(brand);
		setSize(size);
	}

	public void fly() {
		System.out.println("fly");
	}

}