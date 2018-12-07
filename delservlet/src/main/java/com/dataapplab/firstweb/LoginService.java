package com.dataapplab.firstweb;

public class LoginService implements AuthService {
  public boolean validateUser (String userName, String password) 
  {
	  return userName.equalsIgnoreCase("Sidi")&& password.equals("dal");
  }
}
