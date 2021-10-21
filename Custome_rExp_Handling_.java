package com.java.programs;

import java.util.Scanner;

public class Custome_rExp_Handling_ {

	public static void main(String[] args)throws AgeInvalidException {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the employee age:");
		int age=sc.nextInt();
		if(age>15) {
			System.out.println(age);
		}

	}

}
