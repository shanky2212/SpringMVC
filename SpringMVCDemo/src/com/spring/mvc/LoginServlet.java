package com.spring.mvc;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service() of LoginServlet");
		String unm=req.getParameter("uname");
		String pw=req.getParameter("pword");

		Writer out = res.getWriter();
		out.write("<h1>Hi welcome to Bank</h1>");

		String page="";
		boolean check = true;
		if(unm==null || unm.trim().isEmpty())
		{
			page="/WEB-INF/required.html";
			check=false;
			RequestDispatcher rd = req.getRequestDispatcher(page);
			rd.forward(req, res);
		}else if(pw==null || pw.trim().isEmpty()){
			page="/WEB-INF/required.html";
			check=false;
			RequestDispatcher rd = req.getRequestDispatcher(page);
			rd.forward(req, res);
		}
		  if(check){
		  if(unm.equals(pw)){
			page="/WEB-INF/home.html";
			
			RequestDispatcher rd = req.getRequestDispatcher(page);
			rd.forward(req, res);
		}else{
			page="/WEB-INF/error.html";
			RequestDispatcher rd = req.getRequestDispatcher(page);
			rd.forward(req, res);
		}}
		  out.write("<h1>Again, Welcome Bank");
		  System.out.println("Last Statment");
	}

}
