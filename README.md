# PRODUCTS : THE CHARGES & DISCOUNT IT INCLUDES

## Overview 

### 1. WHAT THIS APPLICATION DOES? 
	This application helps user to calculate final price of product based on its product category. 
	User can perform the following operations in the application.
	
	1. Add product
	2. Get product
	3. Get all product
	4. Update product
	5. Delete product
	

### Technologies used 
	Technologies used in this project are following-
	1. JAVA 8
	2. SpringBoot 3.0
	3. JPA(JAVA Persistence API)
	4. MySQL Database
	5. swagger 
	
### Instructions to run 
	1. Clone the application 
		a. git clone https://github.com/SwaranjalSingh/products.git
		
	2. Create Mysql database
		a. create database productdb
		b. run src/main/resources/productdb.sql
		
	3. Change mysql username and password as per your installation
		a. open src/main/resources/application.properties
		b. change spring.datasource.username and spring.datasource.password as per your mysql installation
		
	4. Run the app using maven
		a. mvn spring-boot:run
		b. The app will start running at http://localhost:8080
		
### Explore REST APIs
	
	GET(METHOD) - localhost:8080/products/{productID}/ - To get single product details.
	
	GET(METHOD) - localhost:8080/products/ - To get all product details.
	
	POST(METHOD) - localhost:8080/products/ - To add new product.
	
	PUT(METHOD) - localhost:8080/products/{productID}/ - To update single product.
	
	DELETE(METHOD) - localhost:8080/products/{productID}/ - To delete single product.
	
	
### Sample Valid JSON Request Body

	{
        "productId": 1005,
        "productName": "Neelkamal Bean Bag",
        "productType": "Sofa-Set",
        "productCategory": "Furniture",
        "productPrice": 350.0,
        "charges": {
		    "p_Id" : 5,
		    "p_Category" : "Furniture",
            "discount": 10.0,
            "gst": 18.0,
		    "delivery" : 300
        }
}
	







