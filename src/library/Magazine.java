package library;

public class Magazine extends Item {
	private boolean educational;

	public Magazine() {
		super();
	}

	public Magazine(String title, String author, String date, boolean educational) {
		super(title, author, date);
		this.educational = educational;
	}

	public boolean hasEducational() {
		return educational;
	}

	public void setEducational(boolean educational) {
		this.educational = educational;
	}

	@Override
	public int calcFee() {
		return 100;
	}

	// @Override
	// public void print() {
	// System.out.println("Title: " + this.getTitle());
	// System.out.println("Author: " + this.getAuthor());
	// System.out.println("Publication Date: " + this.getDate());
	// System.out.println("Educational?: " + this.educational);
	// }

}