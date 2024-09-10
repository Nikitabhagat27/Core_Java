/*
 * package com.listner;
 * 
 * import javax.servlet.ServletContext; import
 * javax.servlet.annotation.WebListener; import javax.servlet.http.HttpSession;
 * import javax.servlet.http.HttpSessionEvent; import
 * javax.servlet.http.HttpSessionListener;
 * 
 *//**
	 * Application Lifecycle Listener implementation class MyUserSession
	 *
	 */
/*
 * @WebListener public class MyUserSession implements HttpSessionListener {
 * 
 *//**
	 * Default constructor.
	 */
/*
 * public MyUserSession() { System.out.println("user session constroctor"); }
 * 
 *//**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
/*
 * public void sessionCreated(HttpSessionEvent event) { // TODO Auto-generated
 * method stub System.out.println("session created"); HttpSession session =
 * event.getSession();
 * 
 * ServletContext context=session.getServletContext(); int
 * count=(int)context.getAttribute("TA"); count++; System.out.println(count);
 * context.setAttribute("TA", count); }
 *//**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 *//*
		 * public void sessionDestroyed(HttpSessionEvent event) {
		 * System.out.println("session destroyed"); HttpSession session =
		 * event.getSession();
		 * 
		 * ServletContext context=session.getServletContext(); int
		 * count=(int)context.getAttribute("TA"); count--; context.setAttribute("TA",
		 * count); if(session!=null) { session.invalidate(); } }
		 * 
		 * }
		 */