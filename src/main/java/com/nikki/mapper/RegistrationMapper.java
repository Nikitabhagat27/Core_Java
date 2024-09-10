package com.nikki.mapper;

import javax.servlet.http.HttpServletRequest;

import com.nikki.dto.RegistrationDetail;

public class RegistrationMapper {
	public RegistrationDetail map(HttpServletRequest request) {

		RegistrationDetail regDetail = new RegistrationDetail();
		regDetail.setName(request.getParameter("name"));
		regDetail.setEmail(request.getParameter("email"));
		regDetail.setPassword(request.getParameter("password"));
		regDetail.setGender(request.getParameter("gender"));
		regDetail.setTiming(request.getParameter("timings"));
		regDetail.setRemark(request.getParameter("remarks"));

		String[] courses = request.getParameterValues("c1");
		String courseDetails = "";
		for (String c : courses) {
			// System.out.println(c);
			courseDetails = courseDetails + "," + c;
		}
		String course = courseDetails.substring(1);
		regDetail.setCourse(course);
		return regDetail;
	}
}
