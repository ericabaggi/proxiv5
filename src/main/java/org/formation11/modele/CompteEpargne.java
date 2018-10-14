package org.formation11.modele;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * La classe Saving Account correspond au compte épargne. Il se caractérise par
 * un taux de rémunération par défaut à 3%.
 * 
 * @author Baggi/Mande
 *
 */
@Embeddable
public class CompteEpargne {
	private Long numeroCompteEpargne;
	public static final double TAUXREMUNERATION = 0.03;
	private double soldeBancaireEpagne;
	private String dateOuvertureEpargne;

	public CompteEpargne() {
		super();

	}

	public Long getNumeroCompteEpargne() {
		return numeroCompteEpargne;
	}

	public void setNumeroCompteEpargne(Long numeroCompteCourant) {
		this.numeroCompteEpargne = numeroCompteCourant;
	}

	public double getSoldeBancaireEpagne() {
		return soldeBancaireEpagne;
	}

	public void setSoldeBancaireEpagne(double soldeBancaireEpagne) {
		this.soldeBancaireEpagne = soldeBancaireEpagne;
	}

	public String getDateOuvertureEpargne() {
		return dateOuvertureEpargne;
	}

	public void setDateOuvertureEpargne(String dateOuvertureEpargne) {
		this.dateOuvertureEpargne = dateOuvertureEpargne;
	}


}
