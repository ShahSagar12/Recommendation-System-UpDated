package com.event.serviceImpl;

import com.event.dao.UserDAO;
import com.event.daoImpl.UserDAOImpl;
import com.event.model.User;
import com.event.service.UserService;

public class UserServiceImpl implements UserService{
	UserDAO userDAO=new UserDAOImpl();
	@Override
	public int register(User user) {
		return userDAO.register(user);
	}

	@Override
	public int checkAuthenticate(User user) {
		return userDAO.checkAuthenticate(user);
	}

	@Override
	public String getuserName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getuserAddress(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getuserFaculty(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getusersemester(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
