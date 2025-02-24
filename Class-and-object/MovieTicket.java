public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    public MovieTicket(String movieName){
        this.movieName=movieName;
        this.seatNumber="Not booked";
        this.price=0.0;
    }
    public void bookTicket(String seatNumber,double price){
        if(!this.seatNumber.equals("Not booked")){
            System.out.println("Ticket is already booked for seat "+seatNumber);
        }
        else{
            this.seatNumber=seatNumber;
            this.price=price;
            System.out.println("Successfully booked ticket for seat "+seatNumber);
        }
    }
    public void displayDetails(){
        if(this.seatNumber.equals("Not booked")){
            System.out.println("No ticket booked");
        }
        else{
            System.out.println("Movie : "+movieName);
            System.out.println("Seat number : "+seatNumber);
            System.out.println("Price : Rs"+price);
        }
    }
    public static void main(String[] args) {
        MovieTicket ticket1=new MovieTicket("The Founder");
        ticket1.bookTicket("B45",50);
        ticket1.displayDetails();
    }
}
