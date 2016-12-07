package fr.insa.servlets;


import java.io.IOException;
import java.util.ArrayList;

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
		
		Stage stage = new Stage();
		stage.setTitre("Stage Big Data IOT Machine Learning ElasticSearch Spring REST SOAP NTM Angular Hibernate");
		stage.setLieu("Saint-Vincent et les Grenadines");
		stage.setDescription("Le top meilleur stage, vous allez tellement aimer que vous allez nous supplier de vous embaucher au SMIC après.");
		
		ArrayList<Etudiant> liste = new ArrayList<Etudiant>();

		Etudiant e1 = new Etudiant();
		e1.setNom("Gagarine");
		e1.setPrenom("Youri");
		liste.add(e1);
		
		Etudiant e2 = new Etudiant();
		e2.setNom("Vador");
		e2.setPrenom("Dark");
		liste.add(e2);
		
		Etudiant e3 = new Etudiant();
		e3.setNom("Salvador");
		e3.setPrenom("Henri");
		liste.add(e3);

		Etudiant e4 = new Etudiant();
		e4.setNom("Mariano");
		e4.setPrenom("Luis");
		liste.add(e4);
		
		Etudiant e5 = new Etudiant();
		e5.setNom("Tare");
		e5.setPrenom("Guy");
		liste.add(e5);
		
		request.setAttribute("liste", liste);
		request.setAttribute("stage", stage);


		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
