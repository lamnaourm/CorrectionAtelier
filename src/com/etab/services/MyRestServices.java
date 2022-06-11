package com.etab.services;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class MyRestServices extends ResourceConfig{

	public MyRestServices() {
		packages("com.etab.services");
		packages("com.fasterxml.jackson.jaxrs.json");
	}
}

