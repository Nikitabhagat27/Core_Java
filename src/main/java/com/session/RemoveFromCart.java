package com.session;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RemoveFromCart
 */
@WebServlet("/removefromcart.do")
public class RemoveFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveFromCart() {
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
		} else {
			String book = request.getParameter("bookName");
			System.out.println("remove book from session: "+book);
			ArrayList<String> selectedBook = (ArrayList<String>) session.getAttribute("bname");
			if(selectedBook!=null && selectedBook.size()>0) {
			selectedBook.remove(book);
			session.setAttribute("bname", selectedBook);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("showcart.do");
		rd.forward(request, response);
	}

}
