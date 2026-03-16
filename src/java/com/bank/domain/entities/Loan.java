package com.bank.domain.entities;

import com.bank.domain.enums.LoanStatus;
import com.bank.domain.enums.LoanType;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Representa un préstamo solicitado por un cliente.
 */
public class Loan {

    private Long id;

    private LoanType type;

    private String clientId;

    private BigDecimal requestedAmount;
    private BigDecimal approvedAmount;

    private double interestRate;

    private int months;

    private LoanStatus status;

    private LocalDate approvalDate;
    private LocalDate disbursementDate;

    private String destinationAccount;

}
