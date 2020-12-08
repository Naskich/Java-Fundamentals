

/*5.	Print Part of the ASCII Table
Find online more information about ASCII (American Standard 
Code for Information Interchange) and write a program that prints part of the ASCII
 table of characters at the console.  
On the first line of input you will receive the char index you should start with and on the 
second line - the index of the last character you should print.
Examples
Input	Output
60
65	< = > ? @ A
69
79	E F G H I J K L M N O
97
104	a b c d e f g h
40
55	( ) * + , - . / 0 1 2 3 4 5 6 7
 * */
import java.util.Scanner;
public class PrintPartASCIITable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberSimbolFirst = Integer.parseInt(scanner.nextLine());
		int numberSimbolLast = Integer.parseInt(scanner.nextLine());		
		for (int i = numberSimbolFirst; i <= numberSimbolLast; i++) {
			char castAscii = (char) i;
			System.out.printf(" "+castAscii);
		}
	}
}
