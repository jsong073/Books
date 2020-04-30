public class BookApp {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "A young boy " +
                "discovers that he's a wizard", 30.0, true);
        System.out.println(harryPotter.getDisplayText());
        double cost = harryPotter.buyBooks(5);
        System.out.println(cost);
        harryPotter.setIsInStock(false);
        cost = harryPotter.buyBooks(5);
        System.out.println(cost);
    }
}
