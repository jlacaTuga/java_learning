package app;

import util.Calculator;

import java.util.Scanner;

import static util.Calculator.*;

public class Program {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Calculator calculator=new Calculator();

        System.out.print("Enter radius: ");
        double radius=sc.nextDouble();

        double c=calculator.circumference(radius);

        double v=calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calculator.PI);


        sc.close();
    }


}
