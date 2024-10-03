package com.shopping;

public class login {
	User u;
	public boolean usertype(User u)
	{
		if(u.getUsername().equals("Thejus")&u.getPassword().equals("7243")) {
			System.out.println("Welcome Admin");
			return true;
		}
		else {
			System.out.println("Welcome User");
			return false;
		}
		
	}
	
}
