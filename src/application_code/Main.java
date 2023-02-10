package application_code;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add book");
            System.out.println("2. Check out book");
            System.out.println("3. Check in book");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter id: ");
                    int id = sc.nextInt();

                    library.addBook(new Book(title, author, id));
                    break;

                case 2:
                    System.out.print("Enter id: ");
                    id = sc.nextInt();

                    library.checkOut(id);
                    break;

                case 3:
                    System.out.print("Enter id: ");
                    id = sc.nextInt();

                    library.checkIn(id);
                    break;

                case 4:
                    System.out.println("Quitting the program...");
                    return;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
