package application;



import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account data");
        System.out.print("Account number: ");
        int accNumber = sc.nextInt();
        System.out.print("Holder Name: ");
        sc.nextLine();
        String holderName = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(accNumber, holderName, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount to withdraw: ");
        Double withdrawAmount = sc.nextDouble();

        try {
        account.withdraw(withdrawAmount);
        System.out.printf("New balance: %.2f%n", account.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
