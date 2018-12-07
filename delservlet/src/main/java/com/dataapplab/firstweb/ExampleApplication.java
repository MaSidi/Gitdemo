package com.dataapplab.firstweb;

public class ExampleApplication {
public static void main (String []args) {
	AuthService authentication = new DBloginService();
	ExampleAuthServlet servlet = new ExampleAuthServlet(authentication);
	servlet.doget();
	}
}
