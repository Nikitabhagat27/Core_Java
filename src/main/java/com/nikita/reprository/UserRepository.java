package com.nikita.reprository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nikki.dto.LoginDetail;
import com.nikki.jdbc.util.JdbcUtil;

public class UserRepository {
	public LoginDetail fetchLoinDetail(LoginDetail loginDetail) {
		Connection con = JdbcUtil.getMySqlConnection();
		String sql="select * from login_detail where username=? and password=?";
		LoginDetail result=null;
		PreparedStatement ps =null;
		ResultSet rs =null;
		try {
		    ps = con.prepareStatement(sql);
			ps.setString(1, loginDetail.getUsername());
			ps.setString(2, loginDetail.getPassword());
		    rs = ps.executeQuery();
			rs.next();
			
		    result=new LoginDetail();
			result.setUsername(rs.getString(1));
			result.setPassword(rs.getString(2));
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("something went wrong while fetching data");
			return result;
		}finally {
			JdbcUtil.cleanResources(ps, con, rs);
		}
		
	}}
