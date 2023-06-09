package Retangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert width retangle: ");
        retangle.width = sc.nextDouble();
        System.out.print("Insert height retangle: ");
        retangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangle.area());
        System.out.printf("AREA = %.2f%n", retangle.diagonal());
    }
}
