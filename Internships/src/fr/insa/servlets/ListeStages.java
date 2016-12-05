package fr.insa.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.insa.modele.Stage;

@WebServlet("/liste-stages")
public class ListeStages extends HttpServlet {
	public static final String VUE = "/WEB-INF/liste-stages.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Stage> liste = new ArrayList<Stage>();
		
		Stage st1 = new Stage();
		st1.setTitre("Airbus - Développement d'un système de catapulte pour humains");
		st1.setDebut(new Date(2016));
		st1.setDescription("Elon Musk en avait parlé en soirée.");
		st1.setDuree(6);
		st1.setLieu("Lyon");
		st1.setEntreprise(0);
		
		liste.add(st1);
		
		request.setAttribute("liste", liste);
		
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
