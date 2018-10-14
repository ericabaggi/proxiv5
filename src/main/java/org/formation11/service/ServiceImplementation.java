package org.formation11.service;

import java.util.Set;

import org.formation11.exceptions.MyExceptions;
import org.formation11.modele.Client;
import org.formation11.modele.CompteCourant;
import org.formation11.modele.CompteEpargne;
import org.formation11.modele.Conseiller;
import org.formation11.persistance.DaoClient;
import org.formation11.persistance.DaoClientImplementation;

public class ServiceImplementation implements Service {
	public DaoClient daoclient = new DaoClientImplementation();

	@Override
	public void creerClient(Client c, Conseiller c1, CompteCourant cc, CompteEpargne ce) {
		
		if(c==null|| c1==null)
			try {
				throw new MyExceptions("Un client ne peut être nul et doit être relié à un conseiller existant");
			} catch (MyExceptions e) {
				e.printStackTrace();
			}else {
				daoclient.createCustomer(c, c1, cc, ce);	
			}
		
	}

	@Override
	public Conseiller trouverConseiller() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client afficherClient(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierClient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Client> trouverTousLesClients(Long idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void faireVirement(Client c, Client c2) {
		// TODO Auto-generated method stub
		
	}
	
}
