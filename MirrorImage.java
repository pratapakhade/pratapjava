package com.java.program;

import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String s = sc.nextLine();
	
		String s1="|";
		//System.out.println(s.concat(s1));
		String s2=(s.concat(s1));
		StringBuffer sb = new StringBuffer(s.concat(s1));
		
		//System.out.println(sb.reverse());
		String str1 = new String (sb.reverse());
		//System.out.println(str1+"|");
		System.out.println(s2.concat(str1));

	}

}
