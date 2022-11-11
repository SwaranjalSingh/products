package com.product.product.services;

import java.util.List;
import java.util.Optional;

import com.product.product.entities.Product;

public interface ProductService {

	public List<Product> getProducts();

	public Optional<Product> getProduct(long productId);

	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public void deleteProduct(long parseLong);
}
