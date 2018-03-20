package com.mobiclix.usermanagement.mapper.user;

import javax.ws.rs.ext.ContextResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class UserMapper implements ContextResolver<ObjectMapper>{

	@Override
	public ObjectMapper getContext(Class<?> type) {
	     ObjectMapper objectMapper = new ObjectMapper();
	     objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
	     return objectMapper;
	}

}
