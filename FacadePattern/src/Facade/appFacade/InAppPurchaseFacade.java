package Facade.appFacade;

public class InAppPurchaseFacade {
    private float balance = 50_000;

    public InAppPurchaseFacade() {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public boolean purchase(float value) {
        if (!canPurchase(value)) { return false; }
        balance -= value;
        return true;
    }

    public void recharge(float value) {
        if (value < 0) { return; }
        balance += value;
    }

    public boolean canPurchase(float value) {
        return balance > value;
    }
}
