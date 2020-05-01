import java.util.ArrayList;

public class BookDatabase {
    ArrayList<Book> books;

    //constructor
    public BookDatabase() {
        this.books = new ArrayList<Book>();
    }

    public BookDatabase(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean searchDatabase(String sku) {
        boolean bookFound = false;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (sku.equals(book.getSku())) {
                bookFound = true;
            }
        }
        return bookFound;
    }

    public Book getBook(String sku) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (sku.equals(book.getSku())) {
                return book;
            }
        }
        throw new IllegalArgumentException("SKU not found.");
    }

    public ArrayList<Book> getDatabase() {
        return books;
    }




}
