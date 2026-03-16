package com.bank.domain.entities;

import com.bank.domain.enums.AccountStatus;
import com.bank.domain.enums.AccountType;
import com.bank.domain.enums.Currency;

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

}
