package au.gov.nla.interviewDemo.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @Column(name="BOOK_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="TITLE")
    private String title;
    @Column(name="AUTHOR")
    private String author;
    @Column(name="ISBN")
    private String isbn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

