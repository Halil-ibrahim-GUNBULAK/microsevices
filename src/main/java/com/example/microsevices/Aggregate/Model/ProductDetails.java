package com.example.microsevices.Aggregate.Model;

public class ProductDetails {
    private Long id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;

    public ProductDetails(Long id, String name, String description, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                " name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
