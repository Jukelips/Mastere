package com.mastere.controler;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mastere.dao.UtilisateurDAO;

/**
 * Servlet implementation class ServletUtilisateur
 */
@WebServlet("/utilisateur/*")
public class ServletUtilisateur extends UtilHttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletUtilisateur() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String action = request.getPathInfo();
		switch (action) {
		case "/create":
			request.setAttribute("groupes", UtilisateurDAO.getAllGroupe());
			afficherVue("create", request, response);
			break;

		default:
			response.sendError(404);
			break;
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
