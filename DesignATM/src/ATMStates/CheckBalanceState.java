package ATMStates;

import Models.ATM;
import Models.ATMCard;

public class CheckBalanceState extends ATMState{
    public CheckBalanceState() {
        System.out.println("In check balance state");
    }

    @Override
    void renderBalance(ATM atm, ATMCard atmCard) {
       System.out.println(atmCard.getBankAccount().getBalance());
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
