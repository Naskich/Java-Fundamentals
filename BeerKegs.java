
/*8.	Beer Kegs
Write a program, which calculates the volume of n beer kegs. 
You will receive in total 3 * n lines. Each three lines will hold information for a single keg. 
First up is the model of the keg, after that is the radius of the keg,
 and lastly is the height of the keg.
Calculate the volume using the following formula: π * r^2 * h. 
At the end, print the model of the biggest keg.
Input
You will receive 3 * n lines. Each group of lines will be on a new line:
•	First – model – string.
•	Second –radius – floating-point number
•	Third – height – integer number
Output
Print the model of the biggest keg.
Constraints
•	n will be in the interval [1…10]
•	The radius will be a floating-point number in the interval [1…3.402823E+38]
•	The height will be an integer in the interval [1…2147483647]
Examples
Input	Output		Input	Output
3
Keg 1
10
10
Keg 2
20
20
Keg 3
10
30	Keg 2		2
Smaller Keg
2.41
10
Bigger Keg
5.12
20
	Bigger Keg
 * */
import java.util.Scanner;
public class BeerKegs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberKeg = Integer.parseInt(scanner.nextLine());               
	    double volume = 0;
	    int count = 0;
		double maxNumber = Double.MIN_VALUE;
		String modelBeer = null;
		String nameBeer = null;
		for (int i = 1; i <= numberKeg; i++) {
		           modelBeer = scanner.nextLine();                         
			Double radiusKeg = Double.parseDouble(scanner.nextLine());     
			Double heightKeg = Double.parseDouble(scanner.nextLine());     
			volume = (double)((3.14*radiusKeg*radiusKeg)*heightKeg);
			count+=1;
			 if (maxNumber<volume) {
					maxNumber = volume;
					nameBeer=modelBeer;
			 }
		}
	    System.out.printf("%s",nameBeer);
	}
}
