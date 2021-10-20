package com.array.programs;

import java.util.Scanner;

public class Remove {
	public static int[] removeDuplicateElements() {

		int arr[] = new int[20];
		int n = 0;
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
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}

	public static void main(String[] args) {

		int number, length;
		int[] arr = new int[20];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of elements you want to store from User:");
		int number = sc.nextInt();
		System.out.println("Enter the elements of the array ");
		
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		length = arr.length;
		a = removeDuplicateElements();
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}

}
