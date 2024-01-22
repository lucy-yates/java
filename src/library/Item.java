package library;

import java.util.Objects;

public abstract class Item implements Comparable<Item> {

	private static int itemCount = 1;
	private int Id;

	private String title;

	private String author;

	private int date;

	private boolean checkedIn;

	public Item() {
		this.Id = itemCount++;
		this.checkedIn = true;
	}

	public Item(String title, String author, int date) {
		super();
		this.title = title;
		this.author = author;
		this.date = date;
		this.Id = itemCount++;
		this.checkedIn = true;
	}

	// public void print() {
	// System.out.println("Title: " + this.getTitle());
	// System.out.println("Author: " + this.getAuthor());
	// System.out.println("Publication Date: " + this.getDate());
	// }

	public int getId() {
		return Id;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public boolean setCheckedIn(boolean checkedIn) {
		return this.checkedIn = checkedIn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String Title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public abstract int calcFee();

	@Override
	public String toString() {
		return "Item [Title=" + title + ", Author=" + author + ", Date=" + date + ", ID=" + Id + ", Checked in?  "
				+ checkedIn + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(title, other.title) && Objects.equals(author, other.author)
				&& Objects.equals(date, other.date);
	}

	@Override
	public int compareTo(Item o) {
		return this.author.compareTo(o.author) * -1;
	}

}