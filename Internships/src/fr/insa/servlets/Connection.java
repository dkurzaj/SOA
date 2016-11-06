package fr.insa.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.ldap.client.api.LdapConnection;
import org.apache.directory.ldap.client.api.LdapNetworkConnection;

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
        System.out.println("nom :" + userName);

        LdapConnection connection = new LdapNetworkConnection("srv-ldap1.insa-toulouse.fr", 389);
        try {
			connection.bind("uid="+userName+"ou=People,dc=insa-toulouse,dc=fr", pwd);
			System.out.println("You are now connected to LDAP !");
		} catch (LdapException e) {
			e.printStackTrace();
			System.out.println("Connection to LDAP failed...");
		}
        finally {
        	connection.close();
        }
	}

}
