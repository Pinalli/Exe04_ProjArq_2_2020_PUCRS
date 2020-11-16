package Facade.appFacade;

import Facade.model.Item;
import Facade.model.Store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommerceManagerFacade {

    private List<Store> stores;
    private List<Item> shoppingCart;
    private final Scanner scanner = new Scanner(System.in);

    public CommerceManagerFacade() {
        this.stores = new ArrayList<>();
        stores.add(new Store("Amazon", mockItems("Amazon")));
        stores.add(new Store("Ebay", mockItems("Ebay")));
        stores.add(new Store("AliExpress", mockItems("AliExpress")));
        this.shoppingCart = new ArrayList<>();
    }

    private List<Item> mockItems(String store) {
        return Arrays.asList(
                new Item("iPhone", store, (float)3_999.0),
                new Item("MacBook", store, (float)19_999.0),
                new Item("iPad", store, (float)9_999.0),
                new Item("Home Pod", store, (float)899.0),
                new Item("iPod", store, (float)2_999.0),
                new Item("Watch", store, (float)1_999.0)
        );
    }

    public void addItemToCart() {
        // Selects store
        int storeIndex = getSelectedStoreIndex();
        if (storeIndex < 0 || storeIndex >= stores.size()) {
            System.out.println("Invalid value. Please, try again.\n");
            return;
        }

        // Selects item
        List<Item> items = stores.get(storeIndex).itemList;
        int itemIndex = getSelectedItem(items);
        if (itemIndex < 0 || itemIndex >= items.size()) {
            System.out.println("Invalid value. Please, try again.\n");
            return;
        }

        // Add item to cart
        if (shoppingCart.contains(items.get(itemIndex))) {
            System.out.println("Item was already added!\n");
        } else {
            Item item = items.get(itemIndex);
            shoppingCart.add(item);
            System.out.println("Item is in your shopping cart!\n");
        }
    }

    public boolean removeItemFromCart() {
        // Selects item
        int itemIndex = getSelectedItem(shoppingCart);
        if (itemIndex < 0 || itemIndex >= shoppingCart.size()) {
            System.out.println("Invalid value. Please, try again.");
            return false;
        }

        // Remove item from cart
        boolean flag = shoppingCart.remove(itemIndex) != null;
        if (flag) {
            System.out.println("Item successfully removed");
        } else {
            System.out.println("Item didnt found");
        }

        return flag;
    }

    public float shoppingCartTotal() {
        return shoppingCart.stream().map(a -> a.price).reduce((float)0, Float::sum);
    }

    public void clearCart() {
        shoppingCart.clear();
    }

    private int getSelectedStoreIndex() {
        System.out.println("Select a store:");
        for (int i = 0; i < stores.size(); i++) {
            System.out.println((i + 1) + ". " + stores.get(i).name);
        }
        return scanner.nextInt() - 1;
    }

    private int getSelectedItem(List<Item> items) {
        System.out.println("Select a item:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).name);
        }
        return scanner.nextInt() - 1;
    }

    public List<Store> getStores() {
        return stores;
    }

    public List<Item> getShoppingCart() {
        return shoppingCart;
    }
}
