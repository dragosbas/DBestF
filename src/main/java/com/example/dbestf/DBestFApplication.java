package com.example.dbestf;

import com.example.dbestf.Entities.Product;
import com.example.dbestf.Repositories.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DBestFApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DBestFApplication.class, args);
        ProductRepository produsRepository = applicationContext.getBean(ProductRepository.class);
        produsRepository.save(new Product(1l));
        System.out.printf("Bla");
    }

}
