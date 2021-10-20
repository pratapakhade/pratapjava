package com.array.programs;

public class AccendingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=0,j=0;
		int arr[]= {6,5,3,1,8};
		for ( i =0; i<arr.length-1; i++)
		{
			for ( j=0; j<arr.length-1-i;j++)
			{
				
				
				if (arr[j]>arr[j+1])
					
				{
					int temp=arr[j];
					arr[j]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
			for ( i=0; i<arr.length; i++) {
				
			
			System.out.println(arr[i]);
		}
}
		
		
	}


