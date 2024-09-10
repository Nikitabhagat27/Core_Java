package com.nikki.mapper;

import javax.servlet.http.HttpServletRequest;

import com.nikki.dto.LoginDetail;

public class ObjectMapper {
public  LoginDetail mapToLoginDetail(HttpServletRequest request) {
	
	LoginDetail loginDetail=new LoginDetail();
	loginDetail.setUsername(request.getParameter("username"));
	loginDetail.setPassword(request.getParameter("pwd"));
	return loginDetail;
	
	
}
}
