package app;

import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Account account;

        System.out.println("Enter account number");
        int number= sc.nextInt();
        System.out.println("Enter account holder");
        sc.nextLine();
        String holder=sc.nextLine();
        System.out.println("Is there an initial deposit? (y/n)");
        char response=sc.next().charAt(0);

        if(response=='y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit=sc.nextDouble();
            account=new Account(number, holder, initialDeposit);

        }else{
            account=new Account(number, holder);
        }

        System.out.println("\n Account data: "+account+"\n");
        System.out.println("Enter a deposit value: ");
        double depositValue=sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: "+account);


        sc.close();

    }
}
