package com.example.microsevices.Aggregate.Model;

public class Price {
    private Long productId;
    private double amount;

    // Constructor, getters, and setters

    public Price(Long productId, double amount) {
        this.productId = productId;
        this.amount = amount;
    }

    // Getters and setters

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}