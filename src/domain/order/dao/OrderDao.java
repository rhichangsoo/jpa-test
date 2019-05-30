package domain.order.dao;

import java.util.List;

import domain.base.dao.BaseDao;
import domain.order.entity.BaseOrder;
import domain.order.salesorder.entity.SalesOrder;

public interface OrderDao extends BaseDao {
	BaseOrder find(Integer id);
	SalesOrder findSalesOrder(Integer id);
	List<SalesOrder> getSalesOrdersByCustomer(Integer customerId);
}
