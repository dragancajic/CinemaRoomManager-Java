
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Implement a program which calculates the factorial of a number
		// given by the user.
		// 
		// Factorial of n: f(n) ---> n! = 1 * 2 * 3 * ... * n
		// Factorial of 4: f(4) ---> 4! = 1 * 2 * 3 * 4 = 24
		// Factorial of 0: f(0) ---> 0! = 1
		
		System.out.print("Give a number? ");
		//int number = Integer.valueOf(scanner.nextLine()); // Redundant boxing!
		int number = scanner.nextInt();
		
		long factorial = 1;
		
		while (number > 0) {
			factorial *= number;
			number--;
		}
		
		if (number < 0) {
			System.out.println("Wrong number!");
		} else {
			System.out.println("Factorial: " + factorial);
		}
	}
}
