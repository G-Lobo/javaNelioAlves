package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum, avg;

        System.out.println("How many numbers will be entered?");
        n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("type a number: ");
            vector[i] = sc.nextDouble();
        }

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vector[i];
        }

        avg = sum / n ;

        System.out.print("VALORES = ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vector[i]);
        }
        System.out.println();
        System.out.printf("SUM = %.2f%n", sum);
        System.out.printf("AVERAGE = %.2f%n", avg);

        sc.close();
    }
}