package domain.common.entity;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import domain.customer.entity.Customer;

@Embeddable
public class ChangeHistory {
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="C_CUSTOMER_ID")
    private Customer createCustomer;
    
    private Date createDate;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="U_CUSTOMER_ID")
    private Customer updateCustomer;
    
    private Date updateDate;

    public Customer getCreateCustomer() {
        return createCustomer;
    }
    public void setCreateCustomer(Customer createCustomer) {
        this.createCustomer = createCustomer;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Customer getUpdateCustomer() {
        return updateCustomer;
    }
    public void setUpdateCustomer(Customer updateCustomer) {
        this.updateCustomer = updateCustomer;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
