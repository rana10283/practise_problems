import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length: ");
        double arm = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(arm, 2);

        System.out.println("Area of the equilateral triangle = " + area);

        input.close();
    }
}