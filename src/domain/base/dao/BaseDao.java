package domain.base.dao;

import javax.persistence.EntityManager;

import persistence.PersistenceManager;

public interface BaseDao {
	EntityManager entityManager = PersistenceManager.INSTANCE.getEntityManager();
}
