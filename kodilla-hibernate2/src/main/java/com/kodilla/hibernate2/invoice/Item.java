package com.kodilla.hibernate2.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item {

    private int id;
    private BigDecimal price;
    private BigDecimal value;
    private int quantity;
    private Product product;
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, BigDecimal value, int quantity) {
        this.price = price;
        this.value = value;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }


    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    private void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
