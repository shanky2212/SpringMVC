package com.spring.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo_1 extends HttpServlet  {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		//if(request != null && response != null){
			String fname = request.getParameter("fname");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String gender = request.getParameter("gender");
			String timings = request.getParameter("timings");
			String course = request.getParameter("course");
			String courses[] = request.getParameterValues("course");
			String remarks = request.getParameter("remarks");
		
			String msg ="Your inquiry has been added sucessfully ";
			System.out.println("Full name:"+fname);
			System.out.println("Email ID:"+email);
			System.out.println("Phone no:"+phone);
			System.out.println("Gender:"+gender);
			System.out.println("Timings:"+timings);
			System.out.println("Course"+course);
			System.out.println("All courses");
			if(courses != null)
				for (String c : courses) {
					System.out.println(c);
				}
			System.out.println("Remarks"+remarks);
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>Java Learing Center</h1>");
			out.println("<h3>"+msg+"<h1>");
			out.println("<h3>Full Name :"+fname);
			out.println("<h3>Email ID :"+email);
			out.println("<h3>Phone no :"+phone);
			out.println("<h3>Gender :"+gender);
			out.println("<h3>Timings :"+timings);
			out.println("<h3>Course :");
			//out.println("<h3>All Courses ");
			if(courses != null)
				for (String c : courses) {
					out.println("<br/>"+c);
				}
			out.println("<h3>Remarks: "+remarks);

		
	//}else{}
}
}
