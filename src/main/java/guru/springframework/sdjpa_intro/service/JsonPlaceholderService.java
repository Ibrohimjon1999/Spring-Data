package guru.springframework.sdjpa_intro.service;

import guru.springframework.sdjpa_intro.domain.Book;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface JsonPlaceholderService {
    @GetExchange("/books")
    List<Book> loadBook();
}
