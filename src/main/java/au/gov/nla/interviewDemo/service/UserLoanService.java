package au.gov.nla.interviewDemo.service;

import au.gov.nla.interviewDemo.data.entity.Book;
import au.gov.nla.interviewDemo.data.entity.Loan;
import au.gov.nla.interviewDemo.data.entity.User;
import au.gov.nla.interviewDemo.data.repository.BookRepository;
import au.gov.nla.interviewDemo.data.repository.LoanRepository;
import au.gov.nla.interviewDemo.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserLoanService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    BookRepository bookRepository;

    public List<User> findAllUsers(String email){
        List<User> users = new ArrayList<>();
        if(email==null || email.equals("")){
            Iterable<User> results = this.userRepository.findAll();
            results.forEach(user -> users.add(user));
        }else{
            User user = this.userRepository.findByEmail(email);
            if(user != null){
                users.add(user);
            }
        }
        return users;
    }


    public List<Book> findAllBooks(String isbn){
        List<Book> books = new ArrayList<>();
        if(isbn==null || isbn.equals("")){
            Iterable<Book> results = this.bookRepository.findAll();
            results.forEach(book -> books.add(book));  // I <3 arrow functions :)
        }else{
            Book book = this.bookRepository.findByIsbn(isbn);
            if(book != null){
                books.add(book);
            }
        }
        return books;
    }


    public List<Book> getBooksOnLoanToUser(String userID){
        List<Book> books = new ArrayList<>();
        if(userID != null && !userID.equals("")) {
            long id = Long.parseLong(userID);
            Iterable<Loan> results = this.loanRepository.findAllByUser(userRepository.findById(id));
            results.forEach(loan -> books.add(loan.getBook()));
        }
        return books;
    }


}
