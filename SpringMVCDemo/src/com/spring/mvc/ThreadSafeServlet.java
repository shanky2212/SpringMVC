package com.spring.mvc;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThreadSafeServlet extends HttpServlet {//implements SingleThreadModel{
	private static final long serialVersionUID = 1L;
	public ThreadSafeServlet() {
		System.out.println("TestServlet default constructor");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm = request.getParameter("fname");
		Writer out = response.getWriter();
		out.flush();
		Thread th = Thread.currentThread();
		for (int i = 0; i <5; i++) {
			System.out.println(th.getName()+"\t"+unm+"\t"+this);
			out.write("<h2>"+th.getName()+"\t"+unm+"\t"+this+"</h2>");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		out.write("<h2>Hii.. "+unm+"</br> Response from Server");
	}

}
