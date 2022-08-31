package VendingStates;

import Models.VendingMachine;
import Models.Coin;

import java.util.List;

public interface State {
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void selectProduct(VendingMachine vendingMachine,String codeNumber) throws Exception;
    public void dispense(VendingMachine vendingMachine, String codeNumber) throws Exception;
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception;
    public int refundChange(VendingMachine vendingMachine, int refundAmount) throws Exception;

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;
}
