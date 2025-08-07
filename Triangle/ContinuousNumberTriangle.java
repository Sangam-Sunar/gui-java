package Triangle;

import java.util.Scanner;

public class ContinuousNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        int number = 1; // Start from 1

        for (int i = 1; i <= rows; i++) {
            // Print numbers for current row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            // Move to next line
            System.out.println();
        }

        scanner.close();
    }
}
