package com.capgemini.product.service;

import com.capgemini.product.entities.Product;
import com.capgemini.product.exceptions.ProductNotFoundException;

public interface ProductService {
	public Product addProduct(Product product);

	public Product findProductById(int productIds) throws ProductNotFoundException;

	public Product updateProduct(Product product) throws ProductNotFoundException;

	public void deleteProduct(int productId);
}
