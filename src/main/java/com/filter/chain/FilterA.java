package com.filter.chain;



import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

// * Servlet Filter implementation class FilterA

@WebFilter(filterName = "FilterC ",urlPatterns = "/servleta.do")
public class FilterA extends HttpFilter implements Filter {
       
//    /**
//     * @see HttpFilter#HttpFilter()
//     */
    public FilterA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
         System.out.println("Filter A do filter started");
         chain.doFilter(request, response);
         System.out.println("FilterA do filter completed");

		
	}

	/**
	 * @see Filter#init(FilterConfig)
 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
