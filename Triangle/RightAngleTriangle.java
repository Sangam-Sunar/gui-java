package Triangle;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces to right-align the numbers
            for (int space = rows - i; space > 0; space--) {
                System.out.print(" ");
            }

            // Print numbers from 1 to current row number
            for (int num = 1; num <= i; num++) {
                System.out.print(num);
            }

            // Move to next line
            System.out.println();
        }

        scanner.close();
    }
}
