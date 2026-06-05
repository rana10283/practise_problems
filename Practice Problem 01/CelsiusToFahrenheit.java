import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = input.nextDouble();

        double f = (9.0 / 5.0) * c + 32;

        System.out.println("Temperature in Fahrenheit = " + f);

        input.close();
    }
}