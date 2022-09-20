package ATMStates;

import Models.ATM;
import Models.ATMCard;
import Models.TransactionType;


public class SelectOperationState extends ATMState{
    public SelectOperationState() {
        System.out.println("In select operation state");
        renderAllTransactions();
    }

    @Override
    public void selectOperation(ATM atm, ATMCard atmCard, TransactionType transactionType) {
            switch (transactionType) {
                case CASH_WITHDRAWAL:
                    atm.setCurrentATMState(new CashWithdrawalState());
                    break;
                case BALANCE_CHECK:
                    atm.setCurrentATMState(new CheckBalanceState());
                    break;
                default:
                    System.out.println("OOPS not a valid option");
                    exit(atm);
            }
    }

    @Override
    void returnCard() {

    }

    @Override
    void exit(ATM atm) {

    }
    void renderAllTransactions() {
            TransactionType.getAllTransactionTypes();

    }
}
