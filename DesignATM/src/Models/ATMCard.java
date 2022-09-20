package Models;

public class ATMCard {
    int pin;
    int cvv;
    String expiryDate;

    String cardNumber;

    BankAccount bankAccount;

    public ATMCard(int pin, int cvv, String expiryDate, String cardNumber,BankAccount bankAccount) {
        this.pin = pin;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;

    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public boolean validatePin(int pin) {
        return this.pin == pin;

    }
    public int getBankBalance() {
        return this.bankAccount.getBalance();

    }
    public void deductBalance(int amount) {
        this.bankAccount.setBalance(this.bankAccount.getBalance() - amount);
    }
}
