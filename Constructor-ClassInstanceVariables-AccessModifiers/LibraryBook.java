public class LibraryBook {
    private String title;
    private String author;
    private int price;
    private String availibility;
    public LibraryBook(String title,String author,int price,String availibility){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availibility=availibility;
    }
    public void borrowBook(){
        if(!this.availibility.equals("available")){
            System.out.println(title+" book is not available");
        }
        else{
            availibility="not available";
            System.out.println("You borrowed "+title+" book");
        }
    }
    public void displayDetails(){
        System.out.println("Book Title:"+title);
        System.out.println("Book Author:"+author);
        System.out.println("Book Price:"+price);
        System.out.println("Book Availability:"+availibility);
    }
    public static void main(String[] args) {
        LibraryBook book1=new LibraryBook("Eat pray love","Elizabeth",200,"available");
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();

    }
}
