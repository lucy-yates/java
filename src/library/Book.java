package library;

public class Book extends Item {
	private boolean limitedEdition;

	public Book() {
		super();
	}

	public Book(String title, String author, int date, boolean limitedEdition) {
		super(title, author, date);
		this.limitedEdition = limitedEdition;
	}

	public boolean hasLimitedEdition() {
		return limitedEdition;
	}

	public void setLimitedEdition(boolean limitedEdition) {
		this.limitedEdition = limitedEdition;
	}

	// @Override
	// public void print() {
	// System.out.println("Title: " + this.getTitle());
	// System.out.println("Author: " + this.getAuthor());
	// System.out.println("Publication Date: " + this.getDate());
	// System.out.println("Limited Edition?: " + this.limitedEdition);
	// }

	@Override
	public int calcFee() {
		return 1000;
	}
}