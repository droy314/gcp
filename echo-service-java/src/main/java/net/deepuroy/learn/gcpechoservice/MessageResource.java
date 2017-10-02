package net.deepuroy.learn.gcpechoservice;

import org.springframework.stereotype.Component;
import javax.ws.rs.*;

@Path("echo")
public class MessageResource {
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Message echo(Message message) {
		return message;
	}
	
	@GET
	@Produces("text/plain")
	public String get() {
		return "Hello, from MessageResource!";
	}
	
}