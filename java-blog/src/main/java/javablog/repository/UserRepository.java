package javablog.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import javablog.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    User findByEmail(String email);


}
