public class Product {
    private String productName;
    private double price;
    private static int totalProducts=0;
    public Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    public void displayProductDetails(){
        System.out.println("Product Name:"+productName+"   Product Price:"+price);
    }
    public static void getTotalProducts(){
        System.out.println("Total Products:"+totalProducts);
    }
    public static void main(String[] args) {
        Product product1=new Product("Pen", 10.0);
        product1.displayProductDetails();
        Product product2=new Product("Pencil", 5.0);
        product2.displayProductDetails();
        Product.getTotalProducts();
    }
}
