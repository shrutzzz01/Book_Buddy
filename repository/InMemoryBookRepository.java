package repository;

import model.Book;
import java.util.*;

public class InMemoryBookRepository implements BookRepository {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (!books.contains(book))
            books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getReadBooks() {
        List<Book> readBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getRead() == true) {
                readBooks.add(book);
            }
        }
        return readBooks;
    }

    public List<Book> getUnreadBooks() {
        List<Book> unreadBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getRead() == false) {
                unreadBooks.add(book);
            }
        }
        return unreadBooks;
    }

    public List<Book> filterByGenre(String Genre) {
        List<Book> genreBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(Genre)) {
                genreBooks.add(book);
            }
        }
        return genreBooks;
    }

    public Book findByTitle(String title) {
        Book b = null;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                b = book;
            }
        }
        return b;
    }
}
