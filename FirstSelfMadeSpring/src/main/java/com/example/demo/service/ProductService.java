/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public String add(Product product) {
        Product newProduct = productDao.insert(product);
        return "Product added " + newProduct.getEmployeeName();
    }

    public List<Product> getAll() {
        return productDao.findAll();
    }

    public Optional<Product> getById(String id) {
        Optional<Product> opt = productDao.findById(id);
        return opt;
    }

    public void delete(String id) {
        productDao.deleteById(id);
    }

    public void update(String id, Product product) {
        product.setId(id);
        productDao.save(product);
    }
}
