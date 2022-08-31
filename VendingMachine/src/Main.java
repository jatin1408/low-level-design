import Models.Coin;
import Models.Item;
import Models.VendingMachine;
import VendingStates.Impl.IdleState;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.setVendingMachineState(new IdleState());
        try {

            vendingMachine.getVendingMachineState().clickOnInsertCoinButton(vendingMachine);
            vendingMachine.getVendingMachineState().insertCoin(vendingMachine,Coin.DIME);
            vendingMachine.getVendingMachineState().insertCoin(vendingMachine,Coin.NICKEL);
            vendingMachine.getInventory().addItem(new Item("102", 3, 2));
            vendingMachine.getInventory().addItem(new Item("103", 4, 3));
            vendingMachine.getVendingMachineState().clickOnSelectProductButton(vendingMachine);
            vendingMachine.getVendingMachineState().selectProduct(vendingMachine, "102");
            vendingMachine.getVendingMachineState().dispense(vendingMachine, "102");
            //This should throw an error
            vendingMachine.getVendingMachineState().selectProduct(vendingMachine, "103");


        }
        catch (Exception error) {
            System.out.println(error);
        }
    }
}
