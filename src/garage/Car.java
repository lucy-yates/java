package garage;

public class Car extends Vehicle {

	public Car() {
		super();
	}

	public Car(String colour, String brand, String size) {
		super(colour, brand, size);
		setColour(colour);
		setBrand(brand);
		setSize(size);
	}

	public void vroom() {
		System.out.println("vroom");
	}

}