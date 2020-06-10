package com.fragrance.web.service.user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fragrance.web.entity.User;
import com.fragrance.web.service.user.UserServices;

@WebServlet("/login")
public class UserLoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp#signin").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int result = 0;
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		User user = new User();

		UserServices service = new UserServices();

		try {
			result = service.doLogin(request.getParameter("email"), request.getParameter("pw"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

		}
		if (result == 1) {
			response.sendRedirect("/HTML/index");
		} else if (result == -2) {
			System.out.println("login denied");
			System.out.println(result);
			response.setContentType("text/html; charset=UTF-8");

			PrintWriter out = response.getWriter();

			out.println("<script>alert('아이디 또는 패스워드가 일치하지 않습니다.'); location.href='/login.jsp#signup';</script>");
			out.flush();
		}
	}
}