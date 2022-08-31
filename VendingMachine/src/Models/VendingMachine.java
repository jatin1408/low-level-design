package Models;

import VendingStates.Impl.IdleState;
import VendingStates.State;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VendingMachine {
    List<Coin> coins;
    State vendingMachineState;

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    Inventory inventory;
    public VendingMachine() {
        this.coins=new ArrayList<>();
        vendingMachineState=new IdleState();
        inventory=new Inventory();
    }
    public void setCoins(List<Coin> coins) {
        this.coins=coins;
    }

    public List<Coin> getCoins() {
        return coins;
    }
    public void setVendingMachineState(State state) {
        this.vendingMachineState=state;
    }

    public Integer calculateMoney() {
       return this.coins.stream().collect(Collectors.summingInt(coin -> coin.value));
    }
}
