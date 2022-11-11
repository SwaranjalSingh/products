package com.product.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.product.entities.Product;
import com.product.product.services.ProductService;


@RestController
public class ProductController {
	@Autowired
	private ProductService productService; 
	
	//to get all products
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		 List<Product> products = productService.getProducts();
		 products.stream().forEach(each-> {
			 each.setFinalPrice((each.getProductPrice()+each.getCharges().getGst()
					 +each.getCharges().getDelivery())-(each.getDiscount()/100)*(each.getProductPrice()+each.getCharges().getGst()
							 +each.getCharges().getDelivery()));
		 });
		 return products;
	}
	
	//get a product
	@GetMapping("/products/{productId}")
	public Optional<Product> getProduct(@PathVariable String productId)
	{
		return this.productService.getProduct(Long.parseLong(productId));
	}
	
	//add new product
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product)
	{
		return this.productService.addProduct(product);
	}
	
	// update product
		@PutMapping("/products")
		public Product updateProduct(@RequestBody Product product)
		{
			return this.productService.updateProduct(product);
		}
		
	//delete product
				@DeleteMapping("/products/{productId}")
				public String deleteProduct(@PathVariable String productId)
				{	
						this.productService.deleteProduct(Long.parseLong(productId));
						return "Item deleted";
										
				}
	
}
