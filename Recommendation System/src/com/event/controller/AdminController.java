package com.event.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.event.model.Admin;
import com.event.service.AdminService;
import com.event.serviceImpl.AdminServiceImpl;




@WebServlet("/AdminControllers")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Signup.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Admin admin=new Admin();
		admin.setFirstName(request.getParameter("firstName"));
		admin.setLastName(request.getParameter("lastName"));
		admin.setAddress(request.getParameter("address"));
		admin.setDob(request.getParameter("dob").toString());
		admin.setSex(request.getParameter("sex"));	
		admin.setEmailAddress(request.getParameter("emailAddress"));
		admin.setPassword(request.getParameter("password"));
		admin.setConfirmPassword(request.getParameter("confirmPassword"));
		admin.setStatus(1);
		AdminService userService=new AdminServiceImpl();
		if(userService.register(admin)>0) {
			response.sendRedirect("Login.jsp");
		}else {
			response.sendRedirect("Signup.jsp?err02");
		}

	}
	

}
