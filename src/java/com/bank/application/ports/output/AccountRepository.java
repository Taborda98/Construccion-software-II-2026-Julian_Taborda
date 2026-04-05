package java.com.bank.application.ports.output;

import java.com.bank.domain.entities.BankAccount;
import java.util.Optional;

/**
 * Output port for accessing bank account data.
 */
public interface AccountRepository {

    void save(BankAccount account);

    Optional<BankAccount> findById(String accountNumber);

}