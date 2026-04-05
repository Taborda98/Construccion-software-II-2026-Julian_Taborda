package java.com.bank.domain.entities;

/**
 * Representa un cliente empresarial del banco.
 */
public class CompanyClient {

    private String companyName;
    private String nit;
    private String email;
    private String phone;
    private String address;

    private NaturalClient legalRepresentative;

    public CompanyClient(String companyName, String nit,
                         String email, String phone,
                         String address,
                         NaturalClient legalRepresentative) {

        this.companyName = companyName;
        this.nit = nit;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.legalRepresentative = legalRepresentative;
    }

}
