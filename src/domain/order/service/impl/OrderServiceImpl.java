package domain.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.order.dao.OrderDao;
import domain.order.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao orderDao;
}
