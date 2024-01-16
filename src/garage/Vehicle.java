package garage;

public class Vehicle {

	private String colour;

	private String brand;

	private String size;

	public Vehicle() {
		// default constructor
	}

	public Vehicle(String colour, String brand, String size) {
		super();
		this.colour = colour;
		this.brand = brand;
		this.size = size;
	}

	public void print() {
		System.out.println("Colour: " + this.colour);
		System.out.println("Brand: " + this.brand);
		System.out.println("Size: " + this.size);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}