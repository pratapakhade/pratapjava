/*create a method that can accept an array of String objects and sort in alphabetical order. The elements in the 
 * left half should be completely in uppercase and the elements in the right half
 *  should be completely in lower case. Return the resulting array.
 */
package com.array.programs;

import java.util.Arrays;

import java.util.Scanner;

public class HalfUpper {
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value: ");
      String str = sc.nextLine();
      
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray); // method to sort charascter array
      System.out.println(new String(charArray));
      
      char[] temp=charArray;
      int size=temp.length%2==0 ? temp.length/2:temp.length/2+1;
      for(int i=0;i<size;i++)
      {
    	
      String Firsthalf=temp[];
      String secondhalf =str.substring(size);
      Firsthalf.toUpperCase();
      System.out.println(Firsthalf);
      /*for(int i=0;i<charArray.length/2;i++)
      {
       String str1;
       str1=.toUpperCase();
       System.out.println(str);
   }*/
}
}
}
