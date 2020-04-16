package entities;

public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //Ordenar pelo nome
    /*@Override
    public int compareTo(Employee employee) {
        return name.compareTo(employee.getName());

    }*/

    //Ordenar pelo salario
   /* @Override
    public int compareTo(Employee employee) {
        return salary.compareTo(employee.getSalary());

    }*/

   //Ordenar salario por ordem decrescente
    @Override
    public int compareTo(Employee employee) {
        return -salary.compareTo(employee.getSalary());

    }


}
