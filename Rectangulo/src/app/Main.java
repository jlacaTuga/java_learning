package app;

import entities.Retangulo;

import java.lang.annotation.Retention;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Retangulo retangulo=new Retangulo();

        System.out.println("Digite a altura do retangulo: \n");
        retangulo.height=sc.nextDouble();
        System.out.println("Digite a largura do retangulo: \n");
        retangulo.width=sc.nextDouble();

        retangulo.imprimir();
    }
}
