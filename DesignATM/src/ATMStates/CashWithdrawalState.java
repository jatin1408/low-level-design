package ATMStates;

import Models.ATM;
import Models.ATMCard;
import WithdrawalProcessor.CashWithdrawal;
import WithdrawalProcessor.FiveHundredCashWithdrawal;
import WithdrawalProcessor.OneHundredCashWithdrawal;
import WithdrawalProcessor.TwoThousandCashWithdrawal;

public class CashWithdrawalState extends ATMState{
    public CashWithdrawalState() {
        System.out.println("In cash withdrawal state");
    }


    @Override
    public void cashWithdrawal(ATM atm, ATMCard atmCard, int amount) {
        if(atm.getAtmBalance() < amount) {
            System.out.println("Amount is greater than atm balance");
            exit(atm);
        } else if (atmCard.getBankBalance() < amount) {
            System.out.println("Insufficient funds");
            exit(atm);
        }
        atmCard.deductBalance(amount);
        CashWithdrawal cashWithdrawal = new TwoThousandCashWithdrawal(new FiveHundredCashWithdrawal(new OneHundredCashWithdrawal(null)));
        cashWithdrawal.withdrawal(atm, amount);
        exit(atm);

    }

    @Override
    void returnCard() {
        System.out.println("Please remove your card");
    }
    @Override
    void exit(ATM atm) {
        System.out.println("Thank you!");
        returnCard();
        atm.setCurrentATMState(new IdleState());
    }
}
