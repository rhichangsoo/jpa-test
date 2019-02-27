package domain.product.service;

import java.util.List;

import domain.product.entity.Product;

public interface ProductService {
	public List<Product> getProductByName(String name);
	
}
