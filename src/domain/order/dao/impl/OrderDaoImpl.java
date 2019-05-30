package domain.order.dao.impl;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import domain.customer.entity.Customer;
import domain.order.dao.OrderDao;
import domain.order.entity.BaseOrder;
import domain.order.salesorder.entity.SalesOrder;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

	@Override
	public BaseOrder find(Integer id) {
		Query query = entityManager.createQuery("select product from domain.order.entity.SaleOrder saleOrder where saleOrder.id = :id");
		query.setParameter("id", id);
		return (BaseOrder) query.getSingleResult();
	}

	@Override
	public SalesOrder findSalesOrder(Integer id) {
		return entityManager.find(SalesOrder.class, id);
	}

	@Override
	public List<SalesOrder> getSalesOrdersByCustomer(Integer customerId) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = builder.createQuery();
        
        Root<Customer> customerRoot = criteriaQuery.from(Customer.class);
        Root<SalesOrder> salesOrderRoot = criteriaQuery.from(SalesOrder.class);

        Predicate predicate = builder.and(
        		builder.equal(customerRoot.get("id"), salesOrderRoot.get("customer").get("id"))
        		);
        
        criteriaQuery.select(salesOrderRoot);
        criteriaQuery.where(predicate);
        
		return entityManager.createQuery(criteriaQuery).getResultList();
	}

}
