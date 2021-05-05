/* * *
 * A user inputs a long positive number m.
 * Find out what is the smallest integer n such that n! > m.
 *
 * ~-~-~-~-~-~-~-~-~-~-~|~-~-~-~-~-~-~-~-~-~-~
 * |   Sample Input:    |   Sample Input:    |
 * |   6188989133       |   6                |
 * |--------------------|--------------------|
 * |   Sample Output:   |   Sample Output:   |
 * |   13               |   4                |
 * ~-~-~-~-~-~-~-~-~-~-~|~-~-~-~-~-~-~-~-~-~-~
 */
package org.eu5.learn_pisio;

import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 1:06 AM May 5, 2021
 * @description Smallest integer n such that n! > m.
 */
class SmallestValue {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a long positive number m: ");
		long m = scanner.nextLong();
		//System.out.println(findFactorial(14));
		
		int n = 0;
		do {
			n++;
			//System.out.println("number: " + n + ", factorial: " +  findFactorial(n));
		} while (findFactorial(n) <= m);
		
		System.out.println("Smallest integer n such that n! > m is: " + n);
		//System.out.println(n);
	}
	
	public static long findFactorial(int number) {
		long factorial = 1;
		int i = 1;
		
		while (i <= number) {
			factorial *= i;
			//System.out.println("current factorial " + factorial);
			i++;
			//System.out.println("current number " + number);
		}
		return factorial;
	}
}
