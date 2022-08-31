package Models;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> items;
    public Inventory() {
        this.items=new ArrayList<>();
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public List<Item> getAllItems() {
        return this.items;
    }
    public Item findItem(String code) {
        System.out.println("Finding item in inventory with item code: " + code);
      Item itemObject=this.items.stream().filter(item -> item.code.equals(code)).findFirst().orElse(null);
      return itemObject;
    }
}
