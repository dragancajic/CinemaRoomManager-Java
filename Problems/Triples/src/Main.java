import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int sizeOfArray = scanner.nextInt();
        int[] arrayOfInts = new int[sizeOfArray];
        int numberOfTriples; // counter of triples
        
        for (int i = 0; i < sizeOfArray; i++) {
            arrayOfInts[i] = scanner.nextInt();
            
            // some code
        }
    }
}