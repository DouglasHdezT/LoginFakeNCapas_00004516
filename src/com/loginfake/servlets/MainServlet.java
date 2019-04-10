package com.loginfake.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		String initHTML = "<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1>Repuesta: </h1>"
				+ "<p>";
		String closeHTML = "</p>"
				+ "</body>\r\n" + 
				"</html>";
		
		out.write(initHTML);
		
		if(!username.isEmpty() && !password.isEmpty()) {
			if(username.equals("DeusHdezT") && password.equals("admin1234")) {
				out.write("Credenciales correctas");
			}else {
				out.write("Credenciales incorrectas");
			}
		}else {
			out.write("Alguna credencial vac&iacute;a");
		}
		
		out.write(closeHTML);
	}


}
