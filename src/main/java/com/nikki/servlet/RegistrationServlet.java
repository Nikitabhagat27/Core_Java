package com.nikki.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nikki.service.JdbcService;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register.do")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data
		String name= request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(gender);
		//select course
		String[]courses = request.getParameterValues("c1");
		// multiple selection
		for(String c:courses) {
			System.out.println(c);
		}
		String timings = request.getParameter("timings");
		System.out.println(timings);
		String remarks = request.getParameter("remarks");
		System.out.println(remarks);
		JdbcService service=new JdbcService();
		service.saveData(name, email, password, gender);
		PrintWriter out = response.getWriter();
		
		
	}
}
