
/*4.	Sum of Chars
Write a program, which sums the ASCII codes of n characters. 
Print the sum on the console.
Input
•	On the first line, you will receive n – the number of lines, which will follow
•	On the next n lines – you will receive letters from the Latin alphabet
Output
Print the total sum in the following format:
The sum equals: {totalSum}
Constraints
•	n will be in the interval [1…20].
•	The characters will always be either upper or lower-case
 letters from the English alphabet
•	You will always receive one letter per line
Examples
Input	Output		Input	Output
5
A
b
C
d
E	The sum equals: 399		12
S
o
f
t
U
n
i
R
u
l
z
z	The sum equals: 1263
 * */
import java.util.Scanner;
public class SumOfChars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		int sumAscii = 0;
		for (int i = 0; i <number; i++) {
			char text = scanner.nextLine().charAt(0);
			int castAscii = (int) text;
			sumAscii +=castAscii; 
		}
		System.out.println("The sum equals: "+sumAscii);
	}
}
