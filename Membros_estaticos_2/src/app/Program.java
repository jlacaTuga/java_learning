package app;

import util.Calculator;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Uma vez que na calculadora está como estatico já não preciso de instanciar
        //Calculator calculator=new Calculator();

        System.out.print("Enter radius: ");
        double radius=sc.nextDouble();

        // Como foi declarado estatico utilizo o nome da classe diretamente
        double c=Calculator.circumference(radius);

        double v=Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);


        sc.close();
    }


}
