package com.nikki.factory;

import com.nikki.mapper.ObjectMapper;
import com.nikki.service.LoginService;
import com.nikita.reprository.UserRepository;

public class ObjectFactory {
   public static ObjectMapper createObjectMapperInstance() {
	   return new ObjectMapper();
   }
   public static LoginService createLoginServiceInstance() {
	   return new LoginService();
   }
   public static UserRepository createUserRepositoryInstance() {
	   return new UserRepository();
   }
}
