package java.com.bank.domain.entities;

import java.com.bank.domain.enums.UserStatus;
import java.time.LocalDate;

import java.com.bank.domain.enums.UserRole;

/**
 * Representa cualquier usuario del sistema bancario.
 * Puede ser cliente, empleado o analista interno.
 */
public class User {

    private Long id;
    private String fullName;
    private String identification;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String address;

    private UserRole role;
    private java.com.bank.domain.enums.UserStatus status;

    public User(Long id, String fullName, String identification, String email,
                String phone, LocalDate birthDate, String address,
                UserRole role, java.com.bank.domain.enums.UserStatus status2) {

        this.id = id;
        this.fullName = fullName;
        this.identification = identification;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.address = address;
        this.role = role;
        this.status = status2;
    }

}