package net.deepuroy.learn.gcpechoservice;

import org.springframework.stereotype.Component;
import org.glassfish.jersey.server.ResourceConfig;

@Component
public class EchoApplication extends ResourceConfig {
	
	public EchoApplication() {
		register(MessageResource.class);
	}
	
}  