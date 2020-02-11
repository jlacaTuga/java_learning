package app;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a file path:");
        String strPath=sc.nextLine();

        File path=new File(strPath);

        //ver o nome do arquivo
        System.out.println("getName: "+path.getName());
        //ver o caminho do arquivo
        System.out.println("getParent: "+path.getParent());
        //ver o caminho completo
        System.out.println("getPath: "+path.getPath());

        sc.close();
    }
}
