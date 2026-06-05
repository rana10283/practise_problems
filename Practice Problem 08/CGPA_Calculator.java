import java.util.Scanner;

public class CGPA_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 5;
        int subjects = 5;

        double[][] gradePoints = new double[students][subjects];

        double[][] credits = new double[students][subjects];

        System.out.println("Enter Grade Points and Credits for 5 students (5 subjects each):");

        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < subjects; j++) {

                System.out.print("Subject " + (j + 1) + " Grade Point: ");
                gradePoints[i][j] = sc.nextDouble();

                System.out.print("Subject " + (j + 1) + " Credits: ");
                credits[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n===== CGPA Results =====");

        for (int i = 0; i < students; i++) {

            double totalCredits = 0;
            double weightedSum = 0;

            for (int j = 0; j < subjects; j++) {
                weightedSum += gradePoints[i][j] * credits[i][j];
                totalCredits += credits[i][j];
            }

            double cgpa = weightedSum / totalCredits;

            System.out.println("Student " + (i + 1) + " CGPA = " + cgpa);
        }

        sc.close();
    }
}