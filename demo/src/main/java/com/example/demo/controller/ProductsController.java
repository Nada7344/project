package com.example.demo.controller;

import com.example.demo.model.Products;
import com.example.demo.service.ProductServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Products")
@Slf4j
public class ProductsController {
    @Autowired
    private ProductServices service ;
    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody Products P1) {
     Products P2 = service.create(P1);
        return new ResponseEntity<>(P2, HttpStatus.CREATED);
    }
}
