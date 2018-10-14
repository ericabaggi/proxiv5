package org.formation11.modele;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * La classe Client correspond aux informations relatives aux clients. Chaque
 * client possède un compte courant ainsi qu'un compte épargne. Les informations
 * d'un client que l'on peut enregistrer dans la base sont : le nom, le prénom,
 * le numéro id(généré automatiquement), l'adresse, email
 * 
 * @author Baggi/Belkhammar
 *
 */
@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "id_Conseiller")
	private Conseiller conseiller;
	@Embedded
	private CompteEpargne compteEpargne;
	@Embedded
	private CompteCourant compteCourant;

	public Client() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (long) id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

}
