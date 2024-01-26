package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet implements Servlet {

	ServletConfig conf;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.conf = arg0;
		System.out.println("Creating object");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing-------");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is output from servlet method</h1>");
//		out.println("<h1>Date is : </h1>" + new Date();
		
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("Get service config");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("Get servlet info");
		return null;
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory");
		
	}

	

		
	
}
