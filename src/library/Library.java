package library;

import java.util.ArrayList;

public class Library {
	;
	private ArrayList<Item> items = new ArrayList<>();

	public Library() {
		super();
	}

	public void addLibrary(Item item) {
		items.add(item);
	}

	public void checkOut(Item item) {
		items.remove(item);
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
		return "Library [items=" + items + "]";
	}
}
