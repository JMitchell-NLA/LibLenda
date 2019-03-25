package au.gov.nla.interviewDemo.data.repository;

import au.gov.nla.interviewDemo.data.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByPhoneNumber(String phoneNumber);  // Wow.. that's cool.
    User findByUsername(String userName);
    User findByEmail(String email);
    Iterable<User> findAll(); // should populate.
}
