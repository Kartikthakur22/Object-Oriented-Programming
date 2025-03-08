import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " has placed an order with ID: " + order.getOrderID());
    }

    public void listOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderID() + " Total Price: " + order.calculateTotalPrice());
        }
    }
}

class Order {
    private String orderID;
    private List<Product> products;

    public Order(String orderID) {
        this.orderID = orderID;
        this.products = new ArrayList<>();
    }

    public String getOrderID() {
        return orderID;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added " + product.getName() + " to Order ID: " + orderID);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void listProducts() {
        System.out.println("Products in Order ID: " + orderID);
        for (Product product : products) {
            System.out.println(product.getName() + " - Price: " + product.getPrice());
        }
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        // Creating Customers
        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Smith");

        // Creating Products
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Smartphone", 500.00);
        Product product3 = new Product("Headphones", 150.00);

        // Creating Orders for customers
        Order order1 = new Order("ORD001");
        Order order2 = new Order("ORD002");

        // Adding products to orders
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product3);

        // Customers placing orders
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Listing customer orders
        customer1.listOrders();
        customer2.listOrders();

        // Listing products in each order
        order1.listProducts();
        order2.listProducts();
    }
}
