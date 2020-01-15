import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String>lista=new ArrayList<>();

        lista.add("Maria");
        lista.add("Aline");
        lista.add("Nina");
        lista.add("Mãe");
        lista.add("Pai");
        lista.add("Julia");
        lista.add("Julieta");
        lista.add("Graça");
        lista.add("Rosa");

        System.out.println("Array original");
        for (String familia:lista) {
            System.out.println(familia);
        }

        System.out.println("\nAdicionando nome no index 2");

        lista.add(2,"Vitor");
        for (String familia:lista) {
            System.out.println(familia);
        }

        System.out.println("\nRetornar o tamanho da lista");

        System.out.println("O tamanho da lista: "+lista.size());

        System.out.println("\nRemover nome em indice 1");

        lista.remove(1);
        for (String familia:lista) {
            System.out.println(familia);
        }
        System.out.println("\nRemovendo por nome");

        lista.remove("Nina");
        for (String familia:lista) {
            System.out.println(familia);
        }
        System.out.println("\nRemovendo nomes cuja primeira letra é 'M'");

        lista.removeIf(familia->familia.charAt(0)=='M');
        for (String familia:lista) {
            System.out.println(familia);
        }
        System.out.println("\n");

        System.out.println("Encontrar o indice de um elemento 'Pai'");
        System.out.println("Index of 'Pai': "+lista.indexOf("Pai"));

        System.out.println("Quando não encontra indice por não existir");
        System.out.println("Index of 'Marcolina': "+lista.indexOf("Marcolina"));

        System.out.println("Filtrando os elementos que começam por'J' e criar nova lista");
        List<String> result=lista.stream().filter(familia->familia.charAt(0)=='J').collect(Collectors.toList());
        for(String familia:result){
            System.out.println(familia);
        }

        //Encontrar primeiro elemento que começe pela letra 'J', senão não existir retornar null
        String name=lista.stream().filter(familia->familia.charAt(0)=='J').findFirst().orElse(null);


    }
}
