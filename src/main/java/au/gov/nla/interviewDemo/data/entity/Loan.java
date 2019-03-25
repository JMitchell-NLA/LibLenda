package au.gov.nla.interviewDemo.data.entity;

import javax.persistence.*;

@Entity
public class Loan {
    @Id
    @Column(name="LOAN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
