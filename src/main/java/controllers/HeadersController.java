package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/headers"})
public class HeadersController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Enumeration<String> headers = req.getHeaderNames();
		List<String> listaHeaders = new ArrayList<>();
		
		while(headers.hasMoreElements()) {
			listaHeaders.add(headers.nextElement());
		}
		
		req.setAttribute("headers", listaHeaders);
		RequestDispatcher rd = req.getRequestDispatcher("headers.jsp");
		rd.forward(req, resp);
	}
}
