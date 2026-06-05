import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int greatest = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }

        System.out.println("Greatest number = " + greatest);

        input.close();
    }
}