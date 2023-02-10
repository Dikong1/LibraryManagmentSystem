package application_code;

public class Book {
    String title;
    String author;
    int id;
    boolean availability;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.availability = true;
    }
}
