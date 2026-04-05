package java.com.bank.domain.entities;

import java.com.bank.domain.enums.UserRole;
import java.com.bank.domain.enums.UserStatus;

/**
 * Represents a system user (authentication and roles).
 */
public class User {

    private Long id;
    private String username;
    private String password;
    private UserRole role;
    private UserStatus status;

    // Relación opcional con cliente
    private String clientId;

    public User(Long id, String username, String password,
                UserRole role, UserStatus status, String clientId) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
        this.clientId = clientId;
    }
}