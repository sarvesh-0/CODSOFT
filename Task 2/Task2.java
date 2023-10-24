import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        double totalMarks = 0.0;
        double averagePercentage;

         for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " out of 100: ");
            double marks = sc.nextDouble();
            totalMarks += marks;
        }

        averagePercentage = (totalMarks / (numSubjects * 100)) * 100;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");

        String g= calGrade(averagePercentage);
        System.out.println("Grade: " + g);
        System.out.println("---------------------------------------------------------------------");

        sc.close();

    }

 public static String calGrade(double percentage) {
        if (percentage >= 90.0) {
            return "A";
        } else if (percentage >= 70.0) {
            return "B";
        } else if (percentage >= 50.0) {
            return "C";
        } else if (percentage >= 40.0) {
            return "D";
        } else {
            return "Fail";
        }
    }
}