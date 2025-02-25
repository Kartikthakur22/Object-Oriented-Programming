public class Book {
    private String title;
    private String author;
    private int price;
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public Book(){
        this.title="Eat pray love";
        this.author="Elizabeth";
        this.price=200;
    }
    public void displayDetails(){
        System.out.println("Title of book : "+title);
        System.out.println("Author of book : "+author);
        System.out.println("Price of book : "+price);
    }
    public static void main(String[] args) {
        Book book1=new Book(" The Psychology of Money","Morgan Housel",100);
        book1.displayDetails();
        Book book2=new Book();
        book2.displayDetails();
    }
}
