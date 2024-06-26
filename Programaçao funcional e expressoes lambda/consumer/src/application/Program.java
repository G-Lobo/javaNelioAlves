package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.90));


//        list.forEach(new PriceUpdate());

//        list.forEach(Product::staticPriceUpdate);

//        list.forEach(Product::nonStaticPriceUpdate);

        double factor = 1.1;

//        Consumer<Product> cons = p -> {
//            p.setPrice(p.getPrice() * factor);
//        };
//
//        list.forEach(cons);

        list.forEach(p->p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);

    }



}

