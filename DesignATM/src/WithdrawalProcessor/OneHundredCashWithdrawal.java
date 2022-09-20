package WithdrawalProcessor;

import Models.ATM;

public class OneHundredCashWithdrawal extends CashWithdrawal{
    public OneHundredCashWithdrawal(CashWithdrawal cashWithdrawal) {
        super(cashWithdrawal);
    }

    @Override
    public void withdrawal(ATM atm, int remAmount) {
        int required =  remAmount / 100;
        int balance = remAmount % 100;

        if (atm.getNoOfOneHundredNotes() >= required) {
            atm.deductAmount(100, required);
        }
        else if(required > atm.getNoOfOneHundredNotes()) {
            int oneHundredNotes = atm.getNoOfOneHundredNotes();
            atm.deductAmount(100, oneHundredNotes);
            balance = balance + (required - oneHundredNotes) * 100;
        }
        if(balance!=0) System.out.println("System ran into a problem");
    }
}
