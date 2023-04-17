package Library;

import java.util.List;
import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many books do you want to add? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the author of the book: ");
            String author = scanner.nextLine();
            System.out.print("Enter the title of the book: ");
            String title = scanner.nextLine();
            System.out.print("Enter the price of the book: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            Book book = new Book(author, title, price);
            library.addBook(book);
            System.out.println("Book added: " + book);
        }
        System.out.print("Enter an author to search for: ");
        String authorQuery = scanner.nextLine();
        List<Book> booksByAuthor = library.searchByAuthor(authorQuery);
        System.out.println("Books by " + authorQuery + ": " + booksByAuthor);
        System.out.print("Enter a title to search for: ");
        String titleQuery = scanner.nextLine();
        List<Book> booksByTitle = library.searchByTitle(titleQuery);
        System.out.println("Books with the title " + titleQuery + ": " + booksByTitle);
    }
}