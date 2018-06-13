package com.event.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.event.dao.EventDAO;
import com.event.dbutils.MySqlConnector;
import com.event.model.Event;




public class EventDAOImpl implements EventDAO{
	@Override
	public int save(Event event) {
		int result =0;
		Connection connection = MySqlConnector.connectToDB();
		String sql="INSERT INTO tbl_event(userId,eventName,proposedDate,proposedTime,eventDate,eventTime,eventAddress,eventNotice,status) VALUES(?,?,?,?,?,?,?,?,?)";
		try{
		PreparedStatement ps= connection.prepareStatement(sql);
		ps.setInt(1, event.getUserId());
		ps.setString(2, event.getEventName());
		ps.setString(3, event.getProposedDate());
		ps.setString(4, event.getProposedTime());
		ps.setString(5, (event.getEventdate()));
		ps.setString(6, event.getEventTime());
		ps.setString(7,event.getEventAddress());
		ps.setString(8, event.getEventNotice());
		ps.setInt(9, event.getStatus());
		result = ps.executeUpdate();
		}catch(Exception e){
			System.out.println("NEW Event : "+e);
		}
		return result;
	}

	@Override
	public List<Event> list() {
		List<Event> allEvent = new ArrayList<>();
		Connection conn = MySqlConnector.connectToDB();
		String sql="SELECT * FROM tbl_event ORDER BY id DESC";
		try{
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				Event event = new Event();
				event.setId(rs.getInt("id"));
				event.setUserId(rs.getInt("userId"));
				event.setEventName(rs.getString("eventName"));
				event.setProposedDate(rs.getString("proposedDate"));
				event.setProposedTime(rs.getString("proposedTime"));
				event.setEventdate(rs.getString("eventDate"));
				event.setEventTime(rs.getString("eventTime"));
				event.setEventAddress(rs.getString("eventAddress"));
				event.setEventNotice(rs.getString("eventNotice"));
				event.setStatus(rs.getInt("status"));
				allEvent.add(event);
			}
		}catch(Exception e){
			System.out.println("Event Selection: "+e);
		}

		return allEvent;
	}

	@Override
	public Event get(int id) {
		Event event = new Event();
		Connection conn = MySqlConnector.connectToDB();
		String sql="SELECT * FROM tbl_event WHERE id="+id;
		try{
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				event.setId(rs.getInt("id"));
				event.setUserId(rs.getInt("userId"));
				event.setEventName(rs.getString("eventName"));
				event.setProposedDate(rs.getString("proposedDate"));
				event.setProposedTime(rs.getString("proposedTime"));
				event.setEventdate(rs.getString("eventDate"));
				event.setEventTime(rs.getString("eventTime"));
				event.setEventNotice(rs.getString("eventNotice"));
				event.setStatus(rs.getInt("status"));
			}
		}catch(Exception e){
			System.out.println("Event READING BY USER ID: "+e);
		}
		return event;
	}

	@Override
	public int update(Event event) {
		int result =0;
		Connection conn = MySqlConnector.connectToDB();
		String sql="UPDATE tbl_event SET eventName=?,status=? WHERE id=?";
		try{
		PreparedStatement ps	 = conn.prepareStatement(sql);
		ps.setString(1, event.getEventName());		
		ps.setInt(2, event.getStatus());
		ps.setInt(3, event.getId());
		result = ps.executeUpdate();
		
		}catch(Exception e){
			System.out.println("NEW BLOG POST : "+e);
		}
		return result;
	}

	@Override
	public int delete(int id) {
		int result =0;
		Connection conn = MySqlConnector.connectToDB();
		String sql="DELETE FROM tbl_event WHERE id=?";
		try{
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		result = ps.executeUpdate();
		
		}catch(Exception e){
			System.out.println("Delete Event : "+e);
		}
		return result;
	}

	@Override
	public List<Event> getUserByid(int id) {
		List<Event> allEventPostByUserId = new ArrayList<>();
		Connection conn = MySqlConnector.connectToDB();
		String sql="SELECT * FROM tbl_event WHERE userId="+id;
		try{
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				Event event = new Event();
				event.setId(rs.getInt("id"));
				event.setUserId(rs.getInt("userId"));
				event.setEventName(rs.getString("eventName"));
				event.setEventdate(rs.getString("eventDate"));
				event.setEventTime(rs.getString("eventTime"));
				event.setEventAddress(rs.getString("eventAddress"));
				event.setEventNotice(rs.getString("eventNotice"));
				event.setStatus(rs.getInt("status"));
				allEventPostByUserId.add(event);
			}
		}catch(Exception e){
			System.out.println("Event READING BY USER ID: "+e);
		}

		return allEventPostByUserId;
	}

	@Override
	public String getEventName(int id) {
		String eventName="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT eventName FROM tbl_event WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				eventName=rs.getString("eventName");
				
			}
		} catch (Exception e) {
			System.out.println("ERROR: getting eventname"+e);
		}

		return eventName;
	}

	@Override
	public String proposedDate(int id) {
		String proposedDate="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT proposedDate FROM tbl_event WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				proposedDate=rs.getString("proposedDate");
				
			}
		} catch (Exception e) {
			System.out.println("ERROR: getting username"+e);
		}

		return proposedDate;
	}

	@Override
	public String proposedTime(int id) {
		String proposedTime="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT proposedTime FROM tbl_event WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				proposedTime=rs.getString("proposedTime");
				
			}
		} catch (Exception e) {
			System.out.println("ERROR: getting proposedtime"+e);
		}

		return proposedTime;
	}

	@Override
	public String getEventDate(int id) {
		String eventDate="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT eventDate FROM tbl_event WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				eventDate=rs.getString("eventDate");
				
			}
		} catch (Exception e) {
			System.out.println("ERROR: getting eventDate"+e);
		}

		return eventDate;
	}

	@Override
	public String getEventTime(int id) {
		String eventTime="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT eventTime FROM tbl_event WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				eventTime=rs.getString("eventTime");
				
			}
		} catch (Exception e) {
			System.out.println("ERROR: getting eventTime"+e);
		}

		return eventTime;
	}

	@Override
	public String getEventNotice(int id) {
		String eventNotice="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT eventNotice FROM tbl_event WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				eventNotice=rs.getString("eventNotice");
			
			}
		} catch (Exception e) {
			System.out.println("ERROR: getting username"+e);
		}

		return eventNotice;
	}

	@Override
	public String getEventAddress(int id) {
		String eventAddress="";
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT eventAddress FROM tbl_user WHERE id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				eventAddress=rs.getString("eventAddress");
				
			}
		} catch (Exception e) {
			System.out.println("ERROR: getting eventAddress"+e);
		}

		return eventAddress;
	}
	}

	
	

