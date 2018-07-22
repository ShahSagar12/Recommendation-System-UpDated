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
	String getEventName(int id);
	String proposedDate(int id);
	String proposedTime(int id);
	String getEventDate(int id);
	String getEventTime(int id);
	String getEventNotice(int id);
	String getEventAddress(int id);
	int getEventId(int id);
	
	List<Event> recommendedList();

}
