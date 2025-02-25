public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    public HotelBooking(){
        this.guestName="Jhon";
        this.roomType="Single";
        this.nights=1;
    }
    public HotelBooking(HotelBooking otherBooking){
        this.guestName=otherBooking.guestName;
        this.roomType=otherBooking.roomType;
        this.nights=otherBooking.nights;
    }
    public void displayDetails(){
        System.out.println("Guest Name:"+guestName+"  Room Type:"+roomType+"  Number of Nights:"+nights);
    }
    public static void main(String[] args) {
        HotelBooking booking1=new HotelBooking();
        booking1.displayDetails();
        HotelBooking booking2=new HotelBooking("Kartik","Superior",2);
        booking2.displayDetails();
        HotelBooking booking3=new HotelBooking(booking2);
        booking3.displayDetails();
    }
}
