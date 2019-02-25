package executor;

import javax.persistence.EntityManager;

import domain.customer.entity.Customer;
import persistence.PersistenceManager;

public class RemoveExecutor {

	public static void main(String[] args) {
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();

        Customer customer = em.find(Customer.class, 2);

        em.getTransaction().commit();
        em.close();
        PersistenceManager.INSTANCE.close();
	}

}
