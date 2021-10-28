/*Write a lambda expression which accepts x and y numbers and return xy.*/
package com.java.lambda;

interface power {

	double power1(double x, double y);
}

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// power p1 = (x, y) -> Math.pow(x, y);
		// System.out.println(p1.power1(5, 2));

		power p1 = (x, y) -> Math.pow(x, y);
		System.out.println(p1.power1(5, 2));
	}

}
