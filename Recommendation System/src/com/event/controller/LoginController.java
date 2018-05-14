package com.event.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.event.model.Admin;
import com.event.model.User;
import com.event.service.AdminService;
import com.event.service.UserService;
import com.event.serviceImpl.AdminServiceImpl;
import com.event.serviceImpl.UserServiceImpl;


@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public LoginController() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("Login.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		Admin admin=new Admin();
		user.setEmailAddress(request.getParameter("emailAddress"));
		user.setPassword(request.getParameter("password"));
		UserService userService=new UserServiceImpl();


		admin.setEmailAddress(request.getParameter(""));
		admin.setPassword(request.getParameter(""));
		AdminService adminService=new AdminServiceImpl();
		int ida=adminService.checkAuthenticate(admin);

		int id=userService.checkAuthenticate(user);
		if(id>0) {
			HttpSession session=request.getSession();
			session.setAttribute("id", id);
			session.setAttribute("emailAddress", user.getEmailAddress());
		}else {
			if(ida>0) {
				HttpSession session=request.getSession();
				session.setAttribute("id", ida);
				session.setAttribute("emailAddress", admin.getEmailAddress());
				
			}else {
		response.sendRedirect("default.jsp?err=3");
			}}
	}

}
