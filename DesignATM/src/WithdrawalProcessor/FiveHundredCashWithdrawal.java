package WithdrawalProcessor;

import Models.ATM;

public class FiveHundredCashWithdrawal extends CashWithdrawal{
    public FiveHundredCashWithdrawal(CashWithdrawal cashWithdrawal) {
        super(cashWithdrawal);
    }

    @Override
   public void withdrawal(ATM atm, int remAmount) {
        int required =  remAmount / 500;
        int balance = remAmount % 500;

        if (atm.getNoOfFiveHundredNotes() >= required) {
            atm.deductAmount(500, required);
        }
        else if(required > atm.getNoOfFiveHundredNotes()) {
            int fiveHundredNotes = atm.getNoOfFiveHundredNotes();
            atm.deductAmount(500, fiveHundredNotes);
            balance = balance + (required - fiveHundredNotes) * 500;
        }

        if(balance!=0) super.withdrawal(atm, balance);
    }
}
