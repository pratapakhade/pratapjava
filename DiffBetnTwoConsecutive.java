package com.java.program;

import java.util.Scanner;


public class DiffBetnTwoConsecutive 
{

	public static void main(String[] args)
	{
		
		
		int i=0, diff,comp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		 i = sc.nextInt() ;

		 String str=Integer.toString(i); 
		 System.out.println(str);
		 
		 
		 for (int x = 0; x < str.length()-1 ; x++) {
			  char  ch = str.charAt(x);  
			    int di = Character.getNumericValue(ch);
			    char ch2 = str.charAt(x + 1);
			    int di2 = Character.getNumericValue(ch2);
			    int diffr = Math.abs(di - di2);
			    System.out.print(diffr);   
			}
		
	}
	}



