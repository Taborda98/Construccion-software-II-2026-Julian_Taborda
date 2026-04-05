package java.com.bank.domain.entities;

/**
 * Base class for all clients (person or company).
 */
public abstract class Client {

    protected String clientId;
    protected String email;
    protected String phone;
    protected String address;

    public Client(String clientId, String email, String phone, String address) {
        this.clientId = clientId;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getClientId() {
        return clientId;
    }
}