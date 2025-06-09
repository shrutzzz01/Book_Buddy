import repository.BookRepository;
import repository.InMemoryBookRepository;
import service.BookService;
import ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        BookRepository repo = new InMemoryBookRepository();
        BookService service = new BookService(repo);
        ConsoleUI ui = new ConsoleUI(service);
        ui.start();
    }
}
