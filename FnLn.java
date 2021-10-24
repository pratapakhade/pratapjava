/*Write a Java Program to validate the full name of an employee. 
 * Create and throw a user defined exception if firstName and lastName is blank.
 */


package com.java.programs;

import java.util.Scanner;

public class FnLn {

	public static void main(String[] args) throws FnLnInvalidException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fn:");
		String fn = sc.nextLine();
		System.out.println("enter the ln:");
		String ln = sc.nextLine();
		
		if(fn.isEmpty() || ln.isEmpty()) {
		throw	new FnLnInvalidException("first name and last name should be non empty:");
		}
		System.out.println("first name:"+" " +fn+"\n"+"last name:"+" "+
	ln);
	}

}
/*enter the fn:
smitali
enter the ln:
tutare
first name: smitali
last name: tutare
*/