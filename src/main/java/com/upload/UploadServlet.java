package com.upload;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload.do" )
@MultipartConfig(location="C:/Users/bhaga/uploaded",fileSizeThreshold = 1024*1024*10,maxFileSize = 1024*1024*50)
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part part = request.getPart("photo");
		System.out.println(part.getName());
		System.out.println(part.getContentType());
		System.out.println(part.getSize());
		String header = part.getHeader("content-disposition");
		System.out.println(header);
		String[] split = header.split("\"");
		String filename = split[split.length-1];
		System.out.println(filename);
		part.write(filename);
		PrintWriter  out = response.getWriter();
		out.write("file uploded to C:/Users/bhaga/uploaded ");
		
	}

}
