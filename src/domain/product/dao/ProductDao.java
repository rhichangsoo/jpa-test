package domain.product.dao;

import java.util.List;

import domain.base.dao.BaseDao;
import domain.product.entity.Product;

public interface ProductDao extends BaseDao {
	public List<Product> getProductsByName(String name);
}
