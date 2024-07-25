package com.example.microsevices.Aggregate.Services;

import com.example.microsevices.Aggregate.Model.Price;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    public Price getPriceByProductId(Long productId) {
        // Dummy data, replace with actual logic
        return new Price(productId, 99.99);
    }
}
