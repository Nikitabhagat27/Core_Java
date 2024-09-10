package com.nikki.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nikki.jdbc.util.JdbcUtil;

public class JdbcService {
public int saveData(String username, String email,String password,String gender) {
	Connection con = JdbcUtil.getMySqlConnection();
	String sql="insert into registration values(?,?,?,?)";
	int count=0;
	PreparedStatement ps=null;
	try {
		 ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		 count = ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		JdbcUtil.cleanResources(ps, con);
	}
	return count;
}

}























