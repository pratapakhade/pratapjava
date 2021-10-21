package com.java.program;

import java.util.regex.Pattern;

public class RegularExPattern {

	public static void main(String[] args) {
		
		String str1 =  ("flyingreturn.base@airindia.in");
		
		String str2 = ("star.retros@airindia.in");
		
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{3,}@\\w{4,}\\.\\w{1,}",str1));
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{3,}@\\w{4,}\\.\\w{1,}",str2));
		
		
		String str3 = ("1806 233 1407");
		System.out.println(Pattern.matches("\\d{4}\\s\\d{3}\\s\\d{4}",str3));
		
		String str4 = ("020-26231407");
		System.out.println(Pattern.matches("[0-9]{3}-[0-9]{8}",str4));
		
		String str5 = ("0930 hrs - 1730 hrs");
		System.out.println(Pattern.matches("[0-9]{4}\\s\\w{3}\\s-\\s[0-9]{4}\\s\\w{3}",str5));
		
		String str6 = ("MTNL / BSNL");
		System.out.println(Pattern.matches("[A-Z]{4}\\s/\\s[A-Z]{4}",str6));
		
		String str7 = ("+ 91 124 2641407");
		System.out.println(Pattern.matches("+\\s\\d{2}\\s\\d{3}\\s\\d{1,7}",str7));
	

	}

}
