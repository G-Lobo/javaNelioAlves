package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, evnQty;

        System.out.print("Type the number of entries: ");
        n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("EVEN NUMBERS: ");

        evnQty = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf("%d ",numbers[i]);
                evnQty++;
            }
        }

        System.out.println();
        System.out.printf("QUANTITY OF EVEN NUMBERS = %d%n", evnQty);


        sc.close();
    }
}