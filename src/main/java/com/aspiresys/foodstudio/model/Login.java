package com.aspiresys.foodstudio.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Login {
	
	@Id
	private String userName;
	private String password;
	private String role;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Users user;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	public Login() {
		
	}
	
	public Login( String userName, String password, String role, Users user) {
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + ", role=" + role + ", user=" + user + "]";
	}
	


}
