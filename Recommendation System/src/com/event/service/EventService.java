package com.event.service;

import java.util.List;

import com.event.model.Event;

public interface EventService {
	int save(Event event);
	List<Event> list();
	Event get(int id);
	int update(Event event);
	int delete(int id);
	
	List<Event> getUserByid(int id);

}
