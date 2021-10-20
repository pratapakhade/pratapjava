package com.array.programs;

public class MinValue {

			 public static void main(String[] args) {
				// TODO Auto-generated method stub
				
                 int arr[] = { 10, 40, 60, 30};
						int smallest = arr[0];
						

						for (int i=1; i<arr.length; i++) {
							
						if (arr[i]<smallest)
						{
							smallest = arr[i];
							//System.out.println(arr[i]);
						}
						}
						System.out.println(smallest);
						// TODO Auto-generated method stub

					}

}
