package WithdrawalProcessor;

import Models.ATM;

public class TwoThousandCashWithdrawal extends CashWithdrawal{

    public TwoThousandCashWithdrawal(CashWithdrawal cashWithdrawal) {
        super(cashWithdrawal);
    }

    @Override
    public void withdrawal(ATM atm, int remAmount) {
        int required =  remAmount / 2000;
        int balance = remAmount % 2000;

        if (atm.getNoOfTwoThousandNotes() >= required) {
            atm.deductAmount(2000, required);
        }
        else if(required > atm.getNoOfTwoThousandNotes()) {
                int twoThousandNotes = atm.getNoOfTwoThousandNotes();
                atm.deductAmount(2000, twoThousandNotes);
                balance = balance + (required - twoThousandNotes) * 2000;
        }
        if(balance!=0) super.withdrawal(atm, balance);

    }
}
