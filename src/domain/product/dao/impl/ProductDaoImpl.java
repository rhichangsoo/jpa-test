package domain.product.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import domain.product.dao.ProductDao;
import domain.product.entity.Product;
import persistence.PersistenceManager;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
	EntityManager entityManager = PersistenceManager.INSTANCE.getEntityManager();
	@Override
	public List<Product> getProductsByName(String name) {
		Query query = entityManager.createQuery("select product from domain.product.entity.Product product where product.name = :name");
		query.setParameter("name", name);
		return query.getResultList();
	}

}
