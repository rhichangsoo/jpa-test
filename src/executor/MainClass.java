package executor;

import java.util.List;

import domain.order.salesorder.entity.SalesOrder;
import domain.order.service.OrderService;

public class MainClass extends UpperExecutor {
	public static void main(String[] args) {
		OrderService service = (OrderService)acac.getBean("orderService");
		List<SalesOrder> products = service.getSalesOrdersByCustomer(Integer.MIN_VALUE);
		products.forEach(System.out::println);
		
		acac.close();
	}
}
