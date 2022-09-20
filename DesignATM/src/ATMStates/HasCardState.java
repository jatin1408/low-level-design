package ATMStates;

import Models.ATM;
import Models.ATMCard;

public class HasCardState extends ATMState {

    public HasCardState() {
        System.out.println("In Has Card state");
    }

    @Override
    public void authenticatePin(ATM atm, ATMCard atmCard, int pin) {
        boolean isValidPin = atmCard.validatePin(pin);
        if(!isValidPin) {
            System.out.println("Incorrect pin");
            return;
        }
        atm.setCurrentATMState(new SelectOperationState());
    }

    @Override
    void returnCard() {
        super.returnCard();
    }

    @Override
    void exit(ATM atm) {
        super.exit(atm);
    }
}
