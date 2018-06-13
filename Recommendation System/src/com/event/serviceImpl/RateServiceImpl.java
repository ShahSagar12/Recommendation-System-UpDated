package com.event.serviceImpl;

import java.util.List;

import com.event.dao.RateDAO;
import com.event.daoImpl.RateDAOImpl;
import com.event.model.Rate;
import com.event.service.RateService;

public class RateServiceImpl implements RateService {
	RateDAO rateDAO=(RateDAO) new RateDAOImpl();
	@Override
	public int save(Rate rate) {
		
		return rateDAO.save(rate);
	}

	@Override
	public List<Rate> list() {
		
		return rateDAO.list();
	}

	@Override
	public List<Rate> getUserById(int id) {
		
		return rateDAO.getUserById(id);
	}

	@Override
	public List<Rate> getEventById(int id) {
		
		return rateDAO.getEventById(id);
	}

}
