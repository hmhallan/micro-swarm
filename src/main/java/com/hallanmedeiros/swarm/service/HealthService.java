package com.hallanmedeiros.swarm.service;

import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/health")
public class HealthService {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Calendar ping() {
        return Calendar.getInstance();
    }
	
}
