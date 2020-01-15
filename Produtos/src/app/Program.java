package app;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int aux=0;
        Product product=new Product();

        System.out.println("Enter Product data:\n");
        System.out.println("Name: \n");
        product.name=sc.nextLine();
        System.out.println("Price: \n");
        product.price=sc.nextDouble();
        System.out.println("Quantity: \n");
        product.quantity=sc.nextInt();

        System.out.println( "\n"+product.toString());

        System.out.println("\nEnter the number of products to be added in stock");
        aux=sc.nextInt();
        product.addProducts(aux);
        System.out.println( "\n"+product.toString());

        System.out.println("\nEnter the number of products to be removed in stock");
        aux=sc.nextInt();
        product.removeProducts(aux);
        System.out.println( "\n"+product.toString());




        sc.close();
    }
}
