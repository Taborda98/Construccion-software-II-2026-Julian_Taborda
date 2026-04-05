package java.com.bank.domain.entities;

/**
 * Represents a company client.
 */
public class CompanyClient extends Client {

    private String businessName;
    private String legalRepresentativeId;

    public CompanyClient(String clientId, String businessName, String email,
                         String phone, String address, String legalRepresentativeId) {
        super(clientId, email, phone, address);

        this.businessName = businessName;
        this.legalRepresentativeId = legalRepresentativeId;
    }
}