package com.session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowCartServlet
 */
@WebServlet("/showcart.do")
public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowCartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
			request.setAttribute("MSG", "Session has been destroyed");
			RequestDispatcher rd = request.getRequestDispatcher("showbooks.jsp");
			rd.forward(request, response);
		} else {
			Enumeration<String> names = session.getAttributeNames();
			ArrayList<String> selectedList = Collections.list(names);
			selectedList.remove("BOOKS");
			if (selectedList.size() == 0) {
				request.setAttribute("MSG", "No books selected");
			} else {
				Object attribute = session.getAttribute(selectedList.get(0));
				System.out.println(attribute);
				request.setAttribute("CART", attribute);
			}
			RequestDispatcher rd = request.getRequestDispatcher("showcart.jsp");
			rd.forward(request, response);
		}
	}

}
