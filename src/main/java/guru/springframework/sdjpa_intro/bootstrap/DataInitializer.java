package guru.springframework.sdjpa_intro.bootstrap;

import guru.springframework.sdjpa_intro.domain.Book;
import guru.springframework.sdjpa_intro.repoitories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile({"local", "default"})
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse");

        System.out.println("Id : " + bookDDD.getId());
        Book savedDDD = bookRepository.save(bookDDD);

        System.out.println("Id : " + savedDDD.getId());
        Book bookSIA = new Book("Spring In Action", "234234", "Oriely");

        Book saveSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book ->{
            System.out.println("book id: " + book.getId());
            System.out.println("book title : " + book.getTitle());
        });
    }
}
