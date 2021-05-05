import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        // do-while loop solution
        /*
        int count = -1;
        int number;
        do {
            number = scanner.nextInt();
            count++;
        } while (number != 0);
        */
        
        // while loop solution
        int count = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}