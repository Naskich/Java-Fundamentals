
/*7.	Water Overflow - 71-point from 100 for this task!
You have a water tank with capacity of 255 liters. 
On the next n lines, you will receive liters of water, which you have to pour in your tank. 
If the capacity is not enough, print “Insufficient capacity!” and continue reading the next line. On the last line, print the liters in the tank.
Input
The input will be on two lines:
•	On the first line, you will receive n – the number of lines, which will follow
•	On the next n lines – you receive quantities of water, which you have to pour in the tank
Output
Every time you do not have enough capacity in the tank to pour the given liters, print:
Insufficient capacity!
On the last line, print only the liters in the tank.
Constraints
•	n will be in the interval [1…20]
•	liters will be in the interval [1…1000]
Examples
Input	Output		Input	Output
5
20
100
100
100
20	Insufficient capacity!
240		1
1000
	Insufficient capacity!
0
Input	Output		Input	Output
7
10
20
30
10
5
10
20	105		4
250
10
20
40	Insufficient capacity!
Insufficient capacity!
Insufficient capacity!
250
 * */
import java.util.Scanner;
public class WaterOverflow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberLines = Integer.parseInt(scanner.nextLine());
		if (numberLines>=1 && numberLines<=20) {
			int sumLiters = 0;
			int lastSum = 0;
			int count = 0;
			int maxNumber = Integer.MIN_VALUE;
			for (int i = 1; i <= numberLines; i++) {
				int numbersLiters = Integer.parseInt(scanner.nextLine());	 
				 sumLiters +=numbersLiters;
				 count+=1;
				 //---------------------------------------------
				 if (numberLines==count && sumLiters<=255) {
					 System.out.println(sumLiters);
					 break;
				 }
				 //----------------------------------------------
				 
				 if (sumLiters>255 && numberLines>2) {
					 System.out.printf("Insufficient capacity!%n");		
					 if (maxNumber<=sumLiters) {
						 sumLiters-=numbersLiters;
							maxNumber = sumLiters;							
							if (maxNumber<255 && count==numberLines) {	
								System.out.println(maxNumber);
							}
					 	}		
					}
				 //------------------------------------
				 if (sumLiters>255 && numberLines==2 && count==2) {
					lastSum=sumLiters-numbersLiters;
					if (numbersLiters>lastSum) {
						System.out.println(numbersLiters);
					} else if (lastSum>0) {
						System.out.println(lastSum);
					} else if (lastSum==0) {
						System.out.println(lastSum);
					}
				 }		 
				 //------------------------------------
				if (numberLines==1 && numbersLiters>255) {
					System.out.printf("Insufficient capacity!%n0");
					break;
				}
				//--------------------------------------------------
				if (sumLiters==255 && numberLines==1) {
					System.out.printf("255");
					break;
				}
			}
		}
	}
}