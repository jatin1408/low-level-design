package WithdrawalProcessor;
import Models.ATM;


public abstract class CashWithdrawal {
    CashWithdrawal cashWithdrawal;

    CashWithdrawal(CashWithdrawal cashWithdrawal) {
        this.cashWithdrawal = cashWithdrawal;
    }
    public void withdrawal(ATM atm, int remAmount) {

        if(cashWithdrawal!=null) {
            System.out.println(String.format("In class -> %s " , this.cashWithdrawal.getClass().getSimpleName()));
            cashWithdrawal.withdrawal(atm, remAmount);
        }

    }
}
