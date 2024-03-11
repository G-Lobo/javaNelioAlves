package application;


import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Please type the student's name: ");
        student.name = sc.nextLine();
        System.out.println();

        System.out.print("Grade 1st quarter: ");
        student.grade1 = sc.nextDouble();
        System.out.println();

        System.out.print("Grade 2nd quarter: ");
        student.grade2 = sc.nextDouble();
        System.out.println();

        System.out.print("Grade 3rd quarter: ");
        student.grade3 = sc.nextDouble();
        System.out.println();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }


    }


}
