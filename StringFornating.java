package com.java.lambda;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

interface sformat {

	String returnExpression(String string);
}

/*interface sformat{
	public String strspace(String s);
}
public class StringFornating {

	public static void main(String[] args, int String) {
		// TODO Auto-generated method stub
		Stream<String> streamOfString =
				  Pattern.compile(" ").splitAsStream("a b c");
	}
}
/*sformat sf=()->" ";
	}

sf.strspace("Pratap");
}*/
/*
 * Stream<String> streamOfString =
  Pattern.compile(", ").splitAsStream("a, b, c");
 */

public class StringFornating {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sformat st = (string) -> {
			// convert string to char to take seperate character
			char characters[] = string.toCharArray();
			String result = "";
			
			for (int i = 0; i < characters.length - 1; i++) {
				result += characters[i] + " ";
			}
			
			return result + characters[characters.length - 1];
		};
		
		System.out.print("Enter the string : ");
		String string = sc.next();
		System.out.println("string = " + st.returnExpression(string));

		sc.close();

	}

}

