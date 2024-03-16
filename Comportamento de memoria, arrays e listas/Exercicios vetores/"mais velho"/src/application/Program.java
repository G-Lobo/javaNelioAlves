package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         int n, oldest, position;

        System.out.print("Enter the number of entries: ");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Person number %d data: %n", i);
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
        }

        oldest = ages[0];
        position = 0;

        for (int i = 0; i < n; i++) {
            if (ages[i] > oldest) {
                oldest = ages[i];
                position = i;
            }
        }

        System.out.printf("OLDEST PERSON: %s %n", names[position]);

        sc.close();
    }
}