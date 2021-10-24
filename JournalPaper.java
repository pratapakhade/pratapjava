package com.abstractexample.java;

public class JournalPaper extends WrittenItem {
	private int pubYear;

	public JournalPaper(int pubYear) {
		super();
		this.pubYear = pubYear;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	/*
	 * @Override public int getId_no() { // TODO Auto-generated method stub return
	 * super.getId_no(); }
	 * 
	 * @Override public void setId_no(int id_no) { // TODO Auto-generated method
	 * stub super.setId_no(id_no); }
	 * 
	 * @Override public int getCopies() { // TODO Auto-generated method stub return
	 * super.getCopies(); }
	 * 
	 * @Override public void setCopies(int copies) { // TODO Auto-generated method
	 * stub super.setCopies(copies); }
	 * 
	 * @Override public String getAuthor() { // TODO Auto-generated method stub
	 * return super.getAuthor(); }
	 * 
	 * @Override public void setAuthor(String author) { // TODO Auto-generated
	 * method stub super.setAuthor(author); }
	 * 
	 * @Override public String getTitle() { // TODO Auto-generated method stub
	 * return super.getTitle(); }
	 * 
	 * @Override public void setTitle(String title) { // TODO Auto-generated method
	 * stub super.setTitle(title); }
	 * 
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub return super.equals(obj); } public String toString(){ return
	 * super.toString()+" Year published: "+ pubYear; }
	 */

}
