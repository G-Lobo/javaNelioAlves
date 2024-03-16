package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double avg;

        System.out.print("Type the number of entries: ");
        n = sc.nextInt();

        double[] grades1 = new double[n];
        double[] grades2 = new double[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the name, 1st and 2nd grade of student number %d %n", i+1);
            sc.nextLine();
            names[i] = sc.nextLine();
            grades1[i] = sc.nextDouble();
            grades2[i] = sc.nextDouble();
        }

        System.out.println("APPROVED STUDENTS:");


        for (int i = 0; i < n; i++) {
            avg = (grades1[i] + grades2[i]) / 2;

            if (avg >= 6.0) {
                System.out.printf("%s %n", names[i]);
            }

        }

        sc.close();
    }
}