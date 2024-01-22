package library;

public class Person {

	private static int itemCount = 1;
	private int Id;
	private String name;

	public Person() {
		this.Id = itemCount++;
	}

	public Person(String name) {
		super();
		this.name = name;
		this.Id = itemCount++;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + "]";
	}

}