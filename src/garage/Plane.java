package garage;

public class Plane extends Vehicle {
	private boolean flys;

	public Plane() {
		super();
	}

	public Plane(String colour, String brand, String size, boolean flys) {
		super(colour, brand, size);
		this.flys = flys;
	}

	public void soar() {
		System.out.println("soar");
	}

	public boolean hasFlys() {
		return flys;
	}

	public void setFly(boolean flys) {
		this.flys = flys;
	}

	@Override
	public void print() {
		System.out.println("Colour: " + this.getColour());
		System.out.println("Brand: " + this.getBrand());
		System.out.println("Size: " + this.getSize());
		System.out.println("Flys?: " + this.flys);
	}

}