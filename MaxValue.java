package com.array.programs;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		



				int arr[] = { 10, 40, 60, 30};
				int largest = arr[0];
				

				for (int i=1; i<arr.length; i++) {
					
				if (arr[i]>largest)
				{
					largest = arr[i];
					//System.out.println(arr[i]);
				}
				}
				System.out.println(largest);
				// TODO Auto-generated method stub

			}

		

	}


