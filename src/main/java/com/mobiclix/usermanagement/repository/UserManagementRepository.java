package com.mobiclix.usermanagement.repository;

import java.util.List;

import com.mobiclix.usermanagement.domain.User;

public interface UserManagementRepository {
	public void insertUser(User user);
	public List<User> findAllUsers();
	public User findUsersByID(String id);
	public void updateUser(User user);
	public void deleteUser(String id);
}
