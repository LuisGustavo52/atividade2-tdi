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

@WebServlet(urlPatterns = "/request-body")
public class RequestBodyController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("form.html");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ServletInputStream requestBody = req.getInputStream();
		
		//BufferedReader stream = new BufferedReader(new InputStreamReader(requestBody));
		BufferedReader stream = req.getReader();
		
		req.setAttribute("requestBody", stream.readLine());
		RequestDispatcher rd = req.getRequestDispatcher("request-body.jsp");
		rd.forward(req, resp);
	}
	
}
