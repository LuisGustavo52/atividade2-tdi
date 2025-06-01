package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/status")
public class StatusController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int statusCode = Integer.parseInt(req.getParameter("code"));
		
		if(statusCode >= 400) {
			resp.sendError(statusCode);
		}else {
			resp.setStatus(statusCode);
			req.setAttribute("statusCode", resp.getStatus());
			req.getRequestDispatcher("status.jsp").forward(req,resp);
		}
	}
	
}
