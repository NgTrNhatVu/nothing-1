///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.example.demo.dao;
//
//import com.example.demo.model.Product;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.stereotype.Repository;
//
///**
// *
// * @author pc
// */
//@Repository("fakeDao")
//public class FakeProductDataAccessService implements ProductDao{
//
//    private static final List<Product> fakeDB = new ArrayList<>();
//
//    @Override
//    public void add(Product product) {
//        fakeDB.add(product);
//    }
//
//    @Override
//    public List<Product> getAll() {
//        return fakeDB;
//    }
//
//    @Override
//    public Product getById(String id) {
//        for (Product p : fakeDB) {
//            if (id == p.getId()) {
//                return p;
//            } else {
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String id) {
//        int indexOfProduct = fakeDB.indexOf(getById(id));
//        if (indexOfProduct >= 0) {
//            fakeDB.remove(indexOfProduct);
//        }
//    }
//
//    @Override
//    public void update(String id, Product product) {
//        int indexOfProduct = fakeDB.indexOf(getById(id));
//        if (indexOfProduct >= 0) {
//            fakeDB.set(indexOfProduct, product);
//        }
//    }
//
//}
