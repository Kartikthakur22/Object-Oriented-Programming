public class Books {
    public String ISBN;
    protected String title;
    private String author;

    public Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

class EBook extends Books {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.getAuthor());
    }
}

class Main {
    public static void main(String[] args) {
        Books book1 = new Books("123-456", "Java Programming", "John");
        book1.displayBookDetails();
        book1.setAuthor("Jane");
        
        book1.displayBookDetails();

        EBook eBook1 = new EBook("987-654", "Advanced Java", "Alice");
        eBook1.displayEBookDetails();
    }
}
