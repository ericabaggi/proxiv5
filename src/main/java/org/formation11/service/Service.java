package org.formation11.service;

import java.util.Set;

import org.formation11.modele.Client;
import org.formation11.modele.CompteCourant;
import org.formation11.modele.CompteEpargne;
import org.formation11.modele.Conseiller;
import org.formation11.persistance.DaoClient;
import org.formation11.persistance.DaoClientImplementation;

public interface Service {
	public void creerClient(Client c, Conseiller c1, CompteCourant cc, CompteEpargne ce);

	public Conseiller trouverConseiller();

	public Client afficherClient(Long id);

	public void modifierClient();

	public Set<Client> trouverTousLesClients(Long idConseiller);
	
	public void faireVirement(Client c, Client c2);
}
