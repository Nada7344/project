package com.example.demo.service;

import com.example.demo.Repo.ProductRepository;
import com.example.demo.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository Repo;
    public Products create (Products product1){
        Products product2 = new Products();
        product2.setName(product1.getName());
        product2.setPrice(product2.getPrice());
       Repo.save(product2);
        return product2;
    }
}
