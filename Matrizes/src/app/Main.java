package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Digite o tipo de ordem matriz (int)");
        int n=sc.nextInt();

        int matriz[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Digite um numero para array: ");
                matriz[i][j]=sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for(int i=0;i<n;i++){
            System.out.print(matriz[i][i]+" ");
        }



        sc.close();
    }
}
