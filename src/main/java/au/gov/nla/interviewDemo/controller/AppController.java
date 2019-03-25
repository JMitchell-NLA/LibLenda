package au.gov.nla.interviewDemo.controller;

import au.gov.nla.interviewDemo.data.entity.Book;
import au.gov.nla.interviewDemo.data.entity.Loan;
import au.gov.nla.interviewDemo.data.entity.User;
import au.gov.nla.interviewDemo.data.repository.BookRepository;
import au.gov.nla.interviewDemo.data.repository.LoanRepository;
import au.gov.nla.interviewDemo.data.repository.UserRepository;
import au.gov.nla.interviewDemo.service.UserLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/api")
@RestController
public class AppController {

    @Autowired
    UserLoanService userLoanService;

    @RequestMapping(value="/users", method= RequestMethod.GET)
    public List<User> findAllUsers(@RequestParam(name = "email",required = false) String email){
       return userLoanService.findAllUsers(email);
    }


    @RequestMapping(value="/books", method= RequestMethod.GET)
    public List<Book> findAllBooks(@RequestParam(name = "isbn",required = false) String isbn){
        return userLoanService.findAllBooks(isbn);
    }


    @RequestMapping("/loans/{User}")
    public List<Book> getBooksOnLoanToUser(@PathVariable("User") String userID) {
        return userLoanService.getBooksOnLoanToUser(userID);
    }
}
