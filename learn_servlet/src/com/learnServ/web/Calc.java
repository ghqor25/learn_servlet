package com.learnServ.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class Calc extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int left = Integer.parseInt(req.getParameter("left"));
		int right = Integer.parseInt(req.getParameter("right"));
		int sum = 0;
		
		String act = req.getParameter("operation");
		if(act.equals("µ¡¼À")) sum = left + right;
		else sum = left - right;
		
		PrintWriter out = resp.getWriter();
		out.println(left + "´õÇÏ±â" + right + "´Â" + sum + "ÀÔ´Ï´Ù");
	}
}
