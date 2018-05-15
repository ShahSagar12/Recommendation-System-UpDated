package com.event.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.event.model.Event;
import com.event.service.EventService;
import com.event.serviceImpl.EventServiceImpl;



/**
 * Servlet implementation class EventController
 */
@WebServlet("/addEvent")
public class EventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("CreateEvent.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Event event = new Event();
		String eventName=request.getParameter("eventName");
		System.out.println("Event Name"+eventName);
//		HttpSession session = request.getSession();
//		String id =session.getAttribute("id").toString();
//		System.out.println(""+Integer.parseInt(id));
//		event.setUserId(Integer.parseInt(id));
		event.setEventName(request.getParameter("eventName"));
		event.setEventAddress(request.getParameter("eventAddress"));
		event.setEventNotice(request.getParameter("eventNotice"));
		event.setEventdate(new Date().toString());
		event.setEventTime((int)new Date().getTime());
		event.setStatus(1);
		EventService  service = new EventServiceImpl();
		if(service.save(event)>0){
			response.sendRedirect("AdminHome.jsp");
		}else{
			response.sendRedirect("CreateEvent.jsp");
		}
	}

}
