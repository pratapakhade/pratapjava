/*Create a method which accepts an integer array and removes all the duplicates
 *  in the array. Return the resulting array in descending order
 */
package com.array.programs;

import java.util.Arrays;
import java.util.Scanner;

class RemoveDuplicateElements1 {

	int[] modifyArray(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1) {
			return arr;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		int[] array1 = new int[j];
		for (int i = 0; i < j; i++) {
			array1[i] = temp[i];
		}
		return array1;
	}

	// class RemoveDuplicateMain {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] array = new int[n];
		int[] array1 = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		RemoveDuplicateElements1 obj = new RemoveDuplicateElements1();
		Arrays.sort(array);
		array1 = obj.modifyArray(array);
		System.out.println("Array elements after removal of duplicates: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}

}
