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
        /*
   select
        salesorder1_.id as id1_1_,
        salesorder1_1_.C_CUSTOMER_ID as C_CUSTOM6_1_,
        salesorder1_1_.createDate as createDa2_1_,
        salesorder1_1_.U_CUSTOMER_ID as U_CUSTOM7_1_,
        salesorder1_1_.updateDate as updateDa3_1_,
        salesorder1_1_.customer_id as customer8_1_,
        salesorder1_1_.dateOfOrder as dateOfOr4_1_,
        salesorder1_1_.totalAmount as totalAmo5_1_,
        salesorder1_.shippinFee as shippinF1_6_ 
    from
        customer customer0_ cross 
    join
        sales_order salesorder1_ 
    inner join
        base_order salesorder1_1_ 
            on salesorder1_.id=salesorder1_1_.id 
    where
        customer0_.id=salesorder1_1_.customer_id
         */
		return entityManager.createQuery(criteriaQuery).getResultList();
	}

}
