package com.learnServ.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addquest")
public class AddQuest extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int left = Integer.parseInt(req.getParameter("left"));
		int right = Integer.parseInt(req.getParameter("right"));
		int sum = left + right;
		
		PrintWriter out = resp.getWriter();
		out.println(left + "더하기" + right + "는" + sum + "입니다");
	}
}
