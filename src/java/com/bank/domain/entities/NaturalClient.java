package java.com.bank.domain.entities;

import java.time.LocalDate;

/**
 * Represents an individual client.
 */
public class NaturalClient extends Client {

    private String fullName;
    private LocalDate birthDate;

    public NaturalClient(String clientId, String fullName, String email,
                         String phone, String address, LocalDate birthDate) {
        super(clientId, email, phone, address);

        if (birthDate == null || birthDate.plusYears(18).isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Client must be over 18 years old");
        }

        this.fullName = fullName;
        this.birthDate = birthDate;
    }
}