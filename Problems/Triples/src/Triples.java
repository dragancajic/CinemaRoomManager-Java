/* * *
 * Write a program that reads an array of ints and outputs the number of "triples" in the array.
 * A "triple" is three consecutive ints in increasing order differing by 1
 * (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).
 *
 * ~-~-~-~-~-~-~-~-~-~-~-
 * |   Sample Input:    |
 * |   6                |
 * |   1 2 4 5 6 7      |
 * |--------------------|
 * |   Sample Output:   |
 * |   2                |
 * ~-~-~-~-~-~-~-~-~-~-~-
 */
//package org.eu5.learn_pisio;

//import java.util.Arrays;
import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 6:13 PM May 10, 2021
 * @description Number of "triples" in the array of integers.
 */
class Triples {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input size of array of integers: ");
		int sizeOfArray = scanner.nextInt();
		int[] arrayOfInts = new int[sizeOfArray];
		int numberOfTriples = 0; // counter of triples
		
		System.out.print("Input integer elements of array: ");
		// initialize your array of ints
		for (int i = 0; i < arrayOfInts.length; i++) {
			arrayOfInts[i] = scanner.nextInt();
		}
	
		// test 0
		//System.out.println(Arrays.toString(arrayOfInts));
		
		for (int i = 0; i < arrayOfInts.length - 2; i++) {
			// test 1
			//System.out.println("i: " + i + ", i + 1: " + (i + 1) + ", i + 2: " + (i + 2));
			if (arrayOfInts[i + 1] == arrayOfInts[i] + 1 &&
				arrayOfInts[i + 2] == arrayOfInts[i + 1] + 1) {
				numberOfTriples++;
			}
			// test 2
			//System.out.println("triples: " + numberOfTriples);
		}
		System.out.println("Number of 'triples' in array is: " + numberOfTriples);
		//System.out.println(numberOfTriples);
	}
}
