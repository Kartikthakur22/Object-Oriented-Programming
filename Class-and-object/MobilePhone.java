public class MobilePhone {
    private String brand;
    private String model;
    private int price;
    public MobilePhone(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Mobile brand : "+brand);
        System.out.println("Mobile model : "+model);
        System.out.println("Mobile price : "+price);
    }
    public static void main(String[] args) {
        MobilePhone mobile1=new MobilePhone("Xiomi", "Redmi note 14 pro", 30000);
        mobile1.displayDetails();
    }
}
