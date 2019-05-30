package domain.order.entity;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import domain.common.entity.ChangeHistory;
import domain.customer.entity.Customer;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "base_order")
public class BaseOrder {
    @Id
    @GeneratedValue
    private Integer id;

    @Embedded
    private ChangeHistory changeHistory;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;
    private Date dateOfOrder;
    
    private BigDecimal totalAmount;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ChangeHistory getChangeHistory() {
        return changeHistory;
    }
    public void setChangeHistory(ChangeHistory changeHistory) {
        this.changeHistory = changeHistory;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Date getDateOfOrder() {
        return dateOfOrder;
    }
    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
}
