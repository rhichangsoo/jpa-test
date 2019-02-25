package domain.order.item.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import domain.common.entity.ChangeHistory;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue
    private Integer id;
    
    private ChangeHistory changeHistory;
}
