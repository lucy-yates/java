package garage;

public class Boat extends Vehicle {
	private boolean sink;

	public Boat() {
		super();
	}

	public Boat(String colour, String brand, String size, boolean sink) {
		super(colour, brand, size);
		this.sink = sink;
	}

	public void honk() {
		System.out.println("honk");
	}

	public boolean hasSink() {
		return sink;
	}

	public void setFloat(boolean sink) {
		this.sink = sink;
	}

	@Override
	public int calcBill() {
		return 1000;
	}

	// @Override
	// public void print() {
	// System.out.println("Colour: " + this.getColour());
	// System.out.println("Brand: " + this.getBrand());
	// System.out.println("Size: " + this.getSize());
	// System.out.println("Sinks?: " + this.sink);
	// }
}