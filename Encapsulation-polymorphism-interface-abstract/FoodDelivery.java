abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 2.0; // Additional charge for non-veg items
    }

    @Override
    public void applyDiscount() {
        System.out.println("Discount applied: 10% off on non-veg items");
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on non-veg items";
    }
}

class FoodOrder {
    private FoodItem[] items;

    public FoodOrder(FoodItem[] items) {
        this.items = items;
    }

    public void processOrder() {
        double totalAmount = 0;

        for (FoodItem item : items) {
            System.out.println(item.getItemDetails() + ", Total Price: " + item.calculateTotalPrice());
            totalAmount += item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount();
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println();
        }

        System.out.println("Total Order Amount: " + totalAmount);
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Vegetable Pizza", 12.50, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 8.00, 3);
        
        FoodItem[] items = {vegItem, nonVegItem};

        FoodOrder order = new FoodOrder(items);
        order.processOrder();
    }
}
