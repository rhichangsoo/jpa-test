package executor;

import javax.persistence.EntityManager;

import domain.address.entity.Address;
import persistence.PersistenceManager;

public class MergeExecutor {

	public static void main(String[] args) {
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();

        Address address = null;

        for(int i=0; i<10; i++) {
            address = new Address();
            address.setCity("seoul"+i).setCountry("korea").setPostcode("00"+i).setProvince("seoulProvince"+i).setStreet("seoulStreet"+i);
            em.merge(address);
        }

        em.getTransaction().commit();
        em.close();
        PersistenceManager.INSTANCE.close();
	}

}
