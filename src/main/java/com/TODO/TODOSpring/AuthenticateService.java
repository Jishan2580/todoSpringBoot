package com.TODO.TODOSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service 
public class AuthenticateService {
	
	public boolean check(String email, String password) {
		
		boolean isvalidemail = email.equalsIgnoreCase("jishanshaikh830@gmail.com");
		boolean isvalidpass= password.equals("jishan");
		return isvalidemail && isvalidpass;
		
	}

}
