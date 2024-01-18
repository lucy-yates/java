package garage;

import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(colour, other.colour)
				&& Objects.equals(size, other.size);
	}

}