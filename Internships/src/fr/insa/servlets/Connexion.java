package fr.insa.servlets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/connexion")
public class Connexion extends HttpServlet {
	public static final String VUE = "/WEB-INF/connexion.jsp";
	private static final String CHAMP_NOM = "nom";
	private static final String CHAMP_PASS = "motdepasse";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter(CHAMP_NOM);
		String pwd = request.getParameter(CHAMP_PASS);
		boolean connected = false;
		try {
			String resp = Connexion.sendPost("http://etud.insa-toulouse.fr/~kurzaj/",
					"uid=" + java.net.URLEncoder.encode(userName, "UTF-8") + "&pwd="
							+ java.net.URLEncoder.encode(pwd, "UTF-8"));
			if (resp.equals("true")) {
				connected = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Could not connect to the LDAP proxy server !");
		}
		if (connected) {
			System.out.println("User connected");
			HttpSession session = request.getSession();
			session.setAttribute("sessionNomUtilisateur", userName);
			try {
				String identite = Connexion
						.getHTML("http://etud.insa-toulouse.fr/~kurzaj/identite.php?uid=" + userName);
				session.setAttribute("sessionIdentiteUtilisateur", identite);
				String user_id = Connexion.getHTML("http://etud.insa-toulouse.fr/~kurzaj/id.php?uid=" + userName);
				session.setAttribute("sessionPhotoUtilisateur",
						"<img src=\"http://etud.insa-toulouse.fr/~ggomez/iky2/imgs/trouverImg.php?num=" + user_id
								+ "\">");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("User not connected");
		}

		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);

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
	
	public static String sendPost(String url, String urlParameters) throws Exception {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// add request header
		con.setRequestMethod("POST");
		
		con.setRequestProperty("Content-Length", Integer.toString(urlParameters.getBytes().length));

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		return response.toString();
	}
}
