package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Type the number of entries: ");
        n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS:");

        for (int i = 0; i < n; i++) {
            if (vector[i] < 0) {
                System.out.printf("%d\n", vector[i]);
            }
        }

        sc.close();
    }
}