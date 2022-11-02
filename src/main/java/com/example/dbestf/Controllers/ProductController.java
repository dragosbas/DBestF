package com.example.dbestf.Controllers;

import com.example.dbestf.Entities.Product;
import com.example.dbestf.Services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

@CrossOrigin
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value="/products/getAll/")
    public ResponseEntity<List<Product>> getAllProducts(){return ResponseEntity.ok(productService.findAll());}
}
