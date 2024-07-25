package com.example.microsevices.Aggregate.Services;

import com.example.microsevices.Aggregate.Model.Price;
import com.example.microsevices.Aggregate.Model.Product;
import com.example.microsevices.Aggregate.Model.ProductDetails;
import com.example.microsevices.Aggregate.Model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductAggregatorService {

    private final ProductService productService;
    private final PriceService priceService;
    private final StockService stockService;

    @Autowired
    public ProductAggregatorService(ProductService productService, PriceService priceService, StockService stockService) {
        this.productService = productService;
        this.priceService = priceService;
        this.stockService = stockService;
    }

    public ProductDetails getProductDetails(Long productId) {
        Product product = productService.getProductById(productId);
        Price price = priceService.getPriceByProductId(productId);
        Stock stock = stockService.getStockByProductId(productId);

        return new ProductDetails(product.getId(), product.getName(), product.getDescription(),
                price.getAmount(), stock.getQuantity());
    }
}