package Inheritance;

import java.sql.Date;

class Order{
    protected String orderId;
    protected Date orderDate;
    public Order(String orderId,Date orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    public String getOrderStatus(){
        return "orderPlaced";
    }
}

class ShippedOrder extends Order{
    protected String trackingNumber;
    public ShippedOrder(String orderId,Date orderDate,String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }
    public String getOrderStatus(){
        return "order shipped";
    }
}
class DeliveredOrder extends ShippedOrder {
    private Date deliveryDate;

    public DeliveredOrder(String orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}
public class OrderManagement {
    public static void main(String[] args) {
        Date orderDate = new Date(0, 0, 0);
        Date deliveryDate = new Date(orderDate.getTime() + 86400000L);  // Delivery date one day after order date

        Order order = new Order("O12345", orderDate);
        ShippedOrder shippedOrder = new ShippedOrder("O12346", orderDate, "T123456789");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O12347", orderDate, "T987654321", deliveryDate);

        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Shipped Order Status: " + shippedOrder.getOrderStatus());
        System.out.println("Delivered Order Status: " + deliveredOrder.getOrderStatus());

    }
}
