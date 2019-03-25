package au.gov.nla.interviewDemo.controller;

import au.gov.nla.interviewDemo.data.entity.Book;
import au.gov.nla.interviewDemo.data.entity.Loan;
import au.gov.nla.interviewDemo.data.entity.User;
import au.gov.nla.interviewDemo.data.repository.BookRepository;
import au.gov.nla.interviewDemo.data.repository.LoanRepository;
import au.gov.nla.interviewDemo.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/api")
@RestController
public class AppController {

    // Wow look a repo!

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    BookRepository bookRepository;

    @RequestMapping(value="/users", method= RequestMethod.GET)
    public List<User> findAllUsers(@RequestParam(name = "email",required = false) String email){
       List<User> users = new ArrayList<>();
       if(email==null || email.equals("")){
           Iterable<User> results = this.userRepository.findAll();
           results.forEach(user -> users.add(user));  // I <3 arrow functions :)
       }else{
           User user = this.userRepository.findByEmail(email);
           if(user != null){
               users.add(user);
           }
       }
        return users;
    }


    //optional feature  .. This was a lot of boiler plate to replace.
    @RequestMapping(value="/books", method= RequestMethod.GET)
    public List<Book> findAllBooks(@RequestParam(name = "isbn",required = false) String isbn){
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

    // Could live in a DAO

    @RequestMapping("/loans/{User}")
    public List<Book> getBooksOnLoanToUser(@PathVariable("User") String userID){
        List<Book> books = new ArrayList<>();
        if(userID != null && !userID.equals("")) {
            long id = Long.parseLong(userID);
            Iterable<Loan> results = this.loanRepository.findAllByUser(userRepository.findById(id));
            results.forEach(loan -> books.add(loan.getBook()));
        }
        return books;
    }
}
