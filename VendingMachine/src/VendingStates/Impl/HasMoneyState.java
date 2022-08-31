package VendingStates.Impl;

import Constants.ErrorMessages;
import Models.Coin;
import Models.VendingMachine;
import VendingStates.State;

import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState() {
        System.out.println("In has money state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        vendingMachine.getCoins().add(coin);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, String codeNumber) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }

    @Override
    public void dispense(VendingMachine vendingMachine, String codeNumber) throws Exception {
        throw new Exception(ErrorMessages.INVALID_STATE);
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refunding amount");
        List<Coin> refund=vendingMachine.getCoins();
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return refund;
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
        vendingMachine.setVendingMachineState(new SelectionState());
    }
}
