package java.com.bank.application.ports.input;

/**
 * Input port for loan use cases.
 */
public interface LoanService {

    void requestLoan(String clientId, double amount);

    void approveLoan(Long loanId, Long analystId);

}