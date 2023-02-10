package application_code;

public class Library {
    Book[] books;
    private int currentIndex;

    public Library() {
        books = new Book[10];
        currentIndex = 0;
    }

    public void addBook(Book book) {
        books[currentIndex++] = book;
        System.out.println("Book added: " + book.title + " by " + book.author);
    }

    public void checkOut(int id) {
        for (int i = 0; i < currentIndex; i++) {
            if (books[i].id == id && books[i].availability) {
                books[i].availability = false;
                System.out.println("Book checked out: " + books[i].title + " by " + books[i].author);
                return;
            }
        }
        System.out.println("Book not found or already taken.");
    }

    public void checkIn(int id) {
        for (int i = 0; i < currentIndex; i++) {
            if (books[i].id == id && !books[i].availability) {
                books[i].availability = true;
                System.out.println("Book checked in: " + books[i].title + " by " + books[i].author);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
