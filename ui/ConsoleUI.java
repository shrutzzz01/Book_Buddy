package ui;

import java.util.*;
import model.Book;
import service.BookService;

public class ConsoleUI {
    private BookService bookService;
    private Scanner scanner;

    public ConsoleUI(BookService bookService) {
        this.bookService = bookService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("....BOOK BUDDY....");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. View Read Books");
            System.out.println("4. View Read Books");
            System.out.println("5. Filter by Genre");
            System.out.println("6. Mark Book as Read");
            System.out.println("7. Mark Book as Unread");
            System.out.println("8. Exit");
            System.out.println("------------------");
            System.out.println("Enter your Choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks(bookService.getAllBooks());
                    break;
                case 3:
                    viewBooks(bookService.getReadBooks());
                    break;
                case 4:
                    viewBooks(bookService.getUnreadBooks());
                    break;
                case 5:
                    filterByGenre();
                    break;
                case 6:
                    markAsRead();
                    break;
                case 7:
                    markAsUnread();
                    break;
                case 8:
                    System.out.println("Goodbye! 👋");
                    return;
                default:
                    System.out.println("Invalid choice.");

            }

        }
    }

    public void addBook() {
        System.out.println("Enter title");
        String title = scanner.nextLine();
        System.out.println("Enter author");
        String author = scanner.nextLine();
        System.out.println("Enter genre");
        String genre = scanner.nextLine();
        Book book = new Book(title, author, genre);
        bookService.addBook(book);
        System.out.println("Book added");
    }

    public void viewBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books to show");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void filterByGenre() {
        System.out.println("Enter the genre you want to filter it by:");
        String genre = scanner.nextLine();
        List<Book> books = bookService.filterByGenre(genre);
        viewBooks(books);
    }

    public void markAsRead() {
        System.out.println("Enter the title you want to mark:");
        String title = scanner.nextLine();
        boolean success = bookService.markBookAsRead(title);
        if (success) {
            System.out.println("Book marked");
        } else {
            System.out.println("Book not found");
        }
    }

    public void markAsUnread() {
        System.out.println("Enter the title you want to mark:");
        String title = scanner.nextLine();
        boolean success = bookService.markBookAsRead(title);
        if (success) {
            System.out.println("Book marked");
        } else {
            System.out.println("Book not found");
        }
    }

}
