package org.formation11.persistance;


import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation11.modele.Client;
import org.formation11.modele.CompteCourant;
import org.formation11.modele.CompteEpargne;
import org.formation11.modele.Conseiller;

public class DaoClientImplementation implements DaoClient {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	EntityManager em = emf.createEntityManager();

	@Override
	public void createCustomer(Client c, Conseiller c1, CompteCourant cc, CompteEpargne ce) {
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();

			c.setCompteCourant(cc);
			c.setCompteEpargne(ce);
			c.setConseiller(c1);
			em.persist(c);
			trx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}

	}

	@Override
	public Client findCustomerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyCustomer(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Client> findAllCustomer(Long idconseiller) {
		// TODO Auto-generated method stub
		return null;
	}

}
