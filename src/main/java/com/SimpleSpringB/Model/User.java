package com.SimpleSpringB.Model;

public class User {
	String name;
	String email;
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
