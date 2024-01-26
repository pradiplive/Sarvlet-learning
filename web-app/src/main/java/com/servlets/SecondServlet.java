package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Service using generic servlet");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Second servlet using generic servlet.</h1>");
		
	}

}
