package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, sumEven = 0, numEven = 0;
        double avgEven;

        System.out.print("Type the number of entries: ");
        n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vector[i] % 2 == 0) {
                sumEven += vector[i];
                numEven++;
            }
        }

        if (numEven == 0) {
            System.out.println("NO EVEN NUMBERS!");
        } else {
            avgEven = (double)sumEven / numEven;

            System.out.printf("EVEN AVERAGE = %.1f%n", avgEven);
        }

        sc.close();
    }
}