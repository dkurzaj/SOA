package fr.insa.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.insa.modele.Postuler;
import fr.insa.modele.Stage;
import fr.insa.modele.Status;

@WebServlet("/candidature")
public class Candidature extends HttpServlet{

	
	public static final String VUE = "/WEB-INF/candidature.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long id = Long.parseLong(request.getParameter("id"));

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Stage stage = entityManager.createQuery( "FROM Stage WHERE id = :id", Stage.class ).setParameter("id", id).getResultList().get(0);
        
		entityManager.getTransaction().commit();
        entityManager.close();
		
		request.setAttribute("stage", stage);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idStage = Long.parseLong(request.getParameter("stage"));
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		EntityManager em = entityManagerFactory.createEntityManager();
		Stage stage = em.find(Stage.class, idStage);
		Postuler postuler = new Postuler(null, null, null, stage, new Date(new java.util.Date().getTime()));
		em.getTransaction().begin();
		em.persist(postuler);
		em.getTransaction().commit();
        em.close();
	}
}
