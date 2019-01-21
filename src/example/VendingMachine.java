package example;

public class VendingMachine {

    public static final int CAPACITY = 20;

    int stock;

    boolean hasCoin;

    public VendingMachine() {
        stock = 0;
        hasCoin = false;
    }

    public VendingMachine(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Initializing with a negative number is not allowed");
        }
        if (stock > CAPACITY) {
            throw new IllegalArgumentException("Maximum capacity exceeded");
        }
        this.stock = stock;
        hasCoin = false;
    }

    public int fill(int n) {
        if (hasCoin) {
            throw new IllegalStateException("No refilling allowed while coin inserted");
        }
        if (n < 0) {
            throw new IllegalArgumentException("Refilling with a negative number is not allowed");
        }
        if (stock + n > CAPACITY) {
            throw new IllegalArgumentException("Maximum capacity exceeded");
        }
        stock += n;
        return stock;
    }

    public boolean insertCoin() {
        if (hasCoin) {
            throw new IllegalStateException("Coin already inserted");
        }
        if (stock == 0) {
            System.out.println
                ("Sorry, no bottles left. Please call the service number for a refill.");
            return false;
        }
        hasCoin = true;
        System.out.println("Coin inserted");
        return true;
    }

    public boolean getSoftdrink() {
        if (!hasCoin) {
            System.out.println("Sorry, no coin inserted yet.");
            return false;
        }
        System.out.println("Enjoy your drink");
        hasCoin = false;
        stock--;
        return true;
    }

}

