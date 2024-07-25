package com.example.microsevices.Aggregate.Services;

import com.example.microsevices.Aggregate.Model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public Product getProductById(Long productId) {
        // Dummy data, replace with actual logic
        return new Product(productId, "Sample Product", "A sample product description.");
    }
}
