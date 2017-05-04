package com.hallanmedeiros.swarm.provider;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {
	
    public Response toResponse(NotFoundException e) {
        return Response
                .status(Response.Status.OK)
                .entity("This is our exception page!")
                .type(MediaType.TEXT_PLAIN_TYPE)
                .build();
    }
}