package Models;

import Constants.ErrorMessages;
import VendingStates.Impl.IdleState;
import VendingStates.State;

import java.util.List;

public class DispenseState implements State {
    public DispenseState() {
        System.out.println("In dispense state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, String codeNumber) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }

    @Override
    public void dispense(VendingMachine vendingMachine, String codeNumber) throws Exception {
        Item item=vendingMachine.getInventory().findItem(codeNumber);
        item.setQuantity(item.getQuantity()-1);
        System.out.println("Changed product quantity");
        int refundAmount = vendingMachine.calculateMoney() - item.getPrice();
        System.out.println("Money spent : " + item.getPrice());
        refundChange(vendingMachine,refundAmount);
        System.out.println("Dispensing item code: " + codeNumber);
        vendingMachine.setVendingMachineState(new IdleState());
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refunding whole amount");
        List<Coin> money=vendingMachine.getCoins();
        vendingMachine.setVendingMachineState(new IdleState());
        return money;
    }

    @Override
    public int refundChange(VendingMachine vendingMachine, int refundAmount) throws Exception {
        System.out.println("Refunded change amount of : " + refundAmount);
        return refundAmount;
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }
}
