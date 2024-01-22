package library;

import java.util.ArrayList;

public class Library {
	;
	private ArrayList<Item> items = new ArrayList<>();

	public Library() {
		super();
	}

	public void checkIn(Item item) {
		items.add(item);
	}

	public void checkOut(Item item) {
		items.remove(item);
	}

	@Override
	public String toString() {
		return "Library [items=" + items + "]";
	}

	public void fee() {
		int sum = 0;
		for (Item item : items) {
			// System.out.println("Late fee: " + item.calcFee());
			sum = sum + item.calcFee();
		}
		System.out.println("All late fees: " + sum);
	}
}
