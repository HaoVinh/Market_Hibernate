package DTO;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Customers")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerID;
    
    @Column(name = "Password")
    private String password;
    
    @Column(name = "FullName")
    private String fullName;
    
    @Column(name = "Address")
    private String address;
    
    @Column(name = "City")
    private String city;

    public Customer()
    {
    }
    
    public Customer(int customerID, String password, String fullName, String address, String city) {
        this.customerID = customerID;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.city = city;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
    
