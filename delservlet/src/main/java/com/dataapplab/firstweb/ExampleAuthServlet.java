package com.dataapplab.firstweb;

public class ExampleAuthServlet {
	private AuthService serivce;
	public ExampleAuthServlet (AuthService serivce) {
		this.serivce = serivce;
	}
public void doget() {
	boolean isValidate= this.serivce.validateUser("Sidi", "msd211314");
	if (isValidate) 
	{
		System.out.println("access");
	}
	else
	{
		System.out.println("not access");
	}
	}
}
