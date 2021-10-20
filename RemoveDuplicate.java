package com.array.programs;

public class RemoveDuplicate {

	 public static int removeDuplicate()
	 {
		 int arr[] = null, n = 0;
		 
		 if(n==0 || n==1)
		 {
			 return n;
			 
		 }
		 
		 
		 int [] temp = new int[n];
		 int j = 0;
		 for (int i= 0; i<n-1; i++)
		 {
			 if(arr[i]!=arr[i+1])
			 {
				 temp[j++]=arr[i];
						 
			 }
		 }
		 temp[j++] = arr[n-1];
		 
		 for(int i=0;i<j;i++) {
			 arr[i]=temp[i];
			 
	 }
		 return j;
	 }

	 
	 public static void main(String[] args)
	 {
		 int arr[] = {10,20,10,30,40,10,50,50,30,40};
		 
		 int length = arr.length;
		 length = removeDuplicate();
		 
		 for(int i=0;i<length;i++)
		 {
			 System.out.println(arr[i]);
			 
		 }
	 }
	 
	 
}
