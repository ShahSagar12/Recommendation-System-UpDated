package com.event.dao;

import com.event.model.Admin;


public interface AdminDAO {
	int register(Admin admin);
	int checkAuthenticate(Admin admin);
	String getuserName(int id);
	String getuserAddress(int id);
	

}
