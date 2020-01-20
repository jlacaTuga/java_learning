package entities;

public class BusinessAccountPlus extends BusinessAccount {
    public BusinessAccountPlus(Double loanLimit) {
        super(loanLimit);
    }

    public BusinessAccountPlus(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance, loanLimit);
    }


    //Não consegue sobreescrever pois na classe herdada está final
    @Override
    public  void withdraw(double amount) {
       balance-=amount+2.0;
    }


}
