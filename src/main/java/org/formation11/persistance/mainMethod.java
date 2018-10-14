package org.formation11.persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation11.modele.Client;
import org.formation11.modele.Conseiller;

public class mainMethod {
	
	public static void main(String[] args) {
		System.out.println("éleo");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		Client c = null;

		try {	
			trx.begin();
		c = em.find(Client.class, 1);
		System.out.println(c.getEmail());
			trx.commit();

		} catch (Exception e) {
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}
	
	}

}
