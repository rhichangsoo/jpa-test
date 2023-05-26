package executor;

import javax.persistence.EntityManager;

import persistence.PersistenceManager;

public class MainClass {
	public static void main(String[] args) {
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.close();
        PersistenceManager.INSTANCE.close();		
	}
}
