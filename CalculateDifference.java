import java.util.Scanner;

public class CalculateDifference {

	public int Diff() {
		int number, n, res = 0, counter = 0, temp = 0, mul = 0, diff = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number from User:");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			res = res + i * i;
			temp = temp + i;
			// counter++;
			mul = temp * temp;
			diff = mul - res;
			// System.out.println(diff);

		}
		System.out.println(diff);
		return (diff);
	}

	public static void main(String[] args) {
		CalculateDifference df = new CalculateDifference();
		df.Diff();

		// (1^2+2^2+3^2+….9^2+10^2)-
		// (1+2+3+4+5…+9+10)^2

		// TODO Auto-generated method stub

	}

}
