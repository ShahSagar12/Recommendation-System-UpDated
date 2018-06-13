package com.event.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.event.dao.RateDAO;
import com.event.dbutils.MySqlConnector;

import com.event.model.Rate;

public class RateDAOImpl implements RateDAO {

	@Override
	public int save(Rate rate) {
		int save=0;
		Connection connection=MySqlConnector.connectToDB();
		String sql="INSERT INTO tbl_rate(userId,eventId,rate,status) VALUES(?,?,?,?)";
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1,rate.getUserId());
			ps.setInt(2, rate.getEventId());
			ps.setInt(3, rate.getRate());
			ps.setInt(4, rate.getStatus());
			save=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR:Save Rate"+e);
		}
		return save;
	}

	@Override
	public List<Rate> list() {
		List<Rate> allRate= new ArrayList<>();
		Connection connection=MySqlConnector.connectToDB();
		String sql="SELECT * FROM tbl_rate ORDER BY id DESC";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery(sql);
			while(rs.next()){
				Rate rate=new Rate();
				rate.setId(rs.getInt("id"));
				rate.setUserId(rs.getInt("userId"));
				rate.setEventId(rs.getInt("eventId"));
				rate.setStatus(rs.getInt("status"));
				allRate.add(rate);
			}
		} catch (Exception e) {
			System.out.println("ERROR: list"+e);
		}
		return allRate;
	}

	@Override
	public List<Rate> getUserById(int id) {
		List<Rate> allRateByUserId = new ArrayList<>();
		Connection conn = MySqlConnector.connectToDB();
		String sql="SELECT * FROM tbl_rate WHERE userId="+id;
		try{
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				Rate rate = new Rate();
				rate.setId(rs.getInt("id"));
				rate.setUserId(rs.getInt("userId"));
				rate.setEventId(rs.getInt("eventId"));
				rate.setStatus(rs.getInt("status"));
				allRateByUserId.add(rate);
			}
		}catch(Exception e) {
			System.out.println("ERROR:"+e);
		}
		return allRateByUserId;
	}

	@Override
	public List<Rate> getEventById(int id) {
		List<Rate> allRateByEventId = new ArrayList<>();
		Connection conn = MySqlConnector.connectToDB();
		String sql="SELECT * FROM tbl_rate WHERE userId="+id;
		try{
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				Rate rate = new Rate();
				rate.setId(rs.getInt("id"));
				rate.setUserId(rs.getInt("userId"));
				rate.setEventId(rs.getInt("eventId"));
				rate.setStatus(rs.getInt("status"));
				allRateByEventId.add(rate);
			}
		}catch(Exception e) {
			System.out.println("ERROR:"+e);
		}
		return allRateByEventId;
	}

}
