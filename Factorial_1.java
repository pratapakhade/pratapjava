/*Write a method to calculate factorial of a number. 
 * Test this method using method reference feature. 
 */
package com.java.lambda;

import java.util.function.Function;

interface Fact {
	void fact(int n);
}

public class Factorial_1 {

	public static int facto(int n) {
		n = 1;

		for (int i = 0; i < n; i++) {
			if (n == 0 || n == 1) {
				return 1;
				// System.out.println(number=1);
			} else
				// System.out.println(number=number*i);

				return n * i;

		}
		return n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact f = Factorial_1::facto; // refference to static method
		f.fact(4);// call method
	}

}
