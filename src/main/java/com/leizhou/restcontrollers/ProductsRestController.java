package com.leizhou.restcontrollers;

import com.leizhou.beans.Product;
import com.leizhou.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Controller
@RestController
public class ProductsRestController {

    @Autowired
    private ProductRepository productRepository;

//    @GetMapping("/api/products")
//    @ResponseBody
//    public List<Product> getProducts(){
//        List<Product> products = new ArrayList<>();
//        productRepository.findAll().forEach(item -> products.add(item));
//
//        return products;
//    }

    @GetMapping("/api/products")
    public ResponseEntity getProducts(@RequestParam("name") String name){
        List<Product> products = productRepository.searchByName(name);

        return new ResponseEntity(products, HttpStatus.OK);
    }

    @GetMapping("/api/products/{name}")
    public ResponseEntity getProduct(@PathVariable("name") String name){
        List<Product> products = productRepository.searchByName(name);

        return new ResponseEntity(products, HttpStatus.OK);
    }
}
