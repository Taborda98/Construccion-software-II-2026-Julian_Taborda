package java.com.bank.application.services;

import java.com.bank.application.ports.input.TransferService;
import java.com.bank.application.ports.output.AccountRepository;
import java.com.bank.application.ports.output.TransferRepository;
import java.com.bank.domain.entities.BankAccount;
import java.com.bank.domain.entities.Transfer;
import java.math.BigDecimal;

/**
 * Implementation of transfer use cases.
 */
public class TransferServiceImpl implements TransferService {

    private final AccountRepository accountRepository;
    private final TransferRepository transferRepository;

    public TransferServiceImpl(AccountRepository accountRepository,
                               TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Override
    public void createTransfer(String fromAccount, String toAccount, double amount, Long userId) {

        BankAccount origin = accountRepository.findById(fromAccount)
                .orElseThrow(() -> new RuntimeException("Origin account not found"));

        BankAccount destination = accountRepository.findById(toAccount)
                .orElseThrow(() -> new RuntimeException("Destination account not found"));

        BigDecimal value = BigDecimal.valueOf(amount);

        // Validación de saldo
        if (origin.getBalance().compareTo(value) < 0) {
            throw new RuntimeException("Insufficient funds");
        }

        // Actualizar saldos
        origin.setBalance(origin.getBalance().subtract(value));
        destination.setBalance(destination.getBalance().add(value));

        // Guardar cambios
        accountRepository.save(origin);
        accountRepository.save(destination);

        // Crear transferencia
        Transfer transfer = new Transfer();
        transfer.setAmount(value);
        transfer.setOriginAccount(fromAccount);
        transfer.setDestinationAccount(toAccount);

        transferRepository.save(transfer);
    }
}