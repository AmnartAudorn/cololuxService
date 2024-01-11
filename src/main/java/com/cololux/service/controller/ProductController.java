package com.cololux.service.controller;


import com.cololux.service.dto.ProductDto;
import com.cololux.service.entity.Product;
import com.cololux.service.respository.ProductRepository;
import com.cololux.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRep;

    @Autowired
    private ProductService service;

    @GetMapping("/get/product")
    public List<Product> getProduct() {
        return productRep.findAll();
    }


    @GetMapping("/get/product/code/{productId}")
    public ResponseEntity<ProductDto> getProductByCode(@PathVariable String productId) {
        ProductDto pDto = service.getProductByCode(productId);
        return new ResponseEntity<>(pDto, HttpStatus.OK);
    }


    @PostMapping("/create/product")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        ProductDto pDto = service.saveProduct(productDto);
        return new ResponseEntity<>(pDto, HttpStatus.OK);
    }


    @DeleteMapping("/delete/product/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String productId) {
        service.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
