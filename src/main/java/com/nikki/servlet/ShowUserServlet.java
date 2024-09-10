package com.nikki.servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/menu.do")
public class ShowUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUserServlet() { 
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/header.html");
		rd.include(request, response);
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/login.html");
		rd1.include(request, response);
		RequestDispatcher rd2 = request.getRequestDispatcher("/WEB-INF/footer.html");
		rd2.include(request, response);
	}
}
