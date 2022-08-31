package VendingStates.Impl;

import Constants.ErrorMessages;
import Models.Coin;
import Models.DispenseState;
import Models.VendingMachine;
import VendingStates.State;
import Models.Item;

import java.util.List;

public class SelectionState implements State {
    public SelectionState() {
        System.out.println("In selection state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, String codeNumber) throws Exception {
       Item item=vendingMachine.getInventory().findItem(codeNumber);
       if(item == null) throw new Exception(ErrorMessages.ITEM_NOT_FOUND);
        System.out.println("Item check passed");
        Integer currentAmount=vendingMachine.calculateMoney();
       if(item.getPrice() > currentAmount) throw new Exception(ErrorMessages.INSUFFICIENT_FUNDS);
       if(item.getQuantity() < 1) throw new Exception(ErrorMessages.OUT_OF_STOCK);
       System.out.println("Product quantity and amount check passed");
       vendingMachine.setVendingMachineState(new DispenseState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine, String codeNumber) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
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
        throw new Exception(ErrorMessages.INVALID_STATE);
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
