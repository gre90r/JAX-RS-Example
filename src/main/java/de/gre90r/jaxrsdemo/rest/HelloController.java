package de.gre90r.jaxrsdemo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloController {
	
	// http://localhost:8080/jax-rs-demo/api/hello
	// http://localhost:8080/jax-rs-demo/api/hello?name=peter
	@GET
	public Response helloWithName(@QueryParam("name") String paramName) {
		String name = "";
		if (paramName != null) {
			name = paramName;
		}
		return Response.ok().entity("hello " + name).build();
	}
	
	// http://localhost:8080/jax-rs-demo/api/hello/error
	@GET
	@Path("/error")
	public Response error() {
		return Response.status(500).build();
	}
	
	// http://localhost:8080/jax-rs-demo/api/hello/error2
	@GET
	@Path("/error2")
	public Response error2(@QueryParam("param") String param) {
		if (param == null || param.isEmpty()) {
			throw new RuntimeException();
		}
		return Response.status(200).build();
	}
}
