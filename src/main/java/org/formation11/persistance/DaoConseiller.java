package org.formation11.persistance;

import java.util.List;

import org.formation11.modele.Conseiller;

public interface DaoConseiller {
	
	public void createConseiller(Conseiller c);

	public Conseiller trouverConseiller(int id);

	public List<Conseiller> findAllConseiller();
}
