package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Regular, used or imported (r/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Enter product name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            if (ch == 'r') {
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price, date));
            } else if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }

        }
        System.out.println();
        System.out.println("Price Tags:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }


        sc.close();
    }
}
