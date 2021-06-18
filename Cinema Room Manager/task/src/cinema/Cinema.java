package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        final int PRICE = 10;
        final int PRICE_FRONT = 10;
        final int PRICE_BACK = 8;
    
        int ticketPrice;
        int profit;
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
    
        // declare and initialize
        char[][] seatsArray = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                seatsArray[i][j] = 'S';
            }
        }
    
        System.out.println(); // empty line
        
        while (true) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
    
            int menuItem = scanner.nextInt();
    
            System.out.println(); // empty line
    
            switch (menuItem) {
                case 1:
                    // draw cinema screen room (with marked chosen seat)
                    // and after buying a ticket ("2. Buy a ticket")
                    // draw cinema screen room (with seating arrangement)
                    System.out.println("Cinema:");
                    System.out.print(" ");
                    for (int i = 1; i <= seats; i++) {
                        System.out.print(" " + i);
                    }
    
                    System.out.println(); // empty line
                    
                    // use array for seats in the cinema screen room
                    for (int i = 0, k = 1; i < rows && k <= rows; i++, k++) {
                        System.out.print(k);
                        for (int j = 0; j < seats; j++) {
                            System.out.print(" " + seatsArray[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter a row number:");
                    int rowNumber = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int seatNumber = scanner.nextInt();
    
                    // change element for chosen seat with 'B'
                    seatsArray[rowNumber - 1][seatNumber - 1] = 'B';
                    
                    
                    
                    // calculate the ticket price
                    if (rows * seats <= 60) {
                        ticketPrice = PRICE;
                    } else if (rowNumber <= rows / 2) {
                        ticketPrice = PRICE_FRONT;
                    } else {
                        ticketPrice = PRICE_BACK;
                    }
                    
                    System.out.println("Ticket price: $" + ticketPrice);
                    System.out.println(); // empty line
                    break;
                case 0:
                    // calculate the cinema profit
                    if (rows * seats <= 60) {
                        profit = rows * seats * PRICE;
                    } else if (rows % 2 == 0) {
                        profit = (rows * seats / 2) * (PRICE_FRONT + PRICE_BACK);
                    } else {
                        profit = rows / 2 * seats * PRICE_FRONT +
                                (rows / 2 + rows % 2) * seats * PRICE_BACK;
                    }
                    System.out.print("Total income: ");
                    System.out.println("$" + profit);
                    break;
            }
            
            if (menuItem == 0) {
                break;
            }
        }
    }
}