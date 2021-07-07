/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author pc
 */
@CrossOrigin(origins = "*")
@RequestMapping("/product")
@RestController
public class ProductController {
    
    private final ProductService productService;
    
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @PostMapping
    public void add(@RequestBody Product product){
        productService.add(product);
    }
    
    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }
    
    @GetMapping(path = "{id}")
    public Optional<Product> getById(@PathVariable("id") String id){
        return productService.getById(id);
    }
    
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") String id){
        productService.delete(id);
    }
    
    @PutMapping(path = "{id}")
    public void update(@PathVariable("id") String id,@RequestBody Product product){
        productService.update(id, product);
    }
    
}
