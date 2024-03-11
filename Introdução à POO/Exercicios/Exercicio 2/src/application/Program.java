package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Please type the employee data");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.println();

        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.print("Employee: ");
        System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.print("Updated data: ");
        System.out.println(employee);
        sc.close();
    }


}
