package fr.insa.servlets;

import java.io.IOException;
import java.sql.Date;

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
		Stage st1 = new Stage();
		st1.setTitre("Airbus - Développement d'un système de catapulte pour humains");
		st1.setDebut(new Date(new java.util.Date().getTime()));
		st1.setDescription("<p><strong>Pellentesque habitant morbi tristique</strong> senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. <em>Aenean ultricies mi vitae est.</em> Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, <code>commodo vitae</code>, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. <a href='#'>Donec non enim</a> in turpis pulvinar facilisis. Ut felis.</p><ol>   <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>   <li>Aliquam tincidunt mauris eu risus.</li></ol><p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p><ul>   <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>   <li>Aliquam tincidunt mauris eu risus.</li></ul>");
		st1.setDuree(6);
		st1.setLieu("Lyon");
		st1.setEntreprise(0);
		
		request.setAttribute("stage", st1);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
