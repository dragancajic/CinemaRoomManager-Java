import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
    
        int sum = 0;
        int element = 0;
        //System.out.println("Insert elements of sequence:");
        do {
            element = scanner.nextInt();
            //System.out.println("Current sum: " + sum);
            sum += element;
        } while (element != 0);
    
        System.out.println(sum);
    }
}