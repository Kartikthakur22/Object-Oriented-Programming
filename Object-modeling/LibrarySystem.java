import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        library1.displayLibraryBooks();
        library2.displayLibraryBooks();

        System.out.println("\nIndependent Book: ");
        book1.displayBookInfo();
    }
}
class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}

