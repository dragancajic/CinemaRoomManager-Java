import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        
        int busHeight = scanner.nextInt(); // N centimeters
        int numberOfBridges = scanner.nextInt();
        
        int[] bridgeHeights = new int[numberOfBridges];
        
        for (int i = 0; i < bridgeHeights.length; i++) {
            bridgeHeights[i] = scanner.nextInt();
        }
    
        //System.out.println(Arrays.toString(bridgeHeights));
        
        boolean willCrash = false;
        int index = -1;
        
        for (int i = 0; i < bridgeHeights.length; i++) {
            if (bridgeHeights[i] <= busHeight) {
                willCrash = true;
                index = i + 1;
                break;
            }
        }
    
        if (willCrash) {
            System.out.println("Will crash on bridge " + index);
        } else {
            System.out.println("Will not crash");
        }
    }
}