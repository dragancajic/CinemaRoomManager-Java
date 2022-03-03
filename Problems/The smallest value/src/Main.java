import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
    
        //System.out.print("Input a long positive number m: ");
        long m = scanner.nextLong();
        //System.out.println(findFactorial(14));
    
        int n = 0;
        do {
            n++;
            //System.out.println("number: " + n + ", factorial: " +  findFactorial(n));
        } while (findFactorial(n) <= m);
    
        //System.out.println("Smallest integer n such that n! > m is: " + n);
        System.out.println(n);
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