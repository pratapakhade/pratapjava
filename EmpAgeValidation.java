package com.java.programs;

import java.util.Scanner;

public class EmpAgeValidation {
	public void age(int age) throws AgeInvalidException  {
		// int age=0;
		if (age < 15) {
			throw new AgeInvalidException("age should be greater than 15");
		}
		System.out.println(age+ "valid age");
	}

	public static void main(String[] args) throws AgeInvalidException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee age:");
		int age = sc.nextInt();

		EmpAgeValidation a = new EmpAgeValidation();
		a.age(age);
	}

}
