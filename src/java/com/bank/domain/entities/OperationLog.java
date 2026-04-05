package java.com.bank.domain.entities;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * Representa un registro en la bitácora de operaciones del sistema.
 * Se usa para auditoría y trazabilidad.
 */
public class OperationLog {

    private String id;

    private String operationType;

    private LocalDateTime dateTime;

    private Long userId;

    private String userRole;

    private String affectedProductId;

    private Map<String, Object> details;

}
