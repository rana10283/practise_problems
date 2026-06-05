public class Book {

    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {

        Book b1 = new Book("Java Basics");

        Book b2 = new Book("OOP Concepts", "John Doe");

        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
    }
}