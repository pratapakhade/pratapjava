package com.abstractexample.java;

public class Book extends WrittenItem {
	int copies;

	// Book b1=new Book() ;
	public Book() {
		super();
	}

	public void display() {
		System.out.println("Item [id_no=" + getId_no() + ", title=" + getTitle() + ", copies=" + getCopies()
				+ ",auther= " + getAuthor() + "]");

		// b1.checkOut();
	}
	/*
	 * public void display1() {
	 * 
	 * b.checkIn(); // b1.checkOut(); }
	 * 
	 * public void display2() { checkOut(); // b1.checkOut(); }
	 */

	@Override
	public int getId_no() {
		// TODO Auto-generated method stub
		return super.getId_no();
	}

	@Override
	public void checkIn() {
		copies = getCopies();

		int copies1 = copies + 1;
		System.out.println("After check In " + copies1);
	}

	@Override
	public void checkOut() {
		copies = getCopies();

		int copies2 = copies - 1;
		System.out.println("After check Out " + copies2);
	}

	@Override
	public void setId_no(int id_no) {
		// TODO Auto-generated method stub
		super.setId_no(id_no);
	}

	@Override
	public int getCopies() {
		// TODO Auto-generated method stub
		return super.getCopies();
	}

	@Override
	public void setCopies(int copies) {
		// TODO Auto-generated method stub
		super.setCopies(copies);
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return super.getAuthor();
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		super.setAuthor(author);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}