package guru.springframework.sdjpa_intro.repoitories;

import guru.springframework.sdjpa_intro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
