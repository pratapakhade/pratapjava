/*Create Person and Account Class as shown below in class diagram.
 *  Ensure minimum balance of INR 500 in a bank account is available.
 */




package com.java.account;

public class Account {
	double amt;
	long accno;
	double baln;
	Person accholder;

	public Account() {

	}

	public Account(double baln, Person accholder) {
		super();

		this.baln = baln;
		this.accholder = accholder;
	}

	public double getBaln() {
		return baln;
	}

	public void setBaln(double baln) {
		this.baln = baln;
	}

	public Person getAccholder() {
		return accholder;
	}

	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}

	long accno() {
		long accno = (long) Math.floor(Math.random() * 9000000L) + 1000000L;
		return accno;

	}

	public void deposite(double amt) {
		baln = getBaln() + amt;
		System.out.println("Account [, " + "accno: " + accno() + "baln=" + getBaln() + ", accholder="
				+ accholder.getAge() + " " + accholder.getName() + "]");

	}

	public void withdrow(double amt) {
		System.out.println("inside withdraw method:");
		baln = getBaln();
		if (baln >= amt) {
			System.out.println("befor :" + baln);
			baln = getBaln() - amt;
			System.out.println("after:" + baln);
		} else {
			System.out.println("unable to withdraw ");
		}

	}

	public double getBalance() {
		return baln;

	}

	@Override
	public String toString() {
		return "Account [ " + " baln=" + baln + ", accholder=" + accholder + "]";
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
