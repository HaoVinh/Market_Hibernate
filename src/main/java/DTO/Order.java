
package DTO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name ="Orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
    
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;
    
    @Column(name = "Date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    @Column(name = "Total")
    private float total;
    
    @Column(name = "Note")
    private String note;

    public Order() {
    }

    public Order(int orderID, Customer customer, Date date, float total, String note) {
        this.orderID = orderID;
        this.customer = customer;
        this.date = date;
        this.total = total;
        this.note = note;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    

}
