package app;

import entities.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Triangle x,y;
        x=new Triangle();
        y=new Triangle();

        System.out.println("Enter de measures of triangle x: ");

        x.a=sc.nextDouble();
        x.b=sc.nextDouble();
        x.c=sc.nextDouble();


        System.out.println("Enter de measures of triangle y: ");
        y.a=sc.nextDouble();
        y.b=sc.nextDouble();
        y.c=sc.nextDouble();


        double p=(x.a+x.b+x.c)/2;
        double areax=x.area();


        double areay=y.area();

        System.out.printf("Triangle X area: %.4f\n", areax);
        System.out.printf("Triangle Y area: %.4f\n", areay);

        if(areax>=areay){
            System.out.println("A area maior á a X");
        }else{
            System.out.println("A area maior é a y");
        }




        sc.close();
    }
}
