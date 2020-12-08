
/*40
55	( ) * + , - . / 0 1 2 3 4 5 6 7
6.	Triples of Latin Letters
Write a program to read an integer n and print all triples of the first n small Latin letters, ordered alphabetically:
Examples
Input	Output
3	aaa
aab
aac
aba
abb
abc
aca
acb
acc
baa
bab
bac
bba
bbb
bbc
bca
bcb
bcc
caa
cab
cac
cba
cbb
cbc
cca
ccb
ccc

 * */
import java.util.Scanner;
public class TriplesLatinLetters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < number; i++) {	
			for (int j = 0; j < number; j++) {
				for (int h = 0; h < number; h++) {
					char firstAlphabet = (char) ('a'+i);
				    char secondAlphabet = (char) ('a'+j);				
					char thirdAlphabet = (char) ('a'+h);
					System.out.printf("%c%c%c%n",firstAlphabet,secondAlphabet,thirdAlphabet);
				}
			}
		}
	}
}
