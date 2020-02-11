package app;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter a folder path: ");
        String strPath=sc.nextLine();

        File path=new File(strPath);

        //listar subpastas duma pasta

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");

        for(File folder : folders) {
            System.out.println(folder);
        }

        //listar arquivos duma pasta
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");

        for(File file : files) {
            System.out.println(file);
        }

        //criar uma sub-pasta
        boolean success = new File(strPath + "subdiretorio").mkdir();
        System.out.println("Diretorio criado com sucesso: "+success);

        sc.close();
    }
}
