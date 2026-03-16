package com.bank.domain.entities;

import com.bank.domain.enums.UserRole;
import com.bank.domain.enums.UserStatus;
import java.time.LocalDate;

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
    private UserStatus status;

    public User(Long id, String fullName, String identification, String email,
                String phone, LocalDate birthDate, String address,
                UserRole role, UserStatus status) {

        this.id = id;
        this.fullName = fullName;
        this.identification = identification;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.address = address;
        this.role = role;
        this.status = status;
    }

}