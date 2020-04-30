public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //Constructors

    //default constructor
    public Book() {

    }

    public Book (String title, String author, String description, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    //Getters
    public String getTitle () {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getIsInStock() {
        return this.isInStock;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsInStock(boolean isInStock) {
        this.isInStock = isInStock;
    }

    //methods
    public String getDisplayText(){
        String displayText = this.title + "\n" + this.author + "\n" + this.description;
        return displayText;
    }
}
