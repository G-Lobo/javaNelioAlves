package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.90));


//        list.removeIf(new ProductPredicate());

//        list.removeIf(Product::staticProductPredicate);

//        list.removeIf(Product::nonStaticProductPredicate);

        double min = 100.0;
//
//        Predicate<Product> pred = p -> p.getPrice() >= min;
//
//        list.removeIf(pred);

        list.removeIf(p->p.getPrice()>=min);


        for(Product p: list) {
            System.out.println(p);
        }





    }



}

