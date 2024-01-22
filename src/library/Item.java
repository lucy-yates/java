package library;

import java.util.Objects;

public abstract class Item implements Comparable<Item> {

	// @Override
	// public int compareTo(Vehicle o) {
	// if (id < o.getId()) {
	// return +1;
	// }
	// if (id > o.getId()) {
	// return -1;
	// } else {
	// return 0;
	// }
	// }

	// @Override
	// public int compareTo(Item o) {
	// return this.colour.compareTo(o.colour) * -1;

	// }

	private String title;

	private String author;

	private String date;

	public Item() {

	}

	public Item(String title, String author, String date) {
		super();
		this.title = title;
		this.author = author;
		this.date = date;
	}

	public abstract int calcFee();

	@Override
	public String toString() {
		return "Item [title=" + title + ", author=" + author + ", date=" + date + "]";
	}

	// public void print() {
	// System.out.println("Title: " + this.getTitle());
	// System.out.println("Author: " + this.getAuthor());
	// System.out.println("Publication Date: " + this.getDate());
	// }

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

}