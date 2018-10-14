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
 * 
 * La classe CurrentAccount correspond au compte courant qui se distingue par
 * une autorisation de découvert de 1000 euros(=MINACCOUNTBALANCE).
 * 
 * @author Baggi/Mande
 *
 */
@Embeddable
public class CompteCourant {
	private Long numeroCompteCourant;
	private static final int MINACCOUNTBALANCE = 1000;
	private double soldeBancaireCourant;
	private String dateOuvertureCompteCourant;
	
	public CompteCourant() {
		super();
	}

	public Long getNumeroCompteCourant() {
		return numeroCompteCourant;
	}

	public void setNumeroCompteCourant(Long numeroCompteCourant) {
		this.numeroCompteCourant = numeroCompteCourant;
	}

	public double getSoldeBancaireCourant() {
		return soldeBancaireCourant;
	}

	public void setSoldeBancaireCourant(double soldeBancaireCourant) {
		this.soldeBancaireCourant = soldeBancaireCourant;
	}

	public String getDateOuvertureCompteCourant() {
		return dateOuvertureCompteCourant;
	}

	public void setDateOuvertureCompteCourant(String dateOuvertureCompteCourant) {
		this.dateOuvertureCompteCourant = dateOuvertureCompteCourant;
	}

	
}
