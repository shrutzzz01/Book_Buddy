package service;

import java.util.*;

import model.Book;
import repository.BookRepository;

public class BookService {
    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(Book book) {
        repository.addBook(book);
    }

    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }

    public List<Book> getReadBooks() {
        return repository.getReadBooks();
    }

    public List<Book> getUnreadBooks() {
        return repository.getUnreadBooks();
    }

    public List<Book> filterByGenre(String genre) {
        return repository.filterByGenre(genre);
    }

    public boolean markBookAsRead(String title) {
        Book book = repository.findByTitle(title);
        if (book != null) {
            book.setRead(true);
            return true;
        }
        return false;
    }

    public boolean markBookAsUnread(String title) {
        Book book = repository.findByTitle(title);
        if (book != null) {
            book.setRead(false);
            return false;
        }
        return true;
    }
}
