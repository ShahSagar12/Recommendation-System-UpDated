package com.event.controller;

import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

import javax.mail.Transport;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.event.model.Event;
import com.event.model.SendEmail;
import com.event.service.EventService;
import com.event.service.UserService;
import com.event.serviceImpl.EventServiceImpl;
import com.event.serviceImpl.UserServiceImpl;
import com.event.model.SMTPAuthenticator;



@WebServlet("/addEvent")
public class EventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EventController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("CreateEvent.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Date dd=new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		String date=simpleDateFormat.format(dd);
		String time=timeFormat.format(dd);
		Event event = new Event();
		
		
		HttpSession session = request.getSession();
		String id =session.getAttribute("id").toString();
		String proposedDate=request.getParameter("eventDate").toString();
		String proposedTime=request.getParameter("eventTime").toString();
		
		event.setUserId(Integer.parseInt(id));
		event.setEventName(request.getParameter("eventName"));
		
		event.setEventAddress(request.getParameter("eventAddress"));
		event.setProposedDate(proposedDate);;
		event.setProposedTime(proposedTime);
		event.setEventNotice(request.getParameter("eventNotice"));
		event.setEventdate(date);
		
		event.setEventTime(time);
		event.setStatus(1);
		EventService  service = new EventServiceImpl();
		if(service.save(event)>0){
//			UserService userService=new UserServiceImpl();			
//			String Email=userService.getuserEmailAddress(event.getUserId());
//			System.out.println("Email Address"+userService.getuserEmailAddress(event.getUserId()));
//		
//			SendEmail sendMail=new SendEmail(Email, "INVITATION ", "Come here in time");
			
			response.sendRedirect("AdminHome.jsp");
		}else{
			response.sendRedirect("CreateEvent.jsp");
		}
	}

	

}
