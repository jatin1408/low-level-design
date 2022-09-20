import Models.*;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();
        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), 1234);
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.getCard(), TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.getCard(), 2700);
        atmRoom.atm.printCurrentATMStatus();


    }
    public void initialize() {
        atm=ATM.getATMObject();
        atm.setAtmBalance(5000);
        atm.setNoOfFiveHundredNotes(5);
        atm.setNoOfTwoThousandNotes(1);
        atm.setNoOfOneHundredNotes(5);
        ATMCard atmCard = createCard();
        this.user = new User(atmCard, atmCard.getBankAccount());
    }
    public ATMCard createCard() {
        BankAccount bankAccount = createBankAccount();
       ATMCard card=new ATMCard(1234, 000, "07/24", "1001-2001-1002-2002", bankAccount);
        return card;
    }
    public BankAccount createBankAccount() {
        BankAccount bankAccount = new BankAccount("Alex", 7000);
        return bankAccount;
    }
}
