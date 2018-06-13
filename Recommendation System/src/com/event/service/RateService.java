package com.event.service;

import java.util.List;

import com.event.model.Rate;

public interface RateService {
	int save(Rate rate);
	List<Rate> list();
	List<Rate> getUserById(int id);
	List<Rate> getEventById(int id);

}
