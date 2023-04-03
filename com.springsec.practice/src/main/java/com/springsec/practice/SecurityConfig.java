package com.springsec.practice;

import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class SecurityConfig {
	
	
	public UserDetailsService myDetailsService() {
		UserDetails user=new User("Nikhil", "Nikhil", null);
	}
}
