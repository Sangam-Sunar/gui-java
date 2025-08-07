package Area;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Loop from 1 to 50
        for (int i = 1; i <= 50; i++) {
            sum += i; // same as sum = sum + i
        }

        // Display the result
        System.out.println("The sum of natural numbers from 1 to 50 is: " + sum);
    }
}
