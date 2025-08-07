package Triangle;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print the same number i, i times with space
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to next line
            System.out.println();
        }

        scanner.close();
    }

}
