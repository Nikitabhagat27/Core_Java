package com.nikita.reprository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nikki.dto.RegistrationDetail;
import com.nikki.jdbc.util.JdbcUtil;

public class RegistrationRepo {
  public int save(RegistrationDetail regDetail) {
	  Connection con= JdbcUtil.getMySqlConnection();
		String sql="insert into registration_detail values(?,?,?,?,?,?,?)";
		int count=0;
		PreparedStatement ps=null;
		
		try {
			 ps= con.prepareStatement(sql);
			ps.setString(1, regDetail.getName());
			ps.setString(2, regDetail.getEmail());
			ps.setString(3, regDetail.getPassword());
			ps.setString(4, regDetail.getGender());
			ps.setString(5, regDetail.getCourse());
			ps.setString(6, regDetail.getTiming());
			ps.setString(7, regDetail.getRemark());
			 count = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanResources(ps, con);
		}
		return count;
  }
  public List<RegistrationDetail> findAll() {
	  Connection con= JdbcUtil.getMySqlConnection();
	  String sql="select * from registration_detail";
	  Statement st=null;
	  List<RegistrationDetail> list=new ArrayList<>();
	  try {
		   st = con.createStatement();
		   ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			RegistrationDetail rd = new RegistrationDetail();
			rd.setName(rs.getString("username"));
			rd.setEmail(rs.getString("email"));
			rd.setGender(rs.getString("gender"));
			rd.setCourse(rs.getString("courses"));
			rd.setTiming(rs.getString("batch_timings"));
			rd.setRemark(rs.getString("remarks"));
			
			list.add(rd);
		}
	  }catch(SQLException e) {
		  
	  }finally {
			JdbcUtil.cleanResources(st, con);
		}
	  
	  return list;
  }
}
