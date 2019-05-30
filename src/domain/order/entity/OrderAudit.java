package domain.order.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "order_audit")
public class OrderAudit {

	private static final long serialVersionUID = 6754336386493018085L;

	@Id
    @Column(name = "ORDER_AUDIT_ID")
    protected Long id;
	
	@ManyToOne(targetEntity = BaseOrder.class, optional=false, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ORDER_ID")
	protected BaseOrder order;
	
	@Column(name = "ORDER_AUDIT_STATUS")
	protected String status;
	
	@Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
	protected Date date;
	
	@Column(name = "IS_CSR")
	protected Boolean isCsr = false;
	
	@Column(name = "ADMIN_USER_ID")
	protected Long adminUserId;
	
	@Column(name = "LOCATION_ID")
	protected Long locationId;
	
	@Column(name = "ORDER_AUDIT_DESC")
	protected String desc;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BaseOrder getOrder() {
		return order;
	}

	public void setOrder(BaseOrder order) {
		this.order = order;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsCsr() {
		return isCsr;
	}

	public void setIsCsr(Boolean isCsr) {
		this.isCsr = isCsr;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(Long adminUserId) {
		this.adminUserId = adminUserId;
		if(adminUserId != null){
			setIsCsr(true);
		}
			
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
