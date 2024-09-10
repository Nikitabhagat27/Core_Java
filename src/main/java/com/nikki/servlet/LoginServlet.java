package com.nikki.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nikki.dto.LoginDetail;
import com.nikki.factory.ObjectFactory;
import com.nikki.mapper.ObjectMapper;
import com.nikki.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ObjectMapper mapper = ObjectFactory.createObjectMapperInstance();
        LoginService service = ObjectFactory.createLoginServiceInstance();
        String message = service.validateUser(mapper.mapToLoginDetail(request)); 
         
    	//RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/header.html");
		//rd.include(request, response);
        if(message.contains("Welcome")) {
        	String user=request.getParameter("username");
        	System.out.println(user);
        	String surname="Bhagat";
        	List<String>L1=new ArrayList<>();
        	L1.add("nikita");
        	L1.add("Ritika");
        	L1.add("Riya");
        	request.setAttribute("username",user);
        	request.setAttribute("sname",surname);
            request.setAttribute("list", L1);
            
       	RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/Home2.jsp");
		rd1.forward(request, response);
	}
		else {
			RequestDispatcher rd3 =request.getRequestDispatcher("/WEB-INF/fail.html");
			rd3.include(request, response);
		}
	//equestDispatcher rd2 = request.getRequestDispatcher("/WEB-INF/footer.html");
	//d2.include(request, response);
        
        
        
	}}
