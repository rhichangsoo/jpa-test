package domain.product.entity;

import java.math.BigDecimal;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import domain.common.entity.ChangeHistory;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    @Embedded
    private ChangeHistory changeHistory;
    
	private String name;
	
    private BigDecimal price;

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
