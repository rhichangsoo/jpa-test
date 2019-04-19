package domain.order.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import domain.order.dao.OrderDao;
import domain.order.entity.SaleOrder;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

	@Override
	public SaleOrder find(Integer id) {
		Query query = entityManager.createQuery("select product from domain.order.entity.SaleOrder saleOrder where saleOrder.id = :id");
		query.setParameter("id", id);
		return (SaleOrder) query.getSingleResult();
	}

}
