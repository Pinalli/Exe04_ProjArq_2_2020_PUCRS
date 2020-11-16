package Facade.model;

public class Item {
    public final String name, store;
    public final Float price;

    public Item(String name, String store, Float price) {
        this.name = name;
        this.store = store;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", U$ " + price;
    }
}
