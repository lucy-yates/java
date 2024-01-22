package library;

import java.util.ArrayList;

public class Library {
	;
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Person> people = new ArrayList<>();

	public Library() {
		super();
	}

	public void addItemToLibrary(Item item) {
		items.add(item);
	}

	public void addPersonToLibrary(Person person) {
		people.add(person);
	}

	public boolean removePersonFromLibrary(int Id) {
		for (Person person : people) {
			if (person.getId() == Id) {
				this.people.remove(person);
				return true;
			}

		}
		return false;
	}

	public boolean removeFromLibrary(int Id) {
		for (Item item : items) {
			if (item.getId() == Id) {
				this.items.remove(item);
				return true;
			}

		}
		return false;
	}

	public boolean checkInID(int Id) {
		for (Item item : items) {
			if (item.getId() == Id) {
				return item.setCheckedIn(true);
			}

		}
		return false;
	}

	public boolean checkOutID(int Id) {
		for (Item item : items) {
			if (item.getId() == Id) {
				return item.setCheckedIn(false);
			}

		}
		return true;
	}

	public boolean amendById(int Id, String title, String author, int date) {
		for (Item item : items) {
			if (item.getId() == Id) {
				item.setTitle(title);
				item.setAuthor(author);
				item.setDate(date);
				return true;
			}
		}
		return false;
	}

	public boolean amendPersonById(int Id, String name) {
		for (Person person : people) {
			if (person.getId() == Id) {
				person.setName(name);
				return true;
			}
		}
		return false;
	}

	public void fee() {
		int sum = 0;
		for (Item item : items) {
			// System.out.println("Late fee: " + item.calcFee());
			sum = sum + item.calcFee();
		}
		System.out.println("All late fees: " + sum);
	}

	@Override
	public String toString() {
		return "Library [items=" + items + "people" + people + "]";
	}
}
