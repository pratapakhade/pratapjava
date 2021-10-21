
package com.java.program;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Tokenizer {

	public static void main(String[] args) {
		int n = 0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		
		String s = sc.nextLine(); // taken input as a string example-integer
        StringTokenizer st = new StringTokenizer(s);// create object of StringTokenizer // StringTokenizer- Its an inbuilt class // dividation of string happen
        while (st.hasMoreTokens()) {  // for checking string we use this method - in this program it check 10 after that anything is remaining there
            String temp = st.nextToken();
            n = Integer.parseInt(temp); // convert string to integer
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();

	}

}
