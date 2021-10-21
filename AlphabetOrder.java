package com.java.program;

public class AlphabetOrder {
	
	public static boolean checkAlphabetic(String input) {
	    for (int i = 0; i != input.length(); ++i) {
	        if (!Character.isLetter(input.charAt(i))) {
	            return false;
	        }
	    }

	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(AlphabetOrder.checkAlphabetic("csa"));

	}

}
