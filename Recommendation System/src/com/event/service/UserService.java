package com.event.service;

import com.event.model.User;

public interface UserService {
	int register(User user);
	int checkAuthenticate(User user);
	String getuserName(int id);
	String getuserAddress(int id);
	String getuserFaculty(int id);
	String getusersemester(int id);

}
