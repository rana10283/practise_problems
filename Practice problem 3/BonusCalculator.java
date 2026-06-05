import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sales percentage: ");
        int sales = input.nextInt();

        System.out.print("Enter attendance percentage: ");
        int attendance = input.nextInt();

        if (sales >= 95) {
            if (attendance == 100) {
                System.out.println("Bonus = 60%");
            } else if (attendance >= 90) {
                System.out.println("Bonus = 40%");
            } else {
                System.out.println("Bonus = 5%");
            }
        } else if (sales >= 80) {
            if (attendance == 100) {
                System.out.println("Bonus = 40%");
            } else if (attendance >= 90) {
                System.out.println("Bonus = 20%");
            } else {
                System.out.println("Bonus = 5%");
            }
        } else {
            System.out.println("Bonus = 5%");
        }

        input.close();
    }
}