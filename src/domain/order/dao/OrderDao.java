package domain.order.dao;

import domain.base.dao.BaseDao;
import domain.order.entity.SaleOrder;

public interface OrderDao extends BaseDao {
	SaleOrder find(Integer id);
}
