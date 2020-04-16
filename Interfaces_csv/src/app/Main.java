package app;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        String path="/home/jlaca/IdeaProjects/java_learning/Interfaces_csv/src/app/in.txt";

        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String employeeCSV=br.readLine();
            while (employeeCSV!=null){
                String[] fields=employeeCSV.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCSV=br.readLine();
            }
            //Ordena por ordem alfabetica
            Collections.sort(list);
            for(Employee emp : list){
                System.out.println(emp.getName()+", "+emp.getSalary());
            }
            System.out.println("\n\n\n");

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
