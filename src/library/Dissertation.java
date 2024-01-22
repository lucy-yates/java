package library;

public class Dissertation extends Item {
	private boolean awardWinning;

	public Dissertation() {
		super();
	}

	public Dissertation(String title, String author, int date, boolean awardWinning) {
		super(title, author, date);
		this.awardWinning = awardWinning;
	}

	public boolean hasAwardWinning() {
		return awardWinning;
	}

	public void setAwardWinning(boolean awardWinning) {
		this.awardWinning = awardWinning;
	}

	// @Override
	// public void print() {
	// System.out.println("Title: " + this.getTitle());
	// System.out.println("Author: " + this.getAuthor());
	// System.out.println("Publication Date: " + this.getDate());
	// System.out.println("Award Winning?: " + this.awardWinning);
	// }

	@Override
	public int calcFee() {
		return 10000;
	}
}