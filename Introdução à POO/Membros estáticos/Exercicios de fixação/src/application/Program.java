package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dollar quotation: ");
        double usd = sc.nextDouble();

        System.out.print("How much do you want to buy? ");
        double purchase = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.conversion(usd, purchase));



        sc.close();
    }

}
