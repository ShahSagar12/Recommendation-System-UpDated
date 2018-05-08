package com.event.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		int authenticate=0;
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT id FROM tbl_user WHERE email_address=? AND password=? AND status='1'";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,user.getEmailAddress());
			preparedStatement.setString(2, user.getPassword());
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				authenticate=rs.getInt("id");
			}
		} catch (SQLException exp) {
			System.out.println("ERROR:Authentication"+exp);
		}

		return authenticate;
	}
	
	@Override
	public String getuserName(int id) {
		String userName="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT firstName,lastName FROM tbl_user WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				userName=rs.getString("firstName");
				userName+=""+rs.getString("lastName");
			}
		} catch (Exception e) {
			System.out.println("ERROR: getting username"+e);
		}

		return userName;
	}

	@Override
	public String getuserAddress(int id) {
		String userAddress="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT address FROM tbl_user WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				userAddress=rs.getString("address");
			}

		} catch (Exception e) {
			System.out.println("ERROR:Extraction Address"+e);
		}
		return userAddress;
	}

	@Override
	public String getuserFaculty(int id) {
		String userFaculty="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT faculty FROM tbl_user WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				userFaculty=rs.getString("faculty");

			}
		} catch (Exception e) {
			System.out.println("ERROR: getting username"+e);
		}

		return userFaculty;
	}

	@Override
	public String getusersemester(int id) {
		String userSemester="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT semester FROM tbl_user WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				userSemester=rs.getString("firstName");

			}
		} catch (Exception e) {
			System.out.println("ERROR: getting username"+e);
		}

		return userSemester;
	}

	}
