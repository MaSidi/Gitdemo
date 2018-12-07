package com.dataapplab.firstweb;
import java.io.Serializable;
public class UserBean implements Serializable {
    private String firstname ;
    private String lastname ;
    private int age ;
	public void UserBean () {
		
	}
	
	public UserBean(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
