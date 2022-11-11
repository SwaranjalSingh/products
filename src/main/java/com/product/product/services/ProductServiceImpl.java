package com.product.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.product.dao.ProductDao;
import com.product.product.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao; 
	
	
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		
		return productDao.findAll();
	}

	@Override
	public Optional<Product> getProduct(long productId) {
		// TODO Auto-generated method stub
		
		return productDao.findById(productId);
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
		return product;
	}

	@Override
	public void deleteProduct(long parseLong) {
		// TODO Auto-generated method stub
		Product entity= productDao.getReferenceById(parseLong);
		productDao.delete(entity);
	}
	

}
