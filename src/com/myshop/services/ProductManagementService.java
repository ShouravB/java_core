package com.myshop.services;

import com.myshop.entities.Product;

public interface ProductManagementService {
	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);


}
