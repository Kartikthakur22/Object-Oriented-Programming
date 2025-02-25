public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalRate;  

    public CarRental(String customerName, String carModel, int rentalDays, double rentalRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRate = rentalRate;
    }

    public double calculateTotalCost() {
        return rentalDays * rentalRate;
    }

    public void displayDetails(){
        System.out.println("Customer Name:"+customerName);
        System.out.println("Car Model:"+carModel);
        System.out.println("Rental Days:"+rentalDays);
        System.out.println("Rental Rate:"+rentalRate);
        System.out.println("Total Cost:"+calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental car1=new CarRental("Kartik","thar",5,10000);
        car1.displayDetails();
    }

}
