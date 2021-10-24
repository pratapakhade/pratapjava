package com.java.account;

import java.util.Scanner;

public class AccMain {

	long accno;

	public static void main(String[] args) {
		long accno;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user accno");
		accno = sc.nextLong();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter user name");
		String name = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter user amt");
		double amt = sc2.nextInt();

		//System.out.println("enter user baln");
		//double baln = sc2.nextDouble();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("enter user age");
		int age = sc3.nextInt();

		// System.out.println("");
		// name=sc.nextLine();

		AccMain m = new AccMain();
		AccMain m1 = new AccMain();
		Account acc = new Account();
		Account acc1 = new Account();
		
		m.setBaln(acc.baln);
		Person accholder = new Person();
		accholder.setName(accholder.name);
		accholder.setAge(accholder.age);
		acc.accholder = accholder;

		Person accholder1 = new Person();
		accholder1.setName(accholder1.name);
		accholder1.setAge(accholder1.age);

		m1.setAccno(acc1.accno);
		m1.setBaln(acc1.baln);
		
		acc.withdrow(amt);
		 acc.getBalance();
		 acc.deposite(amt);
		 
	}

	private void setBaln(double baln) {
		// TODO Auto-generated method stub

	}

	private void setAccno(long accno2) {
		// TODO Auto-generated method stub

	}

}
