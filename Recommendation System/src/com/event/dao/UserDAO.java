package com.event.dao;

import com.event.model.User;

public interface UserDAO {

	int register(User user);
	int checkAuthenticate(User user);
	String getuserName(int id);
	String getuserAddress(int id);
	String getuserFaculty(int id);
	String getusersemester(int id);
}
