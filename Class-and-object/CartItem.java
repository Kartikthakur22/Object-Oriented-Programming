public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int quantity) {
        this.quantity += quantity;
        System.out.println("Added " + quantity + " " + itemName + "s to the cart.");
    }

    public void removeItem(int quantity) {
        if (quantity > this.quantity) {
            System.out.println("Cannot remove " + quantity + " " + itemName + "s because you only have " + this.quantity + " in the cart.");
        } else {
            this.quantity -= quantity;
            System.out.println("Removed " + quantity + " " + itemName + "s from the cart.");
        }
    }

    public void displayTotal() {
        double totalCost = this.price * this.quantity;
        System.out.println("Total cost for " + itemName + ": $" + totalCost);
    }
    public static void main(String[] args) {
        CartItem laptop = new CartItem("Laptop", 40000.00, 1);
        laptop.displayTotal();
        laptop.addItem(2);
        laptop.displayTotal();
        laptop.removeItem(1);
        laptop.displayTotal();
    }
}
