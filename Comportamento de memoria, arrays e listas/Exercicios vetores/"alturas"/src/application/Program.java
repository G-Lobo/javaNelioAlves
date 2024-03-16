package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nMinors;
        double totalHeight, avgHeight, minorsPercentage;

        System.out.print("How Many entries? ");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Person's number %d data:%n", i +1);
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }

        nMinors = 0;
        totalHeight = 0;
        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                nMinors++;
            }
            totalHeight += heights[i];
        }

        avgHeight = totalHeight / n;
        minorsPercentage = ((double) nMinors / n) * 100;

        System.out.printf("Average height = %.2f%n", avgHeight);
        System.out.printf("People younger than 16 years old: %.1f%% %n",minorsPercentage);


        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                System.out.printf("%s%n", names[i]);
            }
        }
        sc.close();
    }
}