package Facade.appFacade;

public class Facade {

    private InAppPurchaseFacade inAppPurchaseFacade;
    private CommerceManagerFacade commerceManagerFacade;

    public Facade() {
        inAppPurchaseFacade = new InAppPurchaseFacade();
        commerceManagerFacade = new CommerceManagerFacade();
    }

    public void purchase() {
        if (commerceManagerFacade.getShoppingCart().isEmpty()) {
            System.out.println("Shopping cart is empty!");
            System.out.println("Please, add something to cart before buying!\n");
            return;
        }
        if (inAppPurchaseFacade.purchase(commerceManagerFacade.shoppingCartTotal())) {
            System.out.println("Purchased all items with success!");
            System.out.println("Printing purchased items: ");
            commerceManagerFacade.getShoppingCart().forEach(a -> System.out.println(a.name));
            commerceManagerFacade.clearCart();
        } else {
            System.out.println("Insufficient money!");
        }
    }

    public void addItem() {
        commerceManagerFacade.addItemToCart();
    }

    public void removeItem() {
        commerceManagerFacade.removeItemFromCart();
    }

    public void lookShoppingCart() {
        if (commerceManagerFacade.getShoppingCart().isEmpty()) {
            System.out.println("Shopping cart is empty, please add a item first!");
            return;
        }
        System.out.println("Your shopping cart:");
        commerceManagerFacade.getShoppingCart().forEach(System.out::println);
        System.out.println();
    }

    public void lookTotal() {
        if (commerceManagerFacade.getShoppingCart().isEmpty()) {
            System.out.println("Shopping cart is empty, please add a item first!\n");
            return;
        }
        System.out.println("Current total: U$ " + commerceManagerFacade.shoppingCartTotal() + "\n");
    }

    public void checkBalance() {
        System.out.println("Your current balance is of U$ " + inAppPurchaseFacade.getBalance());
    }

}
