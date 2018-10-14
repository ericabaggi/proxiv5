package org.formation11.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation11.modele.Client;
import org.formation11.modele.CompteCourant;
import org.formation11.modele.CompteEpargne;
import org.formation11.modele.Conseiller;
import org.formation11.persistance.DaoClient;
import org.formation11.persistance.DaoClientImplementation;

public class main {

	public static void main(String[] args) {
		DaoClient daoClient = new DaoClientImplementation();
		Conseiller c = new Conseiller();
		c.setNom("Baggi");
		c.setPrenom("Erica");
		c.setLogin("berica");
		c.setPassword("lune");
//
//		CompteCourant c1 = new CompteCourant();
//		c1.setNumeroCompteCourant((long) Math.random());
//		c1.setSoldeBancaireCourant(100);
//		c1.setDateOuvertureCompteCourant("13/10/2018");
//
//		CompteEpargne c2 = new CompteEpargne();
//		c2.setDateOuvertureEpargne("13/10/2018");
//		c2.setNumeroCompteEpargne((long) Math.random());
//		c2.setSoldeBancaireEpagne(300);

		Client c3 = new Client();
		c3.setAdresse("2 rue des coulommiers");
		c3.setNom("laurentin");
		c3.setPrenom("Xavier");
		c3.setEmail("laurentin@gmail.com");
		c3.setConseiller(c);


		CompteCourant c5 = new CompteCourant();
		double a= Math.random() * 100000;
		c5.setNumeroCompteCourant((long)a);
		c5.setSoldeBancaireCourant(30000);
		c5.setDateOuvertureCompteCourant("15/10/2018");

		CompteEpargne c6 = new CompteEpargne();
		c6.setDateOuvertureEpargne("15/10/2018");
		double b= Math.random() * 1000000;
		c6.setNumeroCompteEpargne((long)b);
		c6.setSoldeBancaireEpagne(20000000);

		Client c4 = new Client();
		c4.setAdresse("6 rue des Frianss");
		c4.setNom("Elonore");
		c4.setPrenom("fari");
		c4.setEmail("fari@gmail.com");
		c4.setConseiller(c);
		c4.setCompteCourant(c5);
		c4.setCompteEpargne(c6);
		daoClient.createCustomer(c4, c, c5, c6);
		double d=Math.random() * 1000000;
		Long e= (long)d;
		System.out.println(e);
	}
}
