/*Create a method which accepts an array of integer elements
 *  and return the second smallest element in the array
 */
package com.array.programs;

public class SecondSmallestElecementArray {

	public static void acceptArray() {
		// TODO Auto-generated method stub

		int temp;
		int arr[] = { 5, 1, 6, 7, 3 };

		// int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// if(temp==temp)

			}
		}
		System.out.println(arr[1]);
	}

	public static void main(String[] args) {
		SecondSmallestElecementArray.acceptArray();
	}// TODO Auto-generated method stub
}
