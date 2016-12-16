package fr.insa.servlets;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.insa.modele.Etudiant;
import fr.insa.modele.Stage;

@WebServlet("/suivi_candidatures")
public class Suivi_candidatures extends HttpServlet{

	public static final String VUE = "/WEB-INF/suivi_candidatures.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
        List<Etudiant> liste = entityManager.createQuery( "from Etudiant", Etudiant.class ).getResultList();
		Stage stage = entityManager.createQuery("from Stage", Stage.class).getResultList().get(0);
        
		entityManager.getTransaction().commit();
        entityManager.close();
        request.setAttribute("liste", liste);
		request.setAttribute("stage", stage);


		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
