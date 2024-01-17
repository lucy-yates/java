package garage;

public class Car extends Vehicle {
	private boolean boot;

	public Car() {
		super();
	}

	public Car(String colour, String brand, String size, boolean boot) {
		super(colour, brand, size);
		this.boot = boot;
	}

	public void vroom() {
		System.out.println("vroom");
	}

	public boolean hasBoot() {
		return bigboot;
	}

	public void setBoot(boolean boot) {
		this.boot = boot;
	}

	@Override
	public void print() {
		System.out.println("Colour: " + this.getColour());
		System.out.println("Brand: " + this.getBrand());
		System.out.println("Size: " + this.getSize());
		System.out.println("Boot: " + this.boot);
	}
}