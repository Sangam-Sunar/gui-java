package Area;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking radius as input from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculating the perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Displaying the result
        System.out.println("The perimeter of the circle is: " + perimeter);

        input.close();
    }
}
