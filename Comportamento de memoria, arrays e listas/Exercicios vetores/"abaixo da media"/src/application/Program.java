package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double avg, sum;

        System.out.print("Enter the amount of entries: ");
        n = sc.nextInt();

        double[] a = new double[n];

        System.out.println("Enter a number: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        avg = sum / n;

        System.out.printf("Vector's average = %.3f%n", avg);

        System.out.println("Elements under average");
        for (int i = 0; i < n; i++) {
            if (a[i] < avg) {
                System.out.printf("%.1f%n", a[i]);
            }
        }





        sc.close();
    }
}