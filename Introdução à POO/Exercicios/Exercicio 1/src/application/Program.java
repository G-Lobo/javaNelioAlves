package application;

import services.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter the rectangle's Width: ");
        rectangle.width = sc.nextDouble();
        System.out.println();

        System.out.print("Enter the rectangle's Height: ");
        rectangle.height =  sc.nextDouble();

        System.out.println();
        System.out.println("AREA = " + rectangle.Area());
        System.out.println("PERIMETER = " + rectangle.Perimeter());
        System.out.println("DIAGONAL = " + rectangle.Diagonal());


        sc.close();
    }


}
