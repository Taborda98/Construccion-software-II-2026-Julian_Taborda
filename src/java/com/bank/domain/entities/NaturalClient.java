package com.bank.domain.entities;

/**
 * Representa un cliente persona natural del banco.
 * Hereda información del usuario del sistema.
 */
public class NaturalClient extends User {

    public NaturalClient(Long id, String fullName, String identification,
                         String email, String phone,
                         java.time.LocalDate birthDate, String address,
                         com.bank.domain.enums.UserRole role,
                         com.bank.domain.enums.UserStatus status) {

        super(id, fullName, identification, email, phone, birthDate, address, role, status);
    }
}
