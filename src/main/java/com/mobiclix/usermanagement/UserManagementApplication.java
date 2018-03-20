package com.mobiclix.usermanagement;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class UserManagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new UserManagementApplication()
			.configure(new SpringApplicationBuilder(UserManagementApplication.class))
			.run(args);
	}
}
