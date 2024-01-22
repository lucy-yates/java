package library;

public class App {

	public static void main(String[] args) {
		Book flies = new Book("Lord of the Flies", "William Golding", "1954", true);
		// flies.print();

		Magazine hello = new Magazine("Hello", "Rosie Nixon", "1988", false);
		// hello.print();

		Dissertation mine = new Dissertation("An Investigation into Continued Fractions and Their Uses.",
				"Lucy Ubsdell-Yates", "2022", true);
		// mine.print();

		Book kipper = new Book("Kipper", "Mick Inkpen", "1991", false);
		// kipper.print();

		Item franky = new Book("Frankenstein", "Mary Shelley", "1818", true);
		Item franky2 = new Book("Frankenstein", "Mary Shelley", "1818", true);

		Item[] items = { flies, hello, mine, kipper, franky };
		for (Item item : items) {
			// item.print();
		}

		Library myLibrary = new Library();
		myLibrary.checkIn(new Book("Diary of a Wimpy kid", "Jeff Kinney", "2007", false));
		myLibrary.checkIn(new Magazine("Total Carp", "Adam Penning", "1999", true));
		myLibrary.checkIn(new Dissertation());
		myLibrary.checkIn(franky);
		myLibrary.checkIn(franky2);
		myLibrary.checkIn(flies);
		myLibrary.checkIn(hello);
		myLibrary.checkIn(mine);
		myLibrary.checkIn(kipper);
		// System.out.println(myLibrary);
		myLibrary.checkOut(franky2);

		// System.out.println(myLibrary);
		System.out.println(franky.equals(franky2));

		System.out.println(flies.toString());
		System.out.println(flies);
		System.out.println(new Magazine());
		System.out.println(franky2);
		System.out.println(myLibrary);

		// List<Item> read = List.of(franky, mine, hello);

		// for (Item v : read) {
		// System.out.println(v.calcFee());
		// }
		myLibrary.fee();

		// List<Vehicle> vroom = new ArrayList<>();
		// vroom.add(kelly);
		// vroom.add(barbie);
		// vroom.add(henners);
		// vroom.add(iona);
		// vroom.add(vulcan);
		// System.out.println(vroom);
		// Collections.sort(vroom);
		// System.out.println(vroom);

	}

}