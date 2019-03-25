package au.gov.nla.interviewDemo;

import au.gov.nla.interviewDemo.controller.UserController;
import au.gov.nla.interviewDemo.data.entity.Book;
import au.gov.nla.interviewDemo.data.entity.Loan;
import au.gov.nla.interviewDemo.data.entity.User;
import au.gov.nla.interviewDemo.data.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertFalse;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterviewDemoApplicationTests {

	@Autowired
	UserController userController;
	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetLoansForUser(){
		User user = userRepository.findByEmail("jharris@live.com.au");
		ArrayList<Book> book = new ArrayList<>();
		Iterable<Book> results = userController.getBooksOnLoanToUser( user.getId() + "");
		results.forEach(book1 -> book.add(book1));
		assertFalse(book.isEmpty());
	}
}
