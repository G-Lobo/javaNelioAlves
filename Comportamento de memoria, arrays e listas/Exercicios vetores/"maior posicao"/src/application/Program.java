package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, highPos;
        double higher;

        System.out.print("How many entries? ");
        n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }

        higher = numbers[0];
        highPos = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] > higher) {
                higher = numbers[i];
                highPos = i;
            }
        }

        System.out.printf("HIGHER VALUE = %.1f%n", higher);
        System.out.printf("HIGHER NUMBER POSITION = %d%n", highPos);

        sc.close();
    }
}