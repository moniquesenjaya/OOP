public class Account {

    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amt){
        this.balance += amt;
        return true;
    }

    public boolean withdraw(double amt){
        if (this.balance >= amt)
        {
            this.balance -= amt;
            return true;
        } else
        {
            return false;
        }

    }
}
