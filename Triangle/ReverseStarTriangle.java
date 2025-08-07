package Triangle;

import java.util.Scanner;

public class ReverseStarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Input the number: ");
        int rows = scanner.nextInt();

        // Loop from input number down to 1
        for (int i = rows; i >= 1; i--) {
            // Print i stars in each line
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

        scanner.close();
    }
}
