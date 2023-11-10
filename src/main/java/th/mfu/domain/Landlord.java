package th.mfu.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Landlord 
{
    @Id
    private String email;
    private String firstName;
    private String lastName;
    private String telephone;
    public Landlord()
    {

    }
    public Landlord(String email, String firstName, String lastName, String telephone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
}
