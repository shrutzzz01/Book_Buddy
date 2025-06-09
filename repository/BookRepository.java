package repository;

import model.Book;
import java.util.*;

public interface BookRepository {
    void addBook(Book book);

    List<Book> getAllBooks();

    List<Book> getReadBooks();

    List<Book> getUnreadBooks();

    Book findByTitle(String title);

    List<Book> filterByGenre(String genre);
}
