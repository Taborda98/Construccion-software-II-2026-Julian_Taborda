package java.com.bank.domain.entities;

import java.com.bank.domain.enums.TransferStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representa una transferencia de dinero entre cuentas.
 */
public class Transfer {

    private Long id;

    private String originAccount;
    private String destinationAccount;

    private BigDecimal amount;

    private LocalDateTime creationDate;
    private LocalDateTime approvalDate;

    private TransferStatus status;

    private Long createdByUser;
    private Long approvedByUser;
    public void setAmount(BigDecimal value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAmount'");
    }
    public void setOriginAccount(String fromAccount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setOriginAccount'");
    }
    public void setDestinationAccount(String toAccount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDestinationAccount'");
    }

}
