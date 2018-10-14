package org.formation11.persistance;


import java.util.Set;

import org.formation11.modele.Client;
import org.formation11.modele.CompteCourant;
import org.formation11.modele.CompteEpargne;
import org.formation11.modele.Conseiller;

public interface DaoClient {
	
	void createCustomer(Client c, Conseiller c1, CompteCourant cc, CompteEpargne ce);
	
	public Client findCustomerById(Long id);

	public void modifyCustomer(Client c);

	public Set<Client> findAllCustomer(Long idconseiller);

	

}
