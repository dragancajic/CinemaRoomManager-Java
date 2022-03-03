import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
    
        int n = scanner.nextInt();
        int max = 0;
    
        int i = 0;
        while (i < n) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > max) {
                max = number;
            }
            i++;
        }
        System.out.println(max);
    }
}