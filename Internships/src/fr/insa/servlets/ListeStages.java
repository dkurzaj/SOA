package fr.insa.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;


import fr.insa.modele.Etudiant;
import fr.insa.modele.Stage;

@WebServlet("/liste-stages")
public class ListeStages extends HttpServlet {
	public static final String VUE = "/WEB-INF/liste-stages.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("sessionNomUtilisateur") == null) {
			//Si on n'est pas connecté
			response.sendRedirect(request.getContextPath() + "/connexion");
		} else {
			
		}
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		String query = "from Stage WHERE id > 0";
		String motsclefs = request.getParameter("motsclefs");
		String ville = request.getParameter("ville");
		
		if (motsclefs != null && motsclefs!= "")
			query += " AND titre LIKE :motsclefs";
		if (ville != null)
			query += " AND lieu = :ville";
		
		TypedQuery<Stage> q = entityManager.createQuery(query, Stage.class );
		
		if (motsclefs != null && motsclefs!= "")
			q.setParameter("motsclefs", "%" + motsclefs + "%");
		if (ville != null)
			q.setParameter("ville", ville);
		
		List<Stage> liste = q.getResultList();
		
		entityManager.getTransaction().commit();
        entityManager.close();
		
		request.setAttribute("liste", liste);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
