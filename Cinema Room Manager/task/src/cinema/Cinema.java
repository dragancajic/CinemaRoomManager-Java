package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        final int PRICE = 10;
        final int PRICE_FRONT = 10;
        final int PRICE_BACK = 8;
    
        int price = 0; // change this to int price;
        int profit;
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
    
        System.out.println();
    
        // draw cinema screen room (with seating arrangement)
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(" " + i);
        }
        
        System.out.println();
        
        for (int i = 1; i <= rows; i++) {
            System.out.print(i);
            // use array for seats in the cinema screen room
            for (int j = 1; j <= seats; j++) {
                System.out.print(" S");
            }
            System.out.println();
        }
    
        System.out.println();
        
        System.out.println("Enter a row number:");
        int rowNumber = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNumber = scanner.nextInt();
        
        if (rows * seats <= 60) {
            profit = rows * seats * PRICE;
        } else if (rows % 2 == 0) {
            profit = (rows * seats / 2) * (PRICE_FRONT + PRICE_BACK);
        } else {
            profit = rows / 2 * seats * PRICE_FRONT +
                    (rows / 2 + rows % 2) * seats * PRICE_BACK;
        }
    
        System.out.println();
        
        System.out.println("Ticket price: " + price);
    
        System.out.println();
        
        // draw cinema screen room (with marked chosen seat)
        System.out.println("Cinema:");
        
        System.out.println();
        
        System.out.println("Total income:");
        System.out.println("$" + profit);
    }
}