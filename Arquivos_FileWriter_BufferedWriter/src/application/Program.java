package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines=new String[] {"Good morning", "Good afternoon","Good night"};

        String path="src/application/out.txt";

        //criar e recriar o arquivo
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(path))){
            for(String line:lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        String[] linhas=new String[] {"Bom dia", "Boa tarde","boa noite"};

        //acrescentar as novas linhas no fim arquivo se recriar o arquivo
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(path,true))){
            for(String linha:linhas){
                bw.write(linha);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
