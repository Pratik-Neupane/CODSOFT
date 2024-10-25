package Grade.Calculator;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of subjects: ");
            int Subjects_num = scanner.nextInt();
            int[] marks = new int[Subjects_num];
            int totalMarks = 0;

            for (int i = 0; i < Subjects_num; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
                int mark = scanner.nextInt();

                while (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    mark = scanner.nextInt();
                }
                marks[i] = mark;
                totalMarks += mark;
            }

            double average = (double) totalMarks / Subjects_num;
            String grade;
            if (average >= 90 && average <= 100) {
                grade = "A+";
            } else if (average >= 80 && average < 90) {
                grade = "A-";
            } else if (average >= 70 && average < 80) {
                grade = "B+";
            } else if (average >= 60 && average < 70) {
                grade = "B";
            } else if (average >= 50 && average < 60) {
                grade = "C";
            } else if (average >= 40 && average < 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("\nTotal Marks: " + totalMarks);
            System.out.println("Average: " + average + "%");
            System.out.println("Grade: " + grade);

            scanner.close();

    }


}
