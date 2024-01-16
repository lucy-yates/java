package garage;

public class Car extends Vehicle {

	public Car() {
	}

	public Car(String colour, String brand, String size) {
		setColour(colour);
		setBrand(brand);
		setSize(size);
	}

	public void vroom() {
		System.out.println("vroom");
	}

}