public class Vehicle {
    private String ownerName;
    private String vehicleType;
    static private double registrationFee=2000;
    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public static void updateRegistrationFee(double newRegistrationFee){
        Vehicle.registrationFee=newRegistrationFee;
    }
    public void displayVehicleDetails(){
        System.out.println("Owner name:"+ownerName);
        System.out.println("Vehicle type:"+vehicleType);
    }
    public static void getRegistrationFees(){
        System.out.println("Registration fees:"+Vehicle.registrationFee);
    }
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle("Kartik", "Two-wheeler");
        vehicle1.displayVehicleDetails();
        Vehicle.getRegistrationFees();
        Vehicle.updateRegistrationFee(1000);
        Vehicle.getRegistrationFees();
    }
}
