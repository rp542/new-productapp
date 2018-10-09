package com.capgemini.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.product.entities.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
