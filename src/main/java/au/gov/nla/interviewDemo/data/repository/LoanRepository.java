package au.gov.nla.interviewDemo.data.repository;

import au.gov.nla.interviewDemo.data.entity.Loan;
import au.gov.nla.interviewDemo.data.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository <Loan,Long> {
    Iterable<Loan> findAll();
    Iterable<Loan> findAllByUser(User user);  // does that work?
}
