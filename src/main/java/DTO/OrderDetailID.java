
package DTO;

import java.io.Serializable;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
public class OrderDetailID implements Serializable{
    
    private int order;
    private int vegetable;

    public OrderDetailID()
    {
        
    }

    public OrderDetailID(int order, int vegetable) {
        this.order = order;
        this.vegetable = vegetable;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getVegetable() {
        return vegetable;
    }

    public void setVegetable(int vegetable) {
        this.vegetable = vegetable;
    }
    
    
    
    
    
}
