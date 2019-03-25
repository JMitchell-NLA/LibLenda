package au.gov.nla.interviewDemo.data.repository;

import au.gov.nla.interviewDemo.data.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book,Long> {
    Book findByIsbn(String isbn);
    Iterable<Book> findAll(); // Give you all the books.
}
