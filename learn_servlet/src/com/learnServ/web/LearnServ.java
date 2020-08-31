package com.learnServ.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class LearnServ extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String temp = req.getParameter("cnt");
		int size = 10;
		if(temp != null && !temp.equals("")) {
			size = Integer.parseInt(temp);
		}
		
		PrintWriter out = resp.getWriter();
		for(int i = 0; i < size; ++i) out.println(i + "¾È³ç");
	}
}