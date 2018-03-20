package com.mobiclix.usermanagement.mapper.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UserNotFoundExceptionMapper implements ExceptionMapper<UserNotFoundException> {

	@Override
	public Response toResponse(UserNotFoundException exception) {
		// TODO Auto-generated method stub
		return Response.status(Status.NOT_FOUND).entity(new UserErrorMessage(exception.getMessage())).build();
	}

}
