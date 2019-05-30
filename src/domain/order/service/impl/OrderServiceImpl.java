package domain.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.customer.entity.Customer;
import domain.order.dao.OrderDao;
import domain.order.salesorder.entity.SalesOrder;
import domain.order.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao orderDao;

	@Override
	public SalesOrder findSalesOrder(Integer id) {
		return null;
	}

	@Override
	public List<SalesOrder> getSalesOrdersByCustomer(Integer customerId) {
		return orderDao.getSalesOrdersByCustomer(customerId);
	}
}
