package Facade.model;

import java.util.List;

public class Store {
    public final String name;
    public final List<Item> itemList;

    public Store(String name, List<Item> itemList) {
        this.name = name;
        this.itemList = itemList;
    }
}
