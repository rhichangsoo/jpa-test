package domain.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.product.dao.ProductDao;
import domain.product.entity.Product;
import domain.product.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	@Autowired()
	ProductDao productDao;
	
	@Override
	public List<Product> getProductByName(String name) {
		return productDao.getProductsByName(name);
	}

}
