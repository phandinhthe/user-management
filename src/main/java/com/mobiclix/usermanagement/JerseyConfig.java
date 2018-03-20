package com.mobiclix.usermanagement;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mobiclix.usermanagement.mapper.exception.UserNotFoundExceptionMapper;
import com.mobiclix.usermanagement.mapper.user.UserMapper;
import com.mobiclix.usermanagement.webservices.UserManagementController;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(UserManagementController.class);
		register(UserNotFoundExceptionMapper.class);
		register(UserMapper.class);
	}
}
