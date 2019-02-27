package domain.product.dao;

import java.util.List;

import domain.product.entity.Product;

public interface ProductDao {
	public List<Product> getProductsByName(String name);
}
