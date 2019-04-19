package domain.product.service;

import java.util.List;

import domain.base.service.BaseService;
import domain.product.entity.Product;

public interface ProductService extends BaseService {
	public List<Product> getProductByName(String name);
	
}
