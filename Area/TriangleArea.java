package Area;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking base and height as input from the user
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        // Calculating the area
        double area = 0.5 * base * height;

        // Displaying the result
        System.out.println("The area of the triangle is: " + area);

        input.close();
    }
}

