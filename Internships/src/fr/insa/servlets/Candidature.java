package fr.insa.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.insa.modele.Stage;

@WebServlet("/candidature")
public class Candidature extends HttpServlet{

	
	public static final String VUE = "/WEB-INF/candidature.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Stage stage = new Stage();
		stage.setTitre("Stage Big Data IOT Machine Learning ElasticSearch Spring REST SOAP NTM Angular Hibernate");
		stage.setLieu("Saint-Vincent et les Grenadines");
		stage.setDescription("Le top meilleur stage, vous allez tellement aimer que vous allez nous supplier de vous embaucher au SMIC après.");
		
		request.setAttribute("stage", stage);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		
	}
}
