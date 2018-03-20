package com.mobiclix.usermanagement.services;

import java.util.List;

import com.mobiclix.usermanagement.domain.User;

public interface UserManagementService {
	public void insertUser(User user);
	public List<User> findAllUsers();
	public User findUserByID(String id);
	public void updateUser(User user);
	public void deleteUser(String id);
}
