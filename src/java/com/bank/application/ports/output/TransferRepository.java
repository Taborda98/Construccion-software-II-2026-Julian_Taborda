package java.com.bank.application.ports.output;

import java.com.bank.domain.entities.Transfer;

/**
 * Output port for transfer persistence.
 */
public interface TransferRepository {

    void save(Transfer transfer);

}