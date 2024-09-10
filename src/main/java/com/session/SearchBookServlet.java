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
 * Servlet implementation class SearchBookServlet
 */
@WebServlet("/searchbook.do")
public class SearchBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String category = request.getParameter("category");
		if(category !=null && "Java".equals(category)) {
			ArrayList<String> list = new ArrayList<>();
			list.add("Java 17");
			list.add("JDBC");
			list.add("Servlet");
			list.add("JSP");
			list.add("Spring");
			HttpSession session =request.getSession();
			session.setAttribute("BOOKS", list);
		}
		
			else {
				request.setAttribute("MSG", "No book found with category " + category);
			}
			RequestDispatcher rd = request.getRequestDispatcher("showbooks.jsp");
			rd.forward(request, response);
		}
	}


