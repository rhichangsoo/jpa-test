package executor;

import java.util.List;

import domain.order.service.OrderService;
import domain.product.entity.Product;
import domain.product.service.ProductService;

public class MainClass extends UpperExecutor {
	public static void main(String[] args) {
		ProductService productService = (ProductService)ctx.getBean("productService");
		List<Product> products = productService.getProductByName("신짱");
		products.forEach(System.out::println);
		
		OrderService orderService = (OrderService)ctx.getBean("orderService");
		ctx.close();
	}
}
