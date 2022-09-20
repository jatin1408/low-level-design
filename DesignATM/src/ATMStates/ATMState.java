package ATMStates;

import Models.ATM;
import Models.ATMCard;
import Models.TransactionType;

public abstract class ATMState {
     public void insertCard(ATM atm, ATMCard atmCard) {
         System.out.println("OOPS!! Something went wrong");

     }
     public void authenticatePin(ATM atm, ATMCard atmCard, int pin) {

         System.out.println("OOPS!! Something went wrong");
     }
     public void selectOperation(ATM atm, ATMCard atmCard, TransactionType transactionType) {
         System.out.println("OOPS!! Something went wrong");
     }
     public void cashWithdrawal(ATM atm, ATMCard atmCard, int amount) {
         System.out.println("OOPS!! Something went wrong");
     }
     void renderBalance(ATM atm, ATMCard atmCard) {
         System.out.println("OOPS!! Something went wrong");
     }
     void returnCard() {
         System.out.println("OOPS!! Something went wrong");
     }
     void exit(ATM atm) {
         System.out.println("OOPS!! Something went wrong");
     }

}
