import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt(); // initial deposit in bank account
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        
        int years = 0;
        
        double deposit = 1.0 * m; // initial deposit in bank account
        while (deposit < 1.0 * k) {
            deposit *= 1 + p / 100.0; // deposit in the current year
            //System.out.printf("actual: %.2f\n", deposit);
            years++;
        }
        System.out.println(years);
    }
}