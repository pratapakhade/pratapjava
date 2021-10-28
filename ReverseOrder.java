package com.java.collection;

import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseOrder {

	public static Integer[] getSorted(TreeSet<Integer> arr1) {
		int size = arr1.size();
		Integer arr[] = new Integer[size];
		arr = arr1.toArray(arr);

		for (int i = 0; i < size; i++) {
			String val = String.valueOf(arr[i]);

			// reverse method available in StringBuilder thats why we use here StringBuilder

			String rev = new StringBuilder(val).reverse().toString();
			arr[i] = Integer.parseInt(rev);
		}
		// for sorting
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {

		TreeSet<Integer> arr1 = new TreeSet<>();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			arr1.add(number);
		}
		int size = arr1.size();
		Integer result[] = getSorted(arr1);

		System.out.println("After Reversing: ");
		for (int i : result)
			System.out.print(i + "  ");

	}

}
