package com.abstractexample.java;

public abstract class Item {
	private int id_no;
	private String title;
	private int copies;

	public void print() {
		System.out.println("Title: " + title);
		System.out.println("ID: " + id_no);
		System.out.println("Number of copies: " + copies);

	}

	public abstract void checkIn();

	public abstract void checkOut();

	public void addItem(int id_no, String title, int copies) {
		setId_no(id_no);
		setTitle(title);
		setCopies(copies);

	}

	public Item() {
		id_no = 0;
		title = " ";
		copies = 0;
	}

	public Item(int id_no, String title, int copies) {
		super();
		this.id_no = id_no;
		this.title = title;
		this.copies = copies;

	}

	public int getId_no() {
		return id_no;
	}

	public void setId_no(int id_no) {
		this.id_no = id_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Item [id_no=" + id_no + ", title=" + title + ", copies=" + copies + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Item otherItem = (Item) obj;
		return id_no == otherItem.id_no && title == otherItem.title && copies == otherItem.copies;
	}

	public void addItem() {
		copies++;
	}

}
