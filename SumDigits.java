
/*2.	Sum Digits
You will be given a single integer. 
Your task is to find the sum of its digits.
Examples
Input	Output
245678	32
97561	28
543	12
 * */

import java.util.Scanner;
public class SumDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		int sumNumber = 0;
		for (int i = 1; i <= number; i++) {
			int firstDigit = i/100000;
			int secondDigit = (i/10000)%10;
			int thirdDigit = (i/1000)%10;
			int fourDigit =(i/100)%10;
			int fiveDigit =(i/10)%10;
			int sixDigit = i%10;
		     sumNumber = firstDigit+secondDigit+thirdDigit+fourDigit+fiveDigit+sixDigit;
		}
		System.out.println(sumNumber);
	}
}
