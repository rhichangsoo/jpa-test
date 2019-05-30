package domain.order.service;

import java.util.List;

import domain.order.salesorder.entity.SalesOrder;

public interface OrderService {
	public SalesOrder findSalesOrder(Integer id);
	public List<SalesOrder> getSalesOrdersByCustomer(Integer customerId);
}
