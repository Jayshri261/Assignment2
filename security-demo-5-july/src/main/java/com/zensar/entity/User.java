package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {

	@Id
	private int userid;
	private String username;
	private String password;
	private String roles;
	public User() {
		super();
	}
	public User(int userid, String username, String password, String roles) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", roles=" + roles
				+ "]";
	}
}
