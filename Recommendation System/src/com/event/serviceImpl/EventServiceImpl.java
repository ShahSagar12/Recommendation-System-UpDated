package com.event.serviceImpl;

import java.util.List;

import com.event.dao.EventDAO;
import com.event.daoImpl.EventDAOImpl;
import com.event.model.Event;
import com.event.service.EventService;

public class EventServiceImpl implements EventService {
 EventDAO eventDAO=new EventDAOImpl();

	@Override
	public int save(Event event) {
		
		return eventDAO.save(event);
	}

	@Override
	public List<Event> list() {
		
		return eventDAO.list();
	}

	@Override
	public Event get(int id) {
		
		return eventDAO.get(id);
	}

	@Override
	public int update(Event event) {
		
		return eventDAO.update(event);
	}

	@Override
	public int delete(int id) {
		
		return eventDAO.delete(id);
	}

	@Override
	public List<Event> getUserByid(int id) {
		
		return eventDAO.getUserByid(id);
	}

	@Override
	public String getEventName(int id) {
		
		return eventDAO.getEventName(id);
	}

	@Override
	public String proposedDate(int id) {
		
		return eventDAO.proposedDate(id);
	}

	@Override
	public String proposedTime(int id) {
		
		return eventDAO.proposedTime(id);
	}

	@Override
	public String getEventDate(int id) {
		
		return eventDAO.getEventDate(id);
	}

	@Override
	public String getEventTime(int id) {
		
		return eventDAO.getEventTime(id);
	}

	@Override
	public String getEventNotice(int id) {
		
		return eventDAO.getEventNotice(id);
	}

	@Override
	public String getEventAddress(int id) {
		
		return eventDAO.getEventAddress(id);
	}

}
