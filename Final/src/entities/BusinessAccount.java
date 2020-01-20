package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(Double loanLimit) {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount<=loanLimit){
            deposit(amount);
        }
    }

    //O final não vai deixar que este metodo seja sobreescrito na classe que herda
    @Override
    public final void withdraw(double amount) {
        super.withdraw(amount);
        balance-=2.0;
    }
}
