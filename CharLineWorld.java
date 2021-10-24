/*: Write a Java program that displays the number of characters, lines and words in a text? */
package com.java.program;

import java.io.*;
import java.io.FileInputStream;

public class CharLineWorld {

	public static void main(String[] args) throws Exception {
		int ccnt = 0, lcnt = 1, wcnt = 1, c;
		FileInputStream fin = new FileInputStream("D:\\smitali.txt");
		while ((c = fin.read()) != -1) {
			ccnt++;
			if (c == 32 || c == 13)
				wcnt++;
			if (c == 13)
				lcnt++;
		}

		System.out.println("Number of Characters are:" + ccnt);
		System.out.println("Number of Words are " + wcnt);
		System.out.println("Number of Lines are " + lcnt);
	}

}

/*
 * 
 * public static void main(String args[]){ try{ FileInputStream fin=new
 * FileInputStream("D:\\smitali.txt"); int i=fin.read();
 * System.out.print((char)i);
 * 
 * fin.close(); }catch(Exception e){System.out.println(e);} } }
 */