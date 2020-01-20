package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc=new Account(1001,"Alex",0.0);
        BusinessAccount bacc=new BusinessAccount(1002,"Maria", 0.0, 500.0);

        //Upcasting
        Account acc1=bacc;
        Account acc2=new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3=new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //Downcasting
        BusinessAccount acc4=(BusinessAccount)acc2;
        acc4.loan(100);

        //Não pode, acc3 é uma SavingsAccount e acc5 é BusinessAccount, só vai dar erro de casting na execução
        //BusinessAccount acc5=(BusinessAccount)acc3;
        //Deve-se testar para ver se é possivel o Cast da seguinte maneira:
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5=(BusinessAccount)acc3;
            acc5.loan(200);
            System.out.println("Loan done");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5=(SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update done");
        }
    }
}
