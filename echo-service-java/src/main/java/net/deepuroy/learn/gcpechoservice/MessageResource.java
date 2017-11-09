package net.deepuroy.learn.gcpechoservice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("echo")
public class MessageResource {
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Message echo(@RequestBody Message message) {
		return message;
	}
	
	@GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
	public String get() {
		return "Hello, from MessageResource!";
	}
	
}