package java.com.bank.domain.entities;

import java.com.bank.domain.enums.AccountStatus;
import java.com.bank.domain.enums.AccountType;
import java.com.bank.domain.enums.Currency;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Representa una cuenta bancaria del cliente.
 */
public class BankAccount {

    private String accountNumber;
    private AccountType accountType;
    private String ownerId;

    private BigDecimal balance;

    private Currency currency;
    private AccountStatus status;

    private LocalDate openDate;

    public BigDecimal getBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }

    public void setBalance(BigDecimal subtract) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBalance'");
    }

    public String getAccountNumber() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountNumber'");
    }

}
