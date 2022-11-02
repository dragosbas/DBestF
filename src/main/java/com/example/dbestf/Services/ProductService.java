package com.example.dbestf.Services;

import com.example.dbestf.Entities.Product;
import com.example.dbestf.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {return productRepository.findAll();}

}
