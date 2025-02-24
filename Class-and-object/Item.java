public class Item {
    private String itemCode;
    private String itemName;
    private int price;
    Item(String itemCode,String itemName,int price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Item Code : "+itemCode);
        System.out.println("Item Name : "+itemName);
        System.out.println("Item Price : "+price);
    }
    public int totalCost(int quantity){
        return quantity*price;
    }
    public static void main(String[] args) {
        Item item1=new Item("B547", "mobile", 20000);
        item1.displayDetails();
        int quantity=3;
        int cost=item1.totalCost(quantity);
        System.out.println("Total cost of "+quantity+" "+item1.itemName+"s will be "+cost);
    }
}
