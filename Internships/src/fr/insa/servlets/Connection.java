package fr.insa.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;


@WebServlet("/Connection")
public class Connection extends HttpServlet {
	public static final String VIEW = "/WEB-INF/connection.jsp";
	private static final String CHAMP_NOM = "nom";
	private static final String CHAMP_PASS = "motdepasse";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter(CHAMP_NOM);
        String pwd = request.getParameter(CHAMP_PASS);
        
        try {
			String resp = Connection.getHTML("http://etud.insa-toulouse.fr/~kurzaj/?uid=" + userName + "&pwd=" + pwd);
			System.out.println("resp:" + resp);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Could not connect to the LDAP proxy server !");
		}
	}
	
	public static String getHTML(String urlToRead) throws Exception {
	      StringBuilder result = new StringBuilder();
	      URL url = new URL(urlToRead);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
	   }

}
