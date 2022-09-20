package Models;

public class BankAccount {
    String name;
    int balance;
    public BankAccount(String name, int balance) {
        this.balance = balance;
        this.name = name;
    }





    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
