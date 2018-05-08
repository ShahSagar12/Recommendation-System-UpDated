package com.event.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.event.model.User;
import com.event.service.UserService;
import com.event.serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class AdminControllers
 */
@WebServlet("/AdminControllers")
public class AdminControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public AdminControllers() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("Signup.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setAddress(request.getParameter("address"));
		user.setDob(request.getParameter("dob").toString());
		user.setSex(request.getParameter("sex"));	
		user.setEmailAddress(request.getParameter("emailAddress"));
		user.setPassword(request.getParameter("password"));
		user.setConfirmPassword(request.getParameter("confirmPassword"));
		user.setStatus(1);
		UserService userService=new UserServiceImpl();
		if(userService.register(user)>0) {
			response.sendRedirect("Login.jsp");
		}else {
			response.sendRedirect("Signup.jsp?err01");
		}

	}
}
