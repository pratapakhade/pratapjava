/* Create a method to check if a number is an increasing number*/
import java.util.*;

public class Increasing {

	boolean isIncreasing(int number) {
		String s = Integer.toString(number);
		char ch;
		int f = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			ch = s.charAt(i);
			if (ch > s.charAt(i + 1))// If any digit is more than next digit
										// then we have to stop checking
			{
				f = 1;
				break;
			}
		}
		if (f == 1)
			return false;
		else
			return true;
	}

	boolean isDecreasing(int number) {
		String s = Integer.toString(number);
		char ch;
		int f = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			ch = s.charAt(i);
			if (ch < s.charAt(i + 1))// If any digit is less than next digit
										// then we have to stop checking
			{
				f = 1;
				break;
			}
		}
		if (f == 1)
			return false;
		else
			return true;
	}

	void isBouncy(int number) {
		if (isIncreasing(number) == true)
			System.out.println("The number " + number + " is Increasing and Not Bouncy");
		else if (isDecreasing(number) == true)
			System.out.println("The number " + number + " is Decreasing and Not Bouncy");
		else
			System.out.println("The number " + number + " is bouncy");
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Increasing bouncyNumber = new Increasing();
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		bouncyNumber.isBouncy(number);
	}
}
