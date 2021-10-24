package com.abstractexample.java;

public abstract class WrittenItem extends Item
{
	private String author;
	
	
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}

	
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}







	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}







	@Override
	public void addItem(int id_no, String title, int copies) {
		// TODO Auto-generated method stub
		super.addItem(id_no, title, copies);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		super.addItem();
	}

	@Override
	public int getId_no() {
		// TODO Auto-generated method stub
		return super.getId_no();
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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
	
	public boolean equals(Object obj){
		if(obj == null)
		return false;
		WrittenItem otherWrittenItem = (WrittenItem) obj;
		return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
		}
		}


