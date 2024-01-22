package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Book flies = new Book("Lord of the Flies", "William Golding", 1954, true);
		// flies.print();
		Magazine hello = new Magazine("Hello", "Rosie Nixon", 1988, false);
		// hello.print();
		Dissertation mine = new Dissertation("An Investigation into Continued Fractions and Their Uses.",
				"Lucy Ubsdell-Yates", 2022, true);
		// mine.print();
		Book kipper = new Book("Kipper", "Mick Inkpen", 1991, false);
		// kipper.print();

		Item franky = new Book("Frankenstein", "Mary Shelley", 1818, true);
		Item franky2 = new Book("Frankenstein", "Mary Shelley", 1818, true);

		Item[] items = { flies, hello, mine, kipper, franky };
		for (Item item : items) {
			// item.print();
		}

		Library myLibrary = new Library();
		myLibrary.addLibrary(new Book("Diary of a Wimpy kid", "Jeff Kinney", 2007, false));
		myLibrary.addLibrary(new Magazine("Total Carp", "Adam Penning", 1999, true));
		myLibrary.addLibrary(new Dissertation());
		myLibrary.addLibrary(franky);
		myLibrary.addLibrary(franky2);
		myLibrary.checkInID(1);
		myLibrary.addLibrary(hello);
		myLibrary.addLibrary(mine);
		myLibrary.addLibrary(kipper);
		// System.out.println(myLibrary);
		myLibrary.checkOutID(6);

		// System.out.println(myLibrary);
		System.out.println(franky.equals(franky2));

		System.out.println(flies.toString());
		System.out.println(flies);
		System.out.println(new Magazine());
		System.out.println(franky2);
		System.out.println(myLibrary);
		System.out.println(franky2);

		// List<Item> read = List.of(franky, mine, hello);

		// for (Item v : read) {
		// System.out.println(v.calcFee());
		// }
		myLibrary.fee();

		List<Item> shh = new ArrayList<>();
		shh.add(flies);
		shh.add(hello);
		shh.add(mine);
		shh.add(kipper);
		shh.add(franky);
		System.out.println(shh);
		Collections.sort(shh);
		System.out.println(shh);

	}

}