package com.mobiclix.usermanagement.repository.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mobiclix.usermanagement.domain.User;
import com.mobiclix.usermanagement.repository.UserManagementRepository;

public class UserManagementRepositoryImpl implements UserManagementRepository {

	private List<User> users = new ArrayList<User>();
	{
		Calendar calendar = Calendar.getInstance();
		calendar.set(1991, 2, 21);
		users.add(new User("The","Dinh", "Phan", calendar.getTime(), "phandinhthe1991@gmail.com"));
		users.add(new User("The","Dinh", "Pham", calendar.getTime(), "phandinhthe1991@gmail.com"));
		users.add(new User("The","Dinh", "Nguyen", calendar.getTime(), "phandinhthe1991@gmail.com"));
		users.add(new User("The","Dinh", "Tran", calendar.getTime(), "phandinhthe1991@gmail.com"));
	}
	
	@Override
	public void insertUser(User user) {
		users.add(user);
	}

	@Override
	public void updateUser(User user) {
		users.forEach(u -> {
			if (u.getId().equalsIgnoreCase(user.getId()))
				u.setUser(user);
		});
	}

	@Override
	public void deleteUser(String id) {
		users.removeIf(user -> user.getId().equalsIgnoreCase(id));
	}

	@Override
	public List<User> findAllUsers() {
		return users;
	}

	@Override
	public User findUsersByID(String id) {
		return users.stream()
				.filter(u -> u.getId().equalsIgnoreCase(id))
				.findFirst()
				.orElse(null);
	}

}
