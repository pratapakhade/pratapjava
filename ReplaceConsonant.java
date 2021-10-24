package com.java.program;

public class ReplaceConsonant {

	public static void alterString(String string) {

	}
/*Create a method which accepts a String and replaces all the vowels in the String with the next alphabet. */
	public static void main(String[] args) {

		String string = "Java is High level Programming Language";

		char[] character = string.toCharArray();
		char[] vowel = { 'a', 'e', 'o', 'u', 'i' };
		char[] chara = new char[string.length()];
		string.replace('a', 'b');

		for (int i = 0; i < character.length; i++) {
			for (char j = 0; j < vowel.length; j++) {

				if (character[i] == vowel[j]) {

					char ch = character[i];

					String res = string.replace(character[i], ++ch);

					chara = res.toCharArray();
				}
			}
			System.out.print(chara[i]);
		}
	}

}
