package com.mobiclix.usermanagement.webservices;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobiclix.usermanagement.domain.User;
import com.mobiclix.usermanagement.services.UserManagementService;

@Path("/user-management/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserManagementController {

	@Autowired
	UserManagementService userManagementService;
	
	@POST
	public Response insertUser(User user) {
		userManagementService.insertUser(user);
		return Response.ok().build();
	}
	
	@GET
	public List<User> findAllUsers() {
		return userManagementService.findAllUsers();
	}
	
	@GET
	@Path("/{id}")
	public User findUsersByID(@PathParam("id") String id) {
		return userManagementService.findUserByID(id);
	}
	
	@PUT
	public Response updateUser(User user) {
		userManagementService.updateUser(user);
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response deleteUser(@PathParam("id") String id) {
		userManagementService.deleteUser(id);
		return Response.ok().build();
	}
}
