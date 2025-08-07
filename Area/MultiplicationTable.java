package Area;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Loop for numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiplication Table of " + i + ":");

            // Loop for each multiplication from 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // Add a blank line between tables
            System.out.println();
        }
    }
}
