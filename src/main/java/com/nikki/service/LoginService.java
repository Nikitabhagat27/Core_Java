package com.nikki.service;

import com.nikki.dto.LoginDetail;
import com.nikki.factory.ObjectFactory;
import com.nikita.reprository.UserRepository;

public class LoginService {
  public String validateUser(LoginDetail loginDetail) {
	  UserRepository repository = ObjectFactory.createUserRepositoryInstance();
	  LoginDetail result = repository.fetchLoinDetail(loginDetail);
	  String message="";
      if(result!=null && loginDetail.getPassword().equals(result.getPassword())) {
    	  message="<h1> Welcome to JLP</h1>";
      }
      else {
     	 message="<h1> invalid username or password </h1>";
      }
	  return message;
  }
}