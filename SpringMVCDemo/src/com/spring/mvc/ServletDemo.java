package com.spring.mvc;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet  {

private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name= request.getParameter("username");
	String password = request.getParameter("password");
	String msg ="";
	
	if(name.equals(password)){
		msg ="<h1>Login Success<h1>";
	}else{
			msg="<h1>login failed";
		}	
	
	Writer out = response.getWriter();
	out.write(msg);
		
		
	}
	
}
