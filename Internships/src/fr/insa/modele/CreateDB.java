package fr.insa.modele;


import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateDB {

	
	
	public static void main(String[] args) {	
		
		createEtudiants();
		createStages();
	}
	
	public static void createStages() {
		Entreprise e1 = new Entreprise("Airbus", "15 avenue des avions 31000 Toulouse","Grand groupe","Aeronautique");
		Entreprise e3 = new Entreprise("Thales", "15 avenue des avions 75000 Paris","Grand groupe","Aeronautique");
		Stage st1 = new Stage();
		st1.setTitre("Airbus - Développement d'un système de catapulte pour humains");
		st1.setDebut(new Date(new java.util.Date().getTime()));
		st1.setDescription("Elon Musk en avait parlé en soirée.");
		st1.setDuree(6);
		st1.setLieu("Toulouse");
		st1.setEntreprise(e1);
		
		Stage st2 = new Stage();
		st2.setTitre("Pas Airbus - Nihil morati post haec militares avidi saepe turbarum adorti sunt Montium primum, qui divertebat in proximo");
		st2.setDebut(new Date(new java.util.Date().getTime()));
		st2.setDescription("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		st2.setDuree(6);
		st2.setLieu("Lyon");
		st2.setEntreprise(e1);
		
		Stage st3 = new Stage();
		st3.setTitre("Thales -- Stage vraiment cool");
		st3.setDebut(new Date(new java.util.Date().getTime()));
		st3.setDescription("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		st3.setDuree(6);
		st3.setLieu("Paris");
		st3.setEntreprise(e3);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(e1);
		entityManager.persist(e3);
		entityManager.persist(st1);
		entityManager.persist(st2);
		entityManager.persist(st3);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public static void createEtudiants() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist( new Etudiant( "Bex-Chauvet","Olivier","IR",5) );
		entityManager.persist( new Etudiant( "Kurzaj","Dorian","IR",5) );
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
