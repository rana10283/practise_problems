import java.util.Scanner;

public class MedalAward {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double grade = input.nextDouble();

        System.out.print("Semester completed? (true/false): ");
        boolean completed = input.nextBoolean();

        if (grade >= 3.5) {
            if (completed) {
                System.out.println("Congratulations! You receive a medal.");
            } else {
                System.out.println("No medal. Semester not completed.");
            }
        } else {
            System.out.println("No medal. GPA is below 3.5.");
        }

        input.close();
    }
}