package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, men , women;
        double highest, lowest, avgFemHeight, totalFemHeight;


        System.out.print("Type the number of entries: ");
        n = sc.nextInt();

        double[] height = new double[n];
        char[] sex = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter person's number %d height: ", i + 1);
            height[i] = sc.nextDouble();
            System.out.printf("Enter person's number %d sex: ", i + 1);
            sex[i] = sc.next().charAt(0);
        }

        highest = height[0];
        lowest = height[0];

        for (int i = 0; i < n; i++) {
            if (height[i] > highest) {
                highest = height[i];
            }
            if (height[i] < lowest) {
                lowest = height[i];
            }
        }

        men = 0;
        women = 0;
        totalFemHeight = 0;

        for (int i = 0; i < n; i++) {
            if (sex[i] == 'm' || sex[i] == 'M') {
                men++;
            } else {
                women++;
                totalFemHeight += height[i];
            }
        }

        avgFemHeight = totalFemHeight / women;

        System.out.printf("Lowest height = %.2f\n", lowest);
        System.out.printf("Highest height = %.2f\n", highest);
        System.out.printf("Average of female heights = %.2f\n", avgFemHeight);
        System.out.printf("Number of men = %d\n", men);

        sc.close();
    }
}