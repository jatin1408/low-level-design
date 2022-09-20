package Models;

public class User {
    ATMCard card;
    BankAccount bankAccount;

    public User(ATMCard card, BankAccount bankAccount) {
        this.card = card;
        this.bankAccount = bankAccount;
    }

    public ATMCard getCard() {
        return card;
    }

}
