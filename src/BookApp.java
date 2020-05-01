public class BookApp {
    public static void main(String[] args) {
        BookDatabase database = new BookDatabase();

        Book book1 = new Book("Head First Java", "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", "Java1001",47.50, true);

        database.addBook(book1);

        Book book2 = new Book("Thinking in Java", "Bruce Eckel",
                "Details about Java under the hood", "Java1002",20.00, true);
        database.addBook(book2);

        Book book3 = new Book("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
                "Everything you need to know in one place", "Orcl1003",45.00, true);
        database.addBook(book3);

        Book book4 = new Book("Automate the Boring Stuff with Python", "Al Sweigart", "Fun" +
                " with Python", "Python1004",10.50, true);
        database.addBook(book4);

        Book book5 = new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
                "Defend your base with Simple Circuits, Arduino, and Raspberry Pi",
                "Zombie1005",16.50, true);
        database.addBook(book5);

        Book book6 = new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris",
                "A dozen fiendishly fun projects for the Raspberry Pi", "Rasp1006",14.75,
                true);
        database.addBook(book6);

        Book sample = database.getBook("Java1001");

        System.out.println(book1.getDisplayText());
        System.out.println(sample.getDisplayText());

    }

}
