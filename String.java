package com.DStringArray;

public class S {
	
	String[] stringOperations(String array[])
	{
		
		int size = array.length;  
		//logic for sorting   
		for(int i = 0; i<size-1; i++)   
			{  
			for (int j = i+1; j<size; j++)   
			{    
				if(array[i].compareTo(array[j])>0)   
				{  
					String temp = array[i];  
					array[i] = array[j];  
					array[j] = temp;  
				}  
			}  
			}
		
		 if(size%2==0)
		 {
			 for (int i=0; i<size/2; i++)
			 {
				 array[i]=array[i].toUpperCase();
			 }
			 for (int i=size/2; i<size; i++)
			 {
				 array[i]=array[i].toLowerCase();
			 }
		 }
		 else
		 {
			 for (int i=0; i<(size/2)+1; i++)
			 {
				 array[i]=array[i].toUpperCase();
			 }
			 for (int i=(size/2)+1; i<size; i++)
			 {
				 array[i]=array[i].toLowerCase();
			 }
		 }
		return array; 
		
	}
	
}
