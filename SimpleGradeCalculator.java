import java.util.Scanner;

public class SimpleGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printBorder();
        System.out.println("Welcome to the Simple Grade Calculator!");
        System.out.println("======================================");

        // Step 1: Take marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        System.out.println("\nEnter marks for each subject:");

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Step 2: Calculate total marks
        double averagePercentage = (double) totalMarks / numSubjects;

        // Step 3: Assign grades based on the average percentage
        char grade = calculateGrade(averagePercentage);

        // Step 4: Display results
        printResults(totalMarks, averagePercentage, grade);
        printBorder();
    }

    // Method to calculate grade based on average percentage
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display results
    private static void printResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nResults:");
        System.out.println("----------------------------");
        System.out.println("Total Marks:       " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade:             " + grade);
        System.out.println("----------------------------");
    }

    // Method to display a border
    private static void printBorder() {
        System.out.println("======================================");
    }
}
