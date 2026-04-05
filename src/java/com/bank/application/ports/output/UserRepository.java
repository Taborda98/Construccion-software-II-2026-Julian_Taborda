package java.com.bank.application.ports.output;

import java.com.bank.domain.entities.User;
import java.util.Optional;

/**
 * Output port for user persistence.
 */
public interface UserRepository {

    Optional<User> findById(Long id);

}