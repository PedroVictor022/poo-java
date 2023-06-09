package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Triangle x;

        x = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a =  sc.nextDouble();
        x.b =  sc.nextDouble();
        x.c =  sc.nextDouble();
        double areaX = x.area();
        System.out.printf("Triangle X area: %.4f%n", areaX);
    }
}
