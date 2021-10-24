package com.abstractexample.java;

public abstract class MediaItem extends Item
{
	private int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

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
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		super.addItem();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
	
}
