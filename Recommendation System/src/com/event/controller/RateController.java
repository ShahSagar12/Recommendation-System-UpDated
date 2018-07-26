package com.event.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.event.model.Rate;
import com.event.service.RateService;
import com.event.serviceImpl.RateServiceImpl;


@WebServlet("/rate")
public class RateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	   
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("default.jsp");
	}
	


	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String id=session.getAttribute("id").toString();
		String iid=request.getParameter("id").toString();
		String rate=request.getParameter("rating").toString();
		System.out.println("userid"+id);
		System.out.println("event id"+iid);
		System.out.println("rating"+rate);
		Rate rate1=new Rate();
		rate1.setEventId(Integer.parseInt(iid));
		rate1.setUserId(Integer.parseInt(id));
		rate1.setRate(Integer.parseInt(rate));
		rate1.setStatus(1);
		RateService rateService=new RateServiceImpl();
		if(rateService.save(rate1)>0){
			response.sendRedirect("Home.jsp");
			
		}else {
			response.sendRedirect("Eventviewer.jsp?error="+iid);
		}


	}

}
