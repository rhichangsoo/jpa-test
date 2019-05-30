package domain.order.salesorder.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import domain.order.entity.BaseOrder;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "sales_order")
public class SalesOrder extends BaseOrder {
	private BigDecimal shippinFee;

	public BigDecimal getShippinFee() {
		return shippinFee;
	}

	public void setShippinFee(BigDecimal shippinFee) {
		this.shippinFee = shippinFee;
	}
	
}
