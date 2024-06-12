package application;

import services.Rent;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        Rent[] rent = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Rent #%d: %n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rent[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }




        sc.close();
    }
}





