package com.mobiclix.usermanagement.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobiclix.usermanagement.domain.User;
import com.mobiclix.usermanagement.mapper.exception.UserNotFoundException;
import com.mobiclix.usermanagement.repository.UserManagementRepository;
import com.mobiclix.usermanagement.services.UserManagementService;

public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	UserManagementRepository userManagementRepository;
	
	@Override
	public void insertUser(User user) {
		userManagementRepository.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		userManagementRepository.updateUser(user);
	}

	@Override
	public void deleteUser(String id) {
		userManagementRepository.deleteUser(id);
	}

	@Override
	public List<User> findAllUsers() {
		return userManagementRepository.findAllUsers();
	}

	@Override
	public User findUserByID(String id) {
		User user = userManagementRepository.findUsersByID(id);
		if (null == user)
			throw new UserNotFoundException("this user doesn't exist in system");
		return userManagementRepository.findUsersByID(id);
	}

}
