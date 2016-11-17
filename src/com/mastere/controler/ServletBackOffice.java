package com.mastere.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletBackOffice extends UtilHttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final String action = req.getPathInfo() == null ? "/" : req.getPathInfo();
		switch(action){
		case"/":
			afficherVue("dashboard", req, resp);
			break;
		default:
			resp.sendError(404);
			break;
		}
	}
}
