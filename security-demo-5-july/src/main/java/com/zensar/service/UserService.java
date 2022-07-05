package com.zensar.service;

import java.util.List;

import com.zensar.entity.User;

public interface UserService {
	public User getUser(int userid);

	public List<User> getUsers();

	public User insertUser(User user);

	public void deleteUser(int userid);

	public void updateUser(int userid, User user);

}
