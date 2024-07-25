package com.example.microsevices.Aggregate.Services;

import com.example.microsevices.Aggregate.Model.Stock;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    public Stock getStockByProductId(Long productId) {
        // Dummy data, replace with actual logic
        return new Stock(productId, 20);
    }
}
