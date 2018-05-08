package com.event.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.event.dao.UserDAO;
import com.event.dbutils.MySqlConnector;
import com.event.model.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public int register(User user)  {
		int registered=0;
		Connection connection=MySqlConnector.connectToDB();
		String sql="INSERT INTO tbl_user(firstName,lastName,address,dob,sex,faculty,semester,rollNo,emailAddress,password, confirmPassword,status) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getAddress());
			preparedStatement.setString(4, user.getDob());
			preparedStatement.setString(5, user.getSex());
			preparedStatement.setString(6, user.getFaculty());
			preparedStatement.setString(7, user.getSemester());
			preparedStatement.setInt(8, user.getRollNo());
			preparedStatement.setString(9, user.getEmailAddress());
			preparedStatement.setString(10,user.getPassword());
			preparedStatement.setString(11, user.getConfirmPassword());
			preparedStatement.setInt(12, user.getStatus());
			registered=preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR:REGISTER "+e);
		}
		return registered;
	}

	@Override
	public int checkAuthenticate(User user) {
		
		return 0;
	}

	@Override
	public String getuserName(int id) {
		
		return null;
	}

	@Override
	public String getuserAddress(int id) {
		
		return null;
	}

	@Override
	public String getuserFaculty(int id) {
		
		return null;
	}

	@Override
	public String getusersemester(int id) {
		
		return null;
	}

}
