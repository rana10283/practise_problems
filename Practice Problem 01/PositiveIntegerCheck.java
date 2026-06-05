import java.util.Scanner;

public class PositiveIntegerCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive integer.");
        } else {
            System.out.println(num + " is NOT a positive integer.");
        }

        input.close();
    }
}