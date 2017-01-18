package fr.insa.servlets;


import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.insa.modele.Postuler;
import fr.insa.modele.Stage;
import fr.insa.modele.Status;

@WebServlet("/suivi_candidatures")
public class Suivi_candidatures extends HttpServlet{

	public static final String VUE = "/WEB-INF/suivi_candidatures.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "Internships" );
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
        List<Postuler> liste = entityManager.createQuery( "from Postuler", Postuler.class ).getResultList();
		// stage pris un peu random pour l'instant mais il faudra relier à la page précédente ou un truc du genre
        Stage stage = entityManager.createQuery("from Stage", Stage.class).getResultList().get(0);
        
		entityManager.getTransaction().commit();
        entityManager.close();
        request.setAttribute("liste", liste);
		request.setAttribute("stage", stage);
		
		
		String action = request.getParameter("action");
		long id;
		//Postuler postulation;
		if (action!=null){
			if (action.equals("accepter")){
				id=Long.parseLong(request.getParameter("idpost"));
				EntityManager em = entityManagerFactory.createEntityManager();
				Postuler post=em.find(Postuler.class, id);
				em.getTransaction().begin();						
				post.setStatus(Status.ACCEPTEE_ENT);
				em.getTransaction().commit();
		        em.close();
			}
			else if (action.equals("refuser")){
				id=Long.parseLong(request.getParameter("idpost"));
				EntityManager em = entityManagerFactory.createEntityManager();
				Postuler post=em.find(Postuler.class, id);
				em.getTransaction().begin();						
				post.setStatus(Status.REFUSEE_ENT);
				em.getTransaction().commit();
		        em.close();
			}
		}

		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
