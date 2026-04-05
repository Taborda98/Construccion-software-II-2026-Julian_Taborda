package java.com.bank.application.ports.input;

/**
 * Input port for transfer use cases.
 */
public interface TransferService {

    void createTransfer(String fromAccount, String toAccount, double amount, Long userId);

}