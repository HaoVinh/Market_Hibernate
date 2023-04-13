
package DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "OrderDetail")
@IdClass(OrderDetailID.class)
public class OrderDetail implements Serializable {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "OrderID")
    private Order order;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "VegetableID")
    private Vegetable vegetable;
    
    @Column(name = "Quantity")
    private int quantity;
    
    @Column(name = "Price")
    private float price;

    public OrderDetail()
    {
        
    }

    public OrderDetail(Order order, Vegetable vegetable, int quantity, float price) {
        this.order = order;
        this.vegetable = vegetable;
        this.quantity = quantity;
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Vegetable getVegetable() {
        return vegetable;
    }

    public void setVegetable(Vegetable vegetable) {
        this.vegetable = vegetable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}