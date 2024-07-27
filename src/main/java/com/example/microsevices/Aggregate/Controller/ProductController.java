package com.example.microsevices.Aggregate.Controller;

import com.example.microsevices.Aggregate.Model.ProductDetails;
import com.example.microsevices.Aggregate.Services.ProductAggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductAggregatorService productAggregatorService;

    @Autowired
    public ProductController(ProductAggregatorService productAggregatorService) {
        this.productAggregatorService = productAggregatorService;
    }
    @GetMapping("")
    public ResponseEntity<String> getMessageDetails() {

        String message="JEKİRDEK";
        return ResponseEntity.ok(message);
    }
    @GetMapping("/{productId}")
    public ResponseEntity<String> getProductDetails(@PathVariable String productId) {

        ProductDetails productDetails = productAggregatorService.getProductDetails(Long.getLong(productId));
        return ResponseEntity.ok(productDetails.toString());
    }
}
