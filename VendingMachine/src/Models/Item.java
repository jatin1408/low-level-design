package Models;

public class Item {
    String code;
    int price;
    int quantity;
    public Item(String code, int price, int quantity) {
        this.code = code;
        this.price = price;
        this.quantity=quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
