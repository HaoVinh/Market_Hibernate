package DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vegetable")
public class Vegetable implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vegetableID;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CatagoryID")
    private Category category;
    
    @Column(name = "VegetableName")
    private String vegetableName;
    
    @Column(name = "Unit")
    private String unit;
    
    @Column(name = "Amount")
    private int amount;
    
    @Column(name = "Image")
    private String image;
    
    @Column(name = "Price")
    private float Price;

    public Vegetable()
    {
    }

    public Vegetable(int vegetableID, Category category, String vegetableName, String unit, int amount, String image, float Price) {
        this.vegetableID = vegetableID;
        this.category = category;
        this.vegetableName = vegetableName;
        this.unit = unit;
        this.amount = amount;
        this.image = image;
        this.Price = Price;
    }

    public int getVegetableID() {
        return vegetableID;
    }

    public void setVegetableID(int vegetableID) {
        this.vegetableID = vegetableID;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
    
    
}
