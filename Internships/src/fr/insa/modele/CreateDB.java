package fr.insa.modele;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class CreateDB {

	
	
	public static void main(String[] args) {	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*entityManager.getTransaction().begin();
		entityManager.persist( new Etudiant( "Bex-Chauvet","Olivier","IR",5) );
		entityManager.persist( new Etudiant( "Kurzaj","Dorian","IR",5) );
		entityManager.getTransaction().commit();
		entityManager.close();
		

		entityManager = entityManagerFactory.createEntityManager();*/
		entityManager.getTransaction().begin();
        List<Etudiant> result = entityManager.createQuery( "from Etudiant", Etudiant.class ).getResultList();
		for ( Etudiant etud : (List<Etudiant>) result ) {
			System.out.println( "Etudiant (" + etud.getAnnee()+etud.getSpecialite() + ") : " + etud.getPrenom()+" "+etud.getNom() );
		}
		entityManager.getTransaction().commit();
        entityManager.close();
	}
}
