package Triangle;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows in the upper half
        System.out.print("Input number of rows (for half diamond): ");
        int rows = scanner.nextInt();

        // Upper half
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
