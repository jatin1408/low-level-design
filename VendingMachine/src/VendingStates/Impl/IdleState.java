package VendingStates.Impl;
import Models.VendingMachine;
import Models.Coin;
import VendingStates.State;
import Constants.ErrorMessages;
import java.util.ArrayList;
import java.util.List;
public class IdleState implements State {
    public IdleState() {
        System.out.println("System in idle state");
    }
    public IdleState(VendingMachine vendingMachine) {
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }
    @Override
    public void selectProduct(VendingMachine vendingMachine,String codeNumber) throws Exception{
        throw new Exception(ErrorMessages.INVALID_STATE);
    }
    @Override
    public void dispense(VendingMachine vendingMachine, String codeNumber) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }
    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }
    @Override
    public int refundChange(VendingMachine vendingMachine, int refundAmount) throws Exception {
        throw  new Exception(ErrorMessages.INVALID_STATE);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }
}
