package com.java.account;

public class current extends Account {

	double overdraft_limit;

	@Override
	public void withdrow(double overdraft_limit) {
		if (overdraft_limit < 500) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
