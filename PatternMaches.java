package com.java.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMaches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "0930 hrs - 1730 hrs";

		String pattern = "(\\d{4})\\s\\w{3}\\s\\-\\s(\\d{4})\\s\\w{3}";

		Pattern P1 = Pattern.compile(pattern);
		Matcher M1 = P1.matcher(str1);

		System.out.println(M1.matches());
		System.out.println(M1.group(0));
		System.out.println(M1.group(1));
		System.out.println(M1.group(2));

		if (M1.group(1).equals("0930")) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}

		if (M1.group(2).equals("1730")) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}
}
