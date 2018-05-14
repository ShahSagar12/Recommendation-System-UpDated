package com.event.serviceImpl;

import java.util.List;

import com.event.dao.EventDAO;
import com.event.daoImpl.EventDAOImpl;
import com.event.model.Event;
import com.event.service.EventService;

public class EventServiceImpl implements EventService {
	private EventDAO eventDAO=(EventDAO) new EventDAOImpl();

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

}
