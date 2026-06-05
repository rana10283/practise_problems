import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers = " + evenCount);
        System.out.println("Odd numbers = " + oddCount);

        input.close();
    }
}