
/*1.	Integer Operations
Read four integer numbers. 
Add first to the second, divide (integer) the sum by the 
third number and multiply the result by the fourth number. Print the result.
Constraints 
•	First number will be in the range [-2,147,483,648… 2,147,483,647]
•	Second number will be in the range [-2,147,483,648… 2,147,483,647]
•	Third number will be in the range [-2,147,483,648… 2,147,483,647]
•	Fourth number will be in the range [-2,147,483,648… 2,147,483,647] 
Examples
Input	Output		Input	Output
10
20
3
3
	30		15
14
2
3	42
 * */
import java.util.Scanner;
public class IntegerOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  int numberFirst = Integer.parseInt(scanner.nextLine());
		  int numberSecond = Integer.parseInt(scanner.nextLine());
		  int numberThird = Integer.parseInt(scanner.nextLine());
		  int numberFourth = Integer.parseInt(scanner.nextLine());
		  int lastSum = 0;
		  lastSum = ((numberFirst+numberSecond)/numberThird)*numberFourth;
		  System.out.println(lastSum);
	}
}
