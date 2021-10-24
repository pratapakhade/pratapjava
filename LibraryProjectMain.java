package com.abstractexample.java;

import java.util.Scanner;

public class LibraryProjectMain {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("enter id no:");
		int Id_no= sc.nextInt();
		
		System.out.println("enter  copies:");
		int copies= sc.nextInt();
	
		System.out.println("enter Author no:");
		String author= sc1.nextLine();
		System.out.println("enter Title no:");
		String title= sc1.nextLine();
        Book b=new Book();
        CD cd=new CD();
        Book b1=new Book();
        Video v=new Video();
        int pubYear = 0;
		JournalPaper jp=new  JournalPaper( pubYear);
		
		b.setAuthor(author);
		b.setId_no(Id_no);
		b.setTitle(title);
		b.setCopies(copies);
		b.display();
		b.addItem();
	
		
		 b.checkIn();
		 b.checkOut();
	}

}
