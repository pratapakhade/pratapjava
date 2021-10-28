/*Write a method to calculate factorial of a number.
 *  Test this method using method reference feature. 
 */
package com.java.lambda;

import java.util.function.Function;//predefine functional interface

public class Factorial {

	public Integer factorial(int n) { // instance method
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		// using lambda
		Factorial cal = new Factorial(); // object creation
		// Function<Integer, Integer> funLambda = (a) -> cal.factorial(a);
		// System.out.println("By Using lambda expression: "+funLambda.apply(4));

		Function<Integer, Integer> fun = cal::factorial;// refference to instance method
		System.out.println("Using   a method References : " + fun.apply(5));

	}

}
