package java.com.bank.application.ports.output;

import java.com.bank.domain.entities.OperationLog;

/**
 * Output port for operation logging (NoSQL).
 */
public interface OperationLogRepository {

    void save(OperationLog log);

}