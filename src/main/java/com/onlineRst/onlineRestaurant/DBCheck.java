package com.onlineRst.onlineRestaurant;

import com.onlineRst.onlineRestaurant.dao.RegistrationRepository;
import com.onlineRst.onlineRestaurant.model.Registration;

public class DBCheck {
	
	
	public  String isAuthorized(String username,String password,RegistrationRepository repo) {
		Registration reg=repo.getRegistrationByUsername(username);
		if (reg==null) {
			System.out.println("is null");
			return "invalid";
		}else if (reg.getPassword().equals(password)) {
			System.out.println("Role "+reg.getRole()+" "+reg.getName() );
			return reg.getRole();
		} 
		return "invalid";
	}
	

}
