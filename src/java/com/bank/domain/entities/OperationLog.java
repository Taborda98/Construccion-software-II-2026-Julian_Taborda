package java.com.bank.domain.entities;

import java.com.bank.domain.enums.OperationType;
import java.com.bank.domain.enums.UserRole;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * Represents an operation log entry for auditing.
 */
public class OperationLog {

    private String id;
    private OperationType operationType;
    private LocalDateTime dateTime;
    private Long userId;
    private UserRole userRole;
    private String affectedProductId;
    private Map<String, Object> details;

    public OperationLog(String id,
                        OperationType operationType,
                        LocalDateTime dateTime,
                        Long userId,
                        UserRole userRole,
                        String affectedProductId,
                        Map<String, Object> details) {

        this.id = id;
        this.operationType = operationType;
        this.dateTime = dateTime;
        this.userId = userId;
        this.userRole = userRole;
        this.affectedProductId = affectedProductId;
        this.details = details;
    }
}