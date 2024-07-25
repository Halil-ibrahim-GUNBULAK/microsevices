package com.example.microsevices.Aggregate.Model;

public class Stock {
    private Long productId;
    private int quantity;

    // Constructor, getters, and setters

    public Stock(Long productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters and setters

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}