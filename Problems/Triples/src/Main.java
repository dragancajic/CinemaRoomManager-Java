import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int sizeOfArray = scanner.nextInt();
        int[] arrayOfInts = new int[sizeOfArray];
        int numberOfTriples = 0; // counter of triples
        
        // initialize your array of ints
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < arrayOfInts.length - 2; i++) {
            
            if (arrayOfInts[i + 1] == arrayOfInts[i] + 1 &&
                arrayOfInts[i + 2] == arrayOfInts[i + 1] + 1) {
                numberOfTriples++;
            }
        }
        
        System.out.println(numberOfTriples);
    }
}