package Area;

public class SumEvenOdd {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sumEven += i; // even number
            } else {
                sumOdd += i; // odd number
            }
        }

        // Display the results
        System.out.println("Sum of even numbers from 1 to 10: " + sumEven);
        System.out.println("Sum of odd numbers from 1 to 10: " + sumOdd);
    }
}
