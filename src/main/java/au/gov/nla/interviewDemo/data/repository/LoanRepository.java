package au.gov.nla.interviewDemo.data.repository;

import au.gov.nla.interviewDemo.data.entity.Loan;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository <Loan,Long> {
    Iterable<Loan> findAll();
    Iterable<Loan> findAllByUser(String userID);  // does that work?
}
