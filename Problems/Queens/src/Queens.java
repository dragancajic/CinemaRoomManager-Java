/* * *
 * You are given coordinates of two queens on a chess board.
 * Find out whether or not they hit each other.
 *
 *     x1 y1 x2 y2          x1 y1 x2 y2
 * ~-~-~-~-~-~-~-~-~-~-~|~-~-~-~-~-~-~-~-~-~-~
 * |   Sample Input:    |   Sample Input:    |
 * |   1 1 3 3          |   1 1 4 3          |
 * |--------------------|--------------------|
 * |   Sample Output:   |   Sample Output:   |
 * |   YES              |   NO               |
 * ~-~-~-~-~-~-~-~-~-~-~|~-~-~-~-~-~-~-~-~-~-~
 */
//package org.eu5.learn_pisio;

import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 2:59 PM May 21, 2021
 * @description Will two queens hit each other?
 */
class Queens {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter coordinates of two queens (x1 y1 x2 y2):");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if (x1 == x2 || y1 == y2) {
			System.out.println("YES");
			//System.out.println("Hello from FIRST!~ :-)");
			
		} else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
			System.out.println("YES");
			//System.out.println("Hello from FOURTH! :-)");
		} else {
			System.out.println("NO");
		}
	}
}
