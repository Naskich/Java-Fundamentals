import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfPeople = Integer.parseInt(scanner.nextLine());
		int numberCapacityElevator = Integer.parseInt(scanner.nextLine());
		int sumLast = 0;
		if (numberOfPeople<=numberCapacityElevator) {
			sumLast=1;
			System.out.println(sumLast);
		} 
		if (numberCapacityElevator<numberOfPeople) {
			if (numberOfPeople%numberCapacityElevator==0) {
				sumLast=(numberOfPeople/numberCapacityElevator);
				System.out.println(sumLast);
			} else {
				sumLast=(numberOfPeople/numberCapacityElevator)+1;
				System.out.println(sumLast);
			}	
		}
	}
}
