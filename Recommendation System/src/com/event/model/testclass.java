package com.event.model;

import com.event.dao.EventDAO;
import com.event.daoImpl.EventDAOImpl;

public class testclass {

	public static void main(String[] args) {
		EventDAO eventdao=new EventDAOImpl();
		System.out.println("output");
		eventdao.recommendedList();

	}

}
