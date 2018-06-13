package com.event.dao;

import java.util.List;

import com.event.model.Rate;

public interface RateDAO {
	int save(Rate rate);
	List<Rate> list();
	List<Rate> getUserById(int id);
	List<Rate> getEventById(int id);

}
