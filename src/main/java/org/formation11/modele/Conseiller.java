package org.formation11.modele;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * La classe Conseiller détailles les informations du conseiller. Le conseiller
 * conseille une liste de clients.
 * 
 * @author Baggi/Belkhammar
 *
 */
@Entity
public class Conseiller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<Client> listeClient = new HashSet<>();

	public Set<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(Set<Client> listeClient) {
		this.listeClient = listeClient;
	}

	public Conseiller(Long id, String login) {
		super();
		this.id = id;
		this.login = login;
	}

	public Conseiller() {
		super();
	}

	public double getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addClient(Client c) {
		listeClient.add(c);
		c.setConseiller(this);
	}

//	@Override
//	public String toString() {
//		return "Conseiller [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
//				+ password + "]";
//	}
}
