package com.array.programs;

import java.util.Arrays;

public class ReverseArraySorting {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 6, 5 };

		// String strArray[] = Arrays.toString(intArray.length);
		String[] strArray = new String[intArray.length];

		for (int i = intArray.length - 1; i >= 0; i--) {
			strArray[i] = String.valueOf(intArray[i]);

			System.out.println(strArray[i]);
			// System.out.println(Arrays.toString(strArray));
		}
		// TODO Auto-generated method stub

		//System.out.println(Arrays.toString(strArray));
		for (String x : strArray) {
			System.out.println(x);
		}
			
	}

}
