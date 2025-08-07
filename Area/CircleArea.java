package Area;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking radius as input from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculating the area using Math.PI
        double area = Math.PI * radius * radius;

        // Displaying the result
        System.out.println("The area of the circle is: " + area);

        input.close();
    }
}


