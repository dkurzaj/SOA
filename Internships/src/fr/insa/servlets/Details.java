package fr.insa.servlets;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.insa.modele.Stage;

@WebServlet("/details")
public class Details extends HttpServlet {
	public static final String VUE = "/WEB-INF/details.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
        List<Stage> liste = entityManager.createQuery( "from Stage", Stage.class ).getResultList();
		entityManager.getTransaction().commit();
        entityManager.close();
        
        Stage st1 = liste.get(0);
		
		request.setAttribute("stage", st1);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
